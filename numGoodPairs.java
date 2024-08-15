class Solution {
    public int numIdenticalPairs(int[] nums) {
        ArrayList<Integer> pairs = new ArrayList<Integer>();
        int counter = 0;

        for(int i = 0; i < nums.length; i++){
            for(int j = 0; j < nums.length; j++) {
                if(nums[i] == nums[j] && i < j) {
                    pairs.add(counter);
                    counter++;
                }
            }
        }

        return pairs.size();
     }
}