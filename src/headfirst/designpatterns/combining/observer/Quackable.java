package headfirst.designpatterns.combining.observer;
/*
 *Das Interface Quackable erbt von dem Interface QuackObservable
 *somit hat auch dieses Interface die Methodenköpfe von dem diesem Interface.
 * @author Ibrahim Keles
 */

public interface Quackable extends QuackObservable {
	public void quack();
}
