import java.util.*;

public class Prac {
    public static void main(String args[]) {

        int [] num = {1,2,3,4,5,6,7,8,9};
        int target = 7;

        int left = 0;
        int right = num.length-1;

        while(left < right) {
            int mid = left + (right - left) / 2;

            if(num[mid] == target) {
                System.out.println("found at index:" + mid);
                break;
            }
            if(left < target) {
                left = mid + 1;
            }
            else {
                right = mid -1;
            }
        }
        
    }        
}


