import com.designer.command.Command;
import com.designer.command.FanOnCommand;
import com.designer.command.LightOffCommand;
import com.designer.command.LightOnCommand;
import com.designer.entities.Fan;
import com.designer.entities.Light;
import com.designer.remotecontrol.RemoteControl;

public class Main {
    public static void main(String[] args) {
    	
        // Dispositivos
        Light livingRoomLight = new Light();
        Fan fan = new Fan();

        // Comandos
        Command lightOnCommand = new LightOnCommand(livingRoomLight);
        Command lightOffCommand = new LightOffCommand(livingRoomLight);
        Command fanOnCommand = new FanOnCommand(fan);

        // Controle remoto (Invoker)
        RemoteControl remote = new RemoteControl();

        // Ligar a luz
        remote.setCommand(lightOnCommand);
        remote.pressButton();

        // Desligar a luz
        remote.setCommand(lightOffCommand);
        remote.pressButton();

        // Ligar o ventilador
        remote.setCommand(fanOnCommand);
        remote.pressButton();
    }
}
