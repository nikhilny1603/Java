import java.util.Scanner;
public class CalculateDay {
    public static void main(String args[])
    {
        // int date = Integer.parseInt(args[0]);
        // int month = Integer.parseInt(args[1]);
        // int year = Integer.parseInt(args[2]);
        
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the date :");
        int date = sc.nextInt();
        System.out.println("Enter the month :");
        int month = sc.nextInt();
        System.out.println("Enter the year :");
        int year = sc.nextInt();

     
        int daypassed = date;

        int[] months_of_year ={0,31,28,31,30,31,30,31,31,30,31,30,31};

        for(int i=0; i<month;i++){
            daypassed = daypassed + months_of_year[i];
        }

         if(year%4==0 && month > 2){
            daypassed = daypassed +1;
        }
        System.out.println();
        System.out.println("Total Days Passed :"+ daypassed);

        year = year -1;
        int mf = year % 400;
        int y = mf / 100;
        int total_year = mf % 100;

        int remaining =year - total_year;
        int leap =0;

        for(int i =remaining+1;i<=year;i++){
            if(i%4==0 && i % 100 !=0 || i % 400==0){
                leap ++;
            }
           
        } 
        
        int odd_year = total_year - leap;

        int total_days = daypassed + (y*5) + odd_year + (leap * 2);
        int num_of_odd_day = total_days % 7;

        System.out.println("Day of week :"+num_of_odd_day);

        switch (num_of_odd_day) {
            case 0:
                System.out.println("Sunday");
                break;
            case 1:
                System.out.println("Monday");
                break;
            case 2:
                System.out.println("Tuseday");
                break;
            case 3:
                System.out.println("Wedensday");
                break;
            case 4:
                System.out.println("Thursday");
                break;
            case 5:
                System.out.println("Friday");
                break;
            case 6:
                System.out.println("Saturday");
                break;   

        }

    }
    
}