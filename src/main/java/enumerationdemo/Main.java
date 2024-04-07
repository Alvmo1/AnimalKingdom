package enumerationdemo;

public class Main {
    public static void main(String[] args) {


        Days day = Days.SATURDAY;
        System.out.println(day);
        System.out.println("==========");

        Days[] days = Days.values();
        for (Days d:days){
            System.out.println(d);
        }
        System.out.println("===============");

        System.out.println(day.getNumberOfDay());

        if (day == Days.FRIDAY){
            System.out.println("Friday Forum Day");
        } else if (day == Days.SATURDAY || day == Days.SUNDAY) {
            System.out.println("Its the weekend");
        }else{
            System.out.println("Just another day at YearUp");
        }
        System.out.println("==============s");
        switch(day){
            case FRIDAY:
                System.out.println("Friday Forum Day");
                break;
            case SATURDAY, SUNDAY:
                System.out.println("Its the weekend");
                break;
            default:
                System.out.println("Just another day at YearUp");
        }
    }
}
