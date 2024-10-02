public class Date {
    private int day;   // From 1 to 31
    private int month; // From 1 to 12
    private int year;  // From 1990 to 9999

    // Here is the default for the date setup
    public Date(int day, int month, int year) {
        this.day = day;
        this.month = month;
        this.year = year;
    }

    // Get the day
    public int getDay() {
        return day;
    }

    // Return the month
    public int getMonth() {
        return month;
    }

    // Bring back the year
    public int getYear() {
        return year;
    }

    // Set the day
    public void setDay(int day) {
        this.day = day;
    }

    // Now set the month
    public void setMonth(int month) {
        this.month = month;
    }

    // Finally, set the year
    public void setYear(int year) {
        this.year = year;
    }

    // Method to set date
    public void setDate(int day, int month, int year) {
        this.day = day;
        this.month = month;
        this.year = year;
    }

    // toString method for "dd/mm/yyyy" format with leading zeros
    @Override
    public String toString() {
        return String.format("%02d/%02d/%d", day, month, year);
    }
}


