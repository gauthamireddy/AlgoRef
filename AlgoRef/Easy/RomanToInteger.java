public class Solution{
    public int romanToInt(String s){
        int prev=0; int total=0;
        for(char c : s.toCharArray()){
            int cur = map.get(c);
            total += (prev>=cur) ? cur: cur-2 *prev ;
            prev = cur;
        }
        return total;
    }

    private HashMap<Character,Integer> map = new HashMap<Character,Integer>(){{
        put('I', 1);
        put('V', 5);
        put('X', 10);
        put('L', 50);
        put('C',100);
        put('D', 500);
        put('M',1000);
    }};
}


//js

const values = new Map([
  ['I', 1],
  ['V', 5],
  ['X', 10]
  /*....*/
]);

function romanToInt(string) {
  let result = 0,
    current, previous = 0;
  for (const char of string.split("").reverse()) {
    current = values.get(char);
    if (current >= previous) {
      result += current;
    } else {
      result -= current;
    }
    previous = current;
  }
  return result;
}
