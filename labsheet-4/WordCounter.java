class WordCounter {
    static String language = "English";

    void countWords(String sentence) {
       
        String[] words = sentence.trim().split("\\s+");
        int count = words.length;

        System.out.println("Language: " + language);
        System.out.println("Sentence: " + sentence);
        System.out.println("Number of Words: " + count);
    }

    public static void main(String[] args) {
        WordCounter w = new WordCounter();
        w.countWords("Java is easy to learn");
    }
}