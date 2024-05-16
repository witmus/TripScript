package model;

/**
 * Class used for mapping entities from database to java objects
 */
public class TownDao {
    /**
     * Town's name, also used as key in map collections of towns
     */
    protected String _name = null;

    /**
     * Town's longitude
     */
    protected float _longitude = 0;

    /**
     * Town's latitude
     */
    protected float _latitude = 0;

    public String GetName(){
        return _name;
    }

    public float GetLongitude(){
        return _longitude;
    }

    public float GetLatitude(){
        return _longitude;
    }

    public TownDao(){

    }

    public TownDao(String name, float longitude, float latitude){
        _name = name;
        _longitude = longitude;
        _latitude = latitude;
    }
}
