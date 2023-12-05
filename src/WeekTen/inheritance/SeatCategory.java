package WeekTen.inheritance;

public class SeatCategory extends Movie{
    private int ticketPrice;
    public SeatCategory(String name, String genre, int runtime, int ticketPrice){
        super(runtime, name, genre);
        this.ticketPrice = ticketPrice;

    }
    public int getTicketPrice(){
        return ticketPrice;
    }
    public void setTicketPrice(int ticketPrice){
        this.ticketPrice = ticketPrice;
    }

    @Override
    public String toString() {
        return String.format("Name: %s%nGenre: %d%nRuntime: %.2f%nPrice: %s%n", getName(), getGenre(), getRuntime(), getTicketPrice());


    }
}
