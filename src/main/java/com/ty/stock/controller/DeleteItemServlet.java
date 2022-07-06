package com.ty.stock.controller;


	import java.io.IOException;
	import java.io.PrintWriter;

	import javax.servlet.ServletException;
	import javax.servlet.http.HttpServlet;
	import javax.servlet.http.HttpServletRequest;
	import javax.servlet.http.HttpServletResponse;

import com.ty.stock.dao.ItemDao;

	public class DeleteItemServlet extends HttpServlet{


		@Override
		protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {


			PrintWriter pw=resp.getWriter();
			String id=req.getParameter("id");
			int parseId=Integer.parseInt(id);


			ItemDao dao=new ItemDao();
			boolean result=dao.deleteItem(parseId);
			if(result==true)
			{
				pw.print("<html><body><h1>Data is deleted</h1><body></html>");
			}
			else
				pw.print("<html><body><h1>Data is not deleted</h1><body></html>");
		}
	}


