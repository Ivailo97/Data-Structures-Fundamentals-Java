package implementations;

import interfaces.Solvable;

import java.util.*;
import java.util.ArrayDeque;
import java.util.stream.Collectors;

public class BalancedParentheses implements Solvable {

    private String parentheses;

    public BalancedParentheses(String parentheses) {
        this.parentheses = parentheses;
    }

    @Override
    public Boolean solve() {

        Map<Character, Character> validParentheses = new HashMap<>();
        validParentheses.put('{', '}');
        validParentheses.put('(', ')');
        validParentheses.put('[', ']');

        ArrayDeque<Character> deque = Arrays.stream(parentheses.split(""))
                .map(x -> x.charAt(0))
                .collect(Collectors.toCollection(ArrayDeque::new));


        if (deque.size() % 2 != 0) {
            return false;
        }

        while (!deque.isEmpty()) {

            Character closing = deque.removeLast();
            Character opening = deque.removeFirst();

            if (!validParentheses.containsKey(opening) || !validParentheses.get(opening).equals(closing)) {
                return false;
            }
        }

        return true;
    }

//    @Override
//    public Boolean solve() {
//
//        Stack<Character> st = new Stack<>();
//
//        for (int i = 0; i < parentheses.length(); i++) {
//            char currentChar = parentheses.charAt(i);
//
//            if (currentChar == '{' || currentChar == '(' || currentChar == '[') {
//                st.push(currentChar);
//            } else if (currentChar == '}' || currentChar == ')' || currentChar == ']') {
//                if (st.isEmpty()) {
//                    return false;
//                } else if (!isMatchingPair(st.pop(), currentChar)) {
//                    return false;
//                }
//            }
//        }
//
//        return st.isEmpty();
//    }
//
//    private boolean isMatchingPair(char character1, char character2)
//    {
//        if (character1 == '(' && character2 == ')')
//            return true;
//        else if (character1 == '{' && character2 == '}')
//            return true;
//        else return character1 == '[' && character2 == ']';
//    }
}
