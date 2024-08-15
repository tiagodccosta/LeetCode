import java.util.ArrayList;
import java.util.List;

class Solution {
    public int[] intersection(int[] nums1, int[] nums2) {
        List<Integer> uniquIntegers = new ArrayList<>();
        int freq1 [] = new int[1001];
        int freq2 [] = new int[1001];

        for(int num: nums1){
            freq1[num] = 1;
        }
        
        for(int num: nums2){
            freq2[num] = 1;
        }

        for(int i = 0; i < 1001; i++){
            if(freq1[i] == 1 && freq2[i] == 1){
                uniquIntegers.add(i);
            }
        }

        int size = uniquIntegers.size();
        int [] result = new int[size];
        
        for(int i = 0; i < size; i++){
            result[i] = uniquIntegers.get(i);
        }

        return result;
    }
}