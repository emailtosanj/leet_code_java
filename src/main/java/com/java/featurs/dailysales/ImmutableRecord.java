package com.java.featurs.dailysales;

import java.util.ArrayList;
import java.util.List;

public class ImmutableRecord {

    record Order(String isin, String side,  List<Integer> qty){

        public Order{
            qty = List.copyOf(qty);
        }

        @Override
        public List<Integer> qty() {
            return new ArrayList<>(qty);
        }
    }
    public static void main(String[] args) {

    }
}
