import java.util.ArrayList;
import java.util.Collections;
public class Program2 {
    public static void main(String[] args) {
        int[] nums ={3,2,3};
        ArrayList<Integer> ar = new ArrayList<>();
        for(int i : nums){
            if(!ar.contains(i)){
                ar.add(i);
            }
        }
        int[] count = new int[ar.size()];
        Collections.sort(ar);
        for(int j = 0;j<ar.size();j++){
            count[j] = count(nums,ar.get(j));
        }
        int maxIndex = max(count);
        
        System.out.println("majority element is "+ar.get(maxIndex));
    }
    static int count(int[] nums,int j){
        int count=0;
        for(int i:nums){
            if(i==j){
                count++;
            }
        }
        return count;
    }
    static int max(int[] count){
        int max = count[0];
        int index = 0;
        for(int i=1; i<count.length;i++){
            if(count[i]>max){
                index = i;
                max = count[i];
            }
        }
        return index;
    }
}
