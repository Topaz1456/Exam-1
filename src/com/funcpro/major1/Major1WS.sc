package com.funcpro.major1

object Major1WS {
  println("Welcome to the Scala worksheet")       //> Welcome to the Scala worksheet
 
 	
 	//1.)
 	def fib(x:Int): Int = {
 		
 		val m = counter(x);
 		
 		if(m == 0) {
 			x;
 		} else if(m == 1) {
 			x;
 		} else {
 			fib(x - 1) + fib(x - 2);
 		}
 		
 	}                                         //> fib: (x: Int)Int
 	
 	def counter(y:Int): Int = {
 		y - 1;
 	}                                         //> counter: (y: Int)Int
 	
 	fib(6);                                   //> res0: Int = 13
 	
 	//2.)
 	def fizzString(fizzString:String): String = {
 	
 	var a = fizzString.startsWith("f");
 	var b = fizzString.endsWith("b");
 		
 		if(a && b) {
 			"FizzBuzz"
 		}	else if(a) {
 			"Fizz"
 		} else if (b) {
 			"Buzz"
 		} else {
 			fizzString
 		}
 		
 	}                                         //> fizzString: (fizzString: String)String
 	
 	fizzString("fib");                        //> res1: String = FizzBuzz
 	
 	//3.)
 	def factorial(x:Int): Int = {
		
		if(x <= 1) {
			x * 1
		} else {
			x * factorial(x - 1);
		}
 	}                                         //> factorial: (x: Int)Int
 	
 	//factorial(1);
 	//factorial(2);
 	//factorial(3);
 	
 	//4.)
 	def sumDigits(x:Int): Int = {
 		
 		if(x % 10 != 0) {
 			(x % 10) + sumDigits(x / 10);
 		} else {
 		 x + 0;
 		}
 		
 	}                                         //> sumDigits: (x: Int)Int
 	
 	sumDigits(126);                           //> res2: Int = 9
}