public class Arrays8 {
public static void main(String[] args) {
      int [] arr = {1,1,2,2,2,1,1,2,3,5,6,6,6,7,7,8};
      //print the least and second least frequent element
      //ignore num that appear only once
      int leastcnt = arr.length; int nxtleastcnt = 1000;
      int leastnum = 0; int nxtleastnum = 0;
      for (int x = 0; x<arr.length; x++){
        boolean f = true;
        int ctr = 1;
        for (int z = x-1; z>=0; z--){
            if (arr[x]==arr[z]){
                f = false;
                break;
            } 
        } if (f) {
        for (int y = x+1; y<arr.length; y++){
            if (arr[x] == arr[y]){
                ctr++;
            }
        }if (ctr>1){
            if (ctr<leastcnt){
            nxtleastcnt = leastcnt;
            nxtleastnum = leastnum;
            leastcnt = ctr;
            leastnum = arr[x];
            } else if (ctr>leastcnt && ctr<nxtleastcnt){
                nxtleastcnt = ctr;
                nxtleastnum = arr[x];
            }
        }
            
        }
      }System.out.print(leastnum + " "+nxtleastnum);
}
}

