import java.util.*;

public class Duplicate_word_01 {

    // Ya function madhe check karto ki ekach word repeat zalay ka
public static boolean checkDuplicateWords(String sentence) {

String[] words = sentence.split(" "); // words split kele
        HashSet<String> box = new HashSet<>(); // box jithe unique words thevnar

        for (String w : words) {
            if (box.contains(w)) {
                return true; // duplicate sapadla
            } else {
                box.add(w); // nava word box madhe add kela
            }
        }

        return false; // sagle unique hote
    }

public static void main(String[] args) {

        String line1 = "hello world hello";
        String line2 = "I love LeetCode platform";
        String line3 = "Java is fun and Java is powerful";

        System.out.println("Line 1 --> " + checkDuplicateWords(line1)); // true
        System.out.println("Line 2 --> " + checkDuplicateWords(line2)); // false
        System.out.println("Line 3 --> " + checkDuplicateWords(line3)); // true
    }
}
