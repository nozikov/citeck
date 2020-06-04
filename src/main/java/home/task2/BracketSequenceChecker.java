package home.task2;


import java.util.Map;
import java.util.Objects;
import java.util.Stack;

/**
 * Написать алгоритм проверки корректности регулярного выражения, которое включает [,],(,)
 * т.е., например ([][[]()]) - правильно, ([][]()]) – неправильно
 */
public class BracketSequenceChecker {

    private final Map<Character, Character> brackets = Map
                                        .of('}', '{', ']', '[', ')', '(');

    public boolean check(String str) {
        Stack<Character> stack = new Stack<>();
        if (str.length() % 2 != 0) {
            return false;
        }
        for (int i = 0; i < str.length(); i++) {
            final char bracket = str.charAt(i);
            if (isOpeningBracket(bracket)) {
                stack.push(bracket);
            } else if (isClosingBracket(bracket)) {
                final char expectedBracket = getPairBracket(bracket);
                if (stack.empty()) {
                    return false;
                }
                if (Objects.equals(expectedBracket, stack.peek())) {
                    stack.pop();
                } else {
                    return false;
                }
            } else {
                return false;
            }
        }
        return stack.empty();
    }

    private boolean isOpeningBracket(char bracket) {
        return brackets.containsValue(bracket);
    }

    private boolean isClosingBracket(char bracket) {
        return brackets.containsKey(bracket);
    }

    private char getPairBracket(char bracket) {
        return brackets.get(bracket);
    }
}
