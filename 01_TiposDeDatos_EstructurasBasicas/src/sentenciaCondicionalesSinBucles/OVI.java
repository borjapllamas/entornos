package sentenciaCondicionalesSinBucles;

import java.util.Scanner;

public class OVI {

	public OVI() {
		int num;
		Scanner sc = new Scanner(System.in);
		System.out.println("Introduce 3 números");
		int num1 = sc.nextInt();
		int num2 = sc.nextInt();
		int num3 = sc.nextInt();
		if (num1>num2) {
			num = num1;
		num1 = num2;
		num2 = num;
		}
		if (num2>num3) {
			num = num2;
		num2 = num3;
		num3 = num;
		}
		if (num3>num1) {
			num = num3;
		num3 = num1;
		num1 = num;
		}
		
	}

}
