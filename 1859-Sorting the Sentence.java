class Solution {
    public String sortSentence(String s) {
        String[] words = s.split(" ");
        String[] sortedWords = new String[words.length];
        for (String word : words) {
            int index = word.charAt(word.length() - 1) - '0';
            String originalWord = word.substring(0, word.length() - 1);
            sortedWords[index - 1] = originalWord;
        }
        return String.join(" ", sortedWords);
    }
}
