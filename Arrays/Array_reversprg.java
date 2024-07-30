package Arrays;

import java.util.Arrays;
import java.util.Scanner;

public class Array_reversprg {

	public static void main(String[] args) {
	/*	Scanner sc=new Scanner(System.in);
		System.out.println("enter the array size");
		int arrsize=sc.nextInt();
		String[] name=new String[arrsize];
		String[] reverse=new String[arrsize];
		System.out.println("enterthe string name");
		 name[0]=sc.next();
		String j="null";
		for(int i=name.length-1;i>=0; i--) {
			 char[] c1=name.toCharArray();
		       // char c1=name.toCharArray(i);
		         //reverse=reverse+c1;
			reverse[c1]=name[i];
			j++;
		}
		System.out.println(Arrays.toString(reverse));
	
		
		
	}}*/

		String a[]=new String[3];
		a[0]="sushmitha";
		a[1]="nagesh";
		a[2]="urvik";
		System.out.println(Arrays.toString(a));
		String j[]=new String[3];
		j[0]="";
      for(int i=0;i<a.length;i++) {
    	//char c1=a.charAt(i);
    	  j[a.length-i-1]=a[i];
    	 
      }
      System.out.println(Arrays.toString(j));

	}}