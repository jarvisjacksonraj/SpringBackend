package dev.jacksonraj.springbasics.movierecommendersystem.lesson7;

import org.springframework.stereotype.Component;

@Component
public class ContentBasedFilter implements Filter {

    //getRecommendations takes a movie as input and returns a list of similar movies
    public String[] getRecommendations(String movie) {
        //logic for content based filter
        return new String[]{"Happy Feet", "Ice Age", "Shark Tale"};
    }

}