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

import static org.junit.Assert.fail;

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

	@BeforeClass
	public static void setupClass() {
		System.out.println("Setup Before Class");
		Properties props = Helper.loadProperties("calculate.properties");
		String[] operands1 = props.getProperty("operand1").split(",");
		String[] operands2 = props.getProperty("operand2").split(",");
		String[] expAddResults = props.getProperty("expAddResult").split(",");
		String[] expSubResults = props.getProperty("expSubResult").split(",");
		String[] expMultResults = props.getProperty("expMultResult").split(",");
		System.out.println(
				Arrays.toString(operands1) + "\n" + Arrays.toString(operands2) + "\n" + Arrays.toString(expAddResults)
						+ "\n" + Arrays.toString(expSubResults) + "\n" + Arrays.toString(expMultResults));
	}

	private double[][] data;
	int currentTestIndex;

	double test;

	@Test
	public void test1() {
		fail("Not yet implemented");
	}

	@Test
	public void test2() {
		fail("Not yet implemented");
	}

	@Test
	public void test3() {
		fail("Not yet implemented");
	}

	@Test
	public void test4() {
		fail("Not yet implemented");
	}

	@Test
	public void test5() {
		fail("Not yet implemented");
	}

	@Test
	public void test6() {
		fail("Not yet implemented");
	}

	@Test
	public void test7() {
		fail("Not yet implemented");
	}

	@Test
	public void test8() {
		fail("Not yet implemented");
	}

}
