import java.util.HashMap;
import java.util.Map;

class CharacterPattern {

    private char character;
    private String[] pattern;

    public CharacterPattern(char character, String[] pattern) {
        this.character = character;
        this.pattern = pattern;
    }

    public char getCharacter() {
        return character;
    }

    public String[] getPattern() {
        return pattern;
    }
}

public class uc7 {

    
    private static final Map<Character, CharacterPattern> patternMap = new HashMap<>();

    public static void main(String[] args) {

        
        initializePatterns();

        String word = "OOPS";
        displayBanner(word);
    }

    private static void initializePatterns() {

        patternMap.put('O', new CharacterPattern('O', new String[]{
                " ***** ",
                "*     *",
                "*     *",
                "*     *",
                "*     *",
                "*     *",
                " ***** "
        }));

        patternMap.put('P', new CharacterPattern('P', new String[]{
                " ***** ",
                "*     *",
                "*     *",
                " ***** ",
                "*      ",
                "*      ",
                "*      "
        }));

        patternMap.put('S', new CharacterPattern('S', new String[]{
                " ***** ",
                "*      ",
                "*      ",
                " ***** ",
                "      *",
                "      *",
                " ***** "
        }));
    }

    private static void displayBanner(String word) {

        int height = 7; 

        for (int i = 0; i < height; i++) {
            for (char ch : word.toCharArray()) {

                CharacterPattern cp = patternMap.get(ch);

                if (cp != null) {
                    System.out.print(cp.getPattern()[i] + "   ");
                }
            }
            System.out.println();
        }
    }
}