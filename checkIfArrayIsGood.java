class Solution {
    public boolean isGood(int[] nums) {
        int maxDigit = 0;

        for(int n : nums) {
            if(n > maxDigit) {
                maxDigit = n;
            }    
        }

        if(nums.length != (maxDigit + 1)) {
            return false;
        }

        HashMap<Integer, Integer> frequency = new HashMap<>();

        for(int n : nums) {
            frequency.put(n, frequency.getOrDefault(n, 0) + 1);
        }

        for (int i = 1; i < maxDigit; i++) {
            if (frequency.getOrDefault(i, 0) != 1) {
                return false;
            }
        }

        return frequency.getOrDefault(maxDigit, 0) == 2;
    }
}
