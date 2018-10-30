package stackpack;
import java.util.*;

public class LinkedStack {
   
	    public static void main(String[] args)
	    {
	        Scanner scan = new Scanner(System.in);   
	        /* Creating object of class linkedStack */   
	        StackOperations ls = new StackOperations();          
	        /* Perform Stack Operations */  
	        System.out.println("Linked Stack Test\n");          
	       
	        System.out.println("\nLinked Stack Operations");
            System.out.println("1. push");
            System.out.println("2. pop");
            System.out.println("3. peek");
            System.out.println("4. check empty");
            System.out.println("5. size");
            System.out.println("6. Exit");   

            boolean ch=true;     
	        do 
	        {          
	            int choice = scan.nextInt();
	            switch (choice) 
	            {
	            case 1 :
	                System.out.println("Enter integer element to push");
	                ls.push( scan.nextInt() ); 
	                ls.display();
	                break;                         
	            case 2 : 
	                try
	                {
	                    System.out.println("Popped Element = "+ ls.pop());
	                }
	                catch (Exception e)
	                {
	                    System.out.println("Error : " + e.getMessage());
	                }    
	                ls.display();
	                break;                         
	            case 3 : 
	                try
	                {
	                    System.out.println("Peek Element = "+ ls.peek());
	                }
	                catch (Exception e)
	                {
	                    System.out.println("Error : " + e.getMessage());
	                }
	                ls.display();
	                break;                         
	            case 4 : 
	                System.out.println("Empty status = "+ ls.isEmpty());
	                ls.display();
	                break;                
	            case 5 : 
	                System.out.println("Size = "+ ls.getSize()); 
	                ls.display();
	                break;
	            case 6:
	            	ch = false;
	            	System.out.println("Resultant stack is");
	            	ls.display();
	               	break;
	            case 7 : 
	                System.out.println("Stack = "); 
	                ls.display();
	                break;                        
	            default : 
	                System.out.println("Wrong Entry \n ");
	                break;
	            }           
	            /* display stack */ 	 
	        } while(ch);                 
	    }
	}
