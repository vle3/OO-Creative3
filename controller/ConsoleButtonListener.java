package controller;

import java.awt.event.ActionListener;
import java.util.Random;
import java.util.stream.IntStream;

import javax.swing.JButton;
import javax.swing.JOptionPane;

import model.ConsoleBank;
import model.GameConsole;
import view.ConsolePanel;
import view.MenuScreen;

import java.awt.event.ActionEvent;

public class ConsoleButtonListener implements ActionListener
{
    private ConsolePanel panel;
    
    public ConsoleButtonListener(ConsolePanel panel)
    {
        this.panel = panel;
    }

    @Override
    public void actionPerformed(ActionEvent e) 
    {
        JButton button = (JButton)e.getSource();
        if(button == panel.getNextButton())
        {
            int index = panel.getCanvas().getConsoleIndex();
            ++index;
            if(index == ConsoleBank.database.size())
            {
                index = 0 ; 
            }
            panel.getCanvas().setConsoleIndex(index);
            panel.getCanvas().repaint();
        }
        else if (button == panel.getPrevButton())
        {
            int index = panel.getCanvas().getConsoleIndex();
            --index;
            if(index < 0)
            {
                index = ConsoleBank.database.size() - 1;
            }

            panel.getCanvas().setConsoleIndex(index);
            panel.getCanvas().repaint();
        }
        else if(button == panel.getRandButton())
        {
            var random = new Random();
            int index = random.nextInt(ConsoleBank.database.size());
            panel.getCanvas().setConsoleIndex(index);
            panel.getCanvas().repaint();
        }

        else if(button == panel.getExitButton())
        {
            panel.getWindow().getContentPane().removeAll();
            var menu = new MenuScreen(panel.getWindow());
            menu.init();
            panel.getWindow().pack();
            panel.getWindow().revalidate();
        }

        else if(button == panel.getSearchButton())
        {
            String key = panel.getSearchText().getText();
            int index = IntStream.range(0, ConsoleBank.database.size())
            .filter(i -> ConsoleBank.database.get(i).name.contains(key))
            .findFirst()
            .orElse(-1);
            if(index < 0)
            {
                JOptionPane.showMessageDialog(panel.getWindow(), "item not found");
            }
            panel.getCanvas().setConsoleIndex(index);
            panel.getCanvas().repaint();
        }
    }
    
}
