package practiceWeek5;

public class JoinString {

    public static String join(String... words) {
        StringBuilder result = new StringBuilder();
        for (String s : words) {
            result.append(s);
        }
        return result.toString();
    }

    static void main(String[] args) {
        System.out.println(join("Hello", " ", "World"));
    }
}