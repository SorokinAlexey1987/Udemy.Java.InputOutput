import java.io.File;
import java.io.IOException;

public class Main {
    public static void main(String[] args) {
        File directory = new File("folder/folder2/folder1");
        File file1 = new File("folder/folder2/folder1/file1.txt");
        File file2 = new File("folder/folder2/folder1/file2.txt");
        File file3 = new File("folder/folder2/folder1/file3.txt");
        try {
            directory.mkdirs();
            file1.createNewFile();
            file2.createNewFile();
            file3.createNewFile();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
        File[] files = directory.listFiles();
        for (File file : files) {
            System.out.println(file.getName());
        }
        //System.out.println(file1.exists());
        //System.out.println(directory.isDirectory());
        //System.out.println(file1.isFile());
    }
}
