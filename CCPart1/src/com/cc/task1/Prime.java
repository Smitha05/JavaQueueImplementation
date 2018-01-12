
package com.cc.task1;

import java.util.LinkedList;

public class Prime {

	public LinkedList<PrimeNumber> generatePrimeQ(LinkedList<Integer> randNum) {
		LinkedList<PrimeNumber> primeQ = new LinkedList<>();
		for (Integer i : randNum) {
			primeQ.add(new PrimeNumber(i, checkPrime(i)));
		}
		return primeQ;

	}

	public boolean checkPrime(int a) {
		for (int i = 2; i < a / 2; i++) {
			if (a % i == 0) {
				return false;
			}
		}
		return true;
	}

}
