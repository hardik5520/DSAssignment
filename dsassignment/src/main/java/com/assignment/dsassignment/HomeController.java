package com.assignment.dsassignment;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HomeController {
	float a,b;
	@GetMapping("/setvalue/val1/{val1}/val2/{val2}")
	public Value HomePage(
			@PathVariable float val1,
			@PathVariable float val2) {
		
		a=val1;
		b=val2;
		return new Value(val1,val2);	
	}
	
	@GetMapping("/getvalue")
	public Value retreiveValues() {
		
		return new Value(a,b);	
	}
	
	

}
