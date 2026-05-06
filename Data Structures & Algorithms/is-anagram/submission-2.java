class Solution {
    public boolean isAnagram(String s, String t) {
        ArrayList<Character> sList = new ArrayList<Character>();
        for (int i = 0; i < s.length(); i++) {
            sList.add(s.charAt(i));
        }

        boolean isAnagram = true;
        int i = 0;
        while (isAnagram && i < t.length()) {
            isAnagram = sList.remove((Character) t.charAt(i));
            i++;
        }
        
        if (sList.size() != 0) {
            isAnagram = false;
        }

        return isAnagram;
    }
}
