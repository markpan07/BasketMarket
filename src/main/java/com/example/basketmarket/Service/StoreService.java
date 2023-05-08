package com.example.basketmarket.Service;

import com.example.basketmarket.Model.Basket;
import org.springframework.stereotype.Service;

import java.util.Set;

@Service
public class StoreService {

    private final Basket basket;

    public StoreService(Basket basket) {
        this.basket = basket;
    }

    public void add(Set<Integer> id){
        basket.add(id);
    }

    public Set<Integer> get() {
        return basket.get();
    }
}
