/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package codingbat;

/**
 *
 * @author apprentice
 */
public class CodingBat {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int[] input = new int[4];
        input[0] = 4;
        input[1]=3;
        input[2]=5;
        input[3]=6;
       // int[] input=new int[]{4,3,2,6};
        boolean result=firstLast6(input);
        System.out.println(result);
        
    }

    public static boolean firstLast6(int[] nums) {
        if (nums[0] == 6 || nums[nums.length - 1] == 6) {
            return true;
        } else {
            return false;
        }


    }
}
