/**
 * 
 */
package com.anil.didemoManual.controllers;

import com.anil.didemoManual.services.GreetingService;

/**
 * @author Anil_Ramesh
 *
 */
public class SetterInjectedDIController {

	private GreetingService greetingService;

	public String sayHello() {
		return greetingService.sayGreeting();
	}

	public void setGreetingService(GreetingService greetingService) {
		this.greetingService = greetingService;
	}

}
