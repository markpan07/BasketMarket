package com.example.basketmarket.Model;

import org.springframework.stereotype.Component;
import org.springframework.web.context.annotation.SessionScope;

import java.util.Collections;
import java.util.HashSet;
import java.util.Set;

@Component
@SessionScope
public class Basket {
    private final Set<Integer> idSet = new HashSet<>();

    public void add(Set<Integer> id) {
        idSet.addAll(id);
    }

    public Set<Integer> get() {
        return Collections.unmodifiableSet(idSet);
    }
}
