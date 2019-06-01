package sda.com.HomeTaskJavaP1.PoorNetflix;

import java.util.Scanner;

public class Person {
    int age;
    char sex;

    public Person() {
        try(Scanner in = new Scanner(System.in)){
            System.out.println("Whats your age");
            this.age = in.nextInt();
            if(age<0) throw new IllegalArgumentException(" age can't be below 0 ");
            System.out.println("Whats your sex ? m - male, f - female");
            this.sex = in.next().charAt(0);
        }catch(IllegalArgumentException e){
            System.out.println(e.getMessage());
        }
    }

    public int getAge() {
        return age;
    }

    public char getSex() {
        return sex;
    }
    public void whatToWatch(){
        String[] maleTV = {"Action","Sport", "Documentaries"};
        String[] femaleTV = {"DanceWithTheStars","KitchenRevolutions", "SoapOpera"};
        if(age<18) System.out.println("you are gonna watch cartoons");
        else{
            int m = (int)(Math.random()*3);
            if(getSex() == 'm') System.out.println("you are gonna watch: " + maleTV[m]);
            else  System.out.println("you are gonna watch: " + femaleTV[m]);
        }

    }
}
