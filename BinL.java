// import java.util.Arrays;

public class BinL {
    public static void main(String[] args) {
       int nums[] = {0, 1, 2, 4, 5, 6, 7, 7, 7};

       int target = 7;

      int l=0, r=nums.length-1;
      int rightmostidx=-1;
      while(l<=r){
        int mid=l+(r-l)/2;
        if(nums[mid]==target){
            rightmostidx=mid;
            r=mid-1;
        }
        else if(nums[mid]>target){
            r=mid-1;
        }
        else{
            l=mid+1;
        }
      }
        System.out.println(rightmostidx);
    }
}