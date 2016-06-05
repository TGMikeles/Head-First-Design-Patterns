package headfirst.designpatterns.combining.observer;
/*
 * Die Klasse DuckCall implementiert Quackable diese Klasse ist zuständig für die verschiedene Entenrufe einer Ente
 * Im Prinzip ist die Klasse sozusagen ein QuackObservable aber benimmt sich wie ein Observer
 * @author Ibrahim Keles
 */
public class DuckCall implements Quackable {
	Observable observable;

	public DuckCall() {
		observable = new Observable(this);
	}

	public void quack() {
		System.out.println("Kwak");
		notifyObservers();
	}

	public void registerObserver(Observer observer) {
		observable.registerObserver(observer);
	}

	public void notifyObservers() {
		observable.notifyObservers();
	}

	public String toString() {
		return "Duck Call";
	}
}
