package view;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.util.OptionalInt;

import javax.swing.JPanel;

import model.ConsoleBank;
import model.GameConsole;

public class ConsoleCanvas extends JPanel
{
    private ConsolePanel panel;
    private int consoleIndex = -1 ;

    public ConsoleCanvas(ConsolePanel panel)
    {
        this.panel = panel;
        setPreferredSize(new Dimension(600,400));
        setBackground(Color.BLACK);
    }

    @Override
    public void paintComponent(Graphics g)
    {
        super.paintComponent(g);

        Graphics2D g2 = (Graphics2D) g;

        if(consoleIndex >= 0)
        {
            GameConsole c = ConsoleBank.database.get(consoleIndex);
            c.render(g2);
        }
    }

    public int getConsoleIndex()
    {
        return consoleIndex;
    }

    public boolean setUseTempDB()
    {
        return true;
    }

    public void setConsoleIndex(int index)
    {
        consoleIndex = index;
    }
    
}
