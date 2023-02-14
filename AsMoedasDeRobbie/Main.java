package AsMoedasDeRobbie;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) throws IOException {
		Scanner scan = new Scanner(System.in);
		scan.useLocale(Locale.ENGLISH);
		Locale.setDefault(new Locale("en","US"));
		
		
		

		while (scan.hasNext()) {
			int n = scan.nextInt();// numero de moedas
			List<Integer> moedas = new ArrayList<Integer>();//lista com valores das moedas
			
			for(int i = 0; i < n ; i++) {
				
				moedas.add(scan.nextInt());
			}
			
			
			int salto = scan.nextInt();
			int sum = 0;
			boolean primo = true;
			
			Collections.reverse(moedas);
			
			
			for(int x = 0; x<moedas.size(); x+=salto) {
				
				sum += moedas.get(x);
				
			}
			
			
			if(sum != 0 && sum != 1 && primo(sum)) {
				System.out.println("You’re a coastal aircraft, Robbie, a large silver aircraft.");

			}else {
				System.out.println("Bad boy! I’ll hit you.");

			}
					
			

		}
		
		scan.close();
		
		

	}
	
	
	private static boolean primo(int sum) {
	    for (int j = 2; j < sum; j++) {
	        if (sum % j == 0)
	            return false;   
	    }
	    return true;
	}

}