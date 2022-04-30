package com.example.peer39parser.service;

import com.example.peer39parser.dto.InputURLsDTO;

import java.util.Map;

public interface ParserService {
    Map<String,String> parseURLs(InputURLsDTO inputURLsDTO);
}
