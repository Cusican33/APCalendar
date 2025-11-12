public class APCalendar
{
    private static boolean isLeapYear(int year)
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
        return (year + numberOfLeapYears(1, year)) % 7;
    }
    private static int dayOfYear(int month, int day, int year)
    {
        int days = 0;
        if (month > 1) days += 31;
        if (month  > 2) days += 28;
        if (isLeapYear(year)) days ++;
        if (month > 3) days += 31;
        if (month > 4) days += 30;
        if (month > 5) days += 31;
        if (month > 6) days += 30;
        if (month > 7) days += 31;
        if (month > 8) days += 31;
        if (month > 9) days += 30;
        if (month > 10) days += 31;
        if (month > 11) days += 30;
        days += day;
        return days;
    }
    public static int dayOfWeek(int month, int day, int year)
    {
        int days = dayOfYear(month, day, year) & 7;
        return firstDayOfYear(year) + days - 1;
    }
}
