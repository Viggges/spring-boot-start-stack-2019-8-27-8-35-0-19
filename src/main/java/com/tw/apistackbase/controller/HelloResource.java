package com.tw.apistackbase.controller;

import java.util.Map;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created on 18/08/2017.
 */
@RestController
@RequestMapping("/hello")
public class HelloResource {

    @GetMapping(path = "/{userName}")
    public ResponseEntity<String> getAll(@PathVariable String userName) {
        return ResponseEntity.ok("Hello:" + userName);
    }
    @GetMapping("/depiaodepiaodeyigepiao/a")
    public String lalala(String lalala){
    	return "depiaodepiaodepiaodeyigepiao";
    }
    @PostMapping("/stream")
    public String lalal(Map map) {
    	return (String) map.get("duanyiran");
    }

}
