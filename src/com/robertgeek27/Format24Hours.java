package com.robertgeek27;
import java.io.IOException;
import java.util.*;

/**
 * This Challengue is taked like exercise of Hackerrank
 * Show the solutions of this problem.
 * @autor robertgeek27
 * 
*/
public class Format24Hours {

    public static void main(String[] args) throws IOException {
        Scanner scannerRead = new Scanner(System.in);
        String  words       = scannerRead.nextLine();
        
        String  timeConversionFormat24 = timeConversion(words);
        
        System.out.println(timeConversionFormat24);
    }

    /**
     * @param formatingTime
     * @return The correct format of hour
     */
    static String timeConversion(String formatingTime) {
         StringBuilder format24 = new StringBuilder();

         if(formatingTime.contains("PM")){
             formatingTime = formatingTime.replace("PM","");
            
             String [] arrStr = formatingTime.split(":");
             int       hour   = Integer.parseInt(arrStr[0]);

             format24.append(formatingTime);

             if(hour >= 1 && hour <= 11){
                format24.setLength(0);
                int hourFinal = 12 + hour;
                format24.append(hourFinal).append(":").append(arrStr[1])
                .append(":").append(arrStr[1]);
             }
         }
         else{
             formatingTime = formatingTime.replace("AM","");
             
             String [] arrStr = formatingTime.split(":");
             int       hour   = Integer.parseInt(arrStr[0]);
             
             format24.append(formatingTime);

             if(hour==12){
               format24.setLength(0);
               format24.append("0").append(":").append(arrStr[1])
               .append(":").append(arrStr[1]);
             }
         }
       return format24.toString();
      }
}
