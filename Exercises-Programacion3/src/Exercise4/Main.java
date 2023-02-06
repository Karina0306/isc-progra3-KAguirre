package Exercise4;

public class Main {
    public static void main(String[] args) {
        String message = "hello world";
        MessageEncoder messageEncoder = new MessageEncoder();
        String encodedMessage = messageEncoder.encode(message);
        System.out.println("Original message: " + message);
        System.out.println("Encrypted message: " + encodedMessage);
    }
}
