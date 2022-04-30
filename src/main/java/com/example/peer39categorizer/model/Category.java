package com.example.peer39categorizer.model;

import lombok.*;

import java.util.HashSet;
import java.util.Set;
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@EqualsAndHashCode(of = {"categoryName"})
public class Category {
    private String categoryName;
    private Set<Keyword> keywords = new HashSet<>();

    public void addKeyword(Keyword keyword){
        if(keywords.size() == 1000){
            throw new RuntimeException("category is full");
        }
        keywords.add(keyword);
    }
    public void removeKeyword(Keyword keyword){
        keywords.remove(keyword);
    }
}
