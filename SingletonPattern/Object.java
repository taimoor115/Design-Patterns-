public class Object {
  public static void main(String[] args) {
    Singleton object1 = Singleton.getSingletonObject();
    Singleton object2 = Singleton.getSingletonObject();

    System.out.println(object1.hashCode());
    System.out.println(object2.hashCode());

  }
}
