public class App {
    public static void main(String[] args) throws Exception {
        System.out.println("Hello, World!");
        String[] vars = new String[] {"5", "7", "9"};
        System.out.println("The average is " + findMean(vars));
        System.out.println("Hi");
        System.out.println("Hello again!");
    }

    public static double findMean(String[] vars) {
        double avg = 0;
        for(String s: vars) {
            avg += Double.parseDouble(s);
        }
        return avg/vars.length;
    }
    public static int addNum(int one, int two) {
        return(one + two);
        /*Intersection of two Arrays */
        
    }
}