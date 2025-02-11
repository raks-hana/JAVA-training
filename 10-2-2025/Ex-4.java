package Techmm;

import java.io.File;
import java.io.IOException;
import java.util.Scanner;

public class Ex4IO {
    public static void main(String args[]) throws IOException {
        Scanner sc = new Scanner(System.in);
        Ex4IO ex = new Ex4IO();
        System.out.println("Choose an option:");
        System.out.println("1 - Create 3 files");
        System.out.println("2 - Create folders");
        System.out.println("3 - Create folders with files");
        int n = sc.nextInt();

        switch (n) {
            case 1:
                for (int i = 1; i <= 3; i++) {
                    ex.createFile("File" + i + ".txt");
                }
                break;

            case 2:
                ex.createFolder();
                break;

            case 3:
                ex.folderWithFiles();
                break;

            default:
                System.out.println("Invalid choice");
        }

        sc.close();
    }
    public void createFile(String s) throws IOException {
        File file = new File("C:\\Users\\raksh\\OneDrive\\Documents\\Tech Mahindra Training\\Core JAVA");
        if (file.createNewFile()) {
            System.out.println("File created");
        } else {
            System.out.println("File already exists");
        }
    }
    public void createFolder() throws IOException {
       // Ex4IO ex = new Ex4IO();
        File folder1 = new File("C:\\Users\\raksh\\OneDrive\\Documents\\Tech Mahindra Training\\Core JAVA");
        File folder2 = new File("C:\\Users\\raksh\\OneDrive\\Documents\\Tech Mahindra Training\\Core JAVA");
        if (folder1.mkdir()) {
            System.out.println("Folder1 created");
        } else {
            System.out.println("Folder1 already exists");
        }

        if (folder2.mkdir()) {
            System.out.println("Folder2 created");
        } else {
            System.out.println("Folder2 already exists");
        }
    }
    public void folderWithFiles() throws IOException {
        createFolder();

        createFilesInFolder("C:\\Users\\raksh\\OneDrive\\Documents\\Tech Mahindra Training\\Core JAVA\\IO-folder", 3);
        createFilesInFolder("C:\\Users\\raksh\\OneDrive\\Documents\\Tech Mahindra Training\\Core JAVA\\IO-folder2", 4);
    }
    public void createFilesInFolder(String Path, int num) throws IOException {
        for (int i = 1; i <= num; i++) {
            File file = new File(Path + "\\File" + i + ".txt");
            if (file.createNewFile()) {
                System.out.println("Files Created inside folders");
            } else {
                System.out.println("File already exists");
            }
        }
    }
}
