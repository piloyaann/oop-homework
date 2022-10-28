package ex_3;

public class Time {
    private int hour;
    private int minute;
    private int seconds;

    public Time(){}
    public Time(int hour, int minute, int seconds) {
        this.hour = hour;
        this.minute = minute;
        this.seconds = seconds;
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

    public int getSeconds() {
        return seconds;
    }

    public void setSeconds(int seconds) {
        this.seconds = seconds;
    }

    public boolean isValid(){
        if ((this.seconds < 0 || this.seconds > 60) || (this.minute < 1 || this.minute > 60) || (this.hour < 1 || this.hour > 24)){
            return false;
        }
        return true;
    }
    public void print(){
        if (!isValid()) System.out.println("is not valid time");
        else System.out.println(this.hour + ":" + this.minute + ":" + this.seconds);
    }
}