package com.robertgeek27;
/**
 * This program resolve the problem of find el major product
 * of adjacents elements take of Hackerrank.
 * @author robert
 *
 */
public class Adjacent {

public static void main(String ... args){
        Adjacent adj = new Adjacent();
        int[] inputArray = {1,2,3,4,6};
        System.out.println(adj.adjacentElementsProduct(inputArray));
}

/**
 * @param inputArray
 * @return The major number of product of two elements over the Array.
 */
public int adjacentElementsProduct(int[] inputArray) {
   int resultProduct = inputArray[0] * inputArray[1];
     if(inputArray.length >= 2 && inputArray.length<=10) {
        for(int i = 0; i<inputArray.length-1; i++) {

           if(inputArray[i] * inputArray[i+1] >= resultProduct) {
                resultProduct = inputArray[i] * inputArray[i+1];
            }
           }
        }
        return resultProduct;
     }
}
