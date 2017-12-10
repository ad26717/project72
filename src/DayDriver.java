public class DayDriver {
    // Create the main method
    public static void main (String [] args){

        // Create day object
        Day day = new Day();
        // Set the day
        day.setDay(6);// 6th day of the week is saturday
        // Results
        System.out.println(day);
        System.out.println(day.nextDay());
        System.out.println(day.previousDay());
        System.out.println(day.addDay(-20));// 20 days ago
    }
}
