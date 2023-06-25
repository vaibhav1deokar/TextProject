package com.wrapperclass;

public class ValueOf {
	
	 public static void main(String[] args)
	    {
	        Byte B = Byte.valueOf((byte) 123);
	        System.out.println(B);              //Output : 123
	 
	        String s1 = String.valueOf("abc");
	        System.out.println(s1);
	        
	        Short S = Short.valueOf((short) 25);
	        System.out.println(S);             //Output : 25
	 
	        Integer I = Integer.valueOf(46);
	        System.out.println(I);            //Output : 46
	 
	        Long L = Long.valueOf(235);
	        System.out.println(L);            //Output : 235
	 
	        Float F = Float.valueOf(23.5f);
	        System.out.println(F);           //Output : 23.5
	 
	        Double D = Double.valueOf(15.4d);
	        System.out.println(D);           //Output : 15.4
	 
	        Boolean BLN = Boolean.valueOf(true);
	        System.out.println(BLN);        //Output : true
	 
	        BLN = Boolean.valueOf(false);
	        System.out.println(BLN);        //Output : false
	 
	        Character C = Character.valueOf('C');
	        System.out.println(C);          //Output : C
	    }


}
