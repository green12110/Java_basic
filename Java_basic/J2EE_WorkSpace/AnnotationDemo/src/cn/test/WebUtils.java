package cn.test;

import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.Reader;
import java.net.HttpURLConnection;
import java.net.URL;
import java.net.URLDecoder;
import java.net.URLEncoder;
import java.security.SecureRandom;
import java.security.cert.CertificateException;
import java.security.cert.X509Certificate;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;
import javax.net.ssl.HostnameVerifier;
import javax.net.ssl.HttpsURLConnection;
import javax.net.ssl.KeyManager;
import javax.net.ssl.SSLContext;
import javax.net.ssl.SSLSession;
import javax.net.ssl.TrustManager;
import javax.net.ssl.X509TrustManager;

import org.apache.commons.lang.StringUtils;

public class WebUtils {

	private static final String DEFAULT_CHARSET = "UTF-8";
	private static final String METHOD_POST = "POST";
	private static final String METHOD_GET = "GET";
	private static final int CONNECT_TIMEOUT = 3000;
	private static final int READ_TIMEOUT = 3000;

	private static class DefaultTrustManager implements X509TrustManager {
		public X509Certificate[] getAcceptedIssuers() {
			return null;
		}

		public void checkClientTrusted(X509Certificate[] chain, String authType) throws CertificateException {
		}

		public void checkServerTrusted(X509Certificate[] chain, String authType) throws CertificateException {
		}
	}

	/**
	 * POST璇锋眰
	 * 
	 * @param url
	 *            璇锋眰閾炬帴
	 * @param params
	 *            璇锋眰鍙傛暟
	 * @return Response
	 * @throws IOException
	 */
	public static String doPost(String url, Map<String, String> params) throws IOException {
		HttpURLConnection conn = null;
		OutputStream out = null;
		try {
			String ctype = "application/x-www-form-urlencoded;charset=UTF-8";
			String query = buildQuery(params, DEFAULT_CHARSET);
			byte[] content = new byte[0];
			if (query != null) {
				content = query.getBytes(DEFAULT_CHARSET);
			}
			conn = getConnection(new URL(url), METHOD_POST, ctype);
			conn.setConnectTimeout(CONNECT_TIMEOUT);
			conn.setReadTimeout(READ_TIMEOUT);
			out = conn.getOutputStream();
			out.write(content);
			return getResponseAsString(conn);
		} catch (IOException e) {
			throw e;
		} finally {
			if (out != null) {
				out.close();
			}
			if (conn != null) {
				conn.disconnect();
			}
		}
	}

	/**
	 * GET璇锋眰
	 * 
	 * @param url
	 *            璇锋眰閾炬帴
	 * @param params
	 *            璇锋眰鍙傛暟
	 * @return Response
	 * @throws IOException
	 */
	public static String doGet(String url, Map<String, String> params) throws IOException {
		HttpURLConnection conn = null;
		try {
			String ctype = "application/x-www-form-urlencoded;charset=UTF-8";
			String query = buildQuery(params, DEFAULT_CHARSET);
			conn = getConnection(buildGetUrl(url, query), METHOD_GET, ctype);
			conn.setConnectTimeout(CONNECT_TIMEOUT);
			conn.setReadTimeout(READ_TIMEOUT);
			return getResponseAsString(conn);
		} catch (IOException e) {
			throw e;
		} finally {
			if (conn != null) {
				conn.disconnect();
			}
		}
	}

	/**
	 * 鑾峰彇閾炬帴
	 * 
	 * @param url
	 *            閾炬帴鍦板潃
	 * @param method
	 *            璇锋眰鏂规硶
	 * @param ctype
	 *            鐞嗘��
	 * @param headerMap
	 *            header
	 * @return
	 * @throws IOException
	 */
	private static HttpURLConnection getConnection(URL url, String method, String ctype) throws IOException {
		HttpURLConnection conn = null;
		if ("https".equals(url.getProtocol())) {
			SSLContext ctx = null;
			try {
				ctx = SSLContext.getInstance("TLS");
				ctx.init(new KeyManager[0], new TrustManager[] { new DefaultTrustManager() }, new SecureRandom());
			} catch (Exception e) {
				throw new IOException(e);
			}
			HttpsURLConnection connHttps = (HttpsURLConnection) url.openConnection();
			connHttps.setSSLSocketFactory(ctx.getSocketFactory());
			connHttps.setHostnameVerifier(new HostnameVerifier() {
				public boolean verify(String hostname, SSLSession session) {
					return true;
				}
			});
			conn = connHttps;
		} else {
			conn = (HttpURLConnection) url.openConnection();
		}

		conn.setRequestMethod(method);
		conn.setDoInput(true);
		conn.setDoOutput(true);
		conn.setRequestProperty("Accept", "text/xml,text/javascript,text/html");
		conn.setRequestProperty("User-Agent", "top-sdk-java");
		conn.setRequestProperty("Content-Type", ctype);
		return conn;
	}

	private static URL buildGetUrl(String strUrl, String query) throws IOException {
		URL url = new URL(strUrl);
		if (StringUtils.isEmpty(query)) {
			return url;
		}

		if (StringUtils.isEmpty(url.getQuery())) {
			if (strUrl.endsWith("?"))
				strUrl = strUrl + query;
			else {
				strUrl = strUrl + "?" + query;
			}
		} else if (strUrl.endsWith("&"))
			strUrl = strUrl + query;
		else {
			strUrl = strUrl + "&" + query;
		}

		return new URL(strUrl);
	}

	/**
	 * 鎷兼帴鍙傛暟
	 * 
	 * @param params
	 *            鍙傛暟
	 * @param charset
	 *            缂栫爜
	 * @return
	 * @throws IOException
	 */
	public static String buildQuery(Map<String, String> params, String charset) throws IOException {
		if ((params == null) || (params.isEmpty())) {
			return null;
		}

		StringBuilder query = new StringBuilder();
		Set<Entry<String, String>> entries = params.entrySet();
		boolean hasParam = false;

		for (Map.Entry<String, String> entry : entries) {
			String name = entry.getKey();
			String value = entry.getValue();

			if (StringUtils.isNotEmpty(name) && StringUtils.isNotEmpty(value)) {
				if (hasParam)
					query.append("&");
				else {
					hasParam = true;
				}

				query.append(name).append("=").append(URLEncoder.encode(value, charset));
			}
		}

		return query.toString();
	}

	/**
	 * 鑾峰彇ResponseJson
	 * 
	 * @param conn
	 *            閾炬帴
	 * @return
	 * @throws IOException
	 */
	protected static String getResponseAsString(HttpURLConnection conn) throws IOException {
		String charset = getResponseCharset(conn.getContentType());
		InputStream es = conn.getErrorStream();
		if (es == null) {
			return getStreamAsString(conn.getInputStream(), charset);
		}
		String msg = getStreamAsString(es, charset);
		if (StringUtils.isEmpty(msg)) {
			throw new IOException(conn.getResponseCode() + ":" + conn.getResponseMessage());
		}
		throw new IOException(msg);
	}

	private static String getStreamAsString(InputStream stream, String charset) throws IOException {
		try {
			Reader reader = new InputStreamReader(stream, charset);
			StringBuilder response = new StringBuilder();

			char[] buff = new char[1024];
			int read = 0;
			while ((read = reader.read(buff)) > 0) {
				response.append(buff, 0, read);
			}

			String str = response.toString();
			return str;
		} finally {
			if (stream != null)
				stream.close();
		}
	}

	/**
	 * 缂栫爜鏍煎紡
	 * 
	 * @param ctype
	 * @return
	 */
	private static String getResponseCharset(String ctype) {
		String charset = DEFAULT_CHARSET;

		if (!StringUtils.isEmpty(ctype)) {
			String[] params = ctype.split(";");
			for (String param : params) {
				param = param.trim();
				if (param.startsWith("charset")) {
					String[] pair = param.split("=", 2);
					if ((pair.length != 2) || (StringUtils.isEmpty(pair[1])))
						break;
					charset = pair[1].trim();
					break;
				}
			}
		}
		return charset;
	}

	public static String decode(String value) {
		return decode(value, DEFAULT_CHARSET);
	}

	public static String encode(String value) {
		return encode(value, DEFAULT_CHARSET);
	}

	public static String decode(String value, String charset) {
		String result = null;
		if (!StringUtils.isEmpty(value)) {
			try {
				result = URLDecoder.decode(value, charset);
			} catch (IOException e) {
				throw new RuntimeException(e);
			}
		}
		return result;
	}

	public static String encode(String value, String charset) {
		String result = null;
		if (!StringUtils.isEmpty(value)) {
			try {
				result = URLEncoder.encode(value, charset);
			} catch (IOException e) {
				throw new RuntimeException(e);
			}
		}
		return result;
	}

}
