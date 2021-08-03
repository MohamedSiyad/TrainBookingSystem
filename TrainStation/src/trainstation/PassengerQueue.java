package trainstation;
import java.util.Scanner;
public class PassengerQueue {

    static Passenger[] queueArray = new Passenger[TrainStation.WAITING_ROOM_CAPACITY];
    static int first = 0;
    static int last = 0;
    int maxStayInQueue = 0; //num of secs that passenger stayed longest in queue
    int maxLength = 0; //maximum length of that was reached by queue, most ppl at one point

    public void add() {
        //if queue is not full - check for circular queue
        if (queueArray[last] != null) 
        {
            System.out.println("The queue is full");
            TrainStation.displayMenu();
        }
        else
        {
        //add the next passenger
        Scanner firstnameinput = new Scanner(System.in);
        Scanner surnameinput = new Scanner(System.in);
        System.out.println("Add passenger first name");
        Passenger.firstname = firstnameinput.next();
        System.out.println("Add passenger last name");
        Passenger.surname = surnameinput.next();
        Passenger next = null;
        queueArray[last] = next;
        
        
        
        last++;

        //check maxLength of queue and set it
        }
    }

    public Passenger remove() {
        //if queue array not empty then remove
        if (queueArray[last] == null) {
            System.out.println("The queue is empty");
        } else {
            Passenger removedPassenger = queueArray[first];
            //array empty, no passengers, return null
            return removedPassenger;
        }
        return null;
    }

    public void display() {
        for (int i = first; i < last; i++) {
            queueArray[i].display();
        }
        if (queueArray[last] == null) {
            System.out.println("The queue is empty");
        }
    }

    //
}
