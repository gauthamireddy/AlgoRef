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
