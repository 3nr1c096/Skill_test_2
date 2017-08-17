package skill.test;

import java.util.Arrays;
import java.util.Scanner;

public class PrimeFactors {
	static int[] v = new int[0];
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Please insert a number: ");
		int n = sc.nextInt();
		sc.close();
		int x = n / 2;
		for(int i = 2; i <= x && n > 1; i++)
			if(n % i == 0) {
				v = Arrays.copyOf(v, v.length + 1);
				v[v.length - 1] = i;
				n /= i;
				i--;
			}
		System.out.println(Arrays.toString(v));
	}//main
}//PrimeFactors
