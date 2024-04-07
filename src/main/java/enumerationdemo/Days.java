package enumerationdemo;

public enum Days {
    SUNDAY(1), MONDAY(2), TUESDAY(3), WEDNESDAY(4), THURSDAY(5), FRIDAY(6), SATURDAY(7),;

    final int numberOfDay;

    Days(int numberOfDay) {
        this.numberOfDay = numberOfDay;
    }

    public int getNumberOfDay(){
        return numberOfDay;
    }
}
