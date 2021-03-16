package view;

import java.awt.BorderLayout;
import java.awt.Container;
import java.awt.GridLayout;
import java.awt.Dimension;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class MenuScreen 
{
    private JFrame window;
    
    public MenuScreen(JFrame window)
    {
        this.window = window;
    }

    public void init()
    {
        Container cp = window.getContentPane();

        JPanel menuPanel = new JPanel();
        menuPanel.setLayout(new GridLayout(2,1));
        menuPanel.setPreferredSize(new Dimension(400,200));

        JButton startButton = new JButton("Start");
        menuPanel.add(startButton);

        cp.add(BorderLayout.CENTER, menuPanel);

        startButton.addActionListener(event -> {
            window.getContentPane().removeAll();
            var panel = new ConsolePanel(window);
            panel.init();
            window.pack();
            window.revalidate();
        });
    }
}
