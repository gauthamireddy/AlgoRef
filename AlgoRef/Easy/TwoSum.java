public class Solution {
    public int[] twoSum(int[] nums, int target) {
        HashMap<Integer, Integer> map = new HashMap<Integer,Integer>();
        for(int i= 0 ; i< nums.length; i++){
            if(map.containsKey(nums[i]))
                return new int[]{map.get(nums[i]), i};
            else
                map.put(target-nums[i],i);
        }
        throw new IllegalArgumentException("No such solution");

    }
}

const twoSum_On_Better = (arr, target) => {
	let numObject = {};
	for (let i = 0; i < arr.length; i++) {
		let thisNum = arr[i];
		numObject[thisNum] = i;
	}
	for (var i = 0; i < arr.length; i++) {
		let diff = target - arr[i];
		if (numObject.hasOwnProperty(diff) && numObject[diff] !== i) {
			return [i, numObject[diff]];
		}
	}
}
