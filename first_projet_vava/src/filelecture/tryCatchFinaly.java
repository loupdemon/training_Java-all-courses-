package filelecture;

import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.text.ParseException;
//import java.text.SimpleDateFormat;

public class tryCatchFinaly {
    public static void main(String[] args) {

        try(
                FileReader fileReader = new FileReader("src/filelecture/file.txt");
                FileWriter fileWriter = new FileWriter("src/filelecture/fileecrire.txt")
        ) {
            fileReader.read();
        } catch (IOException e) {
            e.printStackTrace();

        }

    }
}

