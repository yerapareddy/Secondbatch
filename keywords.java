package javatraining;

public class keywords {
	static int a=10;
	final int c=100; // we cant change the value of this variable
	int b=10;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//static defines memory allocation of variable
		keywords k1 = new keywords();
		k1.calculate();
		k1.calculate();
		System.out.println("after second instance");
		keywords k2 = new keywords();
		k2.calculate();
		k2.add(10,200);
		
		superkeyword s = new superkeyword();
		s.getvalue();
	}
	
	public void calculate(){
		//++ is an incremental operator
		//a++ is equivalent to a=a+1
		a++;//post increment
		b++;
		//++a; //pre increment
		System.out.println("value of a in keywords class is : "+a);
		System.out.println("value of b is : "+b);
		System.out.println("value of c is : "+c);
	}
	
	public void add(int a, int b){
//		a=this.a;
//		b=this.b;
		int d = a+b;
		System.out.println("value of d is : "+d);
	}

}
