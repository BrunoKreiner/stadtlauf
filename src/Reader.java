import java.io.BufferedReader;
import java.io.FileReader;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by Bruno on 19.01.2017.
 */
public class Reader {

    public ArrayList<String> readFile(String path){
        String thisLine = "";
        ArrayList<String> eachLine = new ArrayList<String>();
        try{
            // open input stream test.txt for reading purpose.
            BufferedReader br = new BufferedReader(new FileReader(path));
            while ((thisLine = br.readLine()) != null) {
                eachLine.add(thisLine);
            }

            return eachLine;
        }catch(Exception e){
            e.printStackTrace();
        }
        return eachLine;
    }

    public String searchID(int personID, String path) {
        String thisLine = "";
        String eachLine = "";
        try{
            // open input stream test.txt for reading purpose.
            BufferedReader br = new BufferedReader(new FileReader(path));
            while ((thisLine = br.readLine()) != null) {
                String[] tokens = thisLine.split(" ");
                tokens[1] = tokens[1].replaceAll("\\s+","");
                if(tokens.length == 4){
                    if(tokens[2].equals(personID+"")){
                        eachLine += tokens[3];
                    }
                }else if(tokens.length == 3){
                    if(tokens[1].equals(personID+"")) {
                        eachLine += tokens[2];
                    }
                }else if(tokens.length == 2){
                    if(tokens[0].equals(personID+"")) {
                        eachLine += tokens[1];
                    }
                }
            }

            return eachLine;
        }catch(Exception e){
            e.printStackTrace();
        }
        return eachLine;
    }
}
