public static int[] addPos(int[] a, int pos, int num){
        int[] res = new int[a.length];
        for(int i=0; i<pos; i++)
        res[i] = a[i];

        res[pos] = num;

        for(int i=pos+1; i<a.length; i++)
        res[i]=a[i-1];

        return res;
        }

//another
        List<Integer> myList = new ArrayList<Integer>();
        myList.add(5);
        myList.add(7);
//another
        //initial array
        int[] oldArray = {1,2,3,4,5};

        //new value
        int newValue = 10;

        //define the new array
        int[] newArray = new int[oldArray.length + 1];

        //copy values into new array
        for(int i=0;i < oldArray.length;i++)
        newArray[i] = oldArray[i];
        //another solution is to use
        //System.arraycopy(oldArray, 0, newArray, 0, oldArray.length);

        //add new value to the new array
        newArray[newArray.length-1] = newValue;

        //copy the address to the old reference
        //the old array values will be deleted by the Garbage Collector
        oldArray = newArray;


//more options
https://stackoverflow.com/questions/351409/how-to-append-something-to-an-array

//end 
arr[arr.length] = 4
        
arr.push = 4
        
arr.concat([4])
        
//specific index
        
let arr = [1,2,3,5]
arr[3] = 4 
        
arr.splice(3,0,4)

// beginning of the array
arr.unshift(4)
       
