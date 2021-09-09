package dev.jacksonraj.springbasics.movierecommendersystem.lesson1;

public class RecommenderImplementation {

    public String[] recommendMovies(String movie) {
        //use content based filter to find similar movies
        ContentBasedFilter filter = new ContentBasedFilter();
        String[] results = filter.getRecommendations("Finding Dory");
        //return the results
        return results;
    }
}
