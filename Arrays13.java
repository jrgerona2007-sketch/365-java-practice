import java.util.Scanner; 
public class Arrays13 { 
public static void main(String[] args) {
     // print the user's desired increasing numbers 
     Scanner inp = new Scanner (System.in); 
     int [] arr = {6,1,0,2,3,4,5,6,1,2,3,6,7,8,9,10,0,1,2,3,4,5}; 
     System.out.print("Enter length of increasing numbers to print:"); 
     int length = inp.nextInt();

boolean found = false;
int ctr = 1;
int firstStart = -1;

for (int x = 1; x < arr.length; x++) {
    if (arr[x] == arr[x - 1] + 1) {
        ctr++;
        if (ctr == length) {
            int start = x - length + 1;
            if (!found) {
                // First tie
                for (int z = start; z < start + length; z++) {
                    System.out.print(arr[z] + " ");
                }
                System.out.println();
                firstStart = start;
                found = true;
            } else if (start != firstStart) {
                // Other tie(s)
                for (int z = start; z < start + length; z++) {
                    System.out.print(arr[z] + " ");
                }
                System.out.println();
            }
        }
    } else {
        ctr = 1;
    }
}
}
}
