package testngtraining;

import org.testng.annotations.Parameters;
import org.testng.annotations.Test;
import org.testng.annotations.Test;

public class maths {
	@Test
	@Parameters({"a","b"})
	public static void add(int a,int b){
		System.out.println(a+b);
	}
	@Test(enabled=false)
	@Parameters({"a","b"})
	public static void subtract(int a, int b){
		System.out.println(a-b);
	}
	@Test
	@Parameters({"a","b"})
	public static void multiply(int a,int b){
		System.out.println(a*b);
	}
}
