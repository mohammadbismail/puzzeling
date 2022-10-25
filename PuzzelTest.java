public class PuzzelTest {
    public static void main(String[] args) {
        PuzzleJava myPuzzel = new PuzzleJava();

        // Testing
        // System.out.println(myPuzzel.getTenRolls());
        // System.out.println(myPuzzel.getRandomLetter());
        System.out.println(myPuzzel.generatePassword());
        System.out.println(myPuzzel.getNewPasswordSet(8));
    }

}