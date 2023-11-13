package rs.ac.ni.pmf.oop2;

public class NetworkStorage implements Storage{
    public void store(final String input){
        System.out.println("Storing value " + "\""+ input + "\"" + " into the network...");
        System.out.println("Status: success");
    }
}
