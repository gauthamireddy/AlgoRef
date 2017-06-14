var findDuplicate = function(nums) {
    nums.sort();
    var i = 0;
    for(; i < nums.length; i ++) {
        if(i > 0 && nums[i] == nums[i-1]) break;
    }
    return nums[i];
};
