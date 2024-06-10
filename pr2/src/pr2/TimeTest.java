package pr2;

class Time {
    private int hour;
    private int minute;
    private int second;

    {
        hour = 0;
        minute = 0;
        second = 0;
    }

    public Time(int hour, int minute, int second) {
        if (isValidHour(hour) && isValidMinute(minute) && isValidSecond(second)) {
            this.hour = hour;
            this.minute = minute;
            this.second = second;
        }
    }

    public int getHour() {
        return hour;
    }

    public void setHour(int hour) {
        this.hour = hour;
    }

    public int getMinute() {
        return minute;
    }

    public void setMinute(int minute) {
        this.minute = minute;
    }

    public int getSecond() {
        return second;
    }

    public void setSecond(int second) {
        this.second = second;
    }

    private boolean isValidHour(int hour) {
        return hour >= 0 && hour <= 23;
    }

    private boolean isValidMinute(int minute) {
        return minute >= 0 && minute <= 59;
    }

    private boolean isValidSecond(int second) {
        return second >= 0 && second <= 59;
    }

    private String addZero(int value) {
        if (value >= 0 && value <= 9) {
            return "0" + value;
        }
        return String.valueOf(value);
    }

    public String toUniversal() {
        return this.toString();
    }

    public String toStandard() {
        if (this.hour >= 12) {
            return addZero(this.hour - 12) + ":" + addZero(this.minute) + ":" + addZero(this.second) + " PM";
        } else {
            return addZero(this.hour) + ":" + addZero(this.minute) + ":" + addZero(this.second) + " AM";
        }
    }

    public String toStandard2() {
        String time = addZero(this.hour % 12) + ":" + addZero(this.minute) + ":" + addZero(this.second);

        if (this.hour / 12 == 1) {
            time += " PM";
        } else {
            time += " AM";
        }
        return time;
    }

    public void add(Time other) {
        int newSecond = (this.second + other.getSecond());
        this.second = newSecond % 60;
        int newMinute = (this.minute + other.getMinute() + newSecond / 60);
        this.minute = newMinute % 60;
        int newHour = (this.hour + other.getHour() + newMinute / 60) % 24;
        this.hour = newHour;
    }

    public String toString() {
        return addZero(this.hour) + ":" + addZero(this.minute) + ":" + addZero(this.second);
    }
}

public class TimeTest {
    public static void main(String[] args) {
        Time t = new Time(23, 5, 6);
        System.out.println("Universal Time: " + t.toUniversal());
        System.out.println("Standard Time: " + t.toStandard());

        Time t2 = new Time(4, 24, 33);
        t.add(t2);
        System.out.println("Updated Time " + t.toUniversal());
    }
}
