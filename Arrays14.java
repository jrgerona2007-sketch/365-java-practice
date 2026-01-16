public class Arrays14 {
public static void main(String[] args) {
    // chain breaker
    int [] arr = {6,1,2,2,3,3,4,5,6,7,6,12,12,13};
    //only print 6 1 4 5 6 7 6 12

    for (int x = 0; x<arr.length; x++){
        boolean dupe = false;
        
        
            if (x==0){
            if (arr[x]== arr[x+1]){
                dupe = true;
            }
        } else if (x==arr.length-1){
            if (arr[x]==arr[x-1]){
                dupe = true;
            }
        }else if (x>0){
            if (arr[x] == arr[x+1] || arr[x]==arr[x-1]){
                dupe = true;
            }
        }

          if (!dupe){
            System.out.print(arr[x]+" ");
          }







    }
}
}

