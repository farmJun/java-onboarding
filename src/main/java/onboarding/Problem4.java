package onboarding;

public class Problem4 {
    public static String solution(String word) {
        String answer = "";
        return answer;
    }

    //문자를 뒤집어서 반환하는 함수
    public static Character reverse(char c) {
        if (!Character.isAlphabetic(c)) {
            return c;
        }
        if (Character.isLowerCase(c)) {
            return (char) ('a' + 'z' - c);
        }
        if (Character.isUpperCase(c)) {
            return (char) ('A' + 'Z' - c);
        }
    }
}