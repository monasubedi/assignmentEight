package ProblemThree;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class MainThree {
    public static void main(String[]args){
        List<Marketing> marketings = new ArrayList<>();
        Marketing m1 = new Marketing("Mona Subedi","Product One",3000);
        Marketing m2 = new Marketing("Prakash Subedi","Product Two",4000);
        Marketing m3 = new Marketing("Meera Subedi","Product Three",5000);
        marketings.add(m1);
        marketings.add(m2);
        marketings.add(m3);
        marketings.remove(m1);

        Collections.sort(marketings, new Comparator<Marketing>() {
            @Override
            public int compare(Marketing o1, Marketing o2) {
              if(o1.getSalesAmount() > o2.getSalesAmount()){
                  return 1;
              }
              else if(o1.getSalesAmount() < o2.getSalesAmount()){
                  return -1;
              }
              else {
                  return 0;
              }
            }
        });


       // System.out.println(marketings);

        List<Marketing> listMoreThan1000 = listMoreThan1000(marketings);
        System.out.println(listMoreThan1000);

    }
    public static List<Marketing> listMoreThan1000(List<Marketing> list){

        Collections.sort(list, new Comparator<Marketing>() {
            @Override
            public int compare(Marketing o1, Marketing o2) {
               return o1.getEmployeename().compareTo(o2.getEmployeename());
            }
        });

        List<Marketing> newList = new ArrayList<>();

        for(Marketing m: list){
            if(m.salesamount > 1000){
                newList.add(m);
            }
        }

        return newList;
    }
}
