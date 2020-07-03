package com.benin.magic8ball2;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.MethodOrderer;
import org.junit.jupiter.api.Order;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestMethodOrder;
@TestMethodOrder(MethodOrderer.OrderAnnotation.class)

class Magic8Ball2Test {
	private static Magic8Ball2 m8b2; 

	@BeforeAll
	static void setUpBeforeClass() throws Exception {
		m8b2 = new Magic8Ball2();
	}

	@Test
	@Order(1)
	void magic8Ball2_GivenNoParameters_ShouldConstructObject() {
    assertTrue(m8b2 instanceof Magic8Ball2);
	}
	@Test
	@Order(2)
	void askQuestion_GivenAString_ShouldReturnTrue() {
		boolean success = false;
		String question = "Should I cut bangs into my hair..";
		
		success = m8b2.askQuestion(question);
		assertTrue(success);
		assertEquals(question, m8b2.getQuestion());
	}
	@Test
	@Order(3)
	void shakea_GivenNoParameters_ShouldReturnAnswer() {
		String answer = null;
		answer = m8b2.shake();
	    assertNotNull(answer);
	    //assertEquals("Without a doubt, Yes", answer);
	  //  assertEquals("Most likely", answer);
	   // assertEquals("Cannot predict now", answer);
	   // assertEquals("Outlook not so good", answer);
	    //assertEquals("Please don't ask again", answer);
	   //assertEquals("You may rely on it", answer);
		assertNotEquals ("Benin", answer);
	}

}
