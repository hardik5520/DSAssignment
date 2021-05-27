package com.assignment.dsassignmentservice;


public class ComputeService {
	
	float answer,val1,val2;

	public ComputeService(float val1, float val2, float answer) {
		super();
		this.val1 = val1;
		this.val2 = val2;
		this.answer = answer;
	}
	public ComputeService() {
	}
	public float getVal1() {
		return val1;
	}
	public void setVal1(int val1) {
		this.val1 = val1;
	}
	public float getVal2() {
		return val2;
	}
	public void setVal2(int val2) {
		this.val2 = val2;
	}
	public float getAnswer() {
		return answer;
	}
	public void setAnswer(int answer) {
		this.answer = answer;
	}
	
	
	
	

}
