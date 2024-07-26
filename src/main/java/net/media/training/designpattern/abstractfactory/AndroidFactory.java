package net.media.training.designpattern.abstractfactory;

public class AndroidFactory implements PhoneFactory {
    
    public MotherBoard buildMotherBoard(){
        MotherBoard motherBoard = new AndroidMotherBoard();
        Battery battery = buildBattery();
        motherBoard.attachBattery(battery);
        return motherBoard;
    }

    public Screen buildScreen(){
        return new AndroidScreen();
    }

    public Case buildCase(){
        return new AndroidCase();
    }

    public Battery buildBattery(){
        return new Battery();
    }
}
