package org.example.PatternStrategy;

public class Test {
    public static void main(String[] args) {
        String key = "key";
        String text = "text";
        Encryption encryption = new Encryption(new RSAAlgorythm());
        String cryptedText = encryption.crypt(text, key);
    }
}