package QualityKioskTraining.CalculatorAPI;

import org.testng.annotations.Test;
import org.testng.Assert;


public class AdditionTestCases {
	Calculator obj = new Calculator();
	@Test
	public void TestAdditionWithPositiveNumbers() {
		//calculator obj = new calculator();
		int Result = obj.Addition(10,20);
		Assert.assertEquals(Result,30, "Addition doesnt work with positive numbers");
	}
	@Test
	public void TestAdditionWithNegativeNumbers() {
		//calculator obj = new calculator();
		int Result = obj.Subtration(20,10);
		Assert.assertEquals(Result,10, "Bigger number can't subtract from smaller number");
	}

	@Test
	public void TestAdditionWithZeroNumbers() {
		//calculator obj = new calculator();
		int Result = obj.Subtration(0,0);
		Assert.assertEquals(Result,0, "Bigger number can't Addition from Zero number");
	}
	
	@Test
	public void TestAdditionalWithOnePositiveOneNegativeNumbers() {
	
		int Result = obj.Addition(20,-10);
		Assert.assertEquals(Result,10, "Addition doesnt work with OnePositiveOneNegativeNumbers");
	}
}
