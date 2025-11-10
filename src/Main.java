public class Main
{
    public static void main(String[] args)
    {
        APCalendar c = new APCalendar();
        System.out.println(c.firstDayOfYear(2019));
        System.out.println(c.numberOfLeapYears(0,0));
        System.out.println(c.isLeapYear(0));
    }
}
