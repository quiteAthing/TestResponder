package Validators;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.HashMap;
import java.util.Map;

import com.google.gson.*;
import javax.servlet.ServletException;
import javax.servlet.ServletOutputStream;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/validateNormal")
public class validateNormal extends HttpServlet {

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doWhatever(req,resp);
	}

	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		doWhatever(req,resp);
	}
	
	
	private void doWhatever(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		String loginResult=null;
		// TODO Auto-generated method stub
		Map<String,Object> responseJson=new HashMap<>();
		Gson respond=new Gson();
		boolean loginSuccess=new Boolean(req.getParameter("dummyResult")).booleanValue();
		if(loginSuccess){
			loginResult="success";
		}else{
			loginResult="failed";
		}
		
		responseJson.put("logStatus", loginResult);
		
		BufferedReader bfr=req.getReader();
		System.out.println(bfr.readLine());
		resp.setHeader("Access-Control-Allow-Origin", "*");
		resp.setContentType("text/plain");
		resp.setHeader("Access-Control-Request-Method", "POST");
		resp.setCharacterEncoding("UTF-8");
		resp.addHeader("Access-Control-Allow-Headers","Origin, X-Requested-With, Content-Type, Accept");
		resp.setHeader("Access-Control-Allow-Headers", "Content-Type");

		try {
			ServletOutputStream sop=resp.getOutputStream();
			sop.print(respond.toJson(responseJson));
			sop.flush();
			sop.close();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		System.out.println("VN whatEver");
		
	}
	

}
