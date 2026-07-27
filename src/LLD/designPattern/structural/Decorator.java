package LLD.designPattern.structural;

public class Decorator {

    /**
     * The Decorator Design Pattern is a Structural Design Pattern that allows you to add new functionality to an
     * object dynamically without modifying its existing code.
     *
     * Component Interface
     * Base Class Interface - Coffee Shop
     */
    public interface Coffee{
        public double getCost();
        public String getDescription();
    }

    // Concrete Component -> Base Class - 1
    public static class Espresso implements Coffee{
        @Override
        public double getCost() {
            return 50;
        }
        @Override
        public String getDescription() {
            return "Espresso";
        }
    }

    // Concrete Component -> Base Class - 2
    public static class Cappuccino implements Coffee{
        @Override
        public double getCost() {
            return 50;
        }
        @Override
        public String getDescription() {
            return "Cappuccino";
        }
    }


    // Abstract Decorator Class
    public static abstract class CoffeeDecorator implements Coffee{

        protected Coffee coffee;

        public CoffeeDecorator(Coffee coffee) {
            this.coffee = coffee;
        }
    }

    public static class MilkDecorator extends CoffeeDecorator {
        public MilkDecorator(Coffee coffee) {
            super(coffee);
        }

        public double getCost() {
            return coffee.getCost()+10;
        }

        public String getDescription() {
            return coffee.getDescription() + ", Milk";
        }
    }

    public static class SugarDecorator extends CoffeeDecorator {
        public SugarDecorator(Coffee coffee) {
            super(coffee);
        }

        public double getCost() {
            return coffee.getCost()+5;
        }

        public String getDescription() {
            return coffee.getDescription() + ", Sugar";
        }
    }

    public static class WhippedCreamDecorator extends CoffeeDecorator {
        public WhippedCreamDecorator(Coffee coffee) {
            super(coffee);
        }

        public double getCost() {
            return coffee.getCost()+15;
        }

        public String getDescription() {
            return coffee.getDescription() + ", Whipped cream";
        }
    }

    public static void main(String[] args) {

        Coffee coffee = new Espresso();

        coffee = new MilkDecorator(coffee);
        coffee = new SugarDecorator(coffee);
        coffee = new WhippedCreamDecorator(coffee);

        System.out.println(coffee.getDescription());
        System.out.println("Cost: $" + coffee.getCost());
    }



}
