package model;

/**
 * Class used both for mapping entities and script processing
 */
public class PlaceOfInterest {
    private String _name = null;
    private int _visitHours = 0;

    public PlaceOfInterest(){

    }

    public PlaceOfInterest(String name, int visitHours){
        _name = name;
        _visitHours = visitHours;
    }

    public String GetName(){
        return _name;
    }

    public int GetVisitHours(){
        return _visitHours;
    }
}
