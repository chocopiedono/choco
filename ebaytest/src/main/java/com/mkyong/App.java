package com.mkyong;

import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args ) throws Exception
    {
        SimpleDateFormat sdf = new SimpleDateFormat("yyyyMMdd");

        String dateString = "20151104";


        Date curDate = sdf.parse(dateString);

        System.out.println(curDate);

        System.out.println( "Hello World!" );

        //String street = null;

       // String lastSymbol = street.substring(street.length()-1);

        Double jjk = null;

        if (jjk < 100){
            System.out.println("OK");
        }


    }
}
