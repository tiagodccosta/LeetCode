class Solution {
    public int secondHighest(String s) {
        
        char[] array = s.toCharArray();
        List<Integer> numbers = new ArrayList<>();

        for(char n : array) {
            if(Character.isDigit(n)) {
                int number = n - '0';
                if(!numbers.contains(number)) {
                    numbers.add(number);
                }
            }
        }

        Collections.sort(numbers);
        if(numbers.size() < 2) {
            return -1;
        } else {
            return numbers.get(numbers.size() - 2);
        }
    }
}