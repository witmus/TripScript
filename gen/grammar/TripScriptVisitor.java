// Generated from C:/Users/witek/IdeaProjects/TripScript/src/grammar/TripScript.g4 by ANTLR 4.13.1
package grammar;
import org.antlr.v4.runtime.tree.ParseTreeVisitor;

/**
 * This interface defines a complete generic visitor for a parse tree produced
 * by {@link TripScriptParser}.
 *
 * @param <T> The return type of the visit operation. Use {@link Void} for
 * operations with no return type.
 */
public interface TripScriptVisitor<T> extends ParseTreeVisitor<T> {
	/**
	 * Visit a parse tree produced by {@link TripScriptParser#prog}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitProg(TripScriptParser.ProgContext ctx);
	/**
	 * Visit a parse tree produced by the {@code from_stat}
	 * labeled alternative in {@link TripScriptParser#stat}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFrom_stat(TripScriptParser.From_statContext ctx);
	/**
	 * Visit a parse tree produced by the {@code add_town_stat}
	 * labeled alternative in {@link TripScriptParser#stat}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAdd_town_stat(TripScriptParser.Add_town_statContext ctx);
	/**
	 * Visit a parse tree produced by the {@code add_attraction_stat}
	 * labeled alternative in {@link TripScriptParser#stat}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAdd_attraction_stat(TripScriptParser.Add_attraction_statContext ctx);
	/**
	 * Visit a parse tree produced by the {@code remove_town_stat}
	 * labeled alternative in {@link TripScriptParser#stat}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitRemove_town_stat(TripScriptParser.Remove_town_statContext ctx);
	/**
	 * Visit a parse tree produced by the {@code remove_attraction_stat}
	 * labeled alternative in {@link TripScriptParser#stat}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitRemove_attraction_stat(TripScriptParser.Remove_attraction_statContext ctx);
	/**
	 * Visit a parse tree produced by the {@code first_stat}
	 * labeled alternative in {@link TripScriptParser#stat}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFirst_stat(TripScriptParser.First_statContext ctx);
	/**
	 * Visit a parse tree produced by the {@code show_attractions_stat}
	 * labeled alternative in {@link TripScriptParser#stat}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitShow_attractions_stat(TripScriptParser.Show_attractions_statContext ctx);
	/**
	 * Visit a parse tree produced by the {@code show_route_stat}
	 * labeled alternative in {@link TripScriptParser#stat}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitShow_route_stat(TripScriptParser.Show_route_statContext ctx);
	/**
	 * Visit a parse tree produced by the {@code last_day_stat}
	 * labeled alternative in {@link TripScriptParser#stat}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLast_day_stat(TripScriptParser.Last_day_statContext ctx);
	/**
	 * Visit a parse tree produced by the {@code start_stat}
	 * labeled alternative in {@link TripScriptParser#stat}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStart_stat(TripScriptParser.Start_statContext ctx);
}