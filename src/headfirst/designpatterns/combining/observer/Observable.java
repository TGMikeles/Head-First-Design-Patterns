package headfirst.designpatterns.combining.observer;

import java.util.Iterator;
import java.util.ArrayList;
/*
 * Die Klasse Observer implementiert das interface QuackObservable
 *somit ist es möglich die Methoden des Interface zu benutzen.
 * Im Prinzip ist die Klasse sozusagen ein QuackObservable aber benimmt sich wie ein Observer
 * @author Ibrahim Keles
 */
public class Observable implements QuackObservable {
	ArrayList<Observer> observers = new ArrayList<Observer>();
	QuackObservable duck;

	public Observable(QuackObservable duck) {
		this.duck = duck;
	}

	public void registerObserver(Observer observer) {
		observers.add(observer);
	}

	public void notifyObservers() {
		Iterator<Observer> iterator = observers.iterator();
		while (iterator.hasNext()) {
			Observer observer = iterator.next();
			observer.update(duck);
		}
	}

	public Iterator<Observer> getObservers() {
		return observers.iterator();
	}
}
