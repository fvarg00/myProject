
public enum Singleton {
	INSTANCE;
	
	public static void main(String[] args) {
		System.out.println(INSTANCE.hashCode());
	}

}
