package rs.ac.ni.pmf.oop2;

public class DatabaseStorage implements Storage{
    public void store(final String input){
        System.out.println("Storing value " + "\""+ input + "\"" + " into the database...");
        System.out.println("Status: success");
    }
}
