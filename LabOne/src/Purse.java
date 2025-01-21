import java.util.Map;

public class Purse {
  Map<Denomination,Integer> cash; //represents the money in the purse
    public void add(Denomination d, int amount) {
        //Adds a number of a particular dem=nomination
        cash.put(d, amount);
    }
    public double remove(Denomination d, int amount) {
        //removes the money in the purse and returns that amount
        double removed = d.amt * amount;
        cash.remove(d, amount);
        return removed;
    }
    public double getValue() //returns the amount of money in the purse
    {
        return 0.0;
    }
    public String toString()//returns a string representation of the purse and its contents
    {
        return "money";
    }

}

