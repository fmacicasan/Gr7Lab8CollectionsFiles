package fileoperation;

import java.util.List;

public interface FileOperations {

    public String readFromFile(String fileName);
    public List<String> readFromFileAsList(String fileName);
    public void writeFile(String fileName, String content);
    public void writeFile(String fileName, List<String> listOfStrings);
}
