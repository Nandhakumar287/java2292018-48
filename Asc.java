import java.io.*;
import java.util.*;
  public class Asc{
    public static void main(String args[]){
      Scanner sc=new Scanner(System.in);
      System.out.println("Enter the range k value:");
      int k=sc.nextInt();
      int ka[]=new int[k];
	  System.out.println("Enter the ELEMENT:");
      for(int i=0;i<k;i++)
      {
        ka[i]=sc.nextInt();
      }
	  System.out.println("-------------------");
	  int min=ka[0];
      for(int j=0;j<k;j++)
      {
        if(min>ka[j])
        {
        System.out.println(ka[j]);
        }
		min=ka[j];
      }
    }
  }  
