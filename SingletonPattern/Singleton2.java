public class Singleton2 {

  private static Singleton2 singleton2Var = new Singleton2();

  private Singleton2() {
  }

  // Eager way creating single object
  public static Singleton2 getObject() {
    return singleton2Var;
  }

  public static void main(String[] args) {

  }
}
