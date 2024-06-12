package Academy.1Week.java_essentials_two.src.objects;

public class stringExercise {

    public static void main(String[] args) {
        countWords("I love Java");
    }

    public static void countWords(String text)  {
        int count = 0;
        String[] words = text.split(" ");
        int numberOfWords = words.length;
        // Use String.format to format the string. Documentation: <https://docs.oracle.com/en/java/javase/17/docs/api/java.base/java/lang/String.html#format(java.lang.String,java.lang.Object...)>

        String message = String.format("words are %d", numberOfWords);
        System.out.println(message);


        for (int i = 0; i < text.length; i++) {
            if 

        }
    }

}
