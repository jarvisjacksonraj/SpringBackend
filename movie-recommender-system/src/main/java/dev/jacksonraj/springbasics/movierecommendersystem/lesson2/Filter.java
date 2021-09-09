package dev.jacksonraj.springbasics.movierecommendersystem.lesson2;

public interface Filter {
    public String[] getRecommendations(String movie);
}
