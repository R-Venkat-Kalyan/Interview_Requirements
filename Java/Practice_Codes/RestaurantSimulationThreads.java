public class RestaurantSimulationThreads {

    // Shared resource (kitchen) for synchronization example
    static class Kitchen {
        private boolean foodReady = false;

        // Called by chef to prepare food
        synchronized void prepareFood() {
            System.out.println("Chef: Preparing food...");
            try {
                Thread.sleep(1000); // simulate cooking
            } catch (InterruptedException e) {
                System.out.println("Chef was interrupted while cooking!");
            }
            foodReady = true;
            System.out.println("Chef: Food is ready!");
            notify(); // notify waiter 
        }

        // Called by waiter to serve food
        synchronized void serveFood() {
            while (!foodReady) {
                try {
                    System.out.println("Waiter: Waiting for chef to finish...");
                    wait(); // wait for chef
                } catch (InterruptedException e) {
                    System.out.println("Waiter was interrupted!");
                }
            }
            System.out.println("Waiter: Serving food to customer!");
            foodReady = false;
        }
    }
   
    // --- 1️⃣ Extending Thread class ---
    static class Chef extends Thread {
        Kitchen kitchen;

        Chef(Kitchen k) {
            this.kitchen = k;
            setName("ChefThread");
        }

        public void run() {
            for (int i = 1; i <= 2; i++) {
                kitchen.prepareFood();
                Thread.yield(); // Give chance to other threads
            }
        }
    }

    // --- 2️⃣ Implementing Runnable interface ---
    static class Waiter implements Runnable {
        Kitchen kitchen;

        Waiter(Kitchen k) {
            this.kitchen = k;
        }

        public void run() {
            Thread.currentThread().setName("WaiterThread");
            for (int i = 1; i <= 2; i++) {
                kitchen.serveFood();
            }
        }
    }

    // --- 3️⃣ Daemon Thread Example ---
    static class Cleaner extends Thread {
        Cleaner() {
            setDaemon(true); // Daemon thread runs in background
            setName("CleanerThread");
        }

        public void run() {
            try {
                while (true) {
                    System.out.println("Cleaner: Cleaning tables...");
                    Thread.sleep(800);
                }
            } catch (InterruptedException e) {
                System.out.println("Cleaner interrupted!");
            }
        }
    }

    public static void main(String[] args) throws InterruptedException {
        System.out.println("=== Restaurant Simulation Started ===");

        Kitchen kitchen = new Kitchen();

        Chef chef = new Chef(kitchen);
        Waiter waiterJob = new Waiter(kitchen);
        Thread waiter = new Thread(waiterJob);

        Cleaner cleaner = new Cleaner();

        // Setting priorities
        chef.setPriority(Thread.MAX_PRIORITY);
        waiter.setPriority(Thread.NORM_PRIORITY);

        cleaner.start(); // Daemon thread

        chef.start();
        waiter.start();

        // Using join() to wait for chef and waiter to finish
        chef.join();
        waiter.join();

        System.out.println("Main: Both chef and waiter finished.");

        // Check if threads are alive
        System.out.println("Chef alive? " + chef.isAlive());
        System.out.println("Waiter alive? " + waiter.isAlive());

        // Demonstrating interrupt
        cleaner.interrupt(); // interrupt daemon
        System.out.println("Main: Requested cleaner to stop.");

        System.out.println("=== Restaurant Simulation Ended ===");
    }
    
}
