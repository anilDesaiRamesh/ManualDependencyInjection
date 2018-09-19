/**
 * 
 */
package com.anil.didemoManual.controllers;

import com.anil.didemoManual.services.GreetingService;
import com.anil.didemoManual.services.GreetingServiceImpl;

/**
 * @author Anil_Ramesh
 *
 */
public class PropertyInjectedController {

	public GreetingServiceImpl greetingService;

	String sayHello() {
		return greetingService.sayGreeting();
	}

}
