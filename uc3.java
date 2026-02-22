public class uc3 {
    public static void main(String[] args) {

        String[] O = {
            " ***** ",
            "*     *",
            "*     *",
            "*     *",
            "*     *",
            "*     *",
            " ***** "
        };

        String[] P = {
            " ***** ",
            "*     *",
            "*     *",
            " ***** ",
            "*      ",
            "*      ",
            "*      "
        };

        String[] S = {
            " ***** ",
            "*      ",
            "*      ",
            " ***** ",
            "      *",
            "      *",
            " ***** "
        };

        for (int i = 0; i < 7; i++) {
            String line = String.join("   ", O[i], O[i], P[i], S[i]);
            System.out.println(line);
        }
    }
}