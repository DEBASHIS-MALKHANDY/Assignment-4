package Assignment4;

public class program2 {

	public static void main(String[] args) {
		String s="debashisd";
		int i,j;
		
		char [] ch = new char[s.length()];
		
		for(i=0;i<s.length();i++) {
			ch[i]=s.charAt(i);	
		}
		for(i=0;i<s.length();i++) {
			System.out.print(ch[i]);	
		}
		System.out.println();
		
		for(i=0;i<s.length();i++) {
			for(j=0;j<i;j++) {
				if(ch[i]==ch[j]) {
					System.out.println("Duplicate Char Are:-"+" "+ch[j]);
				}
			}
			

	}
	}

}
