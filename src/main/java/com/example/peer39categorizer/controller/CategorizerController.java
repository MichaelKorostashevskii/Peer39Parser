package com.example.peer39categorizer.controller;

import com.example.peer39categorizer.dto.InputURLsAndCategoriesDTO;
import com.example.peer39categorizer.service.CategorizerService;
import com.example.peer39parser.dto.InputURLsDTO;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.Map;

@RestController
@RequestMapping("api/v1")
public class CategorizerController {
    private CategorizerService categorizerService;

    public CategorizerController(CategorizerService categorizerService) {
        this.categorizerService = categorizerService;
    }

    @GetMapping("/category")
    public Map<String, List<String>> checkURLsCategory(@RequestBody InputURLsAndCategoriesDTO inputURLsAndCategoriesDTO){
        return categorizerService.checkURLsCategory(inputURLsAndCategoriesDTO);
    }
}
