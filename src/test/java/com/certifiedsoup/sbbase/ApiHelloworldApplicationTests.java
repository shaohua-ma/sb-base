package com.certifiedsoup.sbbase;

import java.util.Collections;
import java.util.List;

import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mockito;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest(classes = TodoFactory.class)
public class ApiHelloworldApplicationTests {
	@Value("${testname}")
	String testname;
	
	@Autowired
	TodoFactory factory;
	
	@MockBean
	TodoFactory mockfactory;

//	@Test
//	void contextLoads() {
//	}

	@Test
	public void testone() {
		int ntodos = 9;
		List<Todo> todos = factory.todos(ntodos);
//		Assert.assertThat(actual, matcher);
//		System.out
//		Assert.assertTrue(todos.size() == ntodos);
		Assert.assertTrue(todos.size() == 0);
	}

	@Test
	public void testmock() {
		int ntodos = 9;
		Mockito.when(mockfactory.todos(Mockito.anyInt())).thenReturn(Collections.emptyList());
		
		List<Todo> todos = mockfactory.todos(ntodos);
//		Assert.assertThat(actual, matcher);
//		System.out
		Assert.assertTrue(todos.size() == 0);
	}
	
	/**
	 * this will fail is @SpringBootTest anno is missing.
	 */
	@Test
	public void testAppsetting() {
		Assert.assertEquals("hello", this.testname);
	}
}
