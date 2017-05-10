/**
 * Created by ggaddam on 8/22/2016.
 */
public class ReverseString {
    static String reverseMe(String s) {
        StringBuilder sb = new StringBuilder();
        for(int i = s.length() - 1; i >= 0; --i)
            sb.append(s.charAt(i));
        return sb.toString();
    }
}

/*
Recursive
static String reverseMe(String s) {
        if(s.length() == 0)
        return "";
        return s.charAt(s.length() - 1) + reverseMe(s.substring(0,s.length()-1));
 }*/
