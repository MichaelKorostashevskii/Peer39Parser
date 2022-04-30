package com.example.peer39categorizer.service;

import com.example.peer39categorizer.dto.InputURLsAndCategoriesDTO;
import com.example.peer39parser.dto.InputURLsDTO;

import java.util.List;
import java.util.Map;

public interface CategorizerService {
    Map<String, List<String>> checkURLsCategory(InputURLsAndCategoriesDTO inputURLsAndCategoriesDTO);
}
