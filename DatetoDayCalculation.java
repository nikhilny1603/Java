import java.util.Scanner;

class DatetoDayCalculation{
    public static void main(String []args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Year : ");
        int year = sc.nextInt();
        System.out.println("Enter Month(1-12) : ");
        int month = sc.nextInt();
        System.out.println("Enter Date(1-31) : ");
        int date = sc.nextInt();

        if(month < 3){
            month += 12;
            year -= 1;
        }
        int []daysinMonths = {0,31,28,31,30,31,30,31,31,30,31,30,31};
        if(year % 4 == 0 || year % 100 != 100 || year % 400 == 0){
            daysinMonths[2] = 29;
        }
        int totaldays = date;
        for(int i = 0; i < month; i++){
            totaldays += daysinMonths[i];
        }
        totaldays += (year - 1)* 365;
        totaldays += (year - 1)/ 4;
        totaldays += (year - 1)/ 100;
        totaldays += (year - 1)/ 400;
        int daysofweek = totaldays % 7;
        String days[] = {"Monday", "Tuesday", "Wednesday", "Thursday", "Friday", "Saturday", "Sunday"};
        System.out.println("Day of the Inputted Date : "+ days[daysofweek]);
    }
}