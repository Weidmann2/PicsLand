 import java.util.*;


public class Model extends Observable{
	public String test(){
		setChanged();
		notifyObservers("yo");
		return "yo";
	}

}
