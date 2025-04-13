package Bai3_5;

public class MyDate {
    private int year;
    private int month;
    private int day;
    private static final String [] MONTHS= {
            "Jan","Feb","Mar","Apr","May","Jun","Jul","Aug","Sep","Oct","Now","Dec"
    };
    private static final String [] DAYS= {
            "Sunday","Monday","Thusday","Wednesday","Thursday","Friday","Saturday"
    };
    private static final int [] DAYS_IN_MONTHS= {
            31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31
    };

    public MyDate(int year,int month,int day){
        setDate(year,month,day);
    };
    public boolean isLeapYear(int year) {
        return (year % 4 == 0 && year % 100 != 0) || (year % 400 == 0);
    }

    // Kiểm tra ngày hợp lệ
    public boolean isValidDate(int year, int month, int day) {
        if (year < 1 || year > 9999) return false;
        if (month < 1 || month > 12) return false;
        int daysInMonth = DAYS_IN_MONTHS[month - 1];
        if (month == 2 && isLeapYear(year)) {
            daysInMonth = 29;
        }
        return day >= 1 && day <= daysInMonth;
    }

    // Tính ngày trong tuần (Zeller's Congruence)
    public int getDayOfWeek(int year, int month, int day) {
        if (month == 1 || month == 2) {
            month += 12;
            year--;
        }
        int k = year % 100;
        int j = year / 100;
        int dayOfWeek = (day + (13 * (month + 1)) / 5 + k + (k / 4) + (j / 4) - 2 * j) % 7;
        return (dayOfWeek + 7) % 7; // Đảm bảo không âm
    }

    // Thiết lập ngày
    public void setDate(int year, int month, int day) {
        if (!isValidDate(year, month, day)) {
            throw new IllegalArgumentException("Invalid date!");
        }
        this.year = year;
        this.month = month;
        this.day = day;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        if (!isValidDate(year, month, day)) {
            throw new IllegalArgumentException("Invalid year!");
        }
        this.year = year;
    }

    public int getMonth() {
        return month;
    }

    public void setMonth(int month) {
        if (!isValidDate(year, month, day)) {
            throw new IllegalArgumentException("Invalid month!");
        }
        this.month = month;
    }

    public int getDay() {
        return day;
    }

    public void setDay(int day) {
        if (!isValidDate(year, month, day)) {
            throw new IllegalArgumentException("Invalid day!");
        }
        this.day = day;
    }

    public MyDate nextDay() {
        if (isValidDate(year, month, day + 1)) {
            day++;
        } else if (isValidDate(year, month + 1, 1)) {
            day = 1;
            month++;
        } else {
            day = 1;
            month = 1;
            year++;
        }
        return this;
    }

    public MyDate nextMonth() {
        if (month == 12) {
            month = 1;
            year++;
        } else {
            month++;
        }
        if (!isValidDate(year, month, day)) {
            day = DAYS_IN_MONTHS[month - 1];
            if (month == 2 && isLeapYear(year)) {
                day = 29;
            }
        }
        return this;
    }

    public MyDate nextYear() {
        year++;
        if (!isValidDate(year, month, day)) {
            day = (month == 2 && isLeapYear(year)) ? 29 : 28;
        }
        return this;
    }

    public MyDate previousDay() {
        if (isValidDate(year, month, day - 1)) {
            day--;
        } else if (isValidDate(year, month - 1, 1)) {
            month--;
            day = DAYS_IN_MONTHS[month - 1];
            if (month == 2 && isLeapYear(year)) {
                day = 29;
            }
        } else {
            month = 12;
            day = 31;
            year--;
        }
        return this;
    }

    public MyDate previousMonth() {
        if (month == 1) {
            month = 12;
            year--;
        } else {
            month--;
        }
        if (!isValidDate(year, month, day)) {
            day = DAYS_IN_MONTHS[month - 1];
            if (month == 2 && isLeapYear(year)) {
                day = 29;
            }
        }
        return this;
    }

    public MyDate previousYear() {
        year--;
        if (!isValidDate(year, month, day)) {
            day = (month == 2 && isLeapYear(year)) ? 29 : 28;
        }
        return this;
    }

    @Override
    public String toString() {
        int dayOfWeek = getDayOfWeek(year, month, day);
        return String.format("%s %d %s %d", DAYS[dayOfWeek], day, MONTHS[month - 1], year);
    }
}
