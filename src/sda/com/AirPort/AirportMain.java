package sda.com.AirPort;

import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

public class AirportMain {
static Scanner in;
static Random rand;
    public static void main(String[] args) {
        in = new Scanner(System.in);
        makeAirports(ileLotnisk());
        Integer startingAirport = randomfly(ileLotnisk()); 
        Integer destinationPort = randomfly(ileLotnisk());
        newFlights(startingAirport,destinationPort);
    }

    private static void newFlights(Integer startingAirport, Integer destinationPort) {

    }

    private static int randomfly(int ileLotnisk) {
        return rand.nextInt(ileLotnisk);
    }

    private static ArrayList<Airport> makeAirports(int ileLotnisk){
        ArrayList<Airport> airportsList = new ArrayList<>();
        for(int i =0; i<ileLotnisk;i++){
            airportsList.add(new Airport());
        }
        return airportsList;
    }
    private static int ileLotnisk(){
        System.out.println("ile lotnisk symulujemy?");
        return in.nextInt();
    }
}
