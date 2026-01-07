public class Arrays2 {
public static void main (String[] args) {
    // output should be all unique/non-repeating values 
    // 3, 5, 6
    int [] arr = {4,2,5,5,4};

    for (int x = 0; x<arr.length; x++){
        boolean n = true;
        for (int z = x-1; z>=0; z--){
            if (arr[x] == arr[z]){
                n = false;
                break;
            }

            }
        for(int y = x + 1; y<arr.length; y++){
           if (arr[x] == arr[y]){
            n = false;
            break;
           }
        } 
        if (n) {
            System.out.print(arr[x]);
        }
        }
    }
}





