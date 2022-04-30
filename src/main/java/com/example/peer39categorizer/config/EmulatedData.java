package com.example.peer39categorizer.config;

import com.example.peer39categorizer.model.Category;
import com.example.peer39categorizer.model.Keyword;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Component;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class EmulatedData {
    private Set<Category> data;
}
