package issues03.i210.countTriplets;

import java.io.*;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Stream;

import static java.util.stream.Collectors.toList;

public class Solution {

    // Complete the countTriplets function below.
    static long countTriplets(List<Long> arr, long r) {
        Map<Long, Long> potential = new HashMap<>();
        Map<Long, Long> counter = new HashMap<>();
        long count = 0;
        for (long a : arr) {

            if (counter.containsKey(a / r) && a % r == 0) {
                count = count + counter.get(a / r);
            }

            if (potential.containsKey(a / r) && a % r == 0) {
                counter.put(a, counter.getOrDefault(a, 0L) + potential.get(a / r));
            }

            potential.put(a, potential.getOrDefault(a, 0L) + 1);
        }
        return count;
    }
//        long result = 0;
//        Map<Long, Long> myMap = new LinkedHashMap<>();
//
//        for (long a : arr) {
//            if (myMap.containsKey(a)) {
//                myMap.put(a, myMap.get(a) + 1);
//            } else {
//                myMap.put(a, 1L);
//            }
//        }
//
//        for (Long aLong : myMap.keySet()) {
//            if (myMap.containsKey(aLong * r) && myMap.containsKey(aLong * r * r)) {
//                result = result + myMap.get(aLong) * myMap.get(aLong * r) * myMap.get(aLong * r * r);
//            }
//        }
//
////        for (int i = 0; i < arr.size() - 2; i++) {
////            for (int j = i + 1; j < arr.size() - 1; j++) {
////                if (arr.get(i) * r == arr.get(j)) {
////                    for (int k = j + 1; k < arr.size(); k++) {
////                        if (arr.get(j) * r == arr.get(k)) {
////                            result++;
////                        }
////                    }
////                }
////            }
////        }
//        return result;
//    }

    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter("D:\\JavaTest\\Exercises\\src\\issues03\\i210\\countTriplets\\file.txt"));

        String[] nr = bufferedReader.readLine().replaceAll("\\s+$", "").split(" ");

        int n = Integer.parseInt(nr[0]);

        long r = Long.parseLong(nr[1]);

        List<Long> arr = Stream.of(bufferedReader.readLine().replaceAll("\\s+$", "").split(" "))
                .map(Long::parseLong)
                .collect(toList());

        long ans = countTriplets(arr, r);

        bufferedWriter.write(String.valueOf(ans));
        bufferedWriter.newLine();

        bufferedReader.close();
        bufferedWriter.close();
    }
}



/*
https://www.hackerrank.com/challenges/count-triplets-1/problem?h_l=interview&playlist_slugs%5B%5D=interview-preparation-kit&playlist_slugs%5B%5D=dictionaries-hashmaps

 */