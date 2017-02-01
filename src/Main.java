import java.io.*;
import java.util.*;
import java.util.stream.Collectors;

/**
 * Created by Bruno on 19.01.2017.
 */
public class Main {

    public static void main(String[] args) throws FileNotFoundException, UnsupportedEncodingException {
        Reader reader = new Reader();
        //Writer writer = new Writer();
        ArrayList<String> thisLine;
        ArrayList<Person> people  = new ArrayList<Person>();
        String filename = "allPeople.txt";
        int counter = 0;

        System.out.println(counter);
        counter++;
        System.out.println(counter);

        thisLine = reader.readFile("data/startliste.txt");

        for (int i = 0; i < thisLine.size(); i++) {
            String delims = "\\t";
            String[] tokens = thisLine.get(i).split(delims);
            tokens[0] = tokens[0].replaceAll("\\s+","");
                Person person = new Person(Integer.parseInt(tokens[0]), Integer.parseInt(tokens[1]), tokens[2], "", new String[]{""});
                people.add(person);
        }

        /*for (Person person : people) {
            person.setDate(person.ID);
            System.out.println(person.ID + " " + person.name + " " + person.time);
        }*/

        PrintWriter writer = new PrintWriter("data/" + filename, "UTF-8");
        writer.format("%-10s %-15s %-15s %6s \r\n", "Rang:", "Name:", "Startnr:", "Laufzeit:");
        int rang = 1;

        for (int i = 0; i < people.size(); i++) {
            people.get(i).setDate(people.get(i).ID);
            writer.format("%-10s %-15s %-15s %6s \r\n", rang, people.get(i).name, people.get(i).ID, people.get(i).time);
            rang++;
        }

        people = compareByTime(people);

        for (int i = 0; i < people.size(); i++) {
            people.get(i).setDate(people.get(i).ID);
            writer.format("%-10s %-15s %-15s %6s \r\n", rang, people.get(i).name, people.get(i).ID, people.get(i).time);
            rang++;
        }

        /*public class Person implements Comparable<Person> {
            String fname;
            String lname;
            //getter setter
            public int compareTo(Person person) {
                int comparedFname = this.fname.compareTo(person.getFname());
                if (comparedFname == 0) {//if fname are same then compare by last name
                    return this.lname.compareTo(person.getLname());
                }
                return comparedFname;
            }
        }*/


    }

    public static ArrayList<Person> compareByTime(ArrayList<Person> personArrayList){
        for(Person person:personArrayList){
            String delims = ":";
            person.temp = person.time.split(delims);
            for(String t:person.temp){
                System.out.println(t);
            }
            /*if(person.category == 1){
                person.laufzeit = person.temp[1] +
            }*/
        }
        for(int i = 0; i < personArrayList.size(); i++){
            for(int j = 0; j < personArrayList.size()-1; i++){
                /*if(Integer.parseInt(personArrayList.get(j).temp[2]) > Integer.parseInt(personArrayList.get(j+1).temp[2])){
                    Person temp = new Person(personArrayList.get(j).ID, personArrayList.get(j).category, personArrayList.get(j).name, personArrayList.get(j).time, personArrayList.get(j).temp);
                    personArrayList.get(j).ID = personArrayList.get(j+1).ID;
                    personArrayList.get(j).category = personArrayList.get(j+1).category;
                    personArrayList.get(j).name = personArrayList.get(j+1).name;
                    personArrayList.get(j).time =  personArrayList.get(j+1).time;
                    personArrayList.get(j).temp = personArrayList.get(j+1).temp;
                    personArrayList.get(j+1).ID = temp.ID;
                    personArrayList.get(j+1).category = temp.category;
                    personArrayList.get(j+1).name = temp.name;
                    personArrayList.get(j+1).time =  temp.time;
                    personArrayList.get(j+1).temp = temp.temp;
                }*/

            }
        }
        return personArrayList;
    }
}
