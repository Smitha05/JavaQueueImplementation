
package com.cc.task1;
import java.util.LinkedList;
import java.util.Random;

public class Randomizer {
	LinkedList<Integer> generateRandom() {
		LinkedList<Integer> randNumQ = new LinkedList<Integer>();
		Random rd = new Random();
		for (int i = 1; i <= 100; i++) {
			randNumQ.add(rd.nextInt(Integer.MAX_VALUE) + 1);
		}
		System.out.println("generated random number is " + randNumQ);
		return randNumQ;
	}

	public void displayOutput(LinkedList<PrimeNumber> primeQ) {
		for (PrimeNumber primeNumber : primeQ) {

			if (primeNumber.isPrime()) {
				System.out.println("given random number " + primeNumber.getRnum() + " is a prime number");
			} else {
				System.out.println("given random number " + primeNumber.getRnum() + " is not a prime number");
			}
		}
	}
}
