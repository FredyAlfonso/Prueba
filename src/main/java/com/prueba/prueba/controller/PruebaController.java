package com.prueba.prueba.controller;

import com.prueba.prueba.DTO.RequestDTO;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/prueba")
public class PruebaController {
    @PostMapping
    public ResponseEntity<Object> prueba(@RequestBody RequestDTO requestDTO){
        return ResponseEntity.ok(requestDTO);
    }
}
