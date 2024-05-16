package engine;

import model.PlaceOfInterest;
import model.Town;
import exceptions.*;

import java.time.LocalDate;
import java.util.Map;
import java.util.List;

public interface ITripScriptEngine {
    LocalDate GetStartDate();
    void SetStartDate(LocalDate date);

    Town GetStartTown();
    String GetStartTownName();

    /**
     * Sets trip's starting point
     * @throws TownNotFoundException if town with a given name hasn't been added to the list
     */
    void SetStartTown(String name) throws TownNotFoundException;

    /**
     * Queries DB for a town by the name and if found adds it to the engine's map collection
     * @param name Town's name
     * @param daysSpent Planned duration of visit in the town
     * @throws TownNotFoundException
     */
    void AddTown(String name, int daysSpent) throws TownNotFoundException;

    /**
     * Searches engine's towns map collection by the name and if found removes it from the collection
     * @param name Town's name
     */
    void RemoveTown(String name) throws TownNotFoundException;

    /**
     * Engine towns map getter
     * @return Towns map
     */
    Map<String, Town> GetTowns();

    /**
     * Engine towns list getter
     * @return Towns list
     */
    List<Town> GetTownsList();

    /**
     * Queries DB for a place of interest with the given name
     * in the given town and if found adds it to town's PoI collection
     * @param townName town's name
     * @param poiName  place of interest's name
     */
    void AddPoi(String townName, String poiName) throws TownNotFoundException;

    /**
     * Places of interest getter
     * @return All places of interest from all towns
     */
    List<PlaceOfInterest> GetPois();

    /**
     * Places of interest by town getter
     * @param townName
     * @return Places of interest from the given town
     */
    List<PlaceOfInterest> GetPois(String townName);

    void RemovePoi(String townName, String poiName);

    /**
     * Calculates trip's duration
     * @return Estimation of trip's last day
     */
    LocalDate GetLastDay();

    /**
     * Calculates optimal order in which towns should be visited
     * @return Towns names sequence
     */
    String ShowRoute();

    /**
     * Generates trip's plan based on current state of towns and PoI collections state
     * @return
     */
    String StartProcessing();
}
