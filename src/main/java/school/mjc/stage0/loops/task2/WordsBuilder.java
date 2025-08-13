package school.mjc.stage0.loops.task2;

public class WordsBuilder {
    public void buildPhrase(char... chars) {
        if (chars.length == 0) {
            System.out.println("");
            return;
        }
        StringBuilder phrase = new StringBuilder();
        int index = 0;
        while (index < chars.length) {
            phrase.append(chars[index]);
            index++;
        }
        System.out.println(phrase.toString());
    }
}
