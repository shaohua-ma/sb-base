package com.certifiedsoup.sbbase;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

import org.springframework.stereotype.Service;

@Service
public class TodoFactory {

	Todo one() {
		return new Todo();
	}

	List<Todo> todos(int n) {
		return IntStream.range(0, n).mapToObj(e -> new Todo("todo #: " + e)).collect(Collectors.toList());
	}
}
