package com.progs;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class MyProgramTest {

	@Test
	void testFindSum1() {
		MyProgram prog=new MyProgram();
		int actual=prog.findSum(20, 5);
		assertEquals(25,actual);
	}
	@Test
	void testFindSum2() {
		MyProgram prog=new MyProgram();
		int actual=prog.findSum(2, 5);
		assertEquals(7,actual);
	}

}
//Junit5 is also called as Jupiter Class