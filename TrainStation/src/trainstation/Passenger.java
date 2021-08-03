
package trainstation;


public class Passenger {
    static String firstname;
    static String surname;
    int secondsInQueue;
    
    
    Passenger(String firstname, String surname)
    {
        this.firstname = firstname;
        this.surname = surname;
        secondsInQueue = 0;
    }
    
    String getName()
    {
        return firstname + " " + surname;
    }
    
    public void setName(String firstname, String surname)
    {
        this.firstname = firstname;
        this.surname = surname;
    }

    void display() 
    {
        System.out.println(firstname + " " + surname + " " + secondsInQueue);
    }
}
