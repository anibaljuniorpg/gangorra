package com.anibaljunior.gangorra.service;

import org.springframework.stereotype.Service;

import com.anibaljunior.gangorra.model.dtos.GangorraRequestDTO;
import com.anibaljunior.gangorra.model.dtos.GangorraResponseDTO;

@Service
public class GangorraService {
    public GangorraResponseDTO calcularGangorra(GangorraRequestDTO requestDTO){
        float forca1 = requestDTO.peso1() * requestDTO.distancia1();
        float forca2 = requestDTO.peso2() * requestDTO.distancia2();
        if ( forca1 == forca2) {
            return new GangorraResponseDTO(true, "Equilibrado", 0);
        } else if(forca1 > forca2){
            return new GangorraResponseDTO(false, "Esquerdo", -15);
        } else {
            return new GangorraResponseDTO(false, "Direito", 15);
        }
    }
}
