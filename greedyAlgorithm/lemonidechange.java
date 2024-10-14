package greedyAlgorithm;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class lemonidechange {

    public static boolean lemonadeChange(int[] bills) {
        List<Integer> list = new ArrayList<>();
        int n = bills.length;

        for(int i=0;i<n;i++){
            list.add(bills[i]);
            Collections.sort(list);
            if(bills[i]>5){
                bills[i] -= 5;
                for(int j=list.size()-1;j>0;j--){
                    if(bills[i]>=list.get(j)){
                        bills[i] = bills[i] - list.get(j);
                        list.remove(j);
                    }
                    if(bills[i]==0){
                        break;
                    }

                }
            }
        }
        int sum=0;

        for(int i=0;i<list.size();i++){
            sum = sum + list.get(i);
        }

        if(sum == n*5){
            return true;
        }
        return false;
    }

    public static void main(String[] args) {

        int[] arr = {5,5,5,5,10,5,10,10,10,20};
        System.out.println(lemonadeChange(arr));

        
    }
} 

