package visitor;

import grammar.TripScriptBaseVisitor;
import grammar.TripScriptParser;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.tree.RuleNode;

public class TripScriptMainVisitor extends TripScriptBaseVisitor<String> {

    private CharStream _input = null;

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
        return "from: " + ctx.date.getText();
    }

    @Override
    public String visitAdd_town_stat(TripScriptParser.Add_town_statContext ctx) {
        return "add_town: " + ctx.town.getText() + ' ' + ctx.days.getText();
    }

    @Override
    public String visitAdd_attraction_stat(TripScriptParser.Add_attraction_statContext ctx) {
        return "add_attraction: " + ctx.town.getText() + ' ' + ctx.name.getText();
    }

    @Override
    public String visitRemove_town_stat(TripScriptParser.Remove_town_statContext ctx) {
        return "remove_town: " + ctx.town.getText();
    }

    @Override
    public String visitRemove_attraction_stat(TripScriptParser.Remove_attraction_statContext ctx) {
        return "remove_attraction: " + ctx.town.getText() + ' ' + ctx.name.getText();
    }

    @Override
    public String visitFirst_stat(TripScriptParser.First_statContext ctx) {
        return "first: " + ctx.town.getText();
    }

    @Override
    public String visitShow_attractions_stat(TripScriptParser.Show_attractions_statContext ctx) {
        if(ctx.town != null){
            return ctx.town.getText();
        }

        return "show_attractions";
    }

    @Override
    public String visitShow_route_stat(TripScriptParser.Show_route_statContext ctx) {
        return "show_route";
    }

    @Override
    public String visitLast_day_stat(TripScriptParser.Last_day_statContext ctx) {
        return "last_day";
    }

    @Override
    public String visitStart_stat(TripScriptParser.Start_statContext ctx) {
        return "start";
    }
}
