package visitor;

import engine.ITripScriptEngine;
import engine.TripScriptEngine;
import exceptions.TownNotFoundException;
import grammar.TripScriptBaseVisitor;
import grammar.TripScriptParser;
import org.antlr.v4.runtime.CharStream;

import java.time.LocalDate;

public class TripScriptMainVisitor extends TripScriptBaseVisitor<String> {
    private CharStream _input = null;
    private ITripScriptEngine _engine = new TripScriptEngine();

    public TripScriptMainVisitor() {

    }

    public TripScriptMainVisitor(CharStream input){
        _input = input;
    }

    @Override
    public String visitProg(TripScriptParser.ProgContext ctx) {
        return super.visitProg(ctx);
    }

    @Override
    protected String aggregateResult(String aggregate, String nextResult) {
        if(aggregate == null){
            aggregate = "";
        }

        if(nextResult == null){
            return aggregate;
        }

        return aggregate + nextResult + '\n';
    }

    @Override
    public String visitFrom_stat(TripScriptParser.From_statContext ctx) {
        _engine.SetStartDate(LocalDate.parse(ctx.date.getText()));

        return "from: " + ctx.date.getText();
    }

    @Override
    public String visitAdd_town_stat(TripScriptParser.Add_town_statContext ctx) {
        try{
            _engine.AddTown(ctx.town.getText(), Integer.parseInt(ctx.days.getText()));
        } catch (TownNotFoundException ex){
            return ex.getMessage();
        } catch (NullPointerException ex){
            return "params error";
        }

        return "add_town: " + ctx.town.getText() + ' ' + ctx.days.getText();
    }

    @Override
    public String visitAdd_attraction_stat(TripScriptParser.Add_attraction_statContext ctx) {
        try {
            _engine.AddPoi(ctx.town.getText(), ctx.name.getText());
        } catch (TownNotFoundException e) {
            return e.getMessage();
        }

        return "add_attraction: " + ctx.town.getText() + ' ' + ctx.name.getText();
    }

    @Override
    public String visitRemove_town_stat(TripScriptParser.Remove_town_statContext ctx) {
        try {
            _engine.RemoveTown(ctx.town.getText());
        } catch (TownNotFoundException e) {
            return e.getMessage();
        }

        return "remove_town: " + ctx.town.getText();
    }

    @Override
    public String visitRemove_attraction_stat(TripScriptParser.Remove_attraction_statContext ctx) {
        _engine.RemovePoi(ctx.town.getText(), ctx.name.getText());

        return "remove_attraction: " + ctx.town.getText() + ' ' + ctx.name.getText();
    }

    @Override
    public String visitFirst_stat(TripScriptParser.First_statContext ctx) {
        try {
            _engine.SetStartTown(ctx.town.getText());
        } catch (TownNotFoundException e) {
            return e.getMessage();
        }

        return "first: " + ctx.town.getText();
    }

    @Override
    public String visitShow_attractions_stat(TripScriptParser.Show_attractions_statContext ctx) {
        if(ctx.town != null){
            return _engine.GetPois(ctx.town.getText()).toString();
        }

        return _engine.GetPois().toString();
    }

    @Override
    public String visitShow_route_stat(TripScriptParser.Show_route_statContext ctx) {
        return _engine.ShowRoute();
    }

    @Override
    public String visitLast_day_stat(TripScriptParser.Last_day_statContext ctx) {
        return _engine.GetLastDay().toString();
    }

    @Override
    public String visitStart_stat(TripScriptParser.Start_statContext ctx) {
        return _engine.StartProcessing();
    }
}
