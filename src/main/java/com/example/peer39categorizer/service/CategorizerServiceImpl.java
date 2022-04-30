package com.example.peer39categorizer.service;


import com.example.peer39categorizer.config.EmulatedData;
import com.example.peer39categorizer.dto.InputURLsAndCategoriesDTO;
import com.example.peer39categorizer.model.Category;
import com.example.peer39categorizer.model.Keyword;
import com.example.peer39parser.dto.InputURLsDTO;
import com.example.peer39parser.service.ParserService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.*;

@Service
public class CategorizerServiceImpl implements CategorizerService{
    private EmulatedData data;
    private ParserService parserService;

    public CategorizerServiceImpl(EmulatedData data,ParserService parserService) {
        this.data = data;
        this.parserService = parserService;
    }

    @Override
    public Map<String,List<String>> checkURLsCategory(InputURLsAndCategoriesDTO inputURLsAndCategoriesDTO) {
        Map<String, List<String>> result = new HashMap<>();
        //  result map using parser from 1st part of the task
        Map<String,String> urlsText = parserService.parseURLs(new InputURLsDTO(inputURLsAndCategoriesDTO.getInputURLs()));
        //  checking all parsed urls (if they contain the keywords from every category name provided from client)
        for (String categoryName : inputURLsAndCategoriesDTO.getCategories()) {
            Set<Keyword> keywords = getKeywords(categoryName);
            for (Map.Entry<String, String> e : urlsText.entrySet()) {
                if(isURLcontainsKeyword(keywords, e.getValue())){
                    if(!result.containsKey(categoryName)){
                        result.put(categoryName, new ArrayList<>());
                        result.get(categoryName).add(e.getKey());
                    }else {
                        result.get(categoryName).add(e.getKey());
                    }
                }
            }
        }
        return result;
    }
    private Set<Keyword> getKeywords(String categoryName){
        return data.getData()
                .stream()
                .filter(c -> c.getCategoryName().equals(categoryName))
                .findFirst()
                .map(Category::getKeywords)
                .get();
    }
    private boolean isURLcontainsKeyword(Set<Keyword> keywords,String urlText){
        for (Keyword k : keywords) {
            if(urlText.contains(k.getContent())){
                return true;
            }
        }
        return false;
    }
}
