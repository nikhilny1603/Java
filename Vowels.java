

public class Vowels {
    public static String StrVowels(String []arr){
        String Vowels = "aeiouAEIOU";
        String r = "";
        for(int i = 0; i < arr.length; i++){
            if(Vowels.indexOf(arr[i].charAt(arr[i].length()-1)) != -1){
                r += arr[i] + " ";
            }
        }
        return r;
    }
    public static void main(String[] args) {
        String [] arr = {"Nikhil", "Ritesh", "Mayur", "Atharv", "Om", "Suhas", "Aniket", "Vaishnav", "Vaidehi"};
        System.out.println(StrVowels(arr));
    }
}
