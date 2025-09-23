package com.java.featurs.dailysales;

import java.time.LocalDate;

public record DailySaleRecord(String saleDate, String makeName, Integer leadId, Integer partnerId) {
}
