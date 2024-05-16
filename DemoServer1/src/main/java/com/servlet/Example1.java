package com.servlet;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class Example1
 */
@WebServlet("/Example1")
public class Example1 extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public Example1() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
//		response.getWriter().append("").append(request.getContextPath());
		String name=request.getParameter("username");
		String email = request.getParameter("email");
		int mobile = Integer.parseInt(request.getParameter("mobile"));
		String password=request.getParameter("password");
		String confirmpassword = request.getParameter("confirm-password");
		PrintWriter writer=response.getWriter();
		writer.println("name:"+name);
		writer.println("email:"+email);
		writer.println("mobile:"+mobile);
		writer.println("password:"+password);
		writer.println("confirm password:"+confirmpassword);
		System.out.println("name:"+name);
		System.out.println("email:"+email);
		System.out.println("mobile:"+mobile);
		System.out.println("password:"+password);
		System.out.println("confirm password:"+confirmpassword);
		ArrayList list=new ArrayList();
		list.add(name);
		list.add(email);
		list.add(mobile);
		list.add(password);
		list.add(confirmpassword);
		System.out.println("arraylist:"+list);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
