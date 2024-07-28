package net.media.training.designpattern.abstractfactory;

/**
 * Created by IntelliJ IDEA.
 * User: goyalamit
 * Date: Jul 18, 2011
 * Time: 6:34:34 PM
 * To change this template use File | Settings | File Templates.
 */
public class PhoneMaker {

    public Case buildPhone(String phoneType) {
        Case phoneCase;
        MotherBoard motherBoard;
        Screen screen;
        Processor processor;
        if(phoneType=="Android"){
            PhoneFactory androidFactory = new AndroidFactory();
            motherBoard = androidFactory.buildMotherBoard();
            screen = androidFactory.buildScreen();
            phoneCase = androidFactory.buildCase();
            processor = androidFactory.buildProcessor();
            motherBoard.attachProcessor(processor);
            phoneCase.attachMotherBoard(motherBoard);
            phoneCase.attachScreen(screen);
        }
        else {
            PhoneFactory iphoneFactory = new IphoneFactory();
            motherBoard = iphoneFactory.buildMotherBoard();
            screen = iphoneFactory.buildScreen();
            phoneCase = iphoneFactory.buildCase();
            processor = iphoneFactory.buildProcessor();
            motherBoard.attachProcessor(processor);
            phoneCase.attachMotherBoard(motherBoard);
            phoneCase.attachScreen(screen);
        }
        return phoneCase;
    }
}
