function longestPrefix(arr) {
let first = arr[0]

for(let i=0; i<first.length; i++) {
  for(let j=1; j<arr.length; j++) {
    let other = arr[j];
    if(first[i] != other[i]) return other.slice(0,i)
  }
}
}
