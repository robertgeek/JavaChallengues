package com.robertgeek27;

import java.util.Scanner;

/**
 *
 * @author robert
 */
public class DecimalZip {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        System.out.println("Enter number A");
        int a = input.nextInt();
        
        System.out.println("Enter number B");
        int b = input.nextInt();
        
        DecimalZip z = new DecimalZip();
        System.out.println(z.calculateDecimalZip(a, b));
    }

    /**
     * @param numberA
     * @param numberB
     * @return
     */
    public long calculateDecimalZip(long numberA, long numberB) {
        //Variable result
        long result;

        //Verify if a or b are major to 100000000
        if ((numberA < 0 || numberA > 100000000) || ((numberB < 0 || numberB > 100000000))) {
            return -1;
        }
       
        //Convert numbers entry in Array of Characters
        char[] arrayFirstNumber = String.valueOf(numberA).toCharArray();
        char[] arraySecondNumber = String.valueOf(numberB).toCharArray();
       
        //String for save positions of arrays ordered
        String aux = "";
        
        //Former number mixed.
        for (int i = 0; i < arrayFirstNumber.length || i < arraySecondNumber.length; i++) {
            if (i < arrayFirstNumber.length) {
                aux += arrayFirstNumber[i];
            }
            if (i < arraySecondNumber.length) {
                aux += arraySecondNumber[i];
            }
        }
        //Convert String to Long
        result = Long.parseLong(aux);
        if (result > 100000000) {
            return -1;
        }
        return result;
    }
}
