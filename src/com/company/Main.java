package com.company;

public class Main {


    public static void main(String[] args) {
	// write your code here
        Dimensions caseDimensions = new Dimensions(10,20,5);
        Resolution monitorResolution = new Resolution(1600, 900);

        Case theCase = new Case("ex1231", "Asus", "220w", caseDimensions);
        Monitor theMonitor = new Monitor("ex41", "Dell",18, monitorResolution );
        Motherboard theMotherboard = new Motherboard("mioa131","Gigahertz", 4,4,"v2.421");

        PC mYPC = new PC(theCase, theMonitor, theMotherboard);

      mYPC.getMonitor().drawPixelAt(50,100,"blue");
      mYPC.getMotherboard().loadProgram("Windows XP");
      mYPC.getCase().pressPowerButton();

    }
}
