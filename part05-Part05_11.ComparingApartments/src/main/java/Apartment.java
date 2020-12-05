
public class Apartment {

    private int rooms;
    private int squares;
    private int pricePerSquare;

    public Apartment(int rooms, int squares, int pricePerSquare) {
        this.rooms = rooms;
        this.squares = squares;
        this.pricePerSquare = pricePerSquare;
    }
    
    public boolean largerThan(Apartment compared) {
        if (this.squares > compared.squares) {
            return true;
        }        
        return false;
    }
    
    public int priceDifference(Apartment compared) {
        if (this.moreExpensiveThan(compared)) {
            return this.pricePerSquare * squares - compared.pricePerSquare * compared.squares;
        } else { 
            return compared.pricePerSquare * compared.squares - this.pricePerSquare * this.squares;
        }        
    }
    
    public boolean moreExpensiveThan(Apartment compared) {
        if(this.pricePerSquare * squares > compared.pricePerSquare * compared.squares) {
           return true;
        }        
        return false;
    }
   
}
