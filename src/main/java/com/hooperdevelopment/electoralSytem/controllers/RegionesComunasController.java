package com.hooperdevelopment.electoralSytem.controllers;

import com.hooperdevelopment.electoralSytem.dao.RegionesComunasDao;
import com.hooperdevelopment.electoralSytem.models.RegionesComunas;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.Collections;
import java.util.List;
@CrossOrigin(origins = "http://localhost:5173")
@RestController
@RequestMapping("/regiones")
public class RegionesComunasController {

    private final RegionesComunasDao regionesComunasDao;

    @Autowired
    public RegionesComunasController(RegionesComunasDao regionesComunasDao) {
        this.regionesComunasDao = regionesComunasDao;
    }
    @RequestMapping(method = RequestMethod.GET)
    public ResponseEntity<List<RegionesComunas>> getRegionesComunas() {
        try {
            List<RegionesComunas> regionesComunas = regionesComunasDao.getRegionesComunas();
            return ResponseEntity.ok(regionesComunas);
        } catch (Exception e) {
            e.printStackTrace(); // Loguea la excepción para obtener más detalles
            return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).build();
        }
    }

}
