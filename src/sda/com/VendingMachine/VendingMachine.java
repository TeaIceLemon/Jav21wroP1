package sda.com.VendingMachine;

import java.util.*;

public class VendingMachine {
    static Scanner in ;
    private final HashMap<String, Integer> map = new HashMap<>();
    private int money;
    private List<String> bought = new LinkedList<>();

    public VendingMachine() {
        map.put("cocaCola" ,2);
        map.put("pepsi" , 2);
        map.put("batonik",2);
        map.put("energetyk" , 3);
        map.put("ciasto", 5);
        map.put("kawa" ,2);
        map.put("kanapka" ,3);
        map.put("sok" ,2);
        map.put("woda" ,2);
    }
    public void showProducts(){
        System.out.println("Available products: ");
        for(String name : map.keySet()){
            System.out.println(name + " - " + map.get(name));
        }
    }
    public void inputCoin() {
        System.out.println("vending machine can only accept: 1zł , 2zł and 5zł coin");
        in = new Scanner(System.in);
        outerloop:
        while (true) {
            System.out.println("Put a coin into vending machine");
            int coin = in.nextInt();
            if (coin == 1 || coin == 2 || coin == 5) money += coin;
            else System.out.println("wrong coin!!!");
            System.out.println();
            System.out.println("Do you want to put more coins into vending machine?? [Y]es, [N]o");
            char ch = in.next().charAt(0);
            if (ch == 'n' || ch == 'N') break outerloop;
            if (ch == 'y' || ch == 'Y') continue;
            else if (ch != 'Y' || ch != 'y') System.out.println("wrong command");
        }
    }


    public void buyProduct(){
        showProducts();
        Scanner in = new Scanner(System.in);
            outerloop:
            while(true){
                System.out.println("what do you want to buy ?");
                String product = in.next().toLowerCase();
                if(map.containsKey(product)){
                    System.out.println("Product cost " + map.get(product));
                    if(money>= map.get(product)) {
                        money -= map.get(product);
                        bought.add(product);
                        System.out.println("you have " + money  + " zl left");
                    }else System.out.println("you dont have enough money");
                }
                System.out.println("Do you want to buy somenthing else ? [Y] or [N]");
                char ch = in.next().charAt(0);
                if(ch == 'n' || ch =='N') break outerloop;
        }

    }
    public void whatWasBought(){
        System.out.println("You bought: ");
        for(String product : bought){
            System.out.print(product + " ");
        }
        System.out.println("residue money :" + money);
    }

}
