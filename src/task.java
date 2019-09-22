import java.util.*;
public class task {

	public String palindrome(int n) {
		// TODO Auto-generated method stub
		 int r,sum=0,temp;   
		 //It is the number variable to be checked for palindrome  
		  String s="true",f="false";
		  temp=n;    
		  while(n>0){    
		   r=n%10;  //getting remainder  
		   sum=(sum*10)+r;    
		   n=n/10;    
		  }  
		  if(temp==sum)
			  return s;
		  else
			  return f;
		}  
		

	}


