package practiceWeek5;

public class JoinString {

    public static String join(String... words) {
        String result = "";
        for (String s : words) {
            result += s;
        }
        return result;
    }
}