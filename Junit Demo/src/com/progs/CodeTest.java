package com.progs;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class CodeTest {

	@Test
	void test1() {
		int res=new Code1().divide(10, 5);
		assertEquals(2,res);
	}
	@Test
	void test2() {
		int res=new Code1().divide(2,2);
		assertEquals(1,res);
	}
	@Test
	void test3() {
		try {
			
		int res=new Code1().divide(2,0);
		assertEquals(-1,res);
		}
		catch(Exception e)
		{
			fail();
		}
	}

}
