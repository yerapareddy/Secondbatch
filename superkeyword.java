package javatraining;

public class superkeyword extends keywords{
	int e=36;
	int a =66;
	public void getvalue(){
		System.out.println("value of e : "+e);
		System.out.println("value of a in superkeyword class : "+super.a);
		System.out.println("value of a in superkeyword class without super keyword : "+a);
		calculate();
	}
}
