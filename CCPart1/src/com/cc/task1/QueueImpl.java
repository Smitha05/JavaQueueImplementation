package com.cc.task1;
import java.util.LinkedList;

public class QueueImpl {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Randomizer rg = new Randomizer();
		Prime p = new Prime();
		LinkedList<Integer> randNumQ = rg.generateRandom();
		LinkedList<PrimeNumber> primeQ = p.generatePrimeQ(randNumQ);
		rg.displayOutput(primeQ);

	}

}
