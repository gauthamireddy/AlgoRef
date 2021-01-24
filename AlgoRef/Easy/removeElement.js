var removeElement = function(nums, val) {
    var begin = 0;
    for(var i = 0; i < nums.length; i ++) {
        if(nums[i] !== val) nums[begin++] = nums[i];
    }
    
    return begin;
};

//another solution
int[] input = new int[]{1, 1, 3, 7, 7, 8, 9, 9, 9, 10};
int current = input[0]; //1 in the beginning
int value = 7

for (int i = 0; i < input.length; i++) {
    if (input[i] != value) {
        System.out.print(" " + current);
        current = input[i];
    }
}
System.out.print(" " + current);

var value = 3

var arr = [1, 2, 3, 4, 5, 3]

arr = arr.filter(function(item) {
    return item !== value
})

console.log(arr)
// [ 1, 2, 4, 5 ]


let forDeletion = [2, 3, 5]



function uniqueArray(array) {
  var hashmap = {};
  var unique = [];

  for(var i = 0; i < array.length; i++) {
    // If key returns undefined (unique), it is evaluated as false.
    if(!hashmap.hasOwnProperty(array[i])) {
      hashmap[array[i]] = 1;
      unique.push(array[i]);
    }
  }

  return unique;
}


const removeDupes = (arr) => {
  let result = [];
  let previous = arr[0];
  console.log(previous);
  result[0] = previous;
  
  for(let i = 0; i < arr.length; i++) {
    console.log(arr[i])
    if (arr[i] != previous) {
      result.push(arr[i]);
    }
    
    previous = arr[i];
  }
  
  return result;
}

let arr = [1, 2, 3, 4, 5, 3]

arr = arr.filter(item => !forDeletion.includes(item))
// !!! Read below about array.includes(...) support !!!

console.log(arr)
// [ 1, 4 ]
