/**
 * 
 */
package com.anil.didemoManual.controllers;

import com.anil.didemoManual.services.GreetingService;

/**
 * @author Anil_Ramesh
 *
 */
public class ConstructorInjectedDIController {

	private GreetingService greetingService;

	public ConstructorInjectedDIController(GreetingService greetingService) {
		super();
		this.greetingService = greetingService;
	}

	public String sayHello() {
		return greetingService.sayGreeting();
	}

}
