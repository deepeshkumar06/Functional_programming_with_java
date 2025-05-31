package Programming;

import java.util.List;

public class FP01Function {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<Integer> list = List.of(12,3,4,5,6,2,3,9,7);
//		printallno(list);
		printevenno(list);
	}

//	public static void print(int num) {
//		System.out.println(num);
//	}
	public static boolean isEven(int num) {
		return num%2 == 0;
	}
	
//	private static void printallno(List<Integer> Numbers) {
//		// TODO Auto-generated method stub
//		Numbers.stream().forEach(FP01Function :: print);
//	}
	private static void printevenno(List<Integer> Numbers) {
		// TODO Auto-generated method stub
		Numbers.stream().
			//filter(FP01Function :: isEven). //method Reference
			filter(num -> num%2 == 0).		//Lambda Function
			forEach(System.out :: println); //Pre-defined Method Reference
	}

}
