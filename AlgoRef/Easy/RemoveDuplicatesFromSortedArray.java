public class Solution{
    public void RemoveDuplicates(int[] nums){
        int j=1;
        for(int i=1; i< nums.length; i++){
            if(nums[i]! = nums[i-1])
            nums[j++] = nums[i];
        }
        return j;
    }
}

//another solution
int[] input = new int[]{1, 1, 3, 7, 7, 8, 9, 9, 9, 10};
int current = input[0];
boolean found = false;

for (int i = 0; i < input.length; i++) {
    if (current == input[i] && !found) {
        found = true;
    } else if (current != input[i]) {
        System.out.print(" " + current);
        current = input[i];
        found = false;
    }
}
System.out.print(" " + current);

uniqueArray = a.filter(function(item, pos) {
    return a.indexOf(item) == pos;
})

    
    
    
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
