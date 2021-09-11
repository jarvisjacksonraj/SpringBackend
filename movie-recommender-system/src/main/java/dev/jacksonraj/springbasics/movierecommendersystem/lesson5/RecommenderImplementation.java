package dev.jacksonraj.springbasics.movierecommendersystem.lesson5;

import dev.jacksonraj.springbasics.movierecommendersystem.lesson2.Filter;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class RecommenderImplementation {

    @Autowired
    private Filter collaborativeFilter;

    public String[] recommendMovies(String movie) {
        System.out.println("\nName of the filter in use: " + collaborativeFilter + "\n");

        String[] results = collaborativeFilter.getRecommendations("Finding Dory");

        return results;

    }
}
