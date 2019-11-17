package com.example.demo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/price")
public class PriceController {

    @Autowired
    PriceService priceService;

    @GetMapping
    public int getPrice(){

        return priceService.generateRandomPrice();
    }
}
