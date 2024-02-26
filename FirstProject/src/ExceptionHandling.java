
public class ExceptionHandling {
	public static void main(String[] args) {
		int[]arrayA=new int[2];
		arrayA[0]=1;
		arrayA[1]=2;
		
		try {
//		System.out.println(arrayA[3]);
		int i=50;
		int c=i/0;
		}
//		catch(Exception e) {
//			System.out.println("Exception occured");
//		}
		catch(ArrayIndexOutOfBoundsException e) {
			System.out.println("ArrayIndexOutOfBoundsException Occured");
		}
		
		catch(ArithmeticException e) {
			System.out.println("ArithmeticException Occured");
		}
		catch(Exception e) {
		System.out.println("Exception occured");
	}finally {
		System.out.println("Finally block");
	}
		
		System.out.println(arrayA[1]);
		System.out.println(arrayA[0]);
	}	

}
