package javatraining;



public class exceptiontraining {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try{
			exception();
		int a=100/0;
		System.out.println("coming here");
		}catch (Exception e){
			System.out.println(e);
			System.out.println("coming here");
		}
	}
	
	public static void exception()  {
		
		try{
			int a =100;
			int[] b = new int[2];
			
			String s=null;
			if(s.equals(null)){
				throw new ArithmeticException();
			}
			
			
			
		}catch(ArithmeticException e){
			System.out.println("ArithmeticException==="+e);
		}catch(ArrayIndexOutOfBoundsException e){
			System.out.println("ArrayIndexOutOfBoundsException==="+e);
		}catch(NumberFormatException e){
			System.out.println("NumberFormatException==="+e);
		}catch(Exception e){
			System.out.println("Exception==="+e);
		}finally{
			System.out.println("i am done");
		}
		
	}

}
