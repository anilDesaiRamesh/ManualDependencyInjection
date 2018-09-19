/**
 * 
 */
package com.anil.didemoManual.controllers;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.Before;
import org.junit.Test;

import com.anil.didemoManual.services.GreetingServiceImpl;

/**
 * @author Anil_Ramesh
 *
 */
public class ConstructorInjectedDIControllerTest {

	private ConstructorInjectedDIController constructorInjectedDIController;

	@Before
	public void init() {

		this.constructorInjectedDIController = new ConstructorInjectedDIController(new GreetingServiceImpl());
	}

	@Test
	public void testGreeting() {
		assertEquals(GreetingServiceImpl.HELLO_GURUS, constructorInjectedDIController.sayHello());
	}

}
