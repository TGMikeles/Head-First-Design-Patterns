package headfirst.designpatterns.combining.observer;
/*
 * Das Interface QuackObservable ist dazu da damit sich ein
 * Observer so zu sagen regestrieren kann somit kann er informationen bekommen.
 * Sobald es eine Ändereung gibt wird es mit NotifyObserver eine Information gegeben
 * @author Ibrahim Keles
 */

public interface QuackObservable {
	public void registerObserver(Observer observer);
	public void notifyObservers();
}
