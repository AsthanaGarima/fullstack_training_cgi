package com.cgi.hibernate_todo.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "todo")
public class Todo {
	@Id
	@Column(name= "id")
	private int todo_id;
	
	@Column(name= "todo_name")
	private String todo_name;
	
	@Column(name= "isCompleted")
	private boolean isCompleted;

	public int getTodo_id() {
		return todo_id;
	}

	public void setTodo_id(int todo_id) {
		this.todo_id = todo_id;
	}

	public String getTodo_name() {
		return todo_name;
	}

	@Override
	public String toString() {
		return "Todo [todo_id=" + todo_id + ", todo_name=" + todo_name + ", isCompleted=" + isCompleted + "]";
	}

	public Todo() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Todo(int todo_id, String todo_name, boolean isCompleted) {
		super();
		this.todo_id = todo_id;
		this.todo_name = todo_name;
		this.isCompleted = isCompleted;
	}

	public void setTodo_name(String todo_name) {
		this.todo_name = todo_name;
	}

	public boolean isCompleted() {
		return isCompleted;
	}

	public void setCompleted(boolean isCompleted) {
		this.isCompleted = isCompleted;
	}
	
	
	

}
