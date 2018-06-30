import fileoperation.FileOperationImpl1;
import fileoperation.FileOperations;

import java.util.*;

public class DemoPdfRead {

    public static void main(String[] args) {

        FileOperations fo = new FileOperationImpl1();

        List<String> poezie;
        poezie = fo.readFromFileAsList("testjavarecap1.pdf");

      //  System.out.println(poezie.size());

        int counter=0;
        int versuriCuS = 0;
        Map<Character, Integer> frequencies =new HashMap<>();
        for (String vers: poezie) {

            System.out.println(vers);

        }


    }
}
