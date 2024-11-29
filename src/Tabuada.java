import java.util.ArrayList;

public class Tabuada {

    public  static ArrayList<Integer> execute(int number) {
        ArrayList<Integer> result = new ArrayList<>();

        for(int i = 1; i <= 10; i++) {
            int res = number * i;
            result.add(res);
        }

        return result;
    }
}
