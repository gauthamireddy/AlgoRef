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
