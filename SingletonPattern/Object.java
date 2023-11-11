import java.lang.reflect.Constructor;

public class Object {
  public static void main(String[] args) throws Exception {
    // Singleton object1 = Singleton.getSingletonObject();
    // Singleton object2 = Singleton.getSingletonObject();

    // System.out.println(object1.hashCode());
    // System.out.println(object2.hashCode());

    // Breakage of Singleton Pattern:
    // 1. Reflection API

    Singleton newInstance1 = Singleton.getSingletonObject();
    System.out.println(newInstance1.hashCode());
    Constructor<Singleton> constructor = Singleton.class.getDeclaredConstructor();
    constructor.setAccessible(true); // this will change contructor private to public
    Singleton newInstance2 = constructor.newInstance();
    System.out.println(newInstance2.hashCode());
  }
}
