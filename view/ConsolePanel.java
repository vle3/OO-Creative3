package view;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.border.Border;

import controller.ConsoleButtonListener;

import java.awt.BorderLayout;
import java.awt.Container;
import java.awt.GridLayout;

public class ConsolePanel 
{
    private JFrame window;    
    private JButton nextButton = new JButton("Next");
    private JButton prevButton = new JButton("Previous");
    private JButton randButton = new JButton("Random");

    private JTextField searchText = new JTextField(30);
    private JButton searchButton = new JButton("Search");

    private JButton exitButton = new JButton("Exit");

    private ConsoleCanvas canvas;

    public ConsolePanel(JFrame window)
    {
        this.window = window;
    }

    public void init()
    {
        Container cp = window.getContentPane();

        JPanel southPanel = new JPanel();
        southPanel.setLayout(new GridLayout(2,1));
        cp.add(BorderLayout.SOUTH, southPanel);

        JPanel south1 = new JPanel();
        south1.add(new JLabel("Search for: "));
        south1.add(searchText);
        south1.add(searchButton);
        southPanel.add(south1);

        JPanel south2 = new JPanel();
        south2.add(prevButton);
        south2.add(nextButton);
        south2.add(randButton);
        south2.add(exitButton);
        southPanel.add(south2);

        canvas = new ConsoleCanvas(this);
        cp.add(BorderLayout.CENTER, canvas);

        ConsoleButtonListener listener = new ConsoleButtonListener(this);
        nextButton.addActionListener(listener);
        prevButton.addActionListener(listener);
        randButton.addActionListener(listener);
        exitButton.addActionListener(listener);
        searchButton.addActionListener(listener);
    }

    public JFrame getWindow()
    {
        return window;
    }

    public JButton getPrevButton() {
        return prevButton;
    }

    public JButton getRandButton() {
        return randButton;
    }
   
    public JButton getNextButton() {
        return nextButton;
    }

    public JTextField getSearchText() {
        return searchText;
    }

    public JButton getSearchButton() {
        return searchButton;
    }

    public ConsoleCanvas getCanvas() {
        return canvas;
    }

    public JButton getExitButton() {
        return exitButton;
    }
}
