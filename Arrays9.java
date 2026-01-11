public class Arrays9 {
    public static void main(String[] args) {
        //find longest continous streak and print ties and how many values tied
        int [] arr = {5,5,5,1,1,1,1,1,15,2,2,2,2,2,3,3,3,3,3,4,4,4,4,4,6,6,6,6,6,7,7,7,7,7};
        int lstreak = 1; 
        int nstreak = 0; 
        int ctr = 0; 
        int nextstreak = 0;

        for(int x = 1; x<arr.length; x++){ 
            // finding max and 2nd max streak
            if (arr[x]==arr[x-1]){
                lstreak++;
            } else {
            if (lstreak > nstreak){
                nextstreak = nstreak;
                nstreak = lstreak;  
            }  
            else if (lstreak > nextstreak && lstreak < nstreak){
                nextstreak = lstreak;  
            }
            lstreak=1;
        }    
    }  
    lstreak = 1;
        for (int r = 1; r<arr.length; r++){
            if (arr[r]==arr[r-1]){
                lstreak++;
            } else {
                lstreak=1;
            }
            if (nstreak == lstreak){
                System.out.print(arr[r] + " ");
                ctr++;
            }
        } 

        System.out.print("biggest streak = " + nstreak + " " + nextstreak + " with " + ctr+ " values");
    }
}
