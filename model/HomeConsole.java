package model;

import java.awt.Color;
import java.awt.Graphics2D;
import java.awt.Font;

import java.util.ArrayList;

public class HomeConsole extends GameConsole
{
    private ArrayList<String> features;
    public HomeConsole(String name, String id) {
        super(name, id);
        features = new ArrayList<>();
    }

    public void addFeatures(String c)
    {
        features.add(c);
    }

    @Override
    public void display()
    {
        super.display();
        int no = 1 ; 
        for( var c : features)
        {
            System.out.println("\t" + no + ". " + c);
            no++;
        }
    }
    
    @Override
    public void render(Graphics2D g2)
    {
        super.render(g2);
        g2.setColor(Color.WHITE);
        g2.setFont(new Font("New Courier" , Font.BOLD , 12));
        int no = 1;
        for(var c: features)
        {
            g2.drawString(no + ". " + c, 80, no * 50 + 100);
            no++;
        }
    }
}
