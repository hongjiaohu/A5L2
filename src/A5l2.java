import java.util.Scanner;
/**
 * 
 */
/**

*

* Name: Hongjiao Hu

* Teacher: Mr. Hardman 

* Assignment 5, Program 2

* Date Last Modified: 2016/11/29

*

*/
/**
 * @author h.hu
 *
 */
public class A5l2 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

     	    Scanner userInput = new Scanner(System.in);
			
			int[] userArray = new int[10];
			int userValue;
			int index = 0;
			
			System.out.println("Please enter ten marks to begin.");
			
			for(int i = 0; i < userArray.length; i++){
	        	System.out.print("Please enter a mark: ");
	        	userArray[i] = userInput.nextInt();
	        }

			System.out.println("\nWhat element do you want to search for?");
			userValue = userInput.nextInt(); 
			
			for(int i = 0;i < userArray.length;i++){
				if(userArray[i]==userValue){
					index ++;
				}
			}
			
	        System.out.println("The Value " + userValue +" disolays :" +index + " times.");
		
			
			
	        
	        
	        userInput.close();
	
	}
	
}
	
