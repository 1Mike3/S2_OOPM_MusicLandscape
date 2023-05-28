package MusicLandscape;

public class Date {
    private int day;
    private int month;
    private int year;

    public Date(int day, int month, int year){
        if(day > 0 && day < 32){
            this.day = day;
        }
        if(month > 0 && month < 13){
            this.month = month;
        }
        if(year > 0){
            this.year = year;
        }
    }

    public int getDay() {
        return day;
    }

    public void setDay(int day) {
        if(day > 0 && day < 32){
            this.day = day;
        }
    }

    public int getMonth() {
        return month;
    }

    public void setMonth(int month) {
        if(month > 0 && month < 13){
            this.month = month;
        }
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        if(year > 0){
            this.year = year;
        }
    }

    public String toString(){
        return String.format("%02d.%02d.%04d", day, month, year);
    }

    public boolean equals(Object other){
        if(other instanceof Date){
            Date otherDate = (Date) other;
            return day == otherDate.day && month == otherDate.month && year == otherDate.year;
        }
        return false;
    }
}
