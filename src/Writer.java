import java.io.*;
import java.util.ArrayList;

/**
 * Created by Bruno on 19.01.2017.
 */
public class Writer {
    /*public ArrayList<String> readFile(String path) {
        return
    }*/

    public void createFile(String filename){
        try {
            PrintWriter writer = new PrintWriter("data/" + filename, "UTF-8");

        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (UnsupportedEncodingException e) {
            e.printStackTrace();
        }
    }
}
