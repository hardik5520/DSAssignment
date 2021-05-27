package com.assignment.dsassignmentservice;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;

import org.springframework.web.bind.annotation.RestController;

@RestController
public class ComputeServiceController {

	@Autowired
	private ProxyServer proxy;
	
	@GetMapping("/add")
	public ComputeService addition() {
		ComputeService computeService = proxy.retreiveValues();

		return new 
				ComputeService(computeService.val1,computeService.val2,(computeService.val2+computeService.val1));	
	}
	
	@GetMapping("/diff")
	public ComputeService subtraction() {
		ComputeService computeService = proxy.retreiveValues();

		return new 
				ComputeService(computeService.val1,computeService.val2,(Math.abs(computeService.val2-computeService.val1)));	
	}
	
	@GetMapping("/mul")
	public ComputeService multiplication() {
		ComputeService computeService = proxy.retreiveValues();

		return new 
				ComputeService(computeService.val1,computeService.val2,(computeService.val2*computeService.val1));	
	}
	
	@GetMapping("/div")
	public ComputeService division() {
		ComputeService computeService = proxy.retreiveValues();

		return new 
				ComputeService(computeService.val1,computeService.val2,(computeService.val2/computeService.val1));	
	}
	
	@GetMapping("/mod")
	public ComputeService modulus() {
		ComputeService computeService = proxy.retreiveValues();

		return new 
				ComputeService(computeService.val1,computeService.val2,(computeService.val2%computeService.val1));	
	}
	
	

}
