public class BusTicket{
    private int ticketNo;
    private float ticketPrice;
    private float totalAmount;
    private Person person;   
/*    BusTicket(){//No argument Constructor
    }
    BusTicket(int ticketNo,float ticketPrice,Person person){//Parameterize Constructor
        this.ticketNo=ticketNo;
        this.ticketPrice=ticketPrice;
        this.person=person;
    }
 */ 
 
    public int getTicketNo(){        return ticketNo;    }
    public float getTicketPrice(){        return ticketPrice;    }
    public float getTotalAmount(){        return totalAmount;    }
    public Person getPerson(){        return person;    }
    
    public void setTicketNo(int ticketNo){
        this.ticketNo=ticketNo;
    }
    public void setTicketPrice(float ticketPrice){
        this.ticketPrice=ticketPrice;
    }
    public void setPerson(Person person){
        this.person=person;
    }
    public void setTotalAmount(float totalAmount){
        this.totalAmount=totalAmount;
    }
    
    public void calculateTotal(){
        if(person.getAge()>=0 && person.getAge()<16){
            this.totalAmount=ticketPrice*0.5f;
        }
        else if(person.getAge()>=60){
            this.totalAmount=ticketPrice*0.75f;
        }
        else if(person.getGender()=='F'||person.getGender()=='f'){
            this.totalAmount=ticketPrice*0.9f;
        }
        else
            this.totalAmount=ticketPrice;
    }
}
