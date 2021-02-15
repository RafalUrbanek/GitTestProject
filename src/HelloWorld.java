public class HelloWorld {
    public static void main (String[] args){
        System.out.println(messageOfTheDay());
    }

    private static String messageOfTheDay() {
        String first = "Hello";
        String second = " world";

        return first + second;
    }

    // Comment to tag the 2-nd branch
}
