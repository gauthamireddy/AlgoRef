import java.util.*;

/**
 * Created by ggaddam on 8/21/2016.
 */
public class GroupAnagrams {
    public List< List< String > > groupAnagrams(String[] strs) {
        if(strs == null || strs.length == 0) return new ArrayList< List< String > >();

        HashMap< String, List< String > > map = new HashMap< String, List< String >>();

        for(String s: strs) {
            char[] arr = s.toCharArray();
            Arrays.sort(arr);
            String keyStr = String.valueOf(arr);
            if(!map.containsKey(keyStr)) map.put(keyStr, new ArrayList< String >());
            map.get(keyStr).add(s);
        }

        for(String key: map.keySet()) {
            Collections.sort(map.get(key));
        }

        return new ArrayList< List< String > >(map.values());
    }
}


    function anagrams(stringA, stringB) {
        /*First, we remove any non-alphabet character using regex and convert       
        convert the strings to lowercase. */
        stringA = stringA.replace(/[^\w]/g, '').toLowerCase()
        stringB = stringB.replace(/[^\w]/g, '').toLowerCase()

        /*Next, we check if the lengths of the strings are equal. 
        If they are anagrams, they will have the same length. */
        if (stringA.length !== stringB.length) {
            return false
        }

        let arrB = stringB.split("")

        for (let char of stringA ){ 
            if (!arrB.includes(char)) {
                return false
                break;
            } else {
                arrB.splice(arrB.indexOf(char), 1)
            }
        }

        return true

    }


