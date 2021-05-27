package com.assignment.dsassignmentservice;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

@FeignClient(name="home-page", url="localhost:8000")
public interface ProxyServer {
	
	@GetMapping("/getvalue")
	public ComputeService retreiveValues();

}
