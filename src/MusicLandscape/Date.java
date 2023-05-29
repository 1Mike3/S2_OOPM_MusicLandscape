package MusicLandscape;

public class Date {
    //Attributes
    private int d;
    private int m;
    private int y;

            //constructors
            //standard constructor
            public Date(int day, int month, int year){
                if(day > 0 && day < 32){
                    this.d = day;
                }
                if(month > 0 && month < 13){
                    this.m = month;
                }
                if(year > 0){
                    this.y = year;
                }
            }

            //copy constructor
            public Date(Date date){
                this(date.d, date.m, date.y);
            }


    ///getters
    public int getDay() {
        return d;
    }

    public int getMonth() {
        return m;
    }

    public int getYear() {
        return y;
    }

            // determine leap year fucntion
            public boolean isLeap(){
                return y % 4 == 0 && (y % 100 != 0 || y % 400 == 0);
            }

        /// return the weekday of the date, 0= Sunday, 1 = Monday ...
public int weekday(){
    int y0 = y - (14 - m) / 12;
    int x = y0 + y0 / 4 - y0 / 100 + y0 / 400;
    int m0 = m + 12 * ((14 - m) / 12) - 2;
    int d0 = (d + x + (31 * m0) / 12) % 7;
    return d0;
}

            ///returns a formatted string of the date
                public String dateString(){
                    return String.format("%02d.%02d.%04d", d, m, y);
                }

    //im not sure what is required here, i'll just return the suffix
    private String numberEnding(){
            String ending = "";
        switch (d){
            case 1:
            case 21:
            case 31:
                ending = "st";
                break;
            case 2:
            case 22:
                ending = "nd";
                break;
            case 3:
            case 23:
                ending = "rd";
                break;
            default:
                ending = "th";
        }
        return ending;
    }

                //returns the english name of the month
                private String monthName(int month){
                            switch (month){
                                case 1:
                                    return "January";
                                case 2:
                                    return "February";
                                case 3:
                                    return "March";
                                case 4:
                                    return "April";
                                case 5:
                                    return "May";
                                case 6:
                                    return "June";
                                case 7:
                                    return "July";
                                case 8:
                                    return "August";
                                case 9:
                                    return "September";
                                case 10:
                                    return "October";
                                case 11:
                                    return "November";
                                case 12:
                                    return "December";
                                default:
                                    return "Invalid month";
                            }
                }


//returns the string representing the weekday
    private String dayName(int w){
                switch (w){
            case 0:
                return "Sunday";
            case 1:
                return "Monday";
            case 2:
                return "Tuesday";
            case 3:
                return "Wendsday";
            case 4:
                return "Thursday";
            case 5:
                return "Friday";
            case 6:
                return "Saturday";
            default:
                return "Invalid weekday";
        }
    }


    //add x functions

                ///n ... the number of days to add to the date
    public void addDay(int n){
                if(n + this.d <= 31){
                    this.d += n;
                }
                else{  //add to month if number of days is greater than 31
                    this.d = (n + this.d) % 31;
                    this.m++;
                }
    }
    ///i ... the number of months to add to the date
    public void addMonth(int i){
                if(i + this.m <= 12){
                    this.m += i;
                }
                else{  //add to year if number of months is greater than 12
                    this.m = (i + this.m) % 12;
                    this.y++;
                }
    }

    ///y ... the number of years to add to the date
    public void addYear(int y){
                this.y += y;
    }


    //TODO finish this bullshit





}



