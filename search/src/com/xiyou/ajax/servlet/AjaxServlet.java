package com.xiyou.ajax.servlet;

import java.io.IOException;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.google.gson.Gson;
import com.xiyou.ajax.dao.TitleDAO;
import com.xiyou.ajax.entities.Title;

public class AjaxServlet extends HttpServlet {

	private static final long serialVersionUID = 1L;

	public void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		String text = request.getParameter("text");
		System.out.println(text);
		List<Title> list = TitleDAO.getList(text);
		
		Gson gson = new Gson();
		String json = gson.toJson(list);
		System.out.println(json);
		
		response.setContentType("text/json;chartset=UTF-8");
		response.getWriter().write(json);
		
		
	}

}
