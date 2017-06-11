
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import org.apache.http.HttpEntity;
import org.apache.http.HttpResponse;
import org.apache.http.NameValuePair;
import org.apache.http.client.HttpClient;
import org.apache.http.client.entity.UrlEncodedFormEntity;
import org.apache.http.client.methods.HttpGet;
import org.apache.http.client.methods.HttpPost;
import org.apache.http.impl.client.HttpClients;
import org.apache.http.message.BasicNameValuePair;
import org.apache.http.util.EntityUtils;


/**
 * http请求工具
 * 
 * @author ChenZhuo 2014-11-18
 * 
 */
public abstract class FnClient {

	/**
	 * post请求
	 * 
	 * @param url
	 *            链接地址
	 * @param params
	 *            参数与
	 * @return
	 * @throws Exception
	 */
	public static String doPost(String url, Map<String, String> params) throws Exception {
		HttpClient client = HttpClients.createDefault();
		try {
			HttpPost request = new HttpPost(url);
			List<NameValuePair> postParams = new ArrayList<NameValuePair>();
			for (Map.Entry<String, String> entry : params.entrySet()) {
				postParams.add(new BasicNameValuePair(entry.getKey(), entry.getValue()));
			}
			request.setEntity(new UrlEncodedFormEntity(postParams, "UTF-8"));
			HttpResponse response = client.execute(request);
			HttpEntity entity = response.getEntity();
			return EntityUtils.toString(entity, "UTF-8");
		} catch (Exception e) {
			throw e;
		}
	}

	/**
	 * get请求
	 * 
	 * @param url
	 *            连接地址
	 * @param params
	 *            参数
	 * @return
	 * @throws Exception
	 */
	public static String doGet(String url, Map<String, String> params) throws Exception {
		HttpClient client = HttpClients.createDefault();
		try {
			HttpGet request = new HttpGet(url + "?" + WebUtils.buildQuery(params, "UTF-8"));
			HttpResponse response = client.execute(request);
			HttpEntity entity = response.getEntity();
			return EntityUtils.toString(entity, "UTF-8");
		} catch (Exception e) {
			throw e;
		}
	}
}
