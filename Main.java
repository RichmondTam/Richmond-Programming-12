import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.Arrays;
import java.util.HashSet;


public class Main {
    public static void main(String[] args) throws IOException {


        String illiad= Files.readString(Path.of("C:\\Users\\2474710\\Downloads\\illiad.txt"));
        String[] words = illiad.toLowerCase().replaceAll("[^a-zA-Z1-9\\-' ]"," ").split(" ");
        HashSet<String> uniqueWords = new HashSet<>(Arrays.asList(words));


        System.out.println("The number of unique words: "+uniqueWords.size());






    }
}








