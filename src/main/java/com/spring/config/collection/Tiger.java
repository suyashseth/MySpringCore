package com.spring.config.collection;

import java.util.List;
import java.util.Set;

public class Tiger {

	private int tid;
	private Set<String>name;
	private List<Job>job;
	public int getTid() {
		return tid;
	}
	public void setTid(int tid) {
		this.tid = tid;
	}
	
	public Set<String> getName() {
		return name;
	}
	public void setName(Set<String> name) {
		this.name = name;
	}
	public List<Job> getJob() {
		return job;
	}
	public void setJob(List<Job> job) {
		this.job = job;
	}
	@Override
	public String toString() {
		return "Tiger [tid=" + tid + ", name=" + name + ", job=" + job + "]";
	}
	
	
	
}
