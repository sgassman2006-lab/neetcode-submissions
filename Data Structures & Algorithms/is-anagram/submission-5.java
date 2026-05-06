class Solution {
    public boolean isAnagram(String s, String t) {
        if (s.length() != t.length()) return false;
        Map<Character, Integer> hashMap = new HashMap<Character, Integer>();

        for(int i = 0; i < s.length(); i++) {
            Character c = s.charAt(i);
            Integer val = hashMap.get(c);
            if (val == null) {
                hashMap.put(c, 1);
            } else {
                hashMap.put(c, val + 1);
            }
        }

        for(int i = 0; i < t.length(); i++) {
            Character c = t.charAt(i);
            Integer val = hashMap.get(c);
            if(val == null || val == 0) {
                return false;
            } else {
                hashMap.replace(c, val - 1);
            }
        }

        for (int count : hashMap.values()) {
            if (count != 0) return false;
        }
        return true;
    }
}
