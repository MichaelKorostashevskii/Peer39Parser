package com.example.peer39categorizer.config;

import com.example.peer39categorizer.model.Category;
import com.example.peer39categorizer.model.Keyword;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

/*
    some hardcoded data :)
 */

@Configuration
public class CategorizerConfig {
    @Bean
    public EmulatedData emulateData(){
        Set<Category> data = new HashSet<>();
        Category starWarsCat = new Category();
        starWarsCat.setCategoryName("Star Wars");
        Category basketballCat = new Category();
        basketballCat.setCategoryName("Basketball");
        String[] starWarsKeywords = {"star war", "starwars", "starwar", "Star Wars", "r2d2", "may the force be with you"};
        String[] basketballKeywords = {"basketball", "nba", "ncaa", "lebron james", "john stokton", "anthony davis"};
        Arrays.stream(starWarsKeywords).forEach(w -> starWarsCat.addKeyword(new Keyword(w)));
        Arrays.stream(basketballKeywords).forEach(w -> basketballCat.addKeyword(new Keyword(w)));
        data.add(starWarsCat);
        data.add(basketballCat);
        return new EmulatedData(data);
    }
}
