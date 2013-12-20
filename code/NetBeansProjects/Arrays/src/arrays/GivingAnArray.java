/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package arrays;

/**
 *
 * @author apprentice
 */
public class GivingAnArray {
 
	public static void main( String[] args )
	{
		String[] arr1 = { "alpha", "bravo", "charlie" };

		System.out.print("The first array is filled with the following values:\n\t");
		for ( int i=0; i<arr1.length; i++ )
			System.out.print( arr1[i] + " " );
		System.out.println();
                int arr2[] ={11,23,37,41,53};
                
                System.out.print("The first array is filled with the following values:\n\t");
                for(int i=0; i<arr2.length;i++){
                    System.out.print(arr2[i]+", ");
                }
	}
}

