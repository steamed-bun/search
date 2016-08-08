package com.xiyou.ajax.entities;

public class Title {

	private Integer id;
	private String text;
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public String getText() {
		return text;
	}
	public void setText(String text) {
		this.text = text;
	}
	public Title(Integer id, String text) {
		super();
		this.id = id;
		this.text = text;
	}
	public Title() {
		super();
		// TODO Auto-generated constructor stub
	}
	@Override
	public String toString() {
		return "Title [id=" + id + ", text=" + text + "]";
	}
	public Title(String text) {
		super();
		this.text = text;
	}
	
	
	
}
