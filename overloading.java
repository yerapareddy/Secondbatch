package javatraining;

public class overloading {
	int value;
	
	public overloading(){
		value=100; 
		System.out.println(value);
	}
	public overloading(int value){
		value=value; 
		System.out.println(value);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//overloading is nothing but defining same method in a class with different set of parameters
		overloading o = new overloading();
		overloading o1 = new overloading(200);
		
		/*o.multiplicationtable();
		o.multiplicationtable(8,9 );
		o.multiplicationtable(10,12,32 );*/
	}
	
	public void multiplicationtable(){
		System.out.println("5*1 : "+5);
	}
	
	
	public void multiplicationtable(int table, int value){
		System.out.println(table +" * "+ value+" == "+table*value);
	}
	public void multiplicationtable(int table, int from,int to){
		//loops
		//for,while,do while
		
		//syntax of for loop
		//initialization(will happen only once which is at the start),condition,operation(increment,decrement)
		/*for(int i=from;i<=to;i++){
		System.out.println(table +" * "+ i+" == "+table*i);
		}*/
		/* int j=from;
		//syntax of while loop
		//while(condition)
		while(j<=to){
			System.out.println(table +" * "+ j+" == "+table*j);
			j++;
		}*/
		int k=from;
		//syntax of do while loop
		do{
			
			System.out.println(table +" * "+ k+" == "+table*k);
			k++;
		}while(k<=to);
	}

}
