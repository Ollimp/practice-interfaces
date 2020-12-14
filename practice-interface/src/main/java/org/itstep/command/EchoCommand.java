package org.itstep.command;

public class EchoCommand implements Command {
    @Override
    public void execute(String... args) {
        for (String str : args){
            System.out.print(str + " ");
            System.out.println();
        }
    }
}
