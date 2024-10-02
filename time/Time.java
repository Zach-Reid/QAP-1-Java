public class Time {
    private int hour;   // 0 to 23
    private int minute; // 0 to 59
    private int second; // Also 0 to 59

    // The default time to set it all up
    public Time(int hour, int minute, int second) {
        this.hour = hour;
        this.minute = minute;
        this.second = second;
    }

    // This is the int where we get the hour
    public int getHour() {
        return hour;
    }

    // This is the int where we get the minutes
    public int getMinute() {
        return minute;
    }

    // Get the seconds, in int form
    public int getSecond() {
        return second;
    }

    // Set the hour
    public void setHour(int hour) {
        this.hour = hour;
    }

    // Okay, now set the minute
    public void setMinute(int minute) {
        this.minute = minute;
    }

    // I know you just set the hour and the minute but you should totally set the second as well
    public void setSecond(int second) {
        this.second = second;
    }

    // And here's how it all comes together as the time
    public void setTime(int hour, int minute, int second) {
        this.hour = hour;
        this.minute = minute;
        this.second = second;
    }

    // "hh:mm:ss", leading zeros included
    @Override
    public String toString() {
        return String.format("%02d:%02d:%02d", hour, minute, second);
    }

    // Advance the time by one second
    public Time nextSecond() {
        second++;
        if (second >= 60) {
            second = 0;
            minute++;
            if (minute >= 60) {
                minute = 0;
                hour++;
                if (hour >= 24) {
                    hour = 0; // Reset to 0 after 23:59:59
                }
            }
        }
        return this;
    }

    // Do the exact opposite and move time back a second
    public Time previousSecond() {
        second--;
        if (second < 0) {
            second = 59;
            minute--;
            if (minute < 0) {
                minute = 59;
                hour--;
                if (hour < 0) {
                    hour = 23; // Reset to 23:59:59
                }
            }
        }
        return this;
    }
}


