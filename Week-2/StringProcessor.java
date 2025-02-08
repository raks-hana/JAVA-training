package Techmm;

public class StringProcessor {

    public String reverseString(String str) {
        return new StringBuilder(str).reverse().toString();
    }

    public int countOccurrences(String text, String sub) {
        if (sub.isEmpty()) return 0;
        int count = 0, index = 0;
        while ((index = text.indexOf(sub, index)) != -1) {
            count++;
            index += sub.length();
        }
        return count;
    }


    public String splitAndCapitalize(String str) {
        String[] words = str.split("\\s+");
        StringBuilder result = new StringBuilder();
        for (String word : words) {
            if (!word.isEmpty()) {
                result.append(Character.toUpperCase(word.charAt(0)))
                        .append(word.substring(1))
                        .append(" ");
            }
        }
        return result.toString().trim();
    }

    public static void main(String[] args) {
        StringProcessor sp = new StringProcessor();

        System.out.println(sp.reverseString("hello"));

        System.out.println(sp.countOccurrences("hello hello world", "hello"));

        System.out.println(sp.splitAndCapitalize("hello world this is java"));
    }
}
