package issues.i027.ProcessingFiles;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class ProcessingFile {

    public static void main(String[] args) throws FileNotFoundException {

        File file = new File("D:\\JavaTest\\Exercises\\src\\issues\\i027\\ProcessingFiles\\myfile.txt");
        Scanner input = new Scanner(file);
        while (input.hasNextLine()) {
            String line = input.nextLine();
            System.out.println(line);
        }
        input.close();

    }

}
