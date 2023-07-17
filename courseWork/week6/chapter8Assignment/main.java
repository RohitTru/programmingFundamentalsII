package courseWork.week6.chapter8Assignment;

public class main {
    int monthNumber; // Stores the month number

    public main(int m) {
        if (m < 1 || m > 12) {
            // If the month number is invalid, set it to 1
            monthNumber = 1;
        } else {
            // Set the month number to the valid input
            monthNumber = m;
        }
    }

    public void setMonthNumber(int m) {
        if (m < 1 || m > 12) {
            // If the month number is invalid, set it to 1
            monthNumber = 1;
        } else {
            // Set the month number to the valid input
            monthNumber = m;
        }
    }

    public int getMonthNumber() {
        return monthNumber;
    }

    public String getMonthName() {
        String monthName = "";
        switch (monthNumber) {
            case 1:
                monthName = "January";
                break;
            case 2:
                monthName = "February";
                break;
            case 3:
                monthName = "March";
                break;
            case 4:
                monthName = "April";
                break;
            case 5:
                monthName = "May";
                break;
            case 6:
                monthName = "June";
                break;
            case 7:
                monthName = "July";
                break;
            case 8:
                monthName = "August";
                break;
            case 9:
                monthName = "September";
                break;
            case 10:
                monthName = "October";
                break;
            case 11:
                monthName = "November";
                break;
            case 12:
                monthName = "December";
                break;
        }
        return monthName;
    }

    public String getSeason() {
        if (monthNumber == 12 || (monthNumber >= 1 && monthNumber <= 2)) {
            return "Winter";
        } else if (monthNumber >= 3 && monthNumber <= 5) {
            return "Spring";
        } else if (monthNumber >= 6 && monthNumber <= 8) {
            return "Summer";
        } else {
            return "Fall";
        }
    }

    public String toString() {
        return "Month: " + monthNumber + "\nName: " + getMonthName() + "\nSeason: " + getSeason();
    }

    public boolean equals(main otherMonth) {
        if (monthNumber == otherMonth.getMonthNumber()) {
            return true;
        } else {
            return false;
        }
    }
}
