import java.util.Scanner;
public class TestMain{
    
    public static BusTicket getTicketDetails(){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the passenger name:");
        //String _name=sc.nextLine();
        String name=sc.nextLine();
        System.out.println("Enter the gender(M or F / m or f):");
        char gender=sc.next().charAt(0);
        System.out.println("Enter the age:");
        int age =sc.nextInt();
        System.out.println("Enter the ticket no:");
        int ticketNo =sc.nextInt();
        System.out.println("Enter the ticket price:");
        float ticketPrice=sc.nextFloat();
        
        Person person = new Person();
        person.setName(name);
        person.setGender(gender);
        person.setAge(age);
        BusTicket bus = new BusTicket();
        bus.setTicketNo(ticketNo);
        bus.setTicketPrice(ticketPrice);
        bus.setPerson(person);
        return bus;
    }
    
    public static void main(String[] args){   
        BusTicket bus= new BusTicket();
        bus = TestMain.getTicketDetails();
        bus.calculateTotal();
        System.out.println("Ticket no:"+bus.getTicketNo());
        System.out.println("Passenger Name:"+bus.getPerson().getName());
        System.out.println("Price of a ticket : "+bus.getTicketPrice());
        System.out.println("Total Amount : "+bus.getTotalAmount());
    }
}
