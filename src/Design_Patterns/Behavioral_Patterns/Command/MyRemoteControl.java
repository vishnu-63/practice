package Design_Patterns.Behavioral_Patterns.Command;

import java.util.Stack;

public class MyRemoteControl {
    ICommand command;
    Stack<ICommand> commandList;
    public MyRemoteControl() {
        this.commandList=new Stack<>();
    }
    public void setCommand(ICommand cmd) {
        command=cmd;

    }
    public void pressButton() {
        commandList.add(command);
        command.execute();

    }

    public void undoCommand() {
        if(!commandList.isEmpty()) {
            command=commandList.pop();
            command.undo();
        }
    }
}
