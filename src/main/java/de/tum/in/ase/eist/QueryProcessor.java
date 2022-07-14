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
            int[] numbers = parseToInt(query);
            int max = 0;
            for (int n : numbers) {
                max = Math.max(n, max);
            }
            return Integer.toString(max);
        } else if (query.toLowerCase().contains("plus")) {
            int[] numbers = parseToInt(query);
            int res = numbers[0] + numbers[1];
            return Integer.toString(res);
        } else { // TODO extend the programm here
            return "";
        }
    }

    private static int[] parseToInt(String query) {
        String[] list = query.split("[ ,]*|,[ ,]*");
        int[] numbers = new int[list.length];
        for (int i = 0; i < list.length; i++) {
            numbers[i] = Integer.parseInt(list[i]);
        }
        return numbers;
    }
}
