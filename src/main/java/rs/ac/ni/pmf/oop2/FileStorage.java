package rs.ac.ni.pmf.oop2;

public class FileStorage implements Storage{
    public void store(final String input){
        System.out.println("Storing value " + "\""+ input + "\"" + " into the file...");
        System.out.println("Status: success");
    }
}
