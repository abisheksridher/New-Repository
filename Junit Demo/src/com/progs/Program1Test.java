package com.progs;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class Program1Test {

	@Test
	public void test1() 
	{
		try {
			int res=new Program1().solution("a@#1");
		} catch(BugException e) {
			assertEquals("Invalid Character",e.getMessage());
		}
	}
	@Test
	public void test2() 
	{
		try {
			int res=new Program1().solution("a1b2n");
			assertEquals(3,res);
		} catch(BugException e) {
			fail();
		}
}		
		