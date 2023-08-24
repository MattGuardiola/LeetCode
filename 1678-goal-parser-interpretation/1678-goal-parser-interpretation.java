class Solution {
    public String interpret(String command) {
        StringBuilder interpretation = new StringBuilder();
        
        int i = 0;
        while (i < command.length()) {
            if (command.charAt(i) == 'G') {
                interpretation.append('G');
                i++;
            } else if (command.charAt(i) == '(' && command.charAt(i + 1) == ')') {
                interpretation.append('o');
                i += 2;
            } else if (command.charAt(i) == '(' && command.charAt(i + 1) == 'a' && command.charAt(i + 2) == 'l' && command.charAt(i + 3) == ')') {
                interpretation.append("al");
                i += 4;
            }
        }
        
        return interpretation.toString();
    }
}