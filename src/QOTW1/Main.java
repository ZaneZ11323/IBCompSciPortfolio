package QOTW1;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
public class Main {
    public static void main (String [] args){

        List<Integer> pax = new ArrayList<>();
        pax.add(100);pax.add(200);pax.add(300);
        int[] p_array = new int[pax.size()];
        for (int i = 0; i < pax.size(); i++) {
            p_array [i] = pax.get(i);


        }
        System.out.println(Arrays.toString(p_array));

        int gPax=0;
        int gDay=0;

        int[] averagePassengers = new int[7];
        for (int j = 0; j < p_array.length; j++) {
            averagePassengers[j%7]+=p_array[j];


        }
        System.out.println(Arrays.toString(averagePassengers));
        for (int j = 0; j < 7; j++) {

            int divisor= p_array.length/7;
            if(p_array.length%7>j){
                divisor+=1;
            }
            if (divisor>0) {
                p_array[j] /= divisor;

            }
            if (averagePassengers[j]>gPax){
                gPax=averagePassengers[j];
                gDay=j;
            }
        }
      System.out.println(Arrays.toString(averagePassengers));
        System.out.println(convert(gDay));

    }

     public static String convert(int day){
        switch (day){
            case 1: return "Mon";
            case 2: return "tue";
            case 3: return "Wed";
            case 4: return "thurs";
            case 5: return "Fri";
            case 6: return "sat";
            case 7: return "sun";

        }
      //from Jander 15 ""
         return "invalid";

    }


}
