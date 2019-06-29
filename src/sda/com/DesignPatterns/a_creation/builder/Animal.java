package sda.com.DesignPatterns.a_creation.builder;

public class Animal {
    //Wymagane parametry
    private String species;
    private String name;
    private int age;

    //opcjonalne
    private boolean isAgressive;
    private boolean isPet;

    public Animal(AnimalBuilder builder) {
        this.species = builder.species;
        this.name = builder.name;
        this.age = builder.age;
        this.isAgressive = builder.isAgressive;
        this.isPet = builder.isPet;
    }
    static class AnimalBuilder{
        private String species;
        private String name;
        private int age;

        //opcjonalne
        private boolean isAgressive;
        private boolean isPet;

        public AnimalBuilder(String species, String name, int age) {
            this.species = species;
            this.name = name;
            this.age = age;
        }
        public AnimalBuilder isAgressive(boolean isAgressive){
            this.isAgressive = isAgressive;
            return this;
        }
        public AnimalBuilder isPet(boolean isPet){
            this.isPet = isPet;
            return this;
        }
        public Animal build(){
            return new Animal(this);
        }

    }

    public String getSpecies() {
        return species;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public boolean isAgressive() {
        return isAgressive;
    }

    public boolean isPet() {
        return isPet;
    }
}
