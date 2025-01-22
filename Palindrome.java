

public class Palindrome {
    
    public static boolean isPalindrome(String str){
        String rev = new StringBuilder(str).reverse().toString();
        boolean flag = str.equals(rev);
        return flag;
    }

    public static void main(String[] args) {
        System.out.println(isPalindrome("abbba"));
    }
}
