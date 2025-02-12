import java.util.Random;

class RandomValues{
    public static void main(String []args){
        Random r = new Random();
    String []choices = { "Rock", "Paper", "Scissors" };
    int compIdx = r.nextInt(choices.length);
    String compValue = choices[compIdx];
    System.out.println(compValue);
    }
}