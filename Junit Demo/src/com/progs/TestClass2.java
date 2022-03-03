package com.progs;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class TestClass2 {

	@BeforeAll  //works only once for a class
	static void setUpBeforeClass() throws Exception {
		System.out.println("test class started");
	}

	@AfterAll//works only once for a class
	static void tearDownAfterClass() throws Exception {
		System.out.println("test class finished");
	}

	@BeforeEach //works for each test
	void setUp() throws Exception {
		System.out.println("test method started");
	}

	@AfterEach//works for each test
	void tearDown() throws Exception {
		System.out.println("test method finished");
	}

	@Test
	void test1() {
		assertEquals(true,true);
		
	}
	@Test
	void test2() {
		assertEquals(true,true);
		
	}


}
