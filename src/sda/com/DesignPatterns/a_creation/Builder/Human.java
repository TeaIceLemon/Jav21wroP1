package sda.com.DesignPatterns.a_creation.Builder;

public class Human {
    // wymagane parametry
    private String sex;
    private String name;
    private int age;

    //parametry opcjonalne
    private boolean isSinner;
    private boolean isWorshippingGod;

    private Human(HumanBuilder builder){
        this.sex = builder.sex;
        this.name = builder.name;
        this.age = builder.age;
        this.isSinner = builder.didCommitSin;
        this.isWorshippingGod = builder.isWorshipper;
    }
    static class HumanBuilder{
        //wymaganeParametry
        private String sex;
        private String name;
        private int age;
        //opcjonalne
        private boolean didCommitSin;
        private boolean isWorshipper;

        public HumanBuilder(String sex, String name, int age) {
            this.sex = sex;
            this.name = name;
            this.age = age;
        }

        public HumanBuilder isSinner(boolean didCommitSin) {
            this.didCommitSin = didCommitSin;
            return this;
        }

        public HumanBuilder isWorshipper(boolean isWorshipper) {
            this.isWorshipper = isWorshipper;
            return this;
        }
        public Human build(){
            return new Human(this);
        }
    }
    public String getSex() {
        return sex;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public boolean isSinner() {
        return isSinner;
    }

    public boolean isWorshippingGod() {
        return isWorshippingGod;
    }
}
