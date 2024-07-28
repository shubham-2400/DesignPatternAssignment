package net.media.training.designpattern.observer;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by IntelliJ IDEA.
 * User: joelrosario
 * Date: Jul 20, 2011
 * Time: 9:12:58 PM
 * To change this template use File | Settings | File Templates.
 */
public class Sun implements Subject{
    private boolean isUp;
    private final List<Observer> observers = new ArrayList<>();

    public Sun(Robot robot, Person person, Dog dog, Cat cat) {
        observers.add(robot);
        observers.add(person);
        observers.add(dog);
        observers.add(cat);
    }

    public boolean isUp() {
        return isUp;
    }

    public void set() {
        isUp = false;
        for(Observer observer: observers){
            if(observer.isOutdoors()){
                observer.notifySunSet();
            }
        }
    }

    public void rise() {
        isUp = true;
        for(Observer observer: observers){
            if(observer.isOutdoors()){
                observer.notifySunRose();
            }
        }
    }
}