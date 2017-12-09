import fileoperation.FileOperationImpl1;
import fileoperation.FileOperations;

import java.util.List;

public class DemoFIles {

    public static void main(String[] args) {

        FileOperations fo = new FileOperationImpl1();

        List<String> poezie;
        poezie = fo.readFromFileAsList("luc.txt");

      //  System.out.println(poezie.size());

        int counter=0;
        for (String vers: poezie
             ) {

            if(!(vers.isEmpty() || vers.startsWith("...") || vers.startsWith("http")))
                counter++;
        }

        System.out.println(counter);

    }
}
