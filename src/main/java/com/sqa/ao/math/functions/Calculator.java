/**
 *   File Name: Calculator.java<br>
 *
 *   Yutaka<br>
 *   Java Boot Camp Exercise<br>
 *   Instructor: Jean-francois Nepton<br>
 *   Created: Oct 15, 2015
 *   
 */

package com.sqa.ao.math.functions;

/**
 * [4:24:59 PM] JF Nepton: Today's Warm Up/ Evening Activity... [4:25:02 PM] JF
 * Nepton: Lesson 16 Warmup: Calculator Propped-Up Create a class which reads
 * the properties and provides feedback based on supplied values.
 * 
 * Class should have helper methods with following signatures: public double
 * static addNumbers(double operand1, double operand2); public double static
 * multiplyNumbers(double operand1, double operand2); public double static
 * divideNumbers(double operand1, double operand2);
 * 
 * JUnit test case with a double[][] data which should gather data from
 * properties file. Your JUnit Class must satisfy the following requirements: -
 * Have only three variables double[][] data, double[] test, and int
 * currentTestIndex - A Junit Class variable which holds all values from
 * properties file into a double[][] 2D array - May want to refer to the split()
 * command - The 2D matrix should be populated in the beginning of the JUnit
 * life cycle - The 2D matrix should be set to null at the end of the JUnit life
 * cycle - A double[] should be captured from the 2D array before each method -
 * This array represents an individual test. - A double[] should be set to null
 * after each method call, as well as currentTestIndex incremented. - A test
 * method for each set of numbers (total of 8 Test methods), which each test the
 * 3 functions above and compare to exp***Result values
 * 
 * Properties File: calculate.properties operand1 = 8,5,7,5,8,9,3,5 operand2 =
 * 2,1,6,3,8,3,2,1 expAddResult = 10,6,13,9,16,12,6,6 expSubResult =
 * 6,4,1,2,0,7,1,4 expMultResult = 16,6,42,15,84,27,5,5 [4:28:04 PM] JF Nepton:
 * Sorry should be addNumbers, subtractNumbers, and multplyNumbers, NOT
 * divideNumbers [4:28:41 PM] JF Nepton: Lesson 16 Warmup: Calculator Propped-Up
 * Create a class which reads the properties and provides feedback based on
 * supplied values.
 * 
 * Class should have helper methods with following signatures: public double
 * static addNumbers(double operand1, double operand2); public double static
 * subtractNumbers(double operand1, double operand2); public double static
 * multiplyNumbers(double operand1, double operand2);
 * 
 * JUnit test case with a double[][] data which should gather data from
 * properties file. Your JUnit Class must satisfy the following requirements: -
 * Have only three variables double[][] data, double[] test, and int
 * currentTestIndex - A Junit Class variable which holds all values from
 * properties file into a double[][] 2D array - May want to refer to the split()
 * command - The 2D matrix should be populated in the beginning of the JUnit
 * life cycle - The 2D matrix should be set to null at the end of the JUnit life
 * cycle - A double[] should be captured from the 2D array before each method -
 * This array represents an individual test. - A double[] should be set to null
 * after each method call, as well as currentTestIndex incremented. - A test
 * method for each set of numbers (total of 8 Test methods), which each test the
 * 3 functions above and compare to exp***Result values
 * 
 * Properties File: calculate.properties operand1 = 8,5,7,5,8,9,3,5 operand2 =
 * 2,1,6,3,8,3,2,1 expAddResult = 10,6,13,9,16,12,6,6 expSubResult =
 * 6,4,1,2,0,7,1,4 expMultResult = 16,6,42,15,84,27,5,5 [6:04:17 PM] JF Nepton:
 * Guide to naming conventions on groupId, artifactId and version groupId will
 * identify your project uniquely across all projects, so we need to enforce a
 * naming schema. It has to follow the package name rules, what means that has
 * to be at least as a domain name you control, and you can create as many
 * subgroups as you want. Look at More information about package names. eg.
 * org.apache.maven, org.apache.commons
 * 
 * A good way to determine the granularity of the groupId is to use the project
 * structure. That is, if the current project is a multiple module project, it
 * should append a new identifier to the parent's groupId.
 * 
 * eg. org.apache.maven, org.apache.maven.plugins, org.apache.maven.reporting
 * 
 * artifactId is the name of the jar without version. If you created it then you
 * can choose whatever name you want with lowercase letters and no strange
 * symbols. If it's a third party jar you have to take the name of the jar as
 * it's distributed. eg. maven, commons-math
 * 
 * version if you distribute it then you can choose any typical version with
 * numbers and dots (1.0, 1.1, 1.0.1, ...). Don't use dates as they are usually
 * associated with SNAPSHOT (nightly) builds. If it's a third party artifact,
 * you have to use their version number whatever it is, and as strange as it can
 * look. eg. 2.0, 2.0.1, 1.3.1 [6:19:09 PM] JF Nepton: groupId - com.sqa.jmn
 * [6:19:33 PM] JF Nepton: artifactId - math version - 1.0-SNAPSHOT [6:19:47 PM]
 * JF Nepton: Class name: math (based on artifactId) [6:20:11 PM] JF Nepton:
 * package com.sqa.jmn.math (groupId + artifactId) [6:20:30 PM] JF Nepton: Class
 * Name - Calculator Calculator //ADDD (description of class)
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
public class Calculator {
	public static double addNumbers(double operand1, double operand2) {
		double result = operand1 + operand2;
		return result;
	}

	public static double multiplyNumbers(double operand1, double operand2) {
		double result = operand1 * operand2;
		return result;
	}

	public static double subtractNumbers(double operand1, double operand2) {
		double result = operand1 - operand2;
		return result;
	}

}
