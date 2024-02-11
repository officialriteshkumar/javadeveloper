import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;
public class Result {
    public static String findDay(int month, int day, int year){
        Calendar c = Calendar.getInstance();
           c.set(year, month-1, day);
           int dayOfWeek = c.get(Calendar.DAY_OF_WEEK);
          String result = "";
           switch (dayOfWeek){
               case 2: result = "MONDAY";break;
               case 3: result =  "TUESDAY";break;
               case 4: result =  "WEDNESDAY";break;
               case 5: result =  "THURSDAY";break;
               case 6: result =  "FRIDAY";break;
               case 7: result =  "SATURDAY";break;
               case 1: result =  "SUNDAY";break;
           }
   
           return result;
       }
       public static void main(String args[]){
           System.out.println(findDay(8,5,2015));
       }
   
       }
 