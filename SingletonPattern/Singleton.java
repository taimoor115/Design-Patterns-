public class Singleton {
  private static Singleton singletonVar; // default is null
  // Constructor

  private Singleton() {
  }

  // Method that return the Object
  // Lazy of creating single object
  public static Singleton getSingletonObject() {

    if (singletonVar == null) {
      synchronized (Singleton.class) {
        singletonVar = new Singleton();
      }
    }

    return singletonVar;
  }

  public static void main(String[] args) {

  }
}
