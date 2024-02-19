
public class ArrayExample {
	
	public static void main(String[]args) {
		int[]array1=new int[10];
		int[]array2=new int[10];
		int[]array3= {1,2,3,4,5};
				
		String[] words= {"Hello","World"}; //string array
		
		for (int i=0;i<array3.length;i++) {
			System.out.println(array3[i]);
			array2[i]=array3[i];
		}
		//
		System.out.println("For each loop");
		for (int a:array2) {
			System.out.println(a);
		}
	}

}
