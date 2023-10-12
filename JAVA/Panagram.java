import java.util.Scanner;

public class Panagram {

	public static void main(String[] args) {
		Scanner sc =new Scanner(System.in);
		System.out.println("enter the str ");
		String s1 =sc.nextLine();
		char[] arr= s1.toLowerCase().toCharArray();
		int[] countArr = new int[26];
		for(char c:arr)
		{
			if(c==' ') continue;
			int index = c-'a';
			countArr[index]++;
		}
		char ch ='a';
		int count=0;
		for(int n:countArr)
		{
			if(n>=1) 
			{
				
				count++;
				ch++;
			}
		}
		if(count==countArr.length) System.out.println("String is a Panagram");
		else System.out.println("Not a panagram");
		}
}
