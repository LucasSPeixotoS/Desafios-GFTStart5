package desfaioCodigo;

import java.util.Scanner;

public class Coxinha {
	
	public static void main(String[] args) {
		
		Scanner scan = new Scanner (System.in);
		String input = scan.nextLine();

		String[] inputSplit = input.split(" ");
		double media = Double.parseDouble(inputSplit[0])/Double.parseDouble(inputSplit[1]);
		
		System.out.printf("%.2f",  media);
		scan.close();
	}


}
