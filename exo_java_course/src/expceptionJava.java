import java.io.FileReader;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.text.ParseException;

public class expceptionJava {
    public static void main(String[] args) {
//        try{
//            FileReader fileReader = new FileReader("file.txt");
//        } catch (FileNotFoundException e) {
//            //System.out.println("file not found");
//            System.out.println(e.getMessage());
//        }
//        System.out.println("file reader");

        FileReader fileReader = null;
        try {
            fileReader= new FileReader("src/filelecture/file.txt");
            fileReader.read();
            new SimpleDateFormat().parse("");
        }

        catch (IOException | ParseException e) {
            //throw new RuntimeException(e);
            e.printStackTrace();

        }
        finally {
            if(fileReader!=null) {
                try {
                    fileReader.close();
                } catch (IOException e) {
                    throw new RuntimeException(e);
                }
            }

        }

//        catch (FileNotFoundException e) {
//            //throw new RuntimeException(e);
//            e.printStackTrace();
//        }

//        catch (ParseException e){
//            System.out.println("invalid date format");
//        }
    }
}
