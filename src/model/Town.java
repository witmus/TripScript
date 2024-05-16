package model;

import java.util.*;

/**
 * Class used by the engine for processing user's script
 */
public class Town extends TownDao {
    private final Map<String, PlaceOfInterest> _placesOfInterest = new HashMap<String, PlaceOfInterest>();
    private int _daysSpent = 0;

    public Town(){

    }

    public Town(TownDao town, int days){
        _name = town.GetName();
        _longitude = town.GetLongitude();
        _latitude = town.GetLatitude();
        _daysSpent = days;
    }

    public int GetDays(){
        return _daysSpent;
    }

    public void SetDays(int days){
        _daysSpent = days;
    }

    public Map<String, PlaceOfInterest> GetPlacesOfInterest(){
        return _placesOfInterest;
    }

    public void AddPlaceOfInterest(PlaceOfInterest place){
        _placesOfInterest.put(place.GetName(), place);
    }

    public void RemovePlaceOfInterest(String name){
        _placesOfInterest.remove(name);
    }
}
