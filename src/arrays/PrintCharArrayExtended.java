package arrays;

import helper.SavitchIn;

public class PrintCharArrayExtended {
    public static void main(String[] args) {
        System.out.printf("Enter String: ");
        String inString = SavitchIn.readLine();
        char[] charArray = inString.toCharArray();
        
        for(int i = 0; i < charArray.length; i++) {
            System.out.print(charArray[i]);
        }
    }
}
