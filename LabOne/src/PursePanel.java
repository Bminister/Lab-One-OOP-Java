import java.awt.*;
import java.awt.image.ImageObserver;
import java.util.Map;
import javax.swing.*;

public class PursePanel extends JPanel {
    private Purse purse; //represents the amount to display
    //constructor
    public PursePanel(){
        purse = new Purse();
    }
    public void setPurse(Purse p){
        this.purse = p;
    }
    @Override //needed when using super
    public void paintComponent(Graphics g) //holds logic for displaying purse contents
    {
        super.paintComponent(g);
        ImageObserver observer;
        int y = 10;


        for (Denomination d : purse.cash.keySet()) {
            if (purse.cash.get(d) > 0) {
                g.drawString(d.img(), 20, y);
                y += 20;
            }
        }
    }
}
