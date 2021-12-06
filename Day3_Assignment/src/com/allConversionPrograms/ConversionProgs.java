package com.allConversionPrograms;
import java.util.Scanner;

public class ConversionProgs {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		//Java Program to convert int type variables to char
		System.out.println("Enter Integer value");
		int i = sc.nextInt();
		char ch = (char)i;
		System.out.println("Int to char value is:" +ch);
		
		//Java Program to convert long type variables into int
		System.out.println("Enter Long type value");
		long l = sc.nextLong();
		int a = (int)l;
		System.out.println("Long Type to int value is:" +a);
		
	    //Java Program to convert int type variables to long
		System.out.println("Enter integer value");
		int in = sc.nextInt();
		long ln = (long)in;
		System.out.println("int to Long Type value is:" +ln);
		
		//Java Program to convert boolean variables into string
		System.out.println("Enter boolean value (true/false)");
		boolean b = sc.nextBoolean();
		String str = String.valueOf(b);
		System.out.println("Boolean to string value is "+str);
		
		//Java Program to convert string type variables into boolean
		System.out.println("Enter String value");
		String str1 = sc.next();
		boolean b1 = Boolean.parseBoolean(str1);
		System.out.println("String to boolean conversion value is "+b1);
		
		//Java Program to convert string type variables into int
		System.out.println("Enter an int");
		String str2 = sc.next();
		int in1 = Integer.parseInt(str2);	
		System.out.println("String to integer value is "+in1);
		
		//Java Program to convert int type variables to String
		System.out.println("Enter an int");
		int in2 = sc.nextInt();
		String str3 = String.valueOf(in2);
		System.out.println("Int type to string value is "+str3);
		
		//Java Program to convert int type variables to double
		double d = (double) in2;
		System.out.println("Int to double value is "+d);
		
		//Java Program to convert double type variables to int
		int in3 = (int) d;
		System.out.println("Double type to integer value is "+in3);
		
		//Java Program to convert string variables to double
		System.out.println("Enter an double value ");
		String str4 = sc.next();
		double d1 = Double.parseDouble(str4);
		System.out.println("String type to double value is "+d1);
		
		//Java Program to convert double type variables to string
		String st = String.valueOf(d1);
		System.out.println("The above double type to string value is "+st);
		
		//Java Program to convert primitive types to objects and vice versa
	    int inte = 987;
	    double doub = 82.455836;
	    boolean boo = false;

	    //converts into wrapper objects
	    Integer obj1 = Integer.valueOf(inte);
	    System.out.println(obj1);
	    Double obj2 = Double.valueOf(doub);
	    System.out.println(obj2);
	    Boolean obj3 = Boolean.valueOf(boo);
	    System.out.println(obj3);
	}

}
