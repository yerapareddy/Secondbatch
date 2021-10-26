package datadrivenframework;

import java.io.FileOutputStream;
import java.io.IOException;
import java.util.ArrayList;

import org.testng.Assert;
import org.testng.annotations.Test;
import datadrivenframework.*;
public class GetDataTest {
	
	@Test
	public static void getdata() throws IOException{
		datafromexcel d=new datafromexcel();
		ArrayList<String> data = d.getdatafromexcel("C:\\Users\\Yerapa.Reddy\\Downloads\\Dataforlogin.xlsx","Dataset1","Testcasename","AdminLogin");
		System.out.println(data.get(1));
		System.out.println(data.get(2));
		Assert.assertEquals(data.get(1), "yerapa");
	}
}
