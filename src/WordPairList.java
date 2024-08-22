import java.util.ArrayList;

public class WordPairList {

    private final ArrayList<WordPair> allPairs;


    public WordPairList(String[] words) {
        allPairs = new ArrayList<>();
        for (int i = 0; i < words.length; i++) {
            for (int j = i + 1; j < words.length; j++) {
                allPairs.add(new WordPair(words[i], words[j]));
                //System.out.println("New Pair: " + words[i] + " and " + words[j]);
            }
        }
    }
    public ArrayList<WordPair> getAllPairs()
    {
        return allPairs;
    }
   public int numMatches() {
    //System.out.println("Start num matching");
    int count = 0;
    for (WordPair pair : allPairs) {
        //System.out.println("Word 1: " + pair.getFirst() + " | " + pair.getSecond());
        if (pair.getFirst().equals(pair.getSecond())) {
            //System.out.println("Add!");
            count++;
        }
        //System.out.println("Count: " + count);
    }
    return count;
}
}