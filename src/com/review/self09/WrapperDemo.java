package com.review.self09;

public class WrapperDemo {

	public static void main(String[] args) {
       int int1=5;
       Integer integer1=new Integer(int1);//Boxing
       int int2=integer1.intValue();//unboxing
       
       System.out.println(int2);
       
       int int3=10;
       Integer integer3=10;//autoboxing- Auto-wrapping, Auto-converting
       int int4=integer3;//Auto-unboxing,Auto-unwapping
       
       double d1= 3;
       Double d2=d1;
       Double d4=3.0;
       
       double d5=d4.doubleValue();// 1st way ,long way; unboxing
       double d6=d4;// 2nd way ,short way;Auto unboxing 
       System.out.println(d5+" "+d6);
       
       //boolean is the choclate with a wrapper
       Boolean b1=new Boolean(true);
       //
       //boolean is the chocalate without the wrapper
       boolean b2=b1.booleanValue();
       
       
	}

}
