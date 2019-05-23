package com.spring.config.mix;

import org.springframework.stereotype.Component;

@Component
public class Monkey {

	private int id = 101;
	private String name = "Jaggu";
	private String color = "Blue";
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getColor() {
		return color;
	}
	public void setColor(String color) {
		this.color = color;
	}
	@Override
	public String toString() {
		return "Monkey [id=" + id + ", name=" + name + ", color=" + color + "]";
	}
	
	
}
