class Solution {
    public boolean isPalindrome(String s) {
        StringBuilder letters = new StringBuilder();
        for (int i = 0; i < s.length(); i++) {
            if (Character.isLetterOrDigit(s.charAt(i))) {
                letters.append(Character.toLowerCase(s.charAt(i)));
            }
        }

        return letters.toString().equals(letters.reverse().toString());
    }
}