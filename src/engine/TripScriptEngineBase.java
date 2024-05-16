package engine;

import model.Town;

import java.time.LocalDate;
import java.util.HashMap;
import java.util.Map;

public abstract class TripScriptEngineBase {
    protected LocalDate _startDate = null;
    protected Town _startTown = null;
    protected Map<String, Town> _towns = new HashMap<String, Town>();
}
