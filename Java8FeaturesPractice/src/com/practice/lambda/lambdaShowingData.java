package com.practice.lambda;

public class lambdaShowingData {

	public static void main(String[] args) {
		MyLambdaFunction myLambdaFunction=()->System.out.println("Hi");
		myLambdaFunction.show();
		
		Calculate add=(a,b)->a+b;
		System.out.println("Addition "+add.compute(5, 6));
		
		add=(a,b)->a*b;
		System.out.println("Multiplication "+add.compute(5, 6));
		
		add=(a,b)->a==0?0:a/b;
		System.out.println("Division "+add.compute(12, 6));
		
		add=(a,b)->a==0?0:a/b;
		System.out.println("Division "+add.compute(12, 6));
		
	}

}

@FunctionalInterface
interface MyLambdaFunction
{
	void show();
}


@FunctionalInterface
interface Calculate
{
	int compute(int x,int y);
}