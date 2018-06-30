import fileoperation.FileOperationImpl1;
import fileoperation.FileOperations;

import java.util.Collections;

/**
 * @author flo
 * @since 30/06/2018.
 */
public class WriteExample {

    public static void main(String[] args) {
        FileOperations fileOperations = new FileOperationImpl1();

        fileOperations.writeFile("cucu.out","ana are mere");
        fileOperations.writeFile("cucul.out", Collections.singletonList("ana are mere"));
    }
}
