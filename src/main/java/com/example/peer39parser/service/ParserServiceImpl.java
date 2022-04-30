package com.example.peer39parser.service;

import com.example.peer39parser.dto.InputURLsDTO;
import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.springframework.stereotype.Service;

import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

/*
    parsing HTML to String and remove tags using JSoup library
 */

@Service
public class ParserServiceImpl implements ParserService{
    @Override
    public Map<String, String> parseURLs(InputURLsDTO inputURLsDTO) {
        Map<String,String> res = new HashMap<>();
        for (String url : inputURLsDTO.getInputURLs()) {
            try {
                Document document = Jsoup.connect(url).get();
                String text = document.text();
                res.put(url, text);
            } catch (IOException e) {
                res.put(url, "nothing found for this URL");
            }
        }
        return res;
    }
}
