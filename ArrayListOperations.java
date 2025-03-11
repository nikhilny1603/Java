import java.util.ArrayList;
import java.util.Collections;

class ArrayListOperations{
    public static void main(String []args){
        ArrayList<Integer> list = new ArrayList<Integer>();

        list.add(10);
        list.add(20);
        list.add(30);
        list.add(40);
        System.out.println("ArrayList Elements : "+ list);
        list.add(1,50);
        System.out.println("ArrayList Elements : "+ list);
        list.set(2,60);
        System.out.println("ArrayList Elements : "+ list);
        //list.remove(60);
        //System.out.println("ArrayList Elements : "+ list);
        System.out.println("ArrayList Elements : "+ list.size());
        Collections.sort(list);
        System.out.println(list);

        ArrayList<String> BreakFast = new ArrayList();
        BreakFast.add("Omlete");
        BreakFast.add("Poha");
        BreakFast.add("Idli Sambar");

        ArrayList<String> Lunch = new ArrayList();
        Lunch.add("Dal Chawal");
        Lunch.add("Akhha Masoor");
        Lunch.add("Matar Paneer");

        ArrayList<String> Dinner = new ArrayList();
        Dinner.add("Chicken Curry");
        Dinner.add("Biryani");
        Dinner.add("Rajma Chawal");

        ArrayList<ArrayList<String>> Food = new ArrayList();
        Food.add(BreakFast);
        Food.add(Lunch);
        Food.add(Dinner);

        System.out.println(Food);
    }
    
}