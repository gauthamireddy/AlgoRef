public class Solution{
    public boolean ValidParenthesis(String s){
        if(s.length == 0 || s== null) return true;
        Stack<Character> stack = new Stack<Character>();
        for(char c: s.toCharArray()){
            if(map.containsKey(c))
                stack.push(c);
             else if( stack.isEmpty() || map.get(stack.pop())!== c) return false;

        }

        private HashMap<Character,Character> map = new HashMap<Character,Character>(){{
            put('{','}');
            put('[',']');
            put('(',')');
        }};
    }

    public static void main(String[] args){
        ValidParenthesis('{}')
    }
}