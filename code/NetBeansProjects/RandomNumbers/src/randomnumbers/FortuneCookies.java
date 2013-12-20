/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package randomnumbers;

import java.util.Random;

/**
 *
 * @author apprentice
 */
public class FortuneCookies {
     public static void main(String[] args) {
    int r1=RandomNumber();
    int r2=RandomNumber();
    int r3=RandomNumber();
    int r4=RandomNumber();
    int r5=RandomNumber();
    int r6=RandomNumber();
    
    int s1=RandomSaying();
    String saying = "";
 if(s1==1){
    saying="You will die old and lonely.";
}else if(s1==2){
    saying="You will win the lottery soon";
}else if(s1==3){
    saying="Tommorow will never come for you.";
}else if(s1==4){
    saying="You will fail!";
}else if(s1==5){
    saying="Stop while your ahead";
}else{
    saying="You will succeed.";
}

System.out.println("Fortune cookie says: "+saying);
System.out.println(r1+"-"+r2+"-"+r3+"-"+r4+"-"+r5+"-"+r6);



    
    
    
     } 
    public static int RandomNumber(){
        Random r = new Random();
        int Random = 1+r.nextInt(54);
        return Random;
    }
    public static int RandomSaying(){
        Random r = new Random();
        int Random = 1+r.nextInt(6);
        return Random;
    }
}
