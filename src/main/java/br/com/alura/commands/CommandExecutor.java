package br.com.alura.commands;

import br.com.alura.commands.Command;

public class CommandExecutor {

    public void executeCommand(Command command){
        command.execute();
    }
}
