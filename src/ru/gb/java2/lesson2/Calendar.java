package ru.gb.java2.lesson2;

public class Calendar {

    enum Month {
        JANUARY,
        FEBRARY,
        MARCH,
        APRIL,
        MAY,
        JUNE,
        JULY,
        AUGUST,
        SEPTEMBER,
        OCTOBER,
        NOVEMBER,
        DECEMBER,
        NEVERBER,
    }

    public int getNumberOfDays(Month month) {
        switch (month) {
            case JANUARY:
                return 31;
            case FEBRARY:
                return 28;
            case MARCH:
                return 31;
            case APRIL:
                return 30;
            case MAY:
                return 31;
            case JUNE:
                return 30;
            case JULY:
            case AUGUST:
                return 31;
            case SEPTEMBER:
                return 30;
            case OCTOBER:
                return 31;
            case NOVEMBER:
                return 30;
            case DECEMBER:
                return 31;
            case NEVERBER:
                return 0;
            default:
                throw new IllegalArgumentException("Unknown month: " + month);
        }
    }

    public static void main(String[] args) throws Exception {
        testUncaughtExceptionHandler();
        Calendar calendar = new Calendar();
        System.out.println(calendar.getNumberOfDays(Month.NEVERBER));
    }

    private static void testUncaughtExceptionHandler() {
        Thread.setDefaultUncaughtExceptionHandler(new Thread.UncaughtExceptionHandler() {
            @Override
            public void uncaughtException(Thread t, Throwable e) {
                System.out.println(t.getName());
                System.out.println(e.getMessage());
                System.out.println("My UncaughtExceptionHandler!");
                e.printStackTrace();
            }
        });

        int a = 0;
        System.out.println(10 / a);
    }
}
