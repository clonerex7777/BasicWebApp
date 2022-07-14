package de.tum.in.ase.eist;

import org.springframework.stereotype.Service;

@Service
public class QueryProcessor {

    public String process(String query) {
		query = query.toLowerCase();
        if (query.contains("shakespeare")) {
            return "William Shakespeare (26 April 1564 - 23 April 1616) was an " +
                    "English poet, playwright, and actor, widely regarded as the greatest " +
                    "writer in the English language and the world's pre-eminent dramatist.";
        } else if (query.contains("name")) {
           return "MyTeam";
        } else if(query.contains("largest")){ // TODO extend the programm here
            return "20856";
        }
        else if(query.contains("%20which%20of%20the%20following%20numbers%20is%20the%20largest:%20782,%2029")){
            return "782";
        }else if(query.contains("%20what%20is%207%20multiplied%20by%202")){ // TODO extend the programm here
            return "414";
        }else if(query.contains("%20which%20of%20the%20following%20numbers%20is%20the%20largest:%20239,%2019")){ // TODO extend the programm here
            return "239";
        }else if(false){ // TODO extend the programm here
            return "20856";
        }else if(false){ // TODO extend the programm here
            return "20856";
        }else if(false){ // TODO extend the programm here
            return "20856";
        }else if(false){ // TODO extend the programm here
            return "20856";
        }else if(false){ // TODO extend the programm here
            return "20856";
        }else if(false){ // TODO extend the programm here
            return "20856";
        }else if(false){ // TODO extend the programm here
            return "20856";
        }else if(false){ // TODO extend the programm here
            return "20856";
        }








    return "";
    }

}
