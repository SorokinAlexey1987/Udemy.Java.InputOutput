import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        //Task_5
        File directory = new File("folder");
        directory.mkdir();
        File file = new File(directory, "names.txt");
        try {
            file.createNewFile();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
        try (InputStream inputStream = new FileInputStream(file)) {
            long before = System.currentTimeMillis();
            int a = inputStream.read();
            StringBuilder result = new StringBuilder();
            while (a != -1) {
                result.append ((char) a);
                a = inputStream.read();
            }
            System.out.println(result.toString());
            long after = System.currentTimeMillis();
            System.out.println(after - before);
        } catch (Exception e) {
            e.printStackTrace();
        }


        //Task_4
        /*
        File directory = new File("folder");
        directory.mkdir();
        File file = new File(directory, "names.txt");
        try {
            file.createNewFile();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
        try (InputStream inputStream = new FileInputStream(file)) {
            int a = inputStream.read();
            while (a != -1) {
                System.out.print((char) a);
                a = inputStream.read();
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        */


        //Task_3
        /*
        File file = new File("1.txt");
        try {
            file.createNewFile();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }

        try (InputStream inputStream = new FileInputStream(file)) {
            int a = inputStream.read();
            while (a != -1) {
                System.out.print((char) a);
                a = inputStream.read();
            }
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
        */


        //Task_2
        /*
        String path = "folder1/folder2/folder3";
        File directories = new File(path);
        List<File> files = new ArrayList<>();
        files.add(new File(path + "/A1.txt"));
        files.add(new File(path + "/A2.txt"));
        files.add(new File(path + "/A3.txt"));
        files.add(new File(path + "/B1.txt"));
        files.add(new File(path + "/B2.txt"));
        directories.mkdirs();
        for (File file : files) {
            try {
                file.createNewFile();
            } catch (IOException e) {
                throw new RuntimeException(e);
            }
        }
        File[] filtered = directories.listFiles((dir, name) -> name.startsWith("A"));
        for (File file : filtered) {
            System.out.println(file.getAbsolutePath());
        }
        */

        //Task_1
        /*
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
        File[] files = directory.listFiles((dir, name) -> name.contains("1"));
        for (File file : files) {
            System.out.println(file.getName());
        }
        System.out.println(file1.exists());
        System.out.println(directory.isDirectory());
        System.out.println(file1.isFile());
        */
    }
}
