class Solution {
    public boolean checkRecord(String s) {
        int counterA = 0;
        int consecutiveL = 0;
        
        for(int i = 0; i < s.length(); i++) {
            if(s.charAt(i) == 'A') {
                counterA++;
                if(counterA >= 2) {
                    return false;
                }
            }
            
            if(s.charAt(i) == 'L') {
                consecutiveL++;
                if(consecutiveL >= 3) {
                    return false;
                }
            } else {
                consecutiveL = 0;
            }
        }
        
        return true;
    }
}