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
    public ArrayList<Object> 
}
