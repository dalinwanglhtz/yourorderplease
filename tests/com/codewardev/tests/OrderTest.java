package com.codewardev.tests;


import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import com.codewardev.Order;

class OrderTest {

	 @Test
	  public void test1() {
	    assertEquals("Thi1s is2 3a T4est", Order.order("is2 Thi1s T4est 3a"));
	  }
	  
	  @Test
	  public void test2() {
		  assertEquals(Order.order("4of Fo1r pe6ople g3ood th5e the2"), "Fo1r the2 g3ood 4of th5e pe6ople");
	  }
	  
	  @Test
	  public void test3() {
		  assertEquals(Order.order(""), "");
		}
}
