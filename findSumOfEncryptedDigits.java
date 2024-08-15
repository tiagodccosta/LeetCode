class Solution {
    public int sumOfEncryptedInt(int[] nums) {
        int totalSum = 0;

        for(int num : nums) {
            totalSum += encryptNums(num);
        }
        
        return totalSum;
    }

    private static int findMaxDigit(int x) {
        int maxDigit = 0;
        while (x > 0) {
            int digit = x % 10;
            if (digit > maxDigit) {
                maxDigit = digit;
            }
            x /= 10;
        }
        return maxDigit;
    }

    public int encryptNums(int x) {
        int maxDigit = findMaxDigit(x);
        int result = 0;
        int multiplier = 1;

        while (x > 0) {
            result += maxDigit * multiplier;
            multiplier *= 10;
            x /= 10;
        }
        return result;
    }
}
