package dsa;

class Container<T> {

	private T t;

	public void set(T t) {
		this.t = t;
	}

	public T get() {
		return t;
	}
}
public class Gen {
	public static void main(String[] args) {
		
		Container<Integer> integerContainer = new Container<>();
		integerContainer.set(1);
		System.out.println("Inside Integer Container : "+integerContainer.get());
		
		Container<String> stringContainer = new Container<>();
		stringContainer.set("Jeo");
		System.out.println("Inside String Container : "+stringContainer.get());
		
	}
	
}

