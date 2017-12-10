public class Day {


    //Creating days of week array
    private String[] days = {"Monday", "Tuesday", "Wednesday", "Thursday", "Friday", "Saturday", "Sunday"};
    // Creating day String
    private String day;
    // Create and initialize the index of day
    private int idxOfDay = 0;

    // Create a method that sets the day by the given integer input from the user
    public void setDay(int number) {
        this.day = days[number-1];
        this.idxOfDay = number-1;
    }

    // Create a method that allows user to add or subtract values
    public String addDay(int addDay){
        while (addDay < 0){
            addDay = addDay + 7 ;
        }

        return days[(idxOfDay + addDay)%7];
    }

    // Create a method that returns the day
    public String getDay() {
        return days[idxOfDay-1];
    }

    // Create a method that returns the next day
    public String nextDay(){
        return days[(this.idxOfDay + 1)%7];
    }

    // Create a method that returns the previous day
    public String previousDay(){
        return days[(this.idxOfDay-1)];
    }

    // Create a method that turns variables into string
    @Override
    public String toString() {
        return day;
    }
}
