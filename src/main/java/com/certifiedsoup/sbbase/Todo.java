package com.certifiedsoup.sbbase;

import java.util.Date;

import org.springframework.stereotype.Component;

import lombok.Data;
import lombok.NoArgsConstructor;

@Component
@Data
@NoArgsConstructor
public class Todo {

	public Todo(String todo) {
		this.todo = todo;
	}

	long Id;
	String todo = "todo-default";
	Date due;

}
