class Solution {
    public boolean isAnagram(String s, String t) {
        if(s.length() != t.length()) {
            return false;
        }

        HashMap<Character, Integer> sMap = new HashMap<Character, Integer>();
        HashMap<Character, Integer> tMap = new HashMap<Character, Integer>();

        for (int i = 0; i < s.length(); i++) {
            Character sChar = s.charAt(i);
            Character tChar = t.charAt(i);
            sMap.put(s.charAt(i), sMap.getOrDefault(sChar, 0) + 1);
            tMap.put(t.charAt(i), tMap.getOrDefault(tChar, 0) + 1);
        }

        return sMap.equals(tMap);
    }
}
