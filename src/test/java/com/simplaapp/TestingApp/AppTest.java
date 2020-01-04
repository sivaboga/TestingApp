package com.simplaapp.TestingApp;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.assertThat;

import org.junit.Test;

public class AppTest{

	@Test
	public void multiplication() {
		App app = new App();
		int r = app.multiply(10, 0);
		
		assertThat(r, is(0));

	}

}
