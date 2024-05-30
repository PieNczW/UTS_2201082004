/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.farrell.pembayaran.service;

import com.farrell.pembayaran.model.Pembayaran;
import com.farrell.pembayaran.repository.PembayaranRepository;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 *
 * @author amali
 */
@Service
public class PembayaranService {

    public static void update (Long orderId, String mode_pembayaran, int ref_number, String tgl_bayar, String status, double total) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

@Autowired

private  PembayaranRepository pembayaranRepository;

    public PembayaranService(PembayaranRepository pembayaranRepository) {
        this.pembayaranRepository = pembayaranRepository;

    }
    
    public List<Pembayaran> getAll(){
        return pembayaranRepository.findAll();
    }
    
    public Pembayaran getPembayaranById(Long id){
        return pembayaranRepository.getReferenceById(id);
    }
    
    public void insert(Pembayaran pembayaran){
     pembayaranRepository.save(pembayaran);
    }
    
    public void delete(Long id){
        pembayaranRepository.deleteById(id);
    }
    

}

