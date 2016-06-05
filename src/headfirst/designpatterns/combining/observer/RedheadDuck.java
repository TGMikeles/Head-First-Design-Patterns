package headfirst.designpatterns.combining.observer;
/*
 *Die Klasse RedheadDuck implementiert Quackable diese Klasse gibt der RedheadDuck die Eigenschaften
 *  Im Prinzip ist die Klasse sozusagen ein QuackObservable aber benimmt sich wie ein Observer
 * @author Ibrahim Keles
 */
public class RedheadDuck implements Quackable {
	Observable observable;

	public RedheadDuck() {
		observable = new Observable(this);
	}

	public void quack() {
		System.out.println("Quack");
		notifyObservers();
	}

	public void registerObserver(Observer observer) {
		observable.registerObserver(observer);
	}

	public void notifyObservers() {
		observable.notifyObservers();
	}

	public String toString() {
		return "Redhead Duck";
	}
}
