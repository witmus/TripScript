grammar TripScript;

options
{
    language = Java;
}
//parser

prog: stat* EOF;

stat: FROM_KW'('date=DATE')' #from_stat
    | ADD_TOWN_KW'('town=WORD','days=INT')' #add_town_stat
    | ADD_ATTRACTION_KW'('town=WORD','name=WORD')' #add_attraction_stat
    | REMOVE_TOWN_KW'('town=WORD')' #remove_town_stat
    | REMOVE_ATTRACTION_KW'('town=WORD','name=WORD')' #remove_attraction_stat
    | FIRST_KW'('town=WORD')' #first_stat
    | SHOW_ATTRACTIONS_KW('('town=WORD')')? #show_attractions_stat
    | SHOW_ROUTE_KW #show_route_stat
    | LAST_DAY_KW #last_day_stat
    | START_KW #start_stat;

//keywords

FROM_KW: 'from';

ADD_TOWN_KW: 'add_town';

ADD_ATTRACTION_KW: 'add_attraction';

REMOVE_TOWN_KW: 'remove_town';

REMOVE_ATTRACTION_KW: 'remove_attraction';

FIRST_KW: 'first';

SHOW_ATTRACTIONS_KW: 'show_attractions';

SHOW_ROUTE_KW: 'show_route';

LAST_DAY_KW: 'last_day';

START_KW: 'start';

//inputs

DATE : INT'.'INT'.'INT;

INT : [0-9]+ ;

WORD : [a-zA-Z_][a-zA-Z_]*;

NEWLINE : [\r\n]+ -> channel(HIDDEN);

WS : [ \t]+ -> channel(HIDDEN) ;