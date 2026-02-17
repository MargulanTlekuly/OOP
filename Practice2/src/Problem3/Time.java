package Problem3;

public class Time {
    private int hour;
    private int minute;
    private int second;

    public Time(int h, int m, int s) {
        setTime(h, m, s);
    }

    public void setTime(int h, int m, int s) {
        if (h >= 0 && h < 24 && m >= 0 && m < 60 && s >= 0 && s < 60) {
            this.hour = h;
            this.minute = m;
            this.second = s;
        } else {
            System.out.println("Invalid time values provided.");
        }
    }

    public String toUniversal() {
        return String.format("%02d:%02d:%02d", hour, minute, second);
    }

    public String toStandard() {
        int standardHour = (hour == 0 || hour == 12) ? 12 : hour % 12;
        String period = (hour < 12) ? "AM" : "PM";
        return String.format("%02d:%02d:%02d %s", standardHour, minute, second, period);
    }

    public void add(Time other) {
        this.second += other.second;
        this.minute += this.second / 60;
        this.second %= 60;

        this.minute += other.minute;
        this.hour += this.minute / 60;
        this.minute %= 60;

        this.hour = (this.hour + other.hour) % 24;
    }
    public static void main(String[] args) {
        Time t = new Time(23, 5, 6);
        System.out.println(t.toUniversal());
        System.out.println(t.toStandard());

        Time t2 = new Time(4, 24, 33);
        t.add(t2);
        System.out.println("New Time after addition: " + t.toUniversal());
    }
}
