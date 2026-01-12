import java.util.Scanner;
public class Roman_Numerals {
public static void main(String[] args) {
    Scanner inp = new Scanner(System.in);
    System.out.print("Enter a series of Roman Numerals: ");
    String input = inp.nextLine();
    //XXIVX
    //10 + 10 + 5 - 1 +10 = 34
    //COMPARE TO THE SYMBOLS, IF MATCHING CALL THE CORRESPONDING VALUE AND DO
        char[] symbols = {'I','V','X','L','C','D','M'};
        int[] values   = {  1,  5, 10, 50,100,500,1000 };
    // moving through the string 
    int val = 0; int sum = 0; int lastval=0;
        for (int x= 0; x<input.length(); x++){
            char in = input.charAt(x);
            val = 0;

    // moving through symbols array
            for(int z = 0; z<symbols.length; z++){
                if (in == symbols[z]){
                    val = values[z];
                
            }
                }
             if (lastval<val){
                sum -= lastval;
            } else {
                sum += lastval;
            } 
            lastval = val;
        } sum += lastval;
        System.out.print(sum);
            

        } 
}

