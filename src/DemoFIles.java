import fileoperation.FileOperationImpl1;
import fileoperation.FileOperations;

import java.util.*;

public class DemoFIles {

    public static void main(String[] args) {

        FileOperations fo = new FileOperationImpl1();

        List<String> poezie;
        poezie = fo.readFromFileAsList("luc.txt");

      //  System.out.println(poezie.size());

        int counter=0;
        int versuriCuS = 0;
        Map<Character, Integer> frequencies =new HashMap<>();
        for (String vers: poezie) {

            if(!(vers.isEmpty() || vers.startsWith("...") || vers.startsWith("http")))
                counter++;
            if(vers.startsWith("S"))
                versuriCuS++;


//            frequencies = new HashMap<>();
            for(int i = 0; i < vers.length(); i++) {
                Character c = vers.charAt(i);
                if(frequencies.containsKey(c)) {
                    Integer frecventaCaracter = frequencies.get(c);
                    frecventaCaracter++;
                    frequencies.put(c, frecventaCaracter);
                } else {
                    frequencies.put(c, 1);
                }
            }

        }
        // original frequencies
        System.out.println(frequencies);

        //sorting based on values
        ArrayList<Map.Entry<Character, Integer>> listOfFrequencies = new ArrayList<>(frequencies.entrySet());
        Collections.sort(listOfFrequencies, new Comparator<Map.Entry<Character, Integer>>() {
            @Override
            public int compare(Map.Entry<Character, Integer> o1, Map.Entry<Character, Integer> o2) {
                return Integer.compare(o2.getValue(), o1.getValue());
            }
        });
        System.out.println(listOfFrequencies);


        // sorting based on keys
        TreeMap<Character, Integer> sorted = new TreeMap<>(new Comparator<Character>() {
            @Override
            public int compare(Character o1, Character o2) {
                return Character.compare(o1, o2);
            }
        });
        sorted.putAll(frequencies);
        System.out.println(sorted);

        System.out.println(counter);
        System.out.println("Versuri ce incep cu S:" + versuriCuS);

    }
}
