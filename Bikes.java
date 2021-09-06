package javatraining;

import differentpackage.*;
//syntax of class
//accessmodifier class/interface nameofclass
public class Bikes {

	//syntax of method
	//accessmodifier returntype nameofmethod
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("welcome to my training");
		//classname object = new classname()
		Bikes yamaha = new Bikes(); //instance of a class
		Bikes suzuki = new Bikes(); //instance of a class
		yamaha.getspeed();
		suzuki.getspeed();
		Airplane plane = new Airplane();
		plane.status();
		College college = new College();
		int a =college.nameofteacher();
		System.out.println(a);
	}
	
	private  void getspeed(){
		System.out.println("current speed is 100kmph");
	}
	
	/////data types
	//int - numbers
	//String - characters
	//double - decimal values
	//boolean - true,false
	//long - number of huge length
	//float - 31f
	//char - a,b,c,d
	
	/////accessmodifiers
	//public --- accessible from anywhere
	//private -- accessible within class
	//protected -- accessible within package

}
