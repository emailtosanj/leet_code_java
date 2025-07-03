package com.leetcode.hashing;

import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class DestinationCityTest {

    @Test
    void destCity_1() {

        List<List<String>> lst = List.of(List.of("London","New York"),List.of("New York","Lima"),List.of("Lima","Sao Paulo"));
        DestinationCity destinationCity = new DestinationCity();
        assertEquals("Sao Paulo", destinationCity.destCity(lst));
    }

    @Test
    void destCity_2() {

        List<List<String>> lst = List.of(List.of("B","C"),List.of("D","B"),List.of("C","A"));
        DestinationCity destinationCity = new DestinationCity();
        assertEquals("A", destinationCity.destCity(lst));
    }

    @Test
    void destCity_3() {

        List<List<String>> lst = List.of(List.of("A","Z"));
        DestinationCity destinationCity = new DestinationCity();
        assertEquals("Z", destinationCity.destCity(lst));
    }


}