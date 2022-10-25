import java.util.ArrayList;
import java.util.Random;

public class PuzzleJava {

    Random randMachine = new Random();

    public ArrayList<Object> getTenRolls() {
        ArrayList<Object> randArray = new ArrayList<Object>();
        for (int i = 0; i < 10; i++) {
            int randNumber = randMachine.nextInt(20);
            randArray.add(randNumber);
        }
        return randArray;
    }

    public Character getRandomLetter() {
        ArrayList<Object> alphas = new ArrayList<Object>();
        int randNumber = randMachine.nextInt(25);
        char c;
        for (c = 'A'; c < 'Z'; c++) {
            alphas.add(c);
        }
        Character randomLetter = (Character) alphas.get(randNumber);
        return randomLetter;
    }

    public String generatePassword() {
        String password = "";
        for (int i = 0; i < 8; i++) {
            password += getRandomLetter();
        }
        return password;
    }

    public ArrayList<String> getNewPasswordSet(int arrLength) {
        ArrayList<String> mySet = new ArrayList<String>();
        for (int i = 0; i < arrLength; i++) {
            mySet.add(generatePassword());
        }
        return mySet;
    }

}
