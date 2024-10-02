public class TestTime {
    public static void main(String[] args) {
        // Times are just a placeholder for now since we'll be setting with the set method.
        Time t1 = new Time(0, 0, 0);
        Time t2 = new Time(0, 0, 0); 

        // Set using the set methods. First, t1!
        t1.setHour(21);
        t1.setMinute(10);
        t1.setSecond(15);

        // Next, t2!
        t2.setHour(10);
        t2.setMinute(20);
        t2.setSecond(25);

        //Print those before we change them:
        System.out.println("");
        System.out.println("Starting time for t1: " + t1.toString());
        System.out.println("Starting time for t2: " + t2.toString());
        System.out.println("");


        // Call nextSecond and previousSecond.

        //t1 gets the nextSecond, which should be one second later.
        t1.nextSecond();

        //t2 gets the nextSecond, which should be one second earlier.
        t2.previousSecond();

        // Show the final times with the toString method, and then it should be time to run it.
        System.out.println("Updating times...");
        System.out.println("");
        System.out.println("Updated time for t1: " + t1.toString());
        System.out.println("Updated time for t2: " + t2.toString());
    }
}


