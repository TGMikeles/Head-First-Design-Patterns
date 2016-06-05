package headfirst.designpatterns.combining.observer;
/*
 * Die Klasse  implementier das Interface Observer
 *@author Ibrahim Keles
 */
public class Quackologist implements Observer {
 
	public void update(QuackObservable duck) {
		System.out.println("Quackologist: " + duck + " just quacked.");
	}

	public String toString() {
		return "Quackologist";
	}
}
