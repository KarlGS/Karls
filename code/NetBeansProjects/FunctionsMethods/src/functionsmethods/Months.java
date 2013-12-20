/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package functionsmethods;


public class Months{
	public static String month_name( int month )
	{
		String result="";
                if(month==0){
                    result="January";
                }else if(month==1){
                    result="February";
                }else if(month==2){
                    result="March";
                }else if(month==3){
                    result="April";
                }else if(month==4){
                    result="May";
                }else if(month==5){
                    result="June";
                }else if(month==6){
                    result="July";
                }else if(month==7){
                    result="August";
                }else if(month==8){
                    result="September";
                }else if(month==9){
                    result="October";
                }else if(month==10){
                    result="November";
                }else if(month==11){
                    result="December";
                }else if(month==12){
                    result="January";
                }else{
                    result="You don't know your months";
                }
                       
                
		return result;
	}


	public static void main( String[] args )
	{
		System.out.println( "Month 1: " + month_name(1) );
		System.out.println( "Month 2: " + month_name(2) );
		System.out.println( "Month 3: " + month_name(3) );
		System.out.println( "Month 4: " + month_name(4) );
		System.out.println( "Month 5: " + month_name(5) );
		System.out.println( "Month 6: " + month_name(6) );
		System.out.println( "Month 7: " + month_name(7) );
		System.out.println( "Month 8: " + month_name(8) );
		System.out.println( "Month 9: " + month_name(9) );
		System.out.println( "Month 10: " + month_name(10) );
		System.out.println( "Month 11: " + month_name(11) );
		System.out.println( "Month 12: " + month_name(12) );
		System.out.println( "Month 43: " + month_name(43) );
	}
}