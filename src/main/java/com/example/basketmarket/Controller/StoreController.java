package com.example.basketmarket.Controller;

import com.example.basketmarket.Service.StoreService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.Set;

@RestController
@RequestMapping(path = "/order")
public class StoreController {
    private final StoreService storeService;

    public StoreController(StoreService storeService) {
        this.storeService = storeService;
    }

    @GetMapping(path = "/add")
    public void add(@RequestParam("id") Set<Integer> id) {
        storeService.add(id);
    }

    @GetMapping(path = "/get")
    public Set<Integer> get() {
        return storeService.get();
    }
}
