package com.renju.training.jenkins;

import org.testng.annotations.Test;
import org.testng.AssertJUnit;

public class JenkinsCalcTest {

	@Test
	public void addTest() {
		JenkinsCalculator myCalc = new JenkinsCalculator();
		AssertJUnit.assertEquals(10, myCalc.addNumbers(5, 5));
	}

	@Test
	public void subtractTest() {
		JenkinsCalculator myCalc = new JenkinsCalculator();
		AssertJUnit.assertEquals(5, myCalc.subtractNumbers(10, 5));
	}

}
