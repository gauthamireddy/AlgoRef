/**
 * Created by ggaddam on 8/21/2016.
 */

Spread operator

let arr = [...a, ...b]

function mergeArray(arr1, arr2) {
      return  arr1.concat(arr2.filter((e) => {
                return arr1.indexOf(e) == -1
        })
}

public class MergeSortedArray {
        public void merge(int[] nums1, int m, int[] nums2, int n) {
            int i = m-1, j = n-1, k = m+n-1;
            while(k >= 0) {
                if(j < 0 || (i >= 0 && nums1[i] > nums2[j])){
                    nums1[k--] = nums1[i--];
                }else{
                    nums1[k--] = nums2[j--];
                }
            }
        }
    }

