public class ValidParentheses {

    public static void main(String[] args) {
        // write your code here
        System.out.println(ValidParentheses("()")); // true
        System.out.println(ValidParentheses("("));  // false
        System.out.println(ValidParentheses(")(()))"));  // false
        System.out.println(ValidParentheses("(())((()())())"));  // true
    }

    public static boolean ValidParentheses(String par) {
        int open = 0;
        int closed = 0;

        for (int i = 0; i < par.length(); i++){

            if (par.charAt(i) == '(') {
                open++;
                continue;
            }

            if (par.charAt(i) == ')') {
                closed++;
                if (closed > open) {
                    return false;
                }
            }
        }

        if (open != closed){
            return false;
        }

        return true;
    }
}
