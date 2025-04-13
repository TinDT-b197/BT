package Bai3_4;

public class MyTime {
    // Các thuộc tính của lớp MyTime
    private int hour;   // Giá trị giờ (0 đến 23)
    private int minute; // Giá trị phút (0 đến 59)
    private int second; // Giá trị giây (0 đến 59)

    // Hàm khởi tạo mặc định
    public MyTime() {
        this.hour = 0;
        this.minute = 0;
        this.second = 0;
    }

    // Hàm khởi tạo với tham số giờ, phút và giây
    public MyTime(int hour, int minute, int second) {
        setTime(hour, minute, second);
    }

    // Phương thức thiết lập giờ, phút và giây
    public void setTime(int hour, int minute, int second) {
        setHour(hour);
        setMinute(minute);
        setSecond(second);
    }

    // Phương thức lấy giờ
    public int getHour() {
        return this.hour;
    }

    // Phương thức lấy phút
    public int getMinute() {
        return this.minute;
    }

    // Phương thức lấy giây
    public int getSecond() {
        return this.second;
    }

    // Phương thức thiết lập giờ
    public void setHour(int hour) {
        if (hour >= 0 && hour <= 23) {
            this.hour = hour;
        }
    }

    // Phương thức thiết lập phút
    public void setMinute(int minute) {
        if (minute >= 0 && minute <= 59) {
            this.minute = minute;
        }
    }

    // Phương thức thiết lập giây
    public void setSecond(int second) {
        if (second >= 0 && second <= 59) {
            this.second = second;
        }
    }

    // Phương thức chuyển đối tượng MyTime thành chuỗi theo định dạng HH:MM:SS
    public String toString() {
        return String.format("%02d:%02d:%02d", this.hour, this.minute, this.second);
    }

    // Phương thức tính giây tiếp theo
    public MyTime nextSecond() {
        this.second++;
        if (this.second > 59) {
            this.second = 0;
            nextMinute();
        }
        return this;
    }

    // Phương thức tính phút tiếp theo
    public MyTime nextMinute() {
        this.minute++;
        if (this.minute > 59) {
            this.minute = 0;
            nextHour();
        }
        return this;
    }

    // Phương thức tính giờ tiếp theo
    public MyTime nextHour() {
        this.hour++;
        if (this.hour > 23) {
            this.hour = 0;
        }
        return this;
    }

    // Phương thức tính giây trước đó
    public MyTime previousSecond() {
        this.second--;
        if (this.second < 0) {
            this.second = 59;
            previousMinute();
        }
        return this;
    }

    // Phương thức tính phút trước đó
    public MyTime previousMinute() {
        this.minute--;
        if (this.minute < 0) {
            this.minute = 59;
            previousHour();
        }
        return this;
    }

    // Phương thức tính giờ trước đó
    public MyTime previousHour() {
        this.hour--;
        if (this.hour < 0) {
            this.hour = 23;
        }
        return this;
    }
}

