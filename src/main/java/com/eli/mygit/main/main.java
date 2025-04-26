package com.eli.mygit.main;

import com.eli.mygit.commands.CommandException;
import com.eli.mygit.commands.CommandParser;

import java.nio.file.Paths;

public class main {

    public static void main(String[] args) {
        CommandParser commandParser = new CommandParser();
        try {
            commandParser.commandHandler(args);
        }catch (CommandException e) {
            System.out.println(e);
        }



    }
}
