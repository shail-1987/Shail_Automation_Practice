package Shail_Automation_testNG;

import org.testng.annotations.Test;

import dev.failsafe.internal.util.Assert;

public class Practice_testNG {

	@Test(priority = 1)
	void display() {
		System.out.println("Using testNG");

	}

	@Test(priority = 2)
	void show() {
		System.out.println("Using testNG");
		
	}
}



