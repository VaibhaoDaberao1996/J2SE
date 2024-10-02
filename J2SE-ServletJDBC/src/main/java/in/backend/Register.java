package in.backend;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

@WebServlet("/regform")
public class Register extends HttpServlet {
	
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		
		PrintWriter out =resp.getWriter();
		
		String name =req.getParameter("name1");
		String email =req.getParameter("email1");
		String password =req.getParameter("pass1");
		String gender =req.getParameter("gender1");
		
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
		    Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/servletJdbc", "root","bravestone@96");
		    PreparedStatement ps=con.prepareStatement("insert into register value(?,?,?,?)");
		    ps.setString(1, name);
		    ps.setString(2, email);
		    ps.setString(3, password);
		    ps.setString(4, gender);
		    
		    int queryCount= ps.executeUpdate();
		    if(queryCount>0) {
		    	System.out.println("Data insert successfully");
		    	
		    	
		    	resp.setContentType("text/html");
		    	out.print("<h3 style='color:green'>Register Succesfully</h3>");
		    	
		    	RequestDispatcher rd =req.getRequestDispatcher("/register.jsp");
		    	rd.include(req, resp);
		    }else {
		    	System.out.println("Failed to insert");
		    	
		    	resp.setContentType("text/html");
		    	out.print("<h3 style='color:red'>Register Failed</h3>");
		    	
		    	RequestDispatcher rd =req.getRequestDispatcher("/register.jsp");
		    	rd.include(req, resp);
		    }
		} catch (Exception e) {
			System.out.println(e);
		}
	}

}
