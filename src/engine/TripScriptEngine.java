package engine;

import exceptions.TownNotFoundException;
import model.PlaceOfInterest;
import model.Town;
import model.TownDao;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.Random;

public class TripScriptEngine extends TripScriptEngineBase implements ITripScriptEngine {

    @Override
    public LocalDate GetStartDate() {
        return _startDate;
    }

    @Override
    public void SetStartDate(LocalDate date) {
        _startDate = date;
    }

    @Override
    public Town GetStartTown() {
        return _startTown;
    }

    @Override
    public String GetStartTownName() {
        return _startTown.GetName();
    }

    /**
     * Sets trip's starting point
     *
     * @param name
     * @throws TownNotFoundException if town with a given name hasn't been added to the list
     */
    @Override
    public void SetStartTown(String name) throws TownNotFoundException {
        if(!_towns.containsKey(name)){
            throw new TownNotFoundException(name);
        }

        _startTown = _towns.get(name);
    }

    /**
     * Queries DB for a town by the name and if found adds it to the engine's map collection
     *
     * @param name      Town's name
     * @param daysSpent Planned duration of visit in the town
     * @throws TownNotFoundException
     */
    @Override
    public void AddTown(String name, int daysSpent) throws TownNotFoundException {
        //for testing purposes, remove after implementing DB queries
        if(name == "dupa"){
            throw new TownNotFoundException("dupa");
        }

        //replace below with DB query
        var rand = new Random();
        var townDao = new TownDao(name, rand.nextFloat(), rand.nextFloat());
        var town = new Town(townDao, rand.nextInt());
        //replace above with DB query

        _towns.put(name, town);
    }

    /**
     * Searches engine's towns map collection by the name and if found removes it from the collection
     *
     * @param name Town's name
     */
    @Override
    public void RemoveTown(String name) throws TownNotFoundException {
        if(!_towns.containsKey(name)){
            throw new TownNotFoundException(name);
        }

        _towns.remove(name);
    }

    /**
     * Engine towns map getter
     *
     * @return Towns map
     */
    @Override
    public Map<String, Town> GetTowns() {
        return _towns;
    }

    /**
     * Engine towns list getter
     *
     * @return Towns list
     */
    @Override
    public List<Town> GetTownsList() {
        return new ArrayList<>(_towns.values());
    }

    /**
     * Queries DB for a place of interest with the given name
     * in the given town and if found adds it to town's PoI collection
     *
     * @param townName town's name
     * @param poiName  place of interest's name
     */
    @Override
    public void AddPoi(String townName, String poiName) throws TownNotFoundException {
        if(!_towns.containsKey(townName)){
            throw new TownNotFoundException(townName);
        }

        var town = _towns.get(townName);

        //replace below with DB query
        var poi = new PlaceOfInterest(poiName, 4);
        //replace above with DB query

        town.AddPlaceOfInterest(poi);
    }

    /**
     * Places of interest getter
     *
     * @return All places of interest from all towns
     */
    @Override
    public List<PlaceOfInterest> GetPois() {
        return _towns
            .values()
            .stream()
            .flatMap(t -> t.GetPlacesOfInterest()
                    .values()
                    .stream()
            ).toList();
    }

    /**
     * Places of interest by town getter
     *
     * @param townName
     * @return Places of interest from the given town
     */
    @Override
    public List<PlaceOfInterest> GetPois(String townName) {
        var town = _towns.get(townName);

        return new ArrayList<>(town.GetPlacesOfInterest().values());
    }

    @Override
    public void RemovePoi(String townName, String poiName) {
        var town = _towns.get(townName);

        town.RemovePlaceOfInterest(poiName);
    }

    /**
     * Calculates trip's duration
     *
     * @return Estimation of trip's last day
     */
    @Override
    public LocalDate GetLastDay() {
        //replace below with logic
        return _startDate.plusDays(7);
    }

    /**
     * Calculates optimal order in which towns should be visited
     *
     * @return Towns names sequence
     */
    @Override
    public String ShowRoute() {
        if(_towns.isEmpty()){
            return "No towns";
        }

        return _towns.values()
                .stream()
                .map(TownDao::GetName)
                .toList()
                .toString();
    }

    /**
     * Generates trip's plan based on current state of towns and PoI collections state
     *
     * @return
     */
    @Override
    public String StartProcessing() {
        return "mock plan";
    }
}
