package trainstation;

import java.util.Scanner;

public class TrainStation {

    //implement fields here 
    static int WAITING_ROOM_CAPACITY = 30;

    private static Passenger[] WaitingRoom = new Passenger[WAITING_ROOM_CAPACITY];
    private static PassengerQueue trainQueue = new PassengerQueue();

    public static void main(String[] args) 
    {

        // Menu
        char menuchoice;
        Scanner in = new Scanner(System.in);
        do {
            displayMenu();
            System.out.println("Please choose an option");
            menuchoice = in.next().toLowerCase().charAt(0);
            switch (menuchoice) 
            {
                case 'a':
                    System.out.println("You chose to Add to queue");
                    addPassengerToTrainQueue();
                    break;
                case 'v':
                    System.out.println("You chose to view the queue");
                    viewPassengersInTrainQueue();
                    break;
                case 'd':
                    System.out.println("You chose to delete the queue");
                    deletePassengerInTrainQueue();
                    break;
                default:
                    System.out.println("You entered an invalid choice");
                    displayMenu();
            }
        } //Repeat until user presses 'q'
        while ((menuchoice != 'q'));
        System.out.println("Thank you and goodbye");
        // option A, V, D, S, L, R
        //testing adding and removing 
    }

    static void displayMenu() 
    {
        System.out.println("Welcome to the Eurostar train booking service");
        System.out.println("");
    }

    static void addPassengerToTrainQueue() 
    {
        trainQueue.add();
        
    }

    static void deletePassengerInTrainQueue() 
    {
        trainQueue.remove();
    }

    private static void viewPassengersInTrainQueue() 
    {
        trainQueue.display();
    }

}

//add the rest of methods

