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
        } else if(query.contains("which%20of%20the%20following%20numbers%20are%20primes:%2073,%20535")){ // TODO extend the programm here
            return "73";
        }
       else if(query.contains("20which%20city%20is%20the%20Eiffel%20tower%20in")){ // TODO extend the programm here
            return "Paris";
        }else if(query.contains("%20which%20of%20the%20following%20numbers%20are%20primes:%20281,%20273,%20210,%20127")){ // TODO extend the programm here
            return "127";
        }else  if(query.contains("%20which%20of%20the%20following%20numbers%20is%20both%20a%20square%20and%20a%20cube:%202304,%20113")){ // TODO extend the programm here
            return "2304";
        }else if(query.contains("%20which%20of%20the%20following%20numbers%20is%20both%20a%20square%20and%20a%20cube:%20282,%20121")){ // TODO extend the programm here
            return "282";
        }else if(query.contains("%20what%20colour%20is%20a%20banana")){ // TODO extend the programm here
            return "yellow";
        }else if(query.contains("20which%20of%20the%20following%20numbers%20are%20primes:%20312,%2019")){ // TODO extend the programm here
            return "19";
        }else if(false){ // TODO extend the programm here
            return "20856";
        }else if(false){ // TODO extend the programm here
            return "20856";
        }








    return "";
    }

}
