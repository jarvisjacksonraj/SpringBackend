package dev.jacksonraj.springbasics.movierecommendersystem.lesson4;

import dev.jacksonraj.springbasics.movierecommendersystem.lesson2.Filter;
import org.springframework.stereotype.Component;

@Component
public class CollaborativeFilter implements Filter {

    public String[] getRecommendations(String movie) {
        //logic of collaborative filter
        return new String[] { };
    }
}
