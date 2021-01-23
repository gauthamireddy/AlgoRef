public class Solution {
    public void reverseWords(char[] s) {
        int len = s.length;
        // Reverse the whole string
        reverseStr(s, 0, len-1);
        // Reverse each word
        // i is word start pointer
        // j is word end pointer
        for(int i = 0, j = 0; j <= len; j ++) {
            if(j == len || s[j] == ' ') {
                reverseStr(s, i, j - 1);
                i = j + 1;
            }
        }
    }
 
    private void reverseStr(char[] s, int start, int end) {
        while(start < end) {
            char tmp = s[start];
            s[start] = s[end];
            s[end] = tmp;
            start ++;
            end --;
        }
    }
}


function reverseInPlace(str) {
  var words = [];
  words = str.match(/\S+/g);
  var result = "";
  for (var i = 0; i < words.length; i++) {
     result += words[i].split('').reverse().join('') + " ";
  }
    
    console.log(reverseInPlace("abd fhe kdj"))
    
    
    //result = what I expect is "dba ehf jdk",
    
    //sky is blue = eulb si yks
    
    function reverseString(string) {
  let result = '';
	let words = string.split(' ');
  for( let i=words.length-1; i >= 0; i--) {
  	//result += words[i] + " ";
    result += reverseInPlace(words[i]) + ' '
  } 
  return result;
}

function reverseInPlace(string) {
  let indresult =''
  let wordsind = string.split('');
  for( let i=wordsind.length-1; i >= 0; i--) {
    indresult += wordsind[i] + "";
  }
  return indresult;
}
  return result
}
