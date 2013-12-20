/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package gutchecklab;

/**
 *
 * @author apprentice
 */
public class GutCheckLab {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int[] a = new int[4];
        a[0] = 2;
        a[1] = 4;
        a[2] = 3;
        a[3] = 9;

        int[] b = new int[3];
        b[0] = 3;
        b[1] = 7;
        b[2] = 4;

        System.out.println(arrayChecka(a, b));



    }

    public static boolean arrayChecka(int[] a, int b[]) {
        int[] smaller = new int[0];
        int[] bigger = new int[0];
        //using counter to see if a match occurs
        int counter = 0;

        //determining the smaller array to avoid errors when searching
        if (a.length <= b.length) {
            smaller = a;
            bigger = b;
        } else if (b.length < a.length) {
            smaller = b;
            bigger = a;
        }

        //checks to see if they match at the same spot.
        //  i need another for loop inside but can't figure out how.
        for (int i = 0; i < smaller.length; i++) {
            for (int j = 0; j<bigger.length;j++){
            if (smaller[i] == bigger[j]) {
                counter++;
                return true;
            }
            }
        }
     
      return false;

    }
}