import java.util.ArrayList;
import java.util.Collections;

public class Shuffle {
	public static void main(String[] args) {
		int[] arr={1,2,3,4,5,6,7};
		ArrayList<Integer> al= new ArrayList<Integer>();
		for(int n:arr)
		{
			al.add(n);
		}
	    Collections.shuffle(al);
		for(int n:al)
		{
			System.out.println(n);
		}
    }
}
