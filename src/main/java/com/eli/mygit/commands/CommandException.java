package com.eli.mygit.commands;

public class CommandException extends Exception{
    public CommandException(String message){
        super(message);
    }

    public String toString(){
        return "fatal: " + this.getMessage();
    }
}
