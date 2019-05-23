package com.spring.config.java;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

import org.springframework.beans.factory.BeanNameAware;
import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;

public class Person implements InitializingBean,DisposableBean,
BeanNameAware{

	private int id;
	private String name;
	
	private Job Job;
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
	public Job getJob() {
		return Job;
	}
	public void setJob(Job job) {
		Job = job;
	}
	@Override
	public String toString() {
		return "Person [id=" + id + ", name=" + name + ", Job=" + Job + "]";
	}
	
	@PostConstruct
	public void customInit()
	{
		System.out.println("This is Custom Init()");
	}
	
	@PreDestroy
	public void customDestroy()
	{
		System.out.println("This is custom Destroy method");
	}
	@Override
	public void afterPropertiesSet() throws Exception {
		// TODO Auto-generated method stub
		System.out.println("This is Default Init method");
	}
	@Override
	public void destroy() throws Exception {
		// TODO Auto-generated method stub
		System.out.println("This is Default Destroy method");
	}
	@Override
	public void setBeanName(String name) {
		// TODO Auto-generated method stub
		System.out.println("Bean Name = :"+name);
	}
	
	
}
