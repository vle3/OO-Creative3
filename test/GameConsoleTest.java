package test;

import java.io.Console;
import java.util.ArrayList;

import model.ConsoleBank;
import model.GameConsole;

public class GameConsoleTest 
{
    public static void main(String[] args) 
    {
        ArrayList<GameConsole> db = ConsoleBank.database;
        GameConsole c1 = db.get(0);
        GameConsole c2= db.get(1);
        GameConsole c3= db.get(2);
        GameConsole c4= db.get(3);

        for(var c: db )
        {
            c.display();
        }
    }
}
