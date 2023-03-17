package JAVA;

import java.util.*;

public class Problem24 {
    public static void main(String[] args) {
        
    }

    public static int strStr(String haystack, String needle) {
        if(haystack==null || needle==null) return -1;
        if(haystack.equals(needle))return 0;
        int n=needle.length();
        for(int i=0; i<haystack.length(); i++){
            if (haystack.substring(i, i + n).equals(needle)) {
                return i;
            }
        }
        return -1;
    }
}