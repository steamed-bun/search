package com.xiyou.ajax.test;

import org.junit.Test;

import com.google.gson.Gson;
import com.xiyou.ajax.dao.TitleDAO;
import com.xiyou.ajax.entities.Title;

public class TestTitle {
	
	@Test
	public void testGetList() {
		System.out.println(TitleDAO.getList("BB"));
		for (Title title : TitleDAO.getList("BB")) {
			System.out.println(title);
		}
		
		Gson gson = new  Gson();
		String json = gson.toJson(TitleDAO.getList("BB"));
		System.out.println(json);
		
	}

	
	
}
