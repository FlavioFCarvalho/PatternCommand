package com.designer.remotecontrol;

import com.designer.command.Command;

//Classe Invoker que dispara comandos
public class RemoteControl {
 private Command command;

 public void setCommand(Command command) {
     this.command = command;
 }

 public void pressButton() {
     command.execute();
 }
}

