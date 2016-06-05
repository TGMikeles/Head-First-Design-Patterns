package headfirst.designpatterns.combining.observer;
/*
 * Das Interface Observer halt als Parameter QuackObservable das heißt das er die Methoden
 * aus diesen Interface nutzen kann wie zum Beispiel registerObserver() oder notifyObservers()
 *somit kann er in der Methode update alle Information ausgeben die er von  QuackObservable bekommt
 *@author Ibrahim Keles
 *@param QuackObservable: duck
 */
public interface Observer {
	public void update(QuackObservable duck);
}
