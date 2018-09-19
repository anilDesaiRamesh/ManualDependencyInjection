/**
 * 
 */
package com.anil.didemoManual.controllers;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.Before;

import com.anil.didemoManual.services.GreetingServiceImpl;

/**
 * @author Anil_Ramesh
 *
 */
public class SetterInectedDIControllerTest {

	private SetterInjectedDIController setterInjectedDIController;

	@Before
	public void init() {
		this.setterInjectedDIController = new SetterInjectedDIController();
		this.setterInjectedDIController.setGreetingService(new GreetingServiceImpl());
	}

	@org.junit.Test
	public void testGreeting() {
		assertEquals(GreetingServiceImpl.HELLO_GURUS, setterInjectedDIController.sayHello());
	}

}
