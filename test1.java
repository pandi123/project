import java.util.*;
public class test1 {

	

	
	public static void main(String[] args)
	{
	String str="hai mani and sankar";

		String a[]=str.split(" ");
		for( int i=0;i<a.length;i++)
		
		System.out.println(a[i]);
		
		for(int i=0;i<a.length;i++)
		{
			char c[]=a[i].toCharArray();

		for(int j=0;j<c.length;j++)
		{
			System.out.print(c[j]);
		
		int m=a[i].length();
		System.out.println(m);
		
		char k[]=new char[20];
		char l[]=new char[27];
		for(char b='a';b<='z';b++)
		{
		
			l[i]=b;
			i++;
			
		
		System.out.println(l);
		}
		
		for(char h='a';h<c[m-1];i++)
		{
			
			
			j++;
		}
		System.out.println(j);
		}
	}
	
}
}



	


