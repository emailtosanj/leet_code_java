//You are given an integer array matches where matches[i] = [winneri, loseri] indicates that the player winneri defeated
//player loser in a match.

//Return a list answer of size 2 where:

//answer[0] is a list of all players that have not lost any matches.
//answer[1] is a list of all players that have lost exactly one match.
//The values in the two lists should be returned in increasing order.

//Note:

//You should only consider the players that have played at least one match.
//The testcases will be generated such that no two matches will have the same outcome.
package com.leetcode.hashing;

import java.util.*;
import java.util.concurrent.ConcurrentMap;
import java.util.stream.Collectors;

import static java.util.Locale.filter;
import static java.util.Map.entry;
import static java.util.stream.Collectors.groupingBy;

import static java.util.stream.Collectors.mapping;

public class PlayerWithZeroorOneLosses {

    public List<List<Integer>> findWinners(int[][] matches) {

        List<List<Integer>> zeroOneLossPlyr = new ArrayList<>();

        //Input: matches = [[1,3],[2,3],[3,6],[5,6],[5,7],[4,5],[4,8],[4,9],[10,4],[10,9]]

        List<Integer> zeroLoss  = new ArrayList<>();
        List<Integer> oneLoss  = new ArrayList<>();

        for(int[] match: matches) {
            int winner = match[0];
            int loser = match[1];
            zeroLoss.add(winner);
            oneLoss.add(loser);
        }

        // usage of mapMulti (java 16)--
//        List<Integer> zeroLossRet =   zeroLoss.stream().<Integer>mapMulti((i, consumer) -> {
//            if (!oneLoss.contains(i)) {
//                consumer.accept(i);
//            }
//        }).toList();

        /*List<Integer> zeroLossRet = zeroLoss.stream().parallel()
                .filter(i -> !oneLoss.contains(i))
                .toList().stream().distinct().sorted().toList();*/

        List<Integer> zeroLossRet = zeroLoss.stream().parallel()
                .collect(groupingBy(Integer::intValue, Collectors.counting()))
                .entrySet().stream().filter(entry -> entry.getValue() == 0)
                .map(Map.Entry::getKey)
                .sorted()
                .toList();


        //List<Integer> oneLossRet = oneLoss.stream().parallel().<Integer>mapMulti((i, consumer) -> {
        //  if (Collections.frequency(oneLoss, i) == 1) {
        //      consumer.accept(i);
        //  }
        //}).sorted().toList();

        List<Integer> oneLossRet = oneLoss.stream().parallel().collect(groupingBy(Integer::intValue, Collectors.counting()))
                .entrySet().stream()
                .filter(entry -> entry.getValue() == 1)
                .map(Map.Entry::getKey)
                .sorted()
                .toList();


        zeroOneLossPlyr.add(zeroLossRet.stream().toList());
        zeroOneLossPlyr.add(oneLossRet);

        return zeroOneLossPlyr;

    }
    public List<List<Integer>> findWinners_1(int[][] matches) {

        List<List<Integer>> zeroOneLossPlyr = new ArrayList<>();

        //Input: matches = [[1,3],[2,3],[3,6],[5,6],[5,7],[4,5],[4,8],[4,9],[10,4],[10,9]]

        List<Integer> zeroLoss  = new ArrayList<>();
        List<Integer> oneLoss  = new ArrayList<>();

        for(int[] match: matches) {
            int winner = match[0];
            int loser = match[1];
            zeroLoss.add(winner);
            oneLoss.add(loser);
        }

        // usage of mapMulti (java 16)--
//        List<Integer> zeroLossRet =   zeroLoss.stream().<Integer>mapMulti((i, consumer) -> {
//            if (!oneLoss.contains(i)) {
//                consumer.accept(i);
//            }
//        }).toList();

                 List<Integer> zeroLossRet = zeroLoss.stream().parallel()
                    .filter(i -> !oneLoss.contains(i))
                 .collect(groupingBy(Integer::intValue, Collectors.counting())).keySet().stream().sorted().toList();

//
//        List<Integer> zeroLossRet = zeroLoss.stream().parallel()
//                .filter(i -> !oneLoss.contains(i))
//                .toList().stream().toList();

       /* List<Integer> oneLossRet = oneLoss.stream().parallel().<Integer>mapMulti((i, consumer) -> {
            if (Collections.frequency(oneLoss, i) == 1) {
                consumer.accept(i);
            }
        }).sorted().toList();*/


        List<Integer> oneLossRet = oneLoss.stream().parallel().collect(groupingBy(Integer::intValue, Collectors.counting()))
                .entrySet().stream()
                .filter(entry -> entry.getValue() == 1)
                .map(Map.Entry::getKey)
                .sorted()
                .toList();

        zeroOneLossPlyr.add(zeroLossRet);
        zeroOneLossPlyr.add(oneLossRet);

        return zeroOneLossPlyr;

    }

}
