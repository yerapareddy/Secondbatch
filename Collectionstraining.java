package javatraining;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

import org.omg.Messaging.SyncScopeHelper;

public class Collectionstraining {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int[] a= new int[3];
		a[0]=1;
		a[1]=2;
		a[2]=3;
		System.out.println(a[1]);
		
		ArrayList<String> b = new ArrayList<>();
		b.add("firstname");
		b.add("lastname");
		b.add("middlename");
		System.out.println(b.get(2));
		
		List<String> c = new ArrayList<>();
		c.add("value");
		System.out.println(c.get(0));
		map();
	}
	
	public static void map(){
		HashMap<String,String> m = new HashMap();
		m.put("zipcode", "515671");
		m.put("city", "anantapur");
		m.put("state", "AP");
		System.out.println(m.get("zipcode"));
		
		m.forEach((k,v)->
		System.out.println(k+"===="+v)
		);
		
	}

}
