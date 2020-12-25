package pattern_comand.commands;

import pattern_comand.Command;

public class LightOnCommand implements Command {

    Light light;

    public LightOnCommand(Light light) {
        this.light = light;
    }

    @Override
    public void execute() {
        System.out.println("Object Light/" + light + " is on");
    }

    @Override
    public void cancel() {
        System.out.println("Object Light/" + light + " is cancelled");
    }
}
