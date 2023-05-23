package Assignment4;

import java.util.Arrays;

public class program5 {

	public static void main(String[] args) {
		String s1="a gentle Man";
		String s2="elega Man";
		String s3="";		
		String s4="";
		
		s1=s1.replace(" ", "");
		s2=s2.replace(" ", "");
		
		System.out.println(s1);
		System.out.println(s2);
		
		
		for(int i=0;i<s1.length();i++) {
			if(s1.charAt(i)>='A' && s1.charAt(i)<='Z') {
				s3=s3+(char)(s1.charAt(i)+32);
			}else {
				s3=s3+(s1.charAt(i));
			}
			
		}
		System.out.println(s3);
		
		
		for(int j=0;j<s2.length();j++) {
			if(s2.charAt(j)>='A' && s2.charAt(j)<='Z') {
				s4=s4+(char)(s2.charAt(j)+32);
			}else {
				s4=s4+(s2.charAt(j));
			}
		}
		System.out.println(s4);
		
		
		System.out.println("**************************");
		char[] ch1=s3.toCharArray();
		char[] ch2=s4.toCharArray();		
		for (int k=0;k<ch1.length;k++) {
			for(int l=1;l<ch1.length-k;l++) {
				if(ch1[l]<ch1[l-1]) {
					char temp=ch1[l];
					ch1[l]=ch1[l-1];
					ch1[l-1]=temp;				
				}
			}
		}
		for (int m=0;m<ch1.length;m++) {		
			
			
		}	
		
		System.out.println(ch1);
	System.out.println("**************************");
		for (int n=0;n<ch2.length;n++) {
			for(int o=1;o<ch2.length-n;o++) {
				if(ch2[o]<ch2[o-1]) {
					char tempb=ch2[o];
					ch2[o]=ch2[o-1];
					ch2[o-1]=tempb;				
				}
			}
		}
		for (int p=0;p<ch2.length;p++) {		
			
			
		}	
		System.out.println(ch2);
		if(Arrays.equals(ch1, ch2))
		{
			System.out.println("It's Anagram");
		}
		else
		{
			System.out.println("It's not Anagram");
		}
	}
						  
}