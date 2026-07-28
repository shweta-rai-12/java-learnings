package LLD.designPattern.behavioral;

import dsa.linkedlist.LinkedListIntro;

import java.util.ArrayList;
import java.util.List;

public class Observer {

    /**
     * The Observer Design Pattern is a Behavioral Design Pattern used when one object (Subject) changes its
     * state and multiple dependent objects (Observers) need to be notified automatically.
     * It establishes a one-to-many dependency between objects.
     */
    public interface Observers{
        public void update(double price);
    }

    public interface Subject {
        public void addObserver(Observers o);
        public void removeObserver(Observers o);
        public void notifyObservers();
    }


    public static class Stock implements Subject {

        private List<Observers> observers = new ArrayList<Observers>();

        private double price;
        @Override
        public void addObserver(Observers o) {
            observers.add(o);
        }

        @Override
        public void removeObserver(Observers o) {
            observers.remove(o);
        }

        @Override
        public void notifyObservers() {
            for (Observers o : observers) {
                o.update(price);
            }
        }

        public void setPrice(double price) {
            this.price = price;
            notifyObservers();
        }
    }

    public static class MobileDisplay implements Observers {
        @Override
        public void update(double price) {
            System.out.println("Mobile Display: " + price);
        }
    }

    public static class WebDashboard implements Observers {
        @Override
        public void update(double price) {
            System.out.println("Web Dashboard: " + price);
        }
    }

    public static class EmailService implements Observers {
        @Override
        public void update(double price) {
            System.out.println("Email Service: " + price);
        }
    }

    // Client
    public static void main(String[] args) {
        Stock st = new Stock();
        st.addObserver(new MobileDisplay());
        st.addObserver(new WebDashboard());
        st.addObserver(new EmailService());


        st.setPrice(123.456);
        st.setPrice(135.456);

    }
}
