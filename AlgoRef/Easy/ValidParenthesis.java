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


let isParenthesisMatching = (str) => {
    let stack = [];

    let open = {
        '{': '}',
        '[': ']',
        '(': ')'
    };

    let closed = {
        '}': true,
        ']': true,
        ')': true
    }

    for (let i = 0; i < str.length; i++) {

        let char = str[i];

        if (open[char]) {
            stack.push(char);
        } else if (closed[char]) {
            if (open[stack.pop()] !== char) return false;
        }
    }
    return stack.length === 0;
}
