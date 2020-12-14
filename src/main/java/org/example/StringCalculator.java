package org.example;
import java.util.Arrays;

public class StringCalculator {

    public static int add(String s) throws SpliterFormatException {
        if(s==null||s.equals(""))
        {
            return 0;
        }
        String[]nums;
        if(s.startsWith( "//" ))//kata 05
        {
            String[]parts=s.split( ("\n") );
            String divider;
            String[]delimiters=getDelimiters( parts[0].substring( 2 ).trim() );
if(delimiters.length<=1) {

    divider = parts[0].substring( 2 ).trim();
    divider = divider.replace( "[", "" )
            .replace( "]", "" )
            .replace( "*", "\\D" );
    if (!divider.contains( "\\D" ) && !parts[1].contains( divider )) {
        throw new SpliterFormatException( "Разделитель не корректный" );
    }
    for (char sym : divider.toCharArray()) {
        if (Character.isDigit( sym )) {
            throw new SpliterFormatException( "Разделитель не корректный" );
        }
    }
}else{
    divider=makeDivider( delimiters );
}
            nums = parts[1].replace( " ","" ).split( divider );
        }
        else {//kata 1-4
             nums = s.split( ",|\n" );
        }

            int sum=0;
            for(String n:nums){

               int num =Integer.parseInt(n.trim() );
                if(num>1000)continue;
                sum+=num;

            }
            return sum;
    }
    public static String[] getDelimiters(String s) {
        String[] delimiters = new String[0];
        int start = -1;
        int end;
        while ((start = s.indexOf( "[", start + 1 )) >= 0) {
            end = s.indexOf( "]", start + 1 );
            delimiters = Arrays.copyOf( delimiters, delimiters.length + 1 );
            delimiters[delimiters.length - 1] = s.substring( start+1, end );
        }
        return delimiters;
    }

    public static String makeDivider(String[] strings) {
        StringBuilder sb=new StringBuilder();
        for(String d:strings){
            sb.append( "(" ).append( d.replace( "*","\\*" ).replace( "|","\\|" ) )
            .append(")"  )
            .append( "|" );
        }sb.deleteCharAt( sb.length()-1 );
return sb.toString();
    }
}
