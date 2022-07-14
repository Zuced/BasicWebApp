package de.tum.in.ase.eist;

import org.springframework.stereotype.Service;

@Service
public class QueryProcessor {

    public String process(String query) {
		query = query.toLowerCase();
        if (query.toLowerCase().contains("shakespeare")) {
            return "William Shakespeare (26 April 1564 - 23 April 1616) was an " +
                    "English poet, playwright, and actor, widely regarded as the greatest " +
                    "writer in the English language and the world's pre-eminent dramatist.";
        } else if (query.toLowerCase().contains("name")) {
            return "Kevin";
        } else if (query.toLowerCase().contains("largest")) {
            String[] list = query.split("[ ,]*|,[ ,]*");
            int max = 0;
            for(String str : list) {
                int number = Integer.parseInt(str);
                max = Math.max(number, max);
            }
            return Integer.toString(max);
        } else { // TODO extend the programm here
            return "";
        }
    }
}
