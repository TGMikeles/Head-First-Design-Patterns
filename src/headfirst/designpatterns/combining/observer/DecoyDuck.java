package headfirst.designpatterns.combining.observer;
/*
 *Die Klasse DecoyDuck implementiert Quackable diese Klasse gibt der DecoyDuck die Eigenschaften
 *  Im Prinzip ist die Klasse sozusagen ein QuackObservable aber benimmt sich wie ein Observer
 * @author Ibrahim Keles
 */

public class DecoyDuck implements Quackable {
	Observable observable;

	public DecoyDuck() {
		observable = new Observable(this);
	}

	public void quack() {
		System.out.println("<< Silence >>");
		notifyObservers();
	}

	public void registerObserver(Observer observer) {
		observable.registerObserver(observer);
	}

	public void notifyObservers() {
		observable.notifyObservers();
	}

	public String toString() {
		return "Decoy Duck";
	}
}
