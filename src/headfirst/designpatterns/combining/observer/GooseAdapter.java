package headfirst.designpatterns.combining.observer;
/*
 * Die Klasse GooseAdapter implementiert Quackable
 * Außerdem hat eine Referenz auf Goose damit sie sozusagen ihre eigene Eigenschaften hat mit dem Honk 
 * Im Prinzip ist die Klasse sozusagen ein QuackObservable aber benimmt sich wie ein Observer
 * @author Ibrahim Keles
 */
public class GooseAdapter implements Quackable {
	Goose goose;
	Observable observable;

	public GooseAdapter(Goose goose) {
		this.goose = goose;
		observable = new Observable(this);
	}

	public void quack() {
		goose.honk();
		notifyObservers();
	}

	public void registerObserver(Observer observer) {
		observable.registerObserver(observer);
	}

	public void notifyObservers() {
		observable.notifyObservers();
	}

	public String toString() {
		return "Goose pretending to be a Duck";
	}
}
