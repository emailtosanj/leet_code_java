package com.leetcode.hashing;

public class LeastNumberOfWords {

    public int maxNumberOfBalloons(String text) {


        if(text.length() < 7)
        {
            return 0;
        }

        int[] freq = new int[128]; // this would to the range of constraint bound for letters ascii value of latin chars 65-128
        char[] arr = text.toCharArray();



        for(char c : arr) //this
        {
            if(c == 'b' || c =='a' || c == 'l' || c =='o' || c == 'n')
                freq[c]++;
        }

        int minFreq;

        // Get the frequencies
        int abFreq = Math.min(freq['b'], freq['a']);
        int singleLetterFreq = Math.min(freq['n'], abFreq);
        int loLetterFreq = Math.min(freq['l']/2, freq['o']/2);
        minFreq = Math.min(singleLetterFreq , loLetterFreq);


        // the stream way this is not highlight performing as its iterating and does a lookups having time and space complexity of O(n)
        /**Map<Integer, Long> mp = text.chars().boxed().collect(Collectors.groupingBy(Function.identity(), Collectors.counting()));
        Optional<Map.Entry<Integer, Long>> optionalMapEntry = mp.entrySet().stream().min(Map.Entry.comparingByValue());
        if(optionalMapEntry.isPresent())
        {
           Map.Entry<Integer, Long> entry = optionalMapEntry.get();
           minFreq = (int)entry.getValue().intValue(); // assuming its not overflowing as per constraints
        }*/

        //Full code with functional style
        /**
         *     // Step 1: Create a frequency map of only the characters we care about.
         *         Map<Character, Long> freqMap = text.chars()
         *                 .mapToObj(c -> (char) c)
         *                 .filter(c -> "balloon".indexOf(c) != -1)
         *                 .collect(Collectors.groupingBy(c -> c, Collectors.counting()));
         *
         *         // Step 2: Stream over the required unique letters, calculate the potential
         *         // number of "balloons" each can support, and find the minimum.
         *         return "balon".chars()
         *                 .map(c -> {
         *                     long count = freqMap.getOrDefault((char) c, 0L);
         *                     // For 'l' and 'o', the number of instances is count / 2
         *                     if (c == 'l' || c == 'o') {
         *                         return (int) (count / 2);
         *                     }
         *                     // For 'b', 'a', 'n', the number of instances is just the count
         *                     return (int) count;
         *                 })
         *                 .min() // Find the minimum of the calculated instances
         *                 .orElse(0); // If the stream is empty (e.g., no required letters found), return 0.
         *
         *                 // ABove code functional style is O(n) time and O(1) memory
         */

        return minFreq;
    }



}
