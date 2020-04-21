import implementations.BalancedParentheses;

public class Main {
    public static void main(String[] args) {

        BalancedParentheses balancedParentheses = new BalancedParentheses("}}}{{{");

        System.out.println(balancedParentheses.solve());
    }
}
