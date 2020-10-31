package org.example;

public class StringCalculatorTest {
    static void kata01(){
        System.out.println("kata 01");
        int err=0;
        if(StringCalculator.add( null )!=0){
            err+=1;
            System.err.println("Ошибка null");
        }
        if(StringCalculator.add( "" )!=0){
            err+=1;
            System.err.println("Ошибка пустой строки");
        }
        if(StringCalculator.add( "1" )!=1){
            err+=1;
            System.err.println("Ошибка строки: 1");
        }
        if(StringCalculator.add( "1,2" )!=3){
            err+=1;
            System.err.println("Ошибка строки: 1,2");
        }
        if(StringCalculator.add( "4," )!=4){
            err+=1;
            System.err.println("Ошибка строки: 4,");
        }}
        static void kata02(){
            System.out.println("kata 02");
            int err=0;
        if(StringCalculator.add( "1,2,3" )!=6){
            err+=1;
            System.err.println("Ошибка строки: 1,2,3");
        }
        if(StringCalculator.add( "1,1,1,1" )!=4){
            err+=1;
            System.err.println("Ошибка строки: 1,1,1,1");
        }
        if(StringCalculator.add( " 1,2 " )!=3){
            err+=1;
            System.err.println("Ошибка строки:  1,2 ");
        }
        if(StringCalculator.add( "11,22,33" )!=66){
            err+=1;
            System.err.println("Ошибка строки: 11,22,33");
        }
        if(err>0){
            System.err.println("Ochibok: "+err);
        }
    }

    public static void main(String[] args) {
        kata01();
        kata02();
    }
}
