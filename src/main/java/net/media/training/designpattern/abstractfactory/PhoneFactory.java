package net.media.training.designpattern.abstractfactory;

public interface PhoneFactory {
    public Case buildCase();
    public MotherBoard buildMotherBoard();
    public Screen buildScreen();
    public Battery buildBattery();
    public Processor buildProcessor();
}
