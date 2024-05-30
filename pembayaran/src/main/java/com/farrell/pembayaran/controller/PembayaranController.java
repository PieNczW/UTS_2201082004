/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.farrell.pembayaran.controller;

import com.farrell.pembayaran.model.Pembayaran;
import com.farrell.pembayaran.service.PembayaranService;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 *
 * @author amali
 */
@RestController
@RequestMapping("api/v1/pembayaran")
public class PembayaranController {
   
    @Autowired
    private PembayaranService pembayaranService;
            
    @GetMapping
    public List<Pembayaran> getAll(){
    return pembayaranService.getAll();
    }
    
    @GetMapping(path = "{id}")
    public Pembayaran getPembayaranById(@PathVariable("id") Long Id){
        return pembayaranService.getPembayaranById(Id);
    }
    
    @PostMapping
    public void insert(@RequestBody Pembayaran pembayaran){
        pembayaranService.insert(pembayaran);
    }
    
   
    }