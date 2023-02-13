import java.io.*;
import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        //Task_12
        File directory = new File("folder");
        File file = new File(directory, "names.txt");


        //Task_11
        /*
        File directory = new File("folder");
        File file = new File(directory, "names.txt");
        try (RandomAccessFile randomAccessFile = new RandomAccessFile(file, "r")) {
            Scanner scanner = new Scanner(System.in);
            System.out.println("Enter next page or \"stop\" to exit");
            byte[] pageText = new byte[3000];
            String input = scanner.nextLine();
            while (!input.equals("stop")) {
                int page = Integer.parseInt(input);
                randomAccessFile.seek((page - 1) * pageText.length);
                int count = randomAccessFile.read(pageText);
                System.out.println(new String(pageText, 0 , count));
                System.out.println("Enter next page or \"stop\" to exit");
                input = scanner.nextLine();
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        */


        //Task_10
        /*
        File directory = new File("folder");
        File file = new File(directory, "names.txt");
        try (RandomAccessFile randomAccessFile = new RandomAccessFile(file, "rw")) {
            randomAccessFile.seek(10);
            randomAccessFile.writeBytes("*******************************");
            randomAccessFile.seek(300);
            randomAccessFile.writeBytes("*******************************");
            randomAccessFile.seek(5000);
            byte[] array = new byte[1024];
            randomAccessFile.read(array);
            System.out.println(new String(array));
        } catch (Exception e) {
            e.printStackTrace();
        }
        */

        //Task_9
        /*
        File directory = new File("folder");
        File file = new File(directory, "names.txt");
        try (OutputStream outputStream = new BufferedOutputStream(new FileOutputStream(file, true))) {
            Scanner scanner = new Scanner(System.in);
            System.out.println("Enter name or \"stop\" to exit");
            String next = scanner.nextLine();
            while (!next.equals("stop")) {
                outputStream.write(next.getBytes());
                outputStream.write("\r\n".getBytes());
                next = scanner.nextLine();
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        try (InputStream inputStream = new BufferedInputStream(new FileInputStream(file))) {
            byte[] array = new byte[128];
            int count = inputStream.read(array);
            StringBuilder result = new StringBuilder();
            while(count > 0) {
                result.append(new String(array, 0, count));
                count = inputStream.read(array);
            }
            System.out.println(result.toString());
        } catch (Exception e) {
            e.printStackTrace();
        }
        */


        //Task_8
        /*
        File directory = new File("folder");
        File file = new File(directory, "names.txt");
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a: ");
        int a = scanner.nextInt();
        System.out.println("Enter b: ");
        int b = scanner.nextInt();
        System.out.println("Sum = " + (a + b));
        */


        //Task_7
        /*
        File directory = new File("folder");
        File file = new File(directory, "names.txt");
        try (InputStream inputStream = new BufferedInputStream(new FileInputStream(file))) {
            long before = System.currentTimeMillis();
            int a = inputStream.read();
            StringBuilder result = new StringBuilder();
            while (a != -1) {
                result.append((char) a);
                a = inputStream.read();
            }
            long after = System.currentTimeMillis();
            System.out.println(after - before);
        } catch (Exception e) {
            e.printStackTrace();
        }
        */


        //Task_6
        /*
        File directory = new File("folder");
        File file = new File(directory, "names.txt");
        try (Reader reader = new InputStreamReader(new FileInputStream(file))) {
            char[] array = new char[128];
            int count = reader.read(array);
            StringBuilder result = new StringBuilder();
            while (count > 0) {
                result.append (new String(array, 0, count));
                count = reader.read(array);
            }
            String[] names = result.toString().split(" ");
            Arrays.stream(names)
                    .filter(name -> name.startsWith("A"))
                    .forEach(System.out::println);
        } catch (Exception e) {
            e.printStackTrace();
        }
        */


        //Task_5
        /*
        File directory = new File("folder");
        directory.mkdir();
        File file = new File(directory, "names.txt");
        try {
            file.createNewFile();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
        try (Reader reader = new InputStreamReader(new FileInputStream(file))) {
            int a = reader.read();
            StringBuilder result = new StringBuilder();
            while (a > 0) {
                result.append ((char) a);
                a = reader.read();
            }
            System.out.println(result.toString());
        } catch (Exception e) {
            e.printStackTrace();
        }
        */


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
