class Solution {
    public boolean isPalindrome(String s) {
        String letters = "";
        for (int i = 0; i < s.length(); i++) {
            if (Character.isLetterOrDigit(s.charAt(i))) {
                letters += Character.toLowerCase(s.charAt(i));
            }
        }

        char[] cArray = letters.toCharArray();
        int end = cArray.length - 1;
        for (int i = 0; i < cArray.length; i++) {
            if (cArray[i] != cArray[end - i]) {
                return false;
            }
        }
        return true;
    }
}