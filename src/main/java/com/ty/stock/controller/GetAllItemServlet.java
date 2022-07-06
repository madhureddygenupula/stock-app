package com.ty.stock.controller;

import java.io.IOException;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.ty.stock.dao.ItemDao;
import com.ty.stock.dto.Item;


public class GetAllItemServlet extends HttpServlet{

	
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		

		ItemDao dao=new ItemDao();
		List<Item> items=dao.getAllItems();
	
		
		req.setAttribute("myItem", items);
		RequestDispatcher dispatcher=req.getRequestDispatcher("DisplayItem.jsp");
		dispatcher.forward(req, resp);
	}
}
