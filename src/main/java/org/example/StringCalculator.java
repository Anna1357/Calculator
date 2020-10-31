package org.example;

public class StringCalculator {

    public static int add(String s){
        if(s==null||"".equals( s ))
    {
return 0;
    }
        else
        {
            String[]nums=s.split( "," );
            int sum=0;
            for(String num:nums){
                sum+=Integer.parseInt( num.trim() );
            }
            return sum;}
    }
}
