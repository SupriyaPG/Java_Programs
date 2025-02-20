package exceptionHandling;

//thread can be handled with try catch but we can handle with Throw keyword also

public class uncheckedException {
    public static void main(String[] args) throws InterruptedException { //Throw exception

        System.out.println("Program started");
        System.out.println("Program in process ");

        Thread.sleep(5000);

        System.out.println("Program dome.");
        System.out.println("Finished program");
    }
}
