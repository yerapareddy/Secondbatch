package javatraining;

public class overriding {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//overriding is about creating same method with same set of parameters in a different class
		overriding or = new overriding();
		or.rateofInterest();
		SBI sbi = new SBI();
		AXIS axis = new AXIS();
		sbi.rateofInterest();
		axis.rateofInterest();
	}
	
	public void rateofInterest(){
		System.out.println("Interest is 8%");
	}
}
