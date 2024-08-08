import java.io.File;  // Import the File class
import java.io.FileNotFoundException;  // Import this class to handle errors
import java.util.Scanner; // Import the Scanner class to read text files
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        System.out.println("test");

        ArrayList<String> lang = new ArrayList<String>();
        String word = "";

        try {
            File file = new File("lang.txt");
            Scanner scanLang = new Scanner(file);
            while (scanLang.hasNextLine()) {
                lang.add(scanLang.nextLine());
            }
            scanLang.close();
          } catch (FileNotFoundException e) {
            System.out.println("An error occurred.");
            e.printStackTrace();
        }

        Scanner scanWord = new Scanner(System.in);
        System.out.println("input your word:");
        word = scanWord.nextLine();
        scanWord.close();


        for (String s: lang) {
            System.out.println(s);
        }

        System.out.println(word);
    }
}