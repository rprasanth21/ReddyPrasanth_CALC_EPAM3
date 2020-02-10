package com.epam3.CalcAPPLICATION;
import java.util.Scanner;
public class MainCal {

	public static void main(String[] args)throws ArithmeticException {
		// TODO Auto-generated method stub
		double num1,num2,result;
		Scanner sc=new Scanner(System.in);
		int ch;
		while(true) {
			System.out.println("Enter number1:");
			
			num1=sc.nextInt();
			System.out.println("Enter number2:");
			num2=sc.nextInt();
		System.out.println("Enter Choice:\n");
		System.out.println("1.Addition(+)\n2.Subtraction(-)\n3.Multiplication(*)\n4.Division(/)");
		ch=sc.nextInt();
		switch(ch) {
		
		case 1:
			result=Add.addition(num1,num2);
			System.out.println(num1+"+"+num2+"="+result);
			
			break;
		case 2:
			result=Subtraction.subtraction(num1,num2);
			System.out.println(num1+"-"+num2+"="+result);
		
			break;
		case 3:
			result=Multiplication.multiply(num1,num2);
			System.out.println(num1+"*"+num2+"="+result);
			
			break;
		case 4:
			try {
			result=Division.divide(num1,num2);
			if(num2==0) {
				throw new ArithmeticException("You Should not divide a number with zero");
			}
			System.out.println(num1+"/"+num2+"="+result);
			
			}
			catch(ArithmeticException e){
				System.out.println(e);
				System.out.println("Enter number2:");
				num2=sc.nextInt();
				
			}
			break;
		
		default:
			break;
			
		}
		System.out.println("press any non-zero value to continue or 0 to exit");
		int i=sc.nextInt();
		if(i==0)System.exit(0);
	  }
	}

}
