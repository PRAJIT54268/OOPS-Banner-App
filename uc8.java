import java.util.HashMap;
import java.util.Map;

public class uc8 {

    private static final Map<Character, String[]> patternMap = new HashMap<>();

    public static void main(String[] args) {

        initializePatterns();

        String word = "OOPS";
        renderBanner(word);
    }

    private static void initializePatterns() {

        patternMap.put('O', new String[]{
                " ***** ",
                "*     *",
                "*     *",
                "*     *",
                "*     *",
                "*     *",
                " ***** "
        });

        patternMap.put('P', new String[]{
                " ***** ",
                "*     *",
                "*     *",
                " ***** ",
                "*      ",
                "*      ",
                "*      "
        });

        patternMap.put('S', new String[]{
                " ***** ",
                "*      ",
                "*      ",
                " ***** ",
                "      *",
                "      *",
                " ***** "
        });
    }

    private static void renderBanner(String word) {

        if (word == null || word.isEmpty()) {
            System.out.println("Invalid input");
            return;
        }

        int height = 7;

        for (int row = 0; row < height; row++) {

            for (char ch : word.toCharArray()) {

                String[] pattern = patternMap.get(Character.toUpperCase(ch));

                if (pattern != null) {
                    System.out.print(pattern[row] + "   ");
                } else {
                    System.out.print("        ");
                }
            }
            System.out.println();
        }
    }
}