package Exercise4;

public class MessageEncoder {
    public String encode(String message) {
        String[] words = message.split(" ");
        StringBuilder result = new StringBuilder();
        for (String word : words) {
            if (word.length() >= 2) {
                result.append((int) word.charAt(0));
                char first = word.charAt(1);
                char last = word.charAt(word.length() - 1);
                result.append(last).append(word.substring(2, word.length() - 1)).append(first).append(" ");
            } else {
                result.append(word).append(" ");
            }
        }
        return result.toString().trim();
    }
}