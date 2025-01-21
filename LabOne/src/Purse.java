import java.util.Map;
import java.util.HashMap;


public class Purse {
    public Purse() {
        //Initialize all cash values in a purse to 0
        final Denomination[] US_CURRENCIES = {
                new Denomination("Hundred-Dollar Note",100.0,"Bill","images/hundred.png"),//Change with the actual .png name
                new Denomination("Fifty-Dollar Note", 50.0,"Bill","images/fifty-dollar.png"),
                new Denomination("Twenty-Dollar Note", 20.0,"Bill","images/twenty-dollar.png"),
                new Denomination("Ten-Dollar Note", 10.0,"Bill","images/ten-dollar.png"),
                new Denomination("Five-Dollar Note", 5.0,"Bill","images/five-dollar.png"),
                new Denomination("One-Dollar Note", 10.0,"Bill","images/one-dollar.png"),
                new Denomination("Quarter", 0.25,"Coin","images/quarter.png"),
                new Denomination("Dime", 0.10, "Coin","images/dime.png"),
                new Denomination("Nickel", 0.05, "Coin","images/nickel.png"),
                new Denomination("Penny", 0.01, "Coin","images/penny.png"),
        };
        HashMap<Denomination, Integer> cash = new HashMap<>();
        for (Denomination d : US_CURRENCIES) {
            cash.put(d, 0);
        }
    }

    /*
    public void cash(){
        //Initialize all cash values in a purse to 0
        final Denomination[] US_CURRENCIES = {
                new Denomination("Hundred-Dollar Note",100.0,"Bill","images/hundred.png"),//Change with the actual .png name
                new Denomination("Fifty-Dollar Note", 50.0,"Bill","images/fifty-dollar.png"),
                new Denomination("Twenty-Dollar Note", 20.0,"Bill","images/twenty-dollar.png"),
                new Denomination("Ten-Dollar Note", 10.0,"Bill","images/ten-dollar.png"),
                new Denomination("Five-Dollar Note", 5.0,"Bill","images/five-dollar.png"),
                new Denomination("One-Dollar Note", 10.0,"Bill","images/one-dollar.png"),
                new Denomination("Quarter", 0.25,"Coin","images/quarter.png"),
                new Denomination("Dime", 0.10, "Coin","images/dime.png"),
                new Denomination("Nickel", 0.05, "Coin","images/nickel.png"),
                new Denomination("Penny", 0.01, "Coin","images/penny.png"),
        };
        HashMap<Denomination, Integer> cash = new HashMap<>();
        for (Denomination d : US_CURRENCIES) {
            cash.put(d, 0);
        }
    }

     */

    //add(type: Denomination, num: int): void  // adds a number of a particular denomination
    public void add(Denomination d, int amount)
    {

    }
}