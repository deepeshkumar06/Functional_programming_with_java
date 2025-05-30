package Programming;

import java.util.List;

public class FP01Structured {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		printallno(List.of(12,3,4,5,6,2,3,9,7));
	}

	private static void printallno(List<Integer> Numbers) {
		// TODO Auto-generated method stub
		for(int num : Numbers) {
			System.out.println(num);
		}
	}

}
