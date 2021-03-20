package edu.tekwill.lesson.computer;

import edu.tekwill.lesson.computer.components.*;
import edu.tekwill.lesson.computer.peripherals.*;


public class ComputerMain {
    public static void main(String[] args) {

        System.out.println("   Components :  .  .  .");

        Processor newCpu = new Processor();
        newCpu.cpu = "i5, 2.5GH;";
        System.out.println(newCpu.processorType());

        Motherboard newMotherboard = new Motherboard();
        newMotherboard.motherboard = "Mt342 ASUS;";
        System.out.println(newMotherboard.motherboardType());

        HardDrive newCd = new HardDrive();
        newCd.hardDrive = "HHD Samsung 2.5 TB;";
        System.out.println(newCd.hardDriveType());

        System.out.println("    Peripherals :  .  .  .");

        Keyboard newKeyboard = new Keyboard();
        newKeyboard.keyboard = "Logitec WiFi;";
        newKeyboard.keyboardType();

        Monitor newMonitor = new Monitor();
        newMonitor.monitor = "LG Format 16:9;";
        newMonitor.monitorType();
        ;

        Mouse newMouse = new Mouse();
        newMouse.mouse = "Tecknet cordless optical mouse;";
        newMouse.mouseType();

        System.out.println("    PC is completely   !   !   !");
    }
}
