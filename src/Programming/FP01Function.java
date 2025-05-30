package Programming;

import java.util.List;

public class FP01Function {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		printallno(List.of(12,3,4,5,6,2,3,9,7));
	}

	public static void print(int num) {
		System.out.println(num);
	}
	
	private static void printallno(List<Integer> Numbers) {
		// TODO Auto-generated method stub
		Numbers.stream().forEach(FP01Function :: print);
	}

}
