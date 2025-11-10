public class APCalendar
{
    public static boolean isLeapYear(int year)
    {
        boolean x = year % 4 == 0;
        boolean y = year % 100 == 0;
        boolean z = year % 400 == 0;
        if (year == 0) return false;
        return (x && !y) || z;
    }
    public static int numberOfLeapYears(int year1, int year2)
    {
        int years = 0;
        for (int i = year1; i <= year2; i++)
        {
            if (isLeapYear(i)) years++;
        }
        return years;
    }
    public static int firstDayOfYear(int year)
    {
        return (year + numberOfLeapYears(0, year)) % 7;
    }
    private static int dayOfYear(int month, int day, int year)
    {
        return 0;
    }
    public static int dayOfWeek(int month, int day, int year)
    {
        return 0;
    }
}