package dev.jacksonraj.springbasics.movierecommendersystem.lesson3;

import dev.jacksonraj.springbasics.movierecommendersystem.lesson2.Filter;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;


public class ContentBasedFilter implements Filter {
    public String[] getRecommendations(String movie) {
        //logic of content based filter
        return new String[]{"Happy Feet", "Ice Age", "Shark Tale"};
    }
}