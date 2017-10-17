package com.thomas.javacoffee;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

	public static void main(String[] args) throws IOException{
		
		BufferedReader br = new BufferedReader(
				new InputStreamReader(System.in));
		
		int coffeeCount = 0;
		
		do {
			System.out.println("Enter amount of coffee: ");
			
			String str = br.readLine();
			int amount = Integer.parseInt(str);
			
			if(amount == -1) {
				break;
			}
			
			Coffee[] coffee = new Coffee[amount];
			for(int i=0; i<amount; i++) {
				coffee[i] = new Coffee();
				coffee[i].setCoffeeName("Java");
				
				if(coffee[i].getCoffeeName().equals("Java")) {
					System.out.println("Keep up the good work ;)");
				}
				
				coffeeCount++;
			}
		}while(true);
		
		System.out.println("Had enough already?" + " You drunk " + coffeeCount + " Java Coffee.");
	}
}
