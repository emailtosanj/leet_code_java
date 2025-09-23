package com.java.featurs.dailysales;

import java.util.List;

public record TotalSalesRecord(String saleDate, String makeName, List<Integer> leadIds, List<Integer> partnerIds) {
}
