package headfirst.designpatterns.combining.observer;
/*
 * Die Klasse Goose ist dazu das der Adapter ein ganz eigene Eigenschaften hat in dem Sinn eine anderes Quacken hat 
 * @author Ibrahim Keles
 */
public class Goose {

	public void honk() {
		System.out.println("Honk");
	}

	public String toString() {
		return "Goose";
	}
}
