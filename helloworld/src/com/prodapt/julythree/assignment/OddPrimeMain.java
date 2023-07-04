package com.prodapt.julythree.assignment;

public class OddPrimeMain {

	public static void main(String[] args) {
		
		OddPrime oddPrime = (a)->a%2!=0; 
		System.out.println(oddPrime instanceof OddPrime);
		boolean odd = oddPrime.isOdd(25);
		System.out.println(odd);
		
		
		
		Prime prime = (a) -> {
			for (int i = 2 ; i <= a / 2 ; ++i) 
			{
				if( a % i == 0) 
				{ 
					return false;
				}
			}
			return true;
	    };
		boolean prme = prime.isPrime(1);
		System.out.println(prme);
		

		}
	
	
	}
	



