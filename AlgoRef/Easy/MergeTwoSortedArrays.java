public static int[] merge(int[] a, int[] b){
        int[] answer = new int[a.length+b.length]
        int i=0, j=0, k=0;

        while(i < a.length && j < b.length){

        answer[k++] = a[i] < b[j] ? a[i++]:b[j++]
        }

        while(j< b.length)
        answer[k++] = b[j++];

        while(i<a.length)
        answer[k++] = a[i++];

        return answer;

        }


        //another solution

        String[] array1 = new String[]{"one", "two"};
        String[] array2 = new String[]{"three"};
        String[] array = new String[array1.length + array2.length];
        System.arraycopy(array1, 0, array, 0, array1.length);
        System.arraycopy(array2, 0, array, array1.length, array2.length);

//js
let primes = [...arr1, ...arr2];

let primes = arr1.concat(arr2);


let arr = [1,6,7,8,9];
console.log(mergeArray(arr, [2,3,4,5]))

function mergeArray(arr1, arr2) {
 var new_array =[]
 var i = 0,
     j = 0


 while (i < arr1.length && j < arr2.length ) {
     if (arr1[i] < arr2[j]) {
         new_array.push(arr1[i]);
         i++;
     } else if (arr2[j] < arr1[i]) {
         new_array.push(arr2[j]);
         j++;
     } 
 }

     while(i < arr1.length) {
       new_array.push(arr1[i])
       i++
     } 

     while(j < arr2.length) {
       new_array.push(arr2[j])
       j++
     }
 
 return new_array;
}
