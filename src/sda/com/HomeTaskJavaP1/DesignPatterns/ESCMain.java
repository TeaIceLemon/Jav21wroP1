package sda.com.HomeTaskJavaP1.DesignPatterns;

import javafx.scene.shape.ClosePath;

import java.io.*;
import java.util.Scanner;

/* Emergency Service Coordinator
    by Piotr Wieczorek
    07.2019
 */
public class ESCMain {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Emergency emergency = new Emergency();
        Dispacher dispacher = new Dispacher(emergency);
        Deparment fireDepartment = new FireDeparment(emergency);
        Deparment policeDepartment = new PoliceDeparment(emergency);
        Deparment medicalDepartment = new MedicalDeparment(emergency);
        File file = new File("C:\\Users\\Piotrek\\SDA\\Jav21wroP1\\src\\sda\\com\\HomeTaskJavaP1\\DesignPatterns\\emergency.txt");
        System.out.println("List of Emergencies");
        try(Scanner in = new Scanner(file)){
            while(in.hasNext()){
                System.out.println(in.nextLine());
            }
        }catch (FileNotFoundException e){
            System.out.println(e.getMessage());
            System.out.println("there is no such file ");
        }
        boolean loop = true;
        while(loop) {
            try {
                System.out.println("Hello what kind of emergence happened ? ");
                int input = scanner.nextInt();
                if (input<=0 || input>9) throw new IllegalArgumentException();
                dispacher.confirmEmergency(input);
                loop = false;

            }catch(IllegalArgumentException e){
                 System.out.println("wrong number, hurry up!");
            }
        }
        System.out.println("You helped save life today");



    }
}
