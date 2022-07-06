package com.ty.stock.controller;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.ty.stock.dao.ItemDao;
import com.ty.stock.dto.Item;

public class GetItemServlet extends HttpServlet{

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		
		String id=req.getParameter("id");
		int parseId=Integer.parseInt(id);
		
		ItemDao dao=new ItemDao();
		Item item=dao.getItemById(parseId);
		
		req.setAttribute("myItem", item);
		RequestDispatcher dispatcher=req.getRequestDispatcher("EditItem.jsp");
		dispatcher.forward(req, resp);
		
	}
}
