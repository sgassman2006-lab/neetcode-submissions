class Solution {
    public boolean isValid(String s) {
        if (s.length() % 2 != 0) {
            return false;
        }
        Stack<Character> check = new Stack<Character>();
        for(int i = 0; i < s.length(); i++) {
            char current = s.charAt(i);
            if (check.empty()) {
                if (current == '}' || current == ']' || current == ')') 
                    return false;
                check.push(current);
            } else {
                char c = check.peek();
                if (current == '{' || current == '[' || current == '(')
                    check.push(current);
                else if (c == '{' && current != '}' || c == '[' && current != ']' || c == '(' && current != ')')
                    return false;
                else
                    check.pop();
            }
        }
        return check.empty();
    }
}
