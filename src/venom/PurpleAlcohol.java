package venom;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.ServletOutputStream;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.sun.xml.internal.bind.CycleRecoverable.Context;

@WebServlet("/PurpleAlcohol")
public class PurpleAlcohol extends HttpServlet {

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doWhatever(req, resp);
		
		
	}

	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doWhatever(req, resp);
	}
	
	private void doWhatever(HttpServletRequest req, HttpServletResponse resp){
		System.out.println("received");
		resp.setHeader("Access-Control-Allow-Origin", "*");
	    //resp.setHeader("Access-Control-Request-Method", "GET");
		
		try {
			ServletOutputStream sop=resp.getOutputStream();
			sop.print("hellohellohellohellohellohellohellohellohellohello");
			sop.flush();
			sop.close();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
	}

}
