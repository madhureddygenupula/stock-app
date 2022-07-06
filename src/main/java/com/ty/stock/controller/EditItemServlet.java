package com.ty.stock.controller;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.ty.stock.dao.ItemDao;
import com.ty.stock.dto.Item;


public class EditItemServlet extends HttpServlet{

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		
Item item=new Item();
		
		String id=req.getParameter("id");
		String name=req.getParameter("itemName");
		String brand=req.getParameter("itemBrand");
		String cost=req.getParameter("itemCost");
		String quantity=req.getParameter("itemQuantity");
		String type=req.getParameter("itemType");
		
		
		item.setId(Integer.parseInt(id));
		item.setName(name);
		item.setBrand(brand);
		item.setCost(Double.parseDouble(cost));
		item.setQuantity(Integer.parseInt(quantity));
		item.setType(type);
	
		
		ItemDao dao=new ItemDao();
		dao.updateItem(item);
		
		PrintWriter pw = resp.getWriter();
		pw.print("<html><body><h1>Item updated</h1></body></html>");
		
		req.setAttribute("myItem", item);
		RequestDispatcher dispatcher = req.getRequestDispatcher("EditItem.jsp");
		dispatcher.include(req, resp);
}
}
