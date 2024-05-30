/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.farrell.order.controller;

import com.farrell.order.model.Order;
import com.farrell.order.service.OrderService;
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
@RequestMapping("api/v1/order")
public class OrderController {
   
    @Autowired
    private OrderService orderService;
            
    @GetMapping
    public List<Order> getAll(){
    return orderService.getAll();
    }
    
    @GetMapping(path = "{id}")
    public Order getOrderById(@PathVariable("id") Long Id){
        return orderService.getOrderById(Id);
    }
    
    @PostMapping
    public void insert(@RequestBody Order order){
        orderService.insert(order);
    }
    
   
    }

    

