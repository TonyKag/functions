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

import org.junit.BeforeClass;
import org.junit.Test;

import com.sqa.ao.utils.Helper;

/**
 * CalculatorTests //ADDD (description of class)
 * <p>
 * //ADDD (description of core fields)
 * <p>
 * //ADDD (description of core methods)
 * 
 * @author Yutaka
 * @version 1.0.0
 * @since 1.0
 *
 */
public class CalculatorTests {

	private static double[][] data;

	private static double test;

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
		System.out.println("Strings:" + Arrays.toString(operands1) + "\n" + Arrays.toString(operands2) + "\n"
				+ Arrays.toString(expAddResults) + "\n" + Arrays.toString(expSubResults) + "\n"
				+ Arrays.toString(expMultResults));
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
		System.out.println("Doubles:" + Arrays.toString(operands1D) + "\n" + Arrays.toString(operands2D) + "\n"
				+ Arrays.toString(expAddResultsD) + "\n" + Arrays.toString(expSubResultsD) + "\n"
				+ Arrays.toString(expMultResultsD));

		data = new double[operands1D.length][];
		data[0] = operands1D;
		data[1] = operands2D;
		data[2] = expAddResultsD;
		data[3] = expSubResultsD;
		data[4] = expMultResultsD;
		System.out.println("Data: " + Arrays.deepToString(data));
	}

	int currentTestIndex;

	@Test
	public void test1() {
		// fail("Not yet implemented");
	}

	@Test
	public void test2() {
		// fail("Not yet implemented");
	}

	@Test
	public void test3() {
		// fail("Not yet implemented");
	}

	@Test
	public void test4() {
		// fail("Not yet implemented");
	}

	@Test
	public void test5() {
		// fail("Not yet implemented");
	}

	@Test
	public void test6() {
		// fail("Not yet implemented");
	}

	@Test
	public void test7() {
		// fail("Not yet implemented");
	}

	@Test
	public void test8() {
		// fail("Not yet implemented");
	}

}
