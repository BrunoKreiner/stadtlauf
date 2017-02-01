import java.io.Serializable;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;

/**
 * Created by Bruno on 19.01.2017.
 */
public class Person {

    public int ID;
    public int category;
    public String name;
    public String time;
    public String[] temp;
    public int laufzeit;

    public Person(int ID, int category, String name, String time, String[] temp) {
        this.ID = ID;
        this.category = category;
        this.name = name;
        this.time = time;
        this.temp = temp;
        this.laufzeit = laufzeit;
    }

    public void setDate(int personID){
        Reader reader = new Reader();
        //ArrayList<String> timeList = reader.readFile("data/messresultate.txt");
        String correspondingLine = reader.searchID(personID, "data/messresultate.txt");
        this.time = correspondingLine;
    }

    /*public setTime(){

    }*/

}
