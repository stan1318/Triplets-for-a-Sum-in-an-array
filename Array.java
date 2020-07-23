package com.exc2;
//Made a Java program to find all triplets equal to a given sum in a unsorted array of integers
public class Array {

    static void find_triplets(int[] numbers, int given_sum){
        for(int i=0;i<numbers.length-1;++i){
             int sum = numbers[i]+numbers[(i+1)];
            System.out.println("Cycle i= "+i+" Sum: "+sum);
            if(sum <= given_sum){
                for(int i1=0;i1<numbers.length;++i1){
                    if(i1 == i || i1 == (i+1))
                        continue;
                    sum = numbers[i] + numbers[i+1] + numbers[i1];
                    System.out.println("Cycle i1= "+i1+" Sum: "+sum);
                    if (sum == given_sum)
                    {System.out.println("(" + numbers[i] + " " +
                                numbers[1+i] + " " + numbers[i1] + ")");}
                }
            }
        }
    }
    public static void main(String[] args){
int []numbers = {1,5,8,0,3,2,2};
int given_sum=9;
find_triplets(numbers ,given_sum);
/*ps.I made output for each cycle because I couldn't diagnose an error and needed some way to analyze my code
freking worked :D
 */
    }
}
