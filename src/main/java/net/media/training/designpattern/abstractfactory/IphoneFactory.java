package net.media.training.designpattern.abstractfactory;

public class IphoneFactory implements PhoneFactory{
    
    public MotherBoard buildMotherBoard(){
        MotherBoard motherBoard = new IphoneMotherBoard();
        Battery battery = buildBattery();
        motherBoard.attachBattery(battery);
        return motherBoard;
    }

    public Screen buildScreen(){
        return new IphoneScreen();
    }

    public Case buildCase(){
        return new IphoneCase();
    }

    public Battery buildBattery(){
        return new Battery();
    }
    public Processor buildProcessor(){
        return new IphoneProcessor();
    }
}
