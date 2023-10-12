import java.util.Scanner;

public class RomanNumberConvertToInteger { 
    public static void main(String[] args) {
        Scanner scn=new Scanner(System.in);
        System.out.println("Enter a Roman number:");
        String romanNo = scn.next();
        
        if (isValidRomanNumeral(romanNo)) {
            int intValue = romanToIntegerConv(romanNo);
            System.out.println("The integer value of " + romanNo + " is " + intValue);
        } else {
            System.out.println("Invalid input. Please enter a valid Roman numeral.");
        }
    }

    public static boolean isValidRomanNumeral(String s) {
        return s.matches("^[IVXLCDM]+$");
    }

	public static int romanToIntegerConv(String s)
	{
		int result = 0;
	    int prevValue = 0;
	    for (int i = s.length()-1; i >= 0; i--)
	    {
	    	char c = s.charAt(i);
	        int currValue = 0;
	        switch (c) 
	        {
	            case 'I':
	            	currValue = 1;
	                break;
	            case 'V':
                    currValue = 5;
                    break;
                case 'X':
                    currValue = 10;
                    break;
                case 'L':
                    currValue = 50;
                    break;
                case 'C':
                    currValue = 100;
                    break;
                case 'D':
                    currValue = 500;
                    break;
                case 'M':
                    currValue = 1000;
                    break;        
	                    
	            }

	            if (currValue < prevValue) {
	                result -= currValue;
	            } else {
	                result += currValue;
	            }

	            prevValue = currValue;
	        }

	        return result;
	    }
}
