package com.cgi.spring_hibernate_todo.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "todo")
public class Todo {
	@Id
	@Column( name = "id")
	private int id;
	public Todo(int id, String name, boolean isComplete) {
		super();
		this.id = id;
		this.name = name;
		this.isComplete = isComplete;
	}
	@Override
	public String toString() {
		return "Todo [id=" + id + ", name=" + name + ", isComplete=" + isComplete + "]";
	}
	public int getId() {
		return id;
	}
	public Todo() {
		super();
		// TODO Auto-generated constructor stub
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
	public boolean isComplete() {
		return isComplete;
	}
	public void setComplete(boolean isComplete) {
		this.isComplete = isComplete;
	}
	@Column( name = "todo_name")
	private String name;
	@Column( name = "isCompleted")
	private boolean isComplete;
}
