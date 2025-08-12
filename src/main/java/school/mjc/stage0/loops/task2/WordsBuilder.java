package school.mjc.stage0.loops.task2;

public class WordsBuilder {
    public void buildPhrase(char... chars) {
        if (chars == null || chars.length == 0) {
            System.out.println("No characters provided");
            return;
        }

        int i = 0;
        while (i < chars.length) {
            System.out.print(chars[i]);
            i++;
        }
        System.out.println(); // Add a newline at the end
    }
}
