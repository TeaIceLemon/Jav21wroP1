package sda.com.DesignPatterns.a_creation.Factory.CarFactory;

public class FactoryMain {
    static Car getCar(String type, String engine, String bodyType, String brand){
        if ("Family".equalsIgnoreCase(type)) {
            return new FamilyVehicle(engine, bodyType, brand);
        }else if("Utility".equalsIgnoreCase(type)){
            return new UtilityVehicle(engine, bodyType,brand);
        }
        else return null;
    }

    public static void main(String[] args) {
        Car car1 = getCar("Utility","1.2 gas", "sedan", "toyota");
        Car car2 = getCar("family", "1.4 TDI", "combi", "mercedes");
        System.out.println(car1);
        System.out.println(car2);
    }
}
