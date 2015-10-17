/**
 *   File Name: CalculatorTests.java<br>
 *
 *   Yutaka<br>
 *   Java Boot Camp Exercise<br>
 *   Instructor: Jean-francois Nepton<br>
 *   Created: Oct 15, 2015
 *   
 */

package com.sqa.ao.math.functions;

import java.util.Arrays;
import java.util.Properties;

import org.junit.Assert;
import org.junit.BeforeClass;
import org.junit.Test;

import com.sqa.ao.utils.Helper;

/**
 * CalculatorTests //ADDD (description of class)
 * 
 * @author Yutaka
 * @version 1.0.0
 * @since 1.0
 *
 */
public class CalculatorTests {

	private static double[][] data;

	private static double test;

	static int columnsCount = 5;
	// static int columnsNumber;

	static int currentTestIndex;

	@BeforeClass
	public static void setupClass() {
		System.out.println("Setup Before Class");
		Properties props = Helper.loadProperties("calculate.properties");
		String[] operands1 = props.getProperty("operand1").split(",");
		String[] operands2 = props.getProperty("operand2").split(",");
		String[] expAddResults = props.getProperty("expAddResult").split(",");
		String[] expSubResults = props.getProperty("expSubResult").split(",");
		String[] expMultResults = props.getProperty("expMultResult").split(",");
		double[] operands1D = new double[operands1.length];
		double[] operands2D = new double[operands2.length];
		double[] expAddResultsD = new double[expAddResults.length];
		double[] expSubResultsD = new double[expSubResults.length];
		double[] expMultResultsD = new double[expMultResults.length];

		for (int i = 0; i < operands1.length; i++) {
			operands1D[i] = Double.parseDouble(operands1[i]);
		}
		for (int i = 0; i < operands2.length; i++) {
			operands2D[i] = Double.parseDouble(operands2[i]);
		}
		for (int i = 0; i < expAddResults.length; i++) {
			expAddResultsD[i] = Double.parseDouble(expAddResults[i]);
		}
		for (int i = 0; i < expSubResults.length; i++) {
			expSubResultsD[i] = Double.parseDouble(expSubResults[i]);
		}
		for (int i = 0; i < expMultResults.length; i++) {
			expMultResultsD[i] = Double.parseDouble(expMultResults[i]);
		}

		data = new double[operands1D.length][];
		for (int row = 0; row < operands1D.length; row++) {
			data[row] = new double[] { operands1D[row], operands2D[row], expAddResultsD[row], expSubResultsD[row],
					expMultResultsD[row] };
		}
		System.out.println("Data Deep: " + Arrays.deepToString(data));
	}

	@Test
	public void test1() {
		System.out.println("Add Test: ");
		double operand1 = data[0][0];
		double operand2 = data[0][1];
		double expAddResult = data[0][2];
		double actualResult = Calculator.addNumbers(operand1, operand2);
		System.out.println(operand1 + " + " + operand2 + " = " + expAddResult + "?... " + " = " + actualResult);
		Assert.assertEquals(expAddResult, actualResult, 0);
	}

	@Test
	public void test2() {
		System.out.println("Add Test: ");
		double operand1 = data[1][0];
		double operand2 = data[1][1];
		double expAddResult = data[1][2];
		double actualResult = Calculator.addNumbers(operand1, operand2);
		System.out.println(operand1 + " + " + operand2 + " = " + expAddResult + "?... " + " = " + actualResult);
		Assert.assertEquals(expAddResult, actualResult, 0);
	}

	@Test
	public void test3() {
		System.out.println("Add Test: ");
		double operand1 = data[2][0];
		double operand2 = data[2][1];
		double expAddResult = data[2][2];
		double actualResult = Calculator.addNumbers(operand1, operand2);
		System.out.println(operand1 + " + " + operand2 + " = " + expAddResult + "?... " + " = " + actualResult);
		Assert.assertEquals(expAddResult, actualResult, 0);
	}

	@Test
	public void test4() {
		System.out.println("Add Test: ");
		double operand1 = data[3][0];
		double operand2 = data[3][1];
		double expAddResult = data[3][2];
		double actualResult = Calculator.addNumbers(operand1, operand2);
		System.out.println(operand1 + " + " + operand2 + " = " + expAddResult + "?... " + " = " + actualResult);
		Assert.assertEquals(expAddResult, actualResult, 0);
	}

	@Test
	public void test5() {
		System.out.println("Add Test: ");
		double operand1 = data[4][0];
		double operand2 = data[4][1];
		double expAddResult = data[4][2];
		double actualResult = Calculator.addNumbers(operand1, operand2);
		System.out.println(operand1 + " + " + operand2 + " = " + expAddResult + "?... " + " = " + actualResult);
		Assert.assertEquals(expAddResult, actualResult, 0);
	}

	@Test
	public void test6() {
		System.out.println("Add Test: ");
		double operand1 = data[5][0];
		double operand2 = data[5][1];
		double expAddResult = data[5][2];
		double actualResult = Calculator.addNumbers(operand1, operand2);
		System.out.println(operand1 + " + " + operand2 + " = " + expAddResult + "?... " + " = " + actualResult);
		Assert.assertEquals(expAddResult, actualResult, 0);
	}

	@Test
	public void test7() {
		System.out.println("Add Test: ");
		double operand1 = data[6][0];
		double operand2 = data[6][1];
		double expAddResult = data[6][2];
		double actualResult = Calculator.addNumbers(operand1, operand2);
		System.out.println(operand1 + " + " + operand2 + " = " + expAddResult + "?... " + " = " + actualResult);
		Assert.assertEquals(expAddResult, actualResult, 0);
	}

	@Test
	public void test8() {
		System.out.println("Add Test: ");
		double operand1 = data[7][0];
		double operand2 = data[7][1];
		double expAddResult = data[7][2];
		double actualResult = Calculator.addNumbers(operand1, operand2);
		System.out.println(operand1 + " + " + operand2 + " = " + expAddResult + "?... " + " = " + actualResult);
		Assert.assertEquals(expAddResult, actualResult, 0);
	}
}
