package com.anibaljunior.gangorra.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.anibaljunior.gangorra.model.dtos.GangorraRequestDTO;
import com.anibaljunior.gangorra.model.dtos.GangorraResponseDTO;
import com.anibaljunior.gangorra.service.GangorraService;

@CrossOrigin(origins = "*") 
@RestController
@RequestMapping("/api/gangorra")
public class GangorraController {
    @Autowired
    private GangorraService gangorraService;
    @PostMapping
    public GangorraResponseDTO calcularGangorra(@RequestBody GangorraRequestDTO body){
        return gangorraService.calcularGangorra(body);
    }
}
