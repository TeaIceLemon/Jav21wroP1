package sda.com.PrimeNumber;

import java.util.LinkedList;
import java.util.List;

public class PrimeNumber {
    public boolean isPrime(int n){
        boolean flag = true;
        int m = n-1;
        outerloop:
        while(m>=2){
            if(n%m==0){
                flag = false;
                break outerloop;
            }
            m--;
        }
        return flag;
    }
    public List<Integer> generatePrimeList(int x){
        List<Integer> primeList = new LinkedList();
        while(x>=2){
            if(isPrime(x)){
                primeList.add(x);
            }
            x--;
        }
        return primeList;
        }
    }

