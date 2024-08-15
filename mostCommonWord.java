class Solution {
    public String mostCommonWord(String paragraph, String[] banned) {
        Set<String> bannedSet = new HashSet<>(Arrays.asList(banned));
        
        Map<String, Integer> wordCount = new HashMap<>();
        
        StringBuilder word = new StringBuilder();
        String mostFrequentWord = "";
        int maxCount = 0;
        
        for (int i = 0; i < paragraph.length(); i++) {
            char c = paragraph.charAt(i);
            
            if (Character.isLetter(c)) {
                word.append(Character.toLowerCase(c));
                
                if (i == paragraph.length() - 1 || !Character.isLetter(paragraph.charAt(i + 1))) {
                    String currentWord = word.toString();
                    if (!bannedSet.contains(currentWord)) {
                        int count = wordCount.getOrDefault(currentWord, 0) + 1;
                        wordCount.put(currentWord, count);
                        if (count > maxCount) {
                            mostFrequentWord = currentWord;
                            maxCount = count;
                        }
                    }
                    word = new StringBuilder();
                }
            }
        }
        
        return mostFrequentWord;
    }    
}
