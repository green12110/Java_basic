package cn.servlet;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import net.sf.json.JSONArray;
import net.sf.json.JsonConfig;
import cn.bean.Province;

/**
 * Servlet implementation class TestJsonServlet
 */
@WebServlet("/TestJsonServlet")
public class TestJsonServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
  
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		request.setCharacterEncoding("UTF-8");
		response.setContentType("text/html; charset=UTF-8");
		PrintWriter out = response.getWriter();
	/*	String jsonStr ="[{'pid':1,'pname':'����ʡ'},{'pid':2,'pname':'����ʡ'},{'pid':3,'pname':'ɽ��ʡ'}]";
		out.print(jsonStr);*/
		List<Province> provinces = new ArrayList<Province>();
		provinces.add(new Province(1,"����ʡ"));
		provinces.add(new Province(2,"����ʡ"));
		provinces.add(new Province(3,"ɽ��ʡ"));
		
		//����configΪJSONArray.fromObject() �ĵڶ�������
		JsonConfig config = new JsonConfig();
		//����provinces������province�����pid����
		config.setExcludes(new String[]{"pid"});
		
		JSONArray jsonArray = JSONArray.fromObject(provinces, config);
		System.out.println(jsonArray.toString());
		out.print(jsonArray);
	}

}
