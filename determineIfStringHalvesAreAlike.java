class Solution {
    public boolean halvesAreAlike(String s) {
        char[] vowels = "aeiouAEIOU".toCharArray();
        int length = s.length() / 2;
        int counter1 = 0;
        int counter2 = 0;
        String a = s.substring(0, length);
        String b = s.substring(length);
        char[] aString = a.toCharArray();
        char[] bString = b.toCharArray();

        for(int i = 0; i < aString.length; i++) {
            for(int j = 0; j < vowels.length; j++) {
                if(aString[i] == vowels[j]) {
                    counter1++;
                }
            }
        }

        for(int i = 0; i < bString.length; i++) {
            for(int j = 0; j < vowels.length; j++) {
                if(bString[i] == vowels[j]) {
                    counter2++;
                }
            }
        }

        if(counter1 == counter2) {
            return true;
        } else {
            return false;
        }
    }
}