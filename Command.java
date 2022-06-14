package Practice_1;

import java.util.Arrays;

public class Command {
    private CommandType commandId;
    private byte[] commandBody;
    private int userId;

    public Command(CommandType commandId, int userId, byte[] commandBody) {
        this.commandId = commandId;
        this.userId = userId;
        this.commandBody = commandBody;
    }

    public Command() {

    }

    public int getUserId() {
        return userId;
    }

    public CommandType getCommandId() {
        return commandId;
    }

    public void setCommandId(CommandType commandId) {
        this.commandId = commandId;
    }

    public byte[] getCommandBody() {
        return commandBody;
    }

    public void setCommandBody(byte[] commandBody) {
        this.commandBody = commandBody;
    }

    @Override
    public String toString() {
        return "Command{ commandId = " + commandId + ", commandBody = " + Arrays.toString(commandBody) + " }";
    }
}