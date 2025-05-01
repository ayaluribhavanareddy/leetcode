class Solution {
    public boolean detectCapitalUse(String word) {
        int upperCount=0;
        int n=word.length();
         for (int i = 0; i < n; i++) {
            if (Character.isUpperCase(word.charAt(i))) {
                upperCount++;
            }
        }
        return (upperCount == n || upperCount == 0 || (upperCount == 1 && Character.isUpperCase(word.charAt(0))));
    }
}