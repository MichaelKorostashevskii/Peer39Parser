package com.example.peer39categorizer.dto;

import lombok.Getter;

import java.io.Serializable;
import java.util.Set;

/*
    dto object with URLs and category names receiving from client
 */

@Getter
public class InputURLsAndCategoriesDTO implements Serializable {
    private Set<String> inputURLs;
    private Set<String> categories;
}
