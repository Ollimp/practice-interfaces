package org.itstep;

import org.itstep.command.*;

import java.util.Arrays;
import java.util.Scanner;
import java.util.stream.Collectors;

public class App {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String command = "";
        Command com;
        while (true){
            command = input.nextLine();
            if (command.equals("help")){
                com = new HelpCommand();
                com.execute();
            } else if (command.equals("now")){
                com = new NowCommand();
                com.execute();
            } else if (command.startsWith("echo")){
                com = new EchoCommand();
                com.execute(command.substring(5));
            } else if (command.equals("exit")){
                com = new ExitCommand();
                com.execute();
            } else {
                System.out.println("Error!");
            }
        }
    }
}
