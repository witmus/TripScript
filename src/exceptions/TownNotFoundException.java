package exceptions;

public class TownNotFoundException extends Exception {
    public TownNotFoundException(String name){
        super("Town not found: " + name);
    }
}
