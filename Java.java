

public class Java {

   public static void main(String[] args) {

      int[] num = {1, 1, 206, 10, 2, 3, 1, 0, 20};
      int k = 4;

      int n = num.length;
      int maxSum = Integer.MIN_VALUE;
      int curSum = 0;
      int mxfirstindex=-1, mxlastindex=-1;

      for(int i= 0; i < n; i++) {
         if(i < k) {
            curSum = curSum + num[i];

            if(i == k-1) {
               maxSum = curSum;
               mxfirstindex=0;
               mxlastindex=k-1;
            }
         }
         else {
            curSum = curSum + num[i] - num[i-k];
            if(maxSum<curSum){
               maxSum=curSum;
               mxfirstindex=i-k+1;
               mxlastindex=i;
            }
         }
      }
      System.out.println(maxSum);
      for(int i=mxfirstindex;i<=mxlastindex;i++){
         System.out.print(i+" ");
      }
   }
}