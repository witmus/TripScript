// Generated from C:/Users/witek/IdeaProjects/TripScript/src/grammar/TripScript.g4 by ANTLR 4.13.1
package grammar;
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link TripScriptParser}.
 */
public interface TripScriptListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link TripScriptParser#prog}.
	 * @param ctx the parse tree
	 */
	void enterProg(TripScriptParser.ProgContext ctx);
	/**
	 * Exit a parse tree produced by {@link TripScriptParser#prog}.
	 * @param ctx the parse tree
	 */
	void exitProg(TripScriptParser.ProgContext ctx);
	/**
	 * Enter a parse tree produced by the {@code from_stat}
	 * labeled alternative in {@link TripScriptParser#stat}.
	 * @param ctx the parse tree
	 */
	void enterFrom_stat(TripScriptParser.From_statContext ctx);
	/**
	 * Exit a parse tree produced by the {@code from_stat}
	 * labeled alternative in {@link TripScriptParser#stat}.
	 * @param ctx the parse tree
	 */
	void exitFrom_stat(TripScriptParser.From_statContext ctx);
	/**
	 * Enter a parse tree produced by the {@code add_town_stat}
	 * labeled alternative in {@link TripScriptParser#stat}.
	 * @param ctx the parse tree
	 */
	void enterAdd_town_stat(TripScriptParser.Add_town_statContext ctx);
	/**
	 * Exit a parse tree produced by the {@code add_town_stat}
	 * labeled alternative in {@link TripScriptParser#stat}.
	 * @param ctx the parse tree
	 */
	void exitAdd_town_stat(TripScriptParser.Add_town_statContext ctx);
	/**
	 * Enter a parse tree produced by the {@code add_attraction_stat}
	 * labeled alternative in {@link TripScriptParser#stat}.
	 * @param ctx the parse tree
	 */
	void enterAdd_attraction_stat(TripScriptParser.Add_attraction_statContext ctx);
	/**
	 * Exit a parse tree produced by the {@code add_attraction_stat}
	 * labeled alternative in {@link TripScriptParser#stat}.
	 * @param ctx the parse tree
	 */
	void exitAdd_attraction_stat(TripScriptParser.Add_attraction_statContext ctx);
	/**
	 * Enter a parse tree produced by the {@code remove_town_stat}
	 * labeled alternative in {@link TripScriptParser#stat}.
	 * @param ctx the parse tree
	 */
	void enterRemove_town_stat(TripScriptParser.Remove_town_statContext ctx);
	/**
	 * Exit a parse tree produced by the {@code remove_town_stat}
	 * labeled alternative in {@link TripScriptParser#stat}.
	 * @param ctx the parse tree
	 */
	void exitRemove_town_stat(TripScriptParser.Remove_town_statContext ctx);
	/**
	 * Enter a parse tree produced by the {@code remove_attraction_stat}
	 * labeled alternative in {@link TripScriptParser#stat}.
	 * @param ctx the parse tree
	 */
	void enterRemove_attraction_stat(TripScriptParser.Remove_attraction_statContext ctx);
	/**
	 * Exit a parse tree produced by the {@code remove_attraction_stat}
	 * labeled alternative in {@link TripScriptParser#stat}.
	 * @param ctx the parse tree
	 */
	void exitRemove_attraction_stat(TripScriptParser.Remove_attraction_statContext ctx);
	/**
	 * Enter a parse tree produced by the {@code first_stat}
	 * labeled alternative in {@link TripScriptParser#stat}.
	 * @param ctx the parse tree
	 */
	void enterFirst_stat(TripScriptParser.First_statContext ctx);
	/**
	 * Exit a parse tree produced by the {@code first_stat}
	 * labeled alternative in {@link TripScriptParser#stat}.
	 * @param ctx the parse tree
	 */
	void exitFirst_stat(TripScriptParser.First_statContext ctx);
	/**
	 * Enter a parse tree produced by the {@code show_attractions_stat}
	 * labeled alternative in {@link TripScriptParser#stat}.
	 * @param ctx the parse tree
	 */
	void enterShow_attractions_stat(TripScriptParser.Show_attractions_statContext ctx);
	/**
	 * Exit a parse tree produced by the {@code show_attractions_stat}
	 * labeled alternative in {@link TripScriptParser#stat}.
	 * @param ctx the parse tree
	 */
	void exitShow_attractions_stat(TripScriptParser.Show_attractions_statContext ctx);
	/**
	 * Enter a parse tree produced by the {@code show_route_stat}
	 * labeled alternative in {@link TripScriptParser#stat}.
	 * @param ctx the parse tree
	 */
	void enterShow_route_stat(TripScriptParser.Show_route_statContext ctx);
	/**
	 * Exit a parse tree produced by the {@code show_route_stat}
	 * labeled alternative in {@link TripScriptParser#stat}.
	 * @param ctx the parse tree
	 */
	void exitShow_route_stat(TripScriptParser.Show_route_statContext ctx);
	/**
	 * Enter a parse tree produced by the {@code last_day_stat}
	 * labeled alternative in {@link TripScriptParser#stat}.
	 * @param ctx the parse tree
	 */
	void enterLast_day_stat(TripScriptParser.Last_day_statContext ctx);
	/**
	 * Exit a parse tree produced by the {@code last_day_stat}
	 * labeled alternative in {@link TripScriptParser#stat}.
	 * @param ctx the parse tree
	 */
	void exitLast_day_stat(TripScriptParser.Last_day_statContext ctx);
	/**
	 * Enter a parse tree produced by the {@code start_stat}
	 * labeled alternative in {@link TripScriptParser#stat}.
	 * @param ctx the parse tree
	 */
	void enterStart_stat(TripScriptParser.Start_statContext ctx);
	/**
	 * Exit a parse tree produced by the {@code start_stat}
	 * labeled alternative in {@link TripScriptParser#stat}.
	 * @param ctx the parse tree
	 */
	void exitStart_stat(TripScriptParser.Start_statContext ctx);
}