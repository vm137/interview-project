package bwaters;

import java.util.Stack;

class Parenthesis {
    /* You need to check whether an expression consisting on (, [, { is balanced or not
     It is guaranteed that there will be no other characters in input string (no need to validate it)
     () -> true
     ([) -> false
     ([]) -> true
     ([)] -> false
     ()[]{} -> true
     (((((([[[[[[[{{{{{{{()[]()}}}}}}}]]]]]]])))))) -> true
     ))))) -> false
     */

    public boolean isBalanced(String expr) {
        String[] chrs = expr.split("");
        Stack<String> stack = new Stack<>();
        String openings = "([{";
        String closing = ")]}";

        char firstChar = expr.charAt(0);
        if (closing.contains(String.valueOf(firstChar))) {
            return false;
        }

        for (String c : chrs) {
            if (openings.contains(c)) {
                stack.push(c);
            } else {
                if (stack.empty()) { return false; }
                String last = stack.pop();
                if (")".equals(c) && !"(".equals(last)
                    || "]".equals(c) && !"[".equals(last)
                    || "}".equals(c) && !"{".equals(last)) {
                    return false;
                }
            }
        }
        return true;
    }

    public static void main(String[] args) {
        Parenthesis m = new Parenthesis();
        System.out.println(m.isBalanced("()"));
        System.out.println(m.isBalanced("([)"));
        System.out.println(m.isBalanced("([])"));
        System.out.println(m.isBalanced("([)]"));
        System.out.println(m.isBalanced("()[]{}"));
        System.out.println(m.isBalanced("(((((([[[[[[[{{{{{{{()[]()}}}}}}}]]]]]]]))))))"));
        System.out.println(m.isBalanced("))))))"));
    }
}
