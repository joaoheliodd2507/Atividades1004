package estruturaCondicional;

import java.util.Scanner;

public class Multiplo1004 {

	public static void main(String[] args) {
		double V1;
		Scanner ler = new Scanner(System.in);
		System.out.println("Informe um valor");
		V1 = ler.nextDouble();
		
		String msg = V1 % 5 ==0 ? " O numero é multiplo de 5 " : " O numero não é multiplo de 5";
		System.out.println(msg);

	}

}
