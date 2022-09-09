
import java.util.*;


public class CountSetbit
{
	

public static void main(String[] args) {
	     

Scanner sc=new Scanner(System.in);
	     

int n=sc.nextInt();
	     

int a=0;
	    

while(n>0){
	        

   if((n&1)==1){
	            
   
           a++;
	        
        }
	        

        n=n>>1;
	  
  
      }
	    

      System.out.print(a);
	
  }


}
