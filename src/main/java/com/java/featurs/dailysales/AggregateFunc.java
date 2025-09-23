package com.java.featurs.dailysales;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class AggregateFunc {


    public static void main(String[] args) {

        List<DailySaleRecord> lstDailySales =
        List.of(
            new DailySaleRecord("2020-12-8", "toyota",0,1),
            new DailySaleRecord("2020-12-8", "toyota",1,0),
            new DailySaleRecord("2020-12-8", "toyota",1,2),
            new DailySaleRecord("2020-12-7", "toyota",0,2),
            new DailySaleRecord("2020-12-7", "toyota",0,1),
            new DailySaleRecord("2020-12-8", "honda",1,2),
            new DailySaleRecord("2020-12-8", "honda",2,1),
            new DailySaleRecord("2020-12-7", "honda",0,1),
            new DailySaleRecord("2020-12-7", "honda",1,2),
            new DailySaleRecord("2020-12-7", "honda",2,1)
        );

        // Group by on make name
        //

        List<TotalSalesRecord> lstV = lstDailySales.stream().collect(
                Collectors.groupingBy(

                        ds -> /*new Object()*/ List.of(ds.makeName(), ds.saleDate()), //Function
                        Collectors.collectingAndThen(
                                Collectors.toList(),
                                lst -> new TotalSalesRecord(
                                        lst.getFirst().saleDate(),
                                        lst.getFirst().makeName(),
                                        lst.stream().map(DailySaleRecord::leadId).distinct().toList(),
                                        lst.stream().map(DailySaleRecord::partnerId).distinct().toList()
                                )
                        ))).values().stream().toList();

        System.out.println(lstV);



/*        List<TotalSalesRecord> lstTotalSales = new ArrayList<>(lstDailySales.stream()
                .collect(Collectors.groupingBy(

                        ds -> List.of("asasas", "test"), //Function

                        Collectors.collectingAndThen(

                                Collectors.toList(),

                                list -> new TotalSalesRecord(
                                        list.getFirst().saleDate(),
                                        list.getFirst().makeName(),
                                        list.stream().map(DailySaleRecord::leadId).distinct().toList(),
                                        list.stream().map(DailySaleRecord::partnerId).distinct().toList()
                                )
                        )

                ))
                .values());*/

//        System.out.println(lstTotalSales);



        /*
        +-----------+-----------+--------------+-----------------+
        | date_id   | make_name | unique_leads | unique_partners |
        +-----------+-----------+--------------+-----------------+
        | 2020-12-8 | toyota    | 2            | 3               |
        | 2020-12-7 | toyota    | 1            | 2               |
        | 2020-12-8 | honda     | 2            | 2               |
        | 2020-12-7 | honda     | 3            | 2               |
        +-----------+-----------+--------------+-----------------+
         */
        /*lstDailySales.stream().groupingBy(DailySaleRecord::makeName,DailySaleRecord::saleDate,
                Collectors.summingInt(DailySaleRecord::leadId));*/

        /*DailySaleRecord dailySales_1 = new DailySaleRecord("2020-12-8", "toyota",0,1);
        DailySaleRecord dailySales_2 = new DailySaleRecord("2020-12-8", "toyota",1,0);
        DailySaleRecord dailySales_3 = new DailySaleRecord("2020-12-8", "toyota",1,2);
        DailySaleRecord dailySales_4 = new DailySaleRecord("2020-12-7", "toyota",0,2);
        DailySaleRecord dailySales_5 = new DailySaleRecord("2020-12-7", "toyota",0,1);
        DailySaleRecord dailySales_6 = new DailySaleRecord("2020-12-8", "honda",1,2);
        DailySaleRecord dailySales_7 = new DailySaleRecord("2020-12-8", "honda",2,1);
        DailySaleRecord dailySales_8 = new DailySaleRecord("2020-12-7", "honda",0,1);
        DailySaleRecord dailySales_9 = new DailySaleRecord("2020-12-7", "honda",1,2);
        DailySaleRecord dailySales_10 = new DailySaleRecord("2020-12-7", "honda",2,1);*/






    }

}
