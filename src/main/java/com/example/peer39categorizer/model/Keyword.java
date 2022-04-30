package com.example.peer39categorizer.model;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.ArrayList;
import java.util.List;

@Getter
public class Keyword {
    private String content;

    public Keyword(String content) {
        if(content.split(" ").length > 6 || content.isEmpty()){
            throw new RuntimeException("keywords can contain min 1 words and max 6");
        }
        this.content = content;
    }
}
