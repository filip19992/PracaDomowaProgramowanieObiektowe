package zadania.domowe.java.programowaniekomputerow.zadanie2;

import java.util.Arrays;
import java.util.Random;

public class NajwiekszyElementTablicy {
    public static void main(String[] args) {

        Random random = new Random();
        int[] numbers = new int[10];

        for(int i = 0; i < numbers.length; i++) {
            numbers[i] = random.nextInt(101);
        }

        System.out.println(Arrays.toString(Arrays.stream(numbers).toArray()));
        System.out.println(znajdzNajwieksza(numbers));

    }


    static int znajdzNajwieksza(int[] numbers) {
        int maxValue=0;
      for(int i = 0;i < numbers.length-1;i++) {

          if(numbers[i] > numbers[i+1] && numbers[i] > maxValue) {
               maxValue = numbers[i];
          }
          }
        return maxValue;
    }
    }


