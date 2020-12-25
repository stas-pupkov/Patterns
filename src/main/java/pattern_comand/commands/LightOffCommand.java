package pattern_comand.commands;

import pattern_comand.Command;

public class LightOffCommand implements Command {

    Light light;

    public LightOffCommand(Light light) {
        this.light = light;
    }

    @Override
    public void execute() {
        System.out.println("Object Light/" + light + " is off");
    }

    @Override
    public void cancel() {
        System.out.println("Object Light/" + light + " is cancelled");
    }
}
