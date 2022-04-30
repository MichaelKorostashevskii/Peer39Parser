package com.example.peer39parser.controller;

import com.example.peer39parser.dto.InputURLsDTO;
import com.example.peer39parser.service.ParserService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Map;
import java.util.Set;

@RestController
@RequestMapping("api/v1")
public class ParserController {
    private final ParserService parserService;

    public ParserController(ParserService parserService) {
        this.parserService = parserService;
    }

    @GetMapping("/parseURLs")
    public Map<String,String> parseURLs(@RequestBody InputURLsDTO inputURLsDTO){
        return parserService.parseURLs(inputURLsDTO);
    }
}
