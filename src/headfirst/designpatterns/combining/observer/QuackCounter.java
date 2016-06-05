package headfirst.designpatterns.combining.observer;
/*
 *Die Klasse QuackCounter implementiert das Interface Quackable.
 * Diese Klasse ist dazu da damit man die Anzahl des Quckens zähllt und sie ausgibt
 *  Im Prinzip ist die Klasse sozusagen ein QuackObservable aber benimmt sich wie ein Observer
 * @author Ibrahim Keles
 */
public class QuackCounter implements Quackable {
	Quackable duck;
	static int numberOfQuacks;

	public QuackCounter(Quackable duck) {
		this.duck = duck;
	}

	public void quack() {
		duck.quack();
		numberOfQuacks++;
	}

	public static int getQuacks() {
		return numberOfQuacks;
	}

	public void registerObserver(Observer observer) {
		duck.registerObserver(observer);
	}

	public void notifyObservers() {
		duck.notifyObservers();
	}

	public String toString() {
		return duck.toString();
	}
}
