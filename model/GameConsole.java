package model;

import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics2D;

public class GameConsole 
{
    public String name; 
    public String id;
    
    public GameConsole(String name, String id)
    {
        this.name = name; 
        this.id = id;
    }

    public void display()
    {
        System.out.println(name + " " + id) ;
    }

    public void render(Graphics2D g2) 
    {
        g2.setColor(Color.YELLOW);
        g2.setFont(new Font("New Courier" , Font.BOLD, 14));
        g2.drawString(name + " " + id, 50 , 100);
    }
}
