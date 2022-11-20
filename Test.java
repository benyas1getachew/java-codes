import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */

public class Test
{
	public static void main (String[] args) //throws java.lang.Exception
	{
	    
	    int j=0;
		String[] ha=new String[5];
		
		for(int i=1;i<5;i++){
            if(ha.length>1){
            String[] han=args[i].split(" ");
            int k=Integer.parseInt(han[0]);
            int ka=Integer.parseInt(han[1]);
            if(k>ka){
                System.out.println("yes");
            }
            else{
                System.out.println("no");
            }}
        }
        
	}
}
