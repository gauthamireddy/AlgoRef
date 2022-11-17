function palindrome(num) {
    let reversedNum = '';
    let original = num;
    
    while(num > 0) {
        console.log(num)
        reversedNum = reversedNum + num%10;
        num=Math.floor(num/10)
    }
    console.log(reversedNum)
    
    if(reversedNum == original) return 'palindrome'
    if(reversedNum !== original) return 'not a palindrome'
}



console.log(palindrome(323))
  
 
function palindromeString(str) {
    let len = str.length;
    for(let i=0; i<(len/2); i++) {
        if(str[i] !== str[len-1-i]) {
         return false
        }
    }
    return true
}

console.log(palindromeString('madam'))
