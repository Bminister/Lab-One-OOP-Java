public class Register {
    public Purse makeChange(double amt)
    {
        //takes an amt and returns a Purse containing that amount in the fewest number of bills and coins
        Purse p  = new Purse();
        double temp = amt;
        int NoteAmt;
        if (temp / 100 > 0)
        {
            NoteAmt = (int)(temp / 100);
            p.add(new Denomination("Hundred-Dollar Note",100.0,"Bill","images/hundred.png"),NoteAmt);
            temp -= temp % 100;
        }
        return p;
    }
    public static void main(String[] args) {
        //creates a register and demonstrates that it works

        Register r = new Register();
        Purse p = r.makeChange(300);
        System.out.println(p);

    }

}
