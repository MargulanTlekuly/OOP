package Problem5;

public class Time implements Comparable<Time>{
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
    @Override
    public int compareTo(Time other){
        int hourComparison = Integer.compare(this.hour, other.hour);
        int minuteComparison = Integer.compare(this.minute, other.minute);
        if(hourComparison != 0){
            return hourComparison;
        }
        if(minuteComparison != 0){
            return minuteComparison;
        }
        return Integer.compare(this.second, other.second);
    }
}
