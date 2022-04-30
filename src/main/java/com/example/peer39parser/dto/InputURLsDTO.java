package com.example.peer39parser.dto;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;

import java.io.Serializable;
import java.util.Set;
/*
    dto object with URLs receiving from client
 */
@Getter
@AllArgsConstructor
@NoArgsConstructor
public class InputURLsDTO implements Serializable {
    private Set<String> inputURLs;
}
