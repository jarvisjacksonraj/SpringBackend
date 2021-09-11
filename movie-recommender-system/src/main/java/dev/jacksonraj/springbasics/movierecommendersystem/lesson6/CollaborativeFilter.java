package dev.jacksonraj.springbasics.movierecommendersystem.lesson6;

import dev.jacksonraj.springbasics.movierecommendersystem.lesson2.Filter;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Component
@Primary
@Qualifier("CF")
public class CollaborativeFilter implements Filter {

    public String[] getRecommendations(String movie) {
        //logic of collaborative filter
        return new String[] { };
    }
}
