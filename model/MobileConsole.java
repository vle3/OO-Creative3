package model;

import java.awt.Graphics2D;
import java.awt.Font;
import java.awt.Color;

public class MobileConsole extends GameConsole
{
    public String screenSize;
    public String batteryLife;

    public MobileConsole(String name, String id, String screenSize, String batteryLife) {
        super(name, id);
        this.screenSize = screenSize;
        this.batteryLife = batteryLife;
    }

    @Override
    public void display()
    {
        super.display();
        System.out.println(screenSize + " " + batteryLife);
    }

    @Override
    public void render(Graphics2D g2)
    { 
        super.render(g2);
        g2.setColor(Color.WHITE);
        g2.setFont(new Font("New Courier" , Font.BOLD , 12));
        g2.drawString("Screen Size: " + screenSize 
        + " \t\t\t\t Battery Life: " + batteryLife, 180, 150);
    }
    
}
