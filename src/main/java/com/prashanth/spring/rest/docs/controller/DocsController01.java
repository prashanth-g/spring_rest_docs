package com.prashanth.spring.rest.docs.controller;

import java.util.Collections;
import java.util.Map;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class DocsController01 {

    @GetMapping("/")
    public Map<String, Object> index() {
        return Collections.singletonMap("message", "Docs 01");
    }

}
