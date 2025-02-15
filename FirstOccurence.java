import java.util.*;
class FirstOccurence{

    public static int FirstOccur(String haystack, String needle){

        for(int i = 0; i < haystack.length() - needle.length() + 1; i++){
            if(haystack.substr(i,(needle.length())) == needle){
                return i;
            }
        }
        return -1;
    }
    public static void main(String []args){
        String haystack = "Leetcode";
        String needle = "Leet";
        int result = FirstOccur(haystack,needle);
        System.out.println(result);
    }
}