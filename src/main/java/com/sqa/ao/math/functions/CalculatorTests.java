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

	static int columnsCount = 5;
	static int columnsNumber;

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
		// System.out.println("Strings:" + Arrays.toString(operands1) + "\n" +
		// Arrays.toString(operands2) + "\n"
		// + Arrays.toString(expAddResults) + "\n" +
		// Arrays.toString(expSubResults) + "\n"
		// + Arrays.toString(expMultResults));
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
		// System.out.println("Doubles:" + Arrays.toString(operands1D) + "\n" +
		// Arrays.toString(operands2D) + "\n"
		// + Arrays.toString(expAddResultsD) + "\n" +
		// Arrays.toString(expSubResultsD) + "\n"
		// + Arrays.toString(expMultResultsD));
		// data = new double[operands1D.length][];
		// data[0] = operands1D;
		// data[1] = operands2D;
		// data[2] = expAddResultsD;
		// data[3] = expAddResultsD;
		// data[4] = expAddResultsD;
		// System.out.println("Data Deep: " + Arrays.deepToString(data));
		// System.out.println("Data String: " + Arrays.toString(data));
		// double data[][] = { { operands1D[0], operands2D[0],
		// expAddResultsD[0], expSubResultsD[0], expMultResultsD[0] },
		// { operands1D[1], operands2D[1], expAddResultsD[1], expSubResultsD[1],
		// expMultResultsD[1] },
		// { operands1D[2], operands2D[2], expAddResultsD[2], expSubResultsD[2],
		// expMultResultsD[2] },
		// { operands1D[3], operands2D[3], expAddResultsD[3], expSubResultsD[3],
		// expMultResultsD[3] },
		// { operands1D[4], operands2D[4], expAddResultsD[4], expSubResultsD[4],
		// expMultResultsD[4] },
		// { operands1D[5], operands2D[5], expAddResultsD[5], expSubResultsD[5],
		// expMultResultsD[5] },
		// { operands1D[6], operands2D[6], expAddResultsD[6], expSubResultsD[6],
		// expMultResultsD[6] },
		// { operands1D[7], operands2D[7], expAddResultsD[7], expSubResultsD[7],
		// expMultResultsD[7] } };
		// data[0] = new double[]
		// {operands1D[0],operands2D[0],expAddResultsD[0],
		// expSubResultsD[0],expMultResultsD[0]};
		// {operands1D[1],operands2D[1],expAddResultsD[1],
		// expSubResultsD[1],expMultResultsD[1]},
		// {operands1D[2],operands2D[2],expAddResultsD[2],
		// expSubResultsD[2],expMultResultsD[2]},
		// {operands1D[3],operands2D[3],expAddResultsD[3],
		// expSubResultsD[3],expMultResultsD[3]},
		// {operands1D[4],operands2D[4],expAddResultsD[4],
		// expSubResultsD[4],expMultResultsD[4]},
		// {operands1D[5],operands2D[5],expAddResultsD[5],
		// expSubResultsD[5],expMultResultsD[5]},
		// {operands1D[6],operands2D[6],expAddResultsD[6],
		// expSubResultsD[6],expMultResultsD[6]},
		// {operands1D[7],operands2D[7],expAddResultsD[7],
		// expSubResultsD[7],expMultResultsD[7]}};
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
