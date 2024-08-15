class Solution {
    public int[] separateDigits(int[] nums) {

        List<Integer> numList = new ArrayList<>();

        for(int num : nums) {
            String numToString = String.valueOf(num);

            for(char dig : numToString.toCharArray()) {
                numList.add(dig - '0');
            }   
        }

        int[] answer = new int[numList.size()];
        for(int i = 0; i < numList.size(); i++) {
            answer[i] = numList.get(i);
        }

        return answer;
    }
}
