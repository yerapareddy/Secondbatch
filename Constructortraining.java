package javatraining;

public class Constructortraining {
	
	 int a;
	//name of constructor should be the same as classname
		//constructor doesnt have returntype
		public Constructortraining(int b){
			a=b;
		}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Constructortraining c = new Constructortraining(100);
		System.out.println(c.getvalue());
	}
	public  int getvalue(){
		return a;
	}

}
