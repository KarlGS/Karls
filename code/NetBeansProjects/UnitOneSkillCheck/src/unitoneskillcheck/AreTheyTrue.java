/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package unitoneskillcheck;

/**
 *
 * @author apprentice
 */
public class AreTheyTrue {

    public static void main(String[] args) {
        howTrue(true, true);
    }

    public static String howTrue(boolean one, boolean two) {
        String answer = "";
        if (one == false && two == false) {
            answer = "NEITHER";
        } else if ((one == true && two == false) || (one == false && two == true)) {
            answer = "ONLY ONE";
        } else if (one == true && two == true) {
            answer = "BOTH";
        }
        System.out.println(answer);
        return answer;
    }
}
