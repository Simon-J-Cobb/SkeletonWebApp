package com.develogical;

public class QueryProcessor {

    public String process(String query) {

        System.out.println("Received query:" + query);

        if (query.toLowerCase().contains("shakespeare")) {
            return "William Shakespeare (26 April 1564 - 23 April 1616) was an "
                    + "English poet, playwright, and actor, widely regarded as the greatest "
                    + "writer in the English language and the world's pre-eminent dramatist.";
        }
        if (query.toLowerCase().contains("name")) {
            return "Micheal Scott";
        }
        if (query.toLowerCase().contains("plus")) {
            String[] components = query.split(" ");
            return String.valueOf(Integer.parseInt(components[2]) + Integer.parseInt(components[4].replace("?", "")));
        }
        if (query.toLowerCase().contains("largest")) {
            String[] components = query.split(": ");
            String[] numbers = components[1].split(",");
            Integer max = 0;
            for (String number : numbers) {
                Integer integer = Integer.parseInt(number.replace(" ", "").replace("?", ""));
                if (integer > max) {
                    max = integer;
                }


            }
            return String.valueOf(max);

        }
        if (query.toLowerCase().contains("multiplied")) {
            String[] components = query.split(" ");
            return String.valueOf(Integer.parseInt(components[2]) * Integer.parseInt(components[4].replace("?", "")));
        }

        return "";
    }
}
