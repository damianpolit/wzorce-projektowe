public class SingletonExample {

     public static void main(String[] args) {
          Singleton singleton1 = Singleton.getInstance();
          Singleton singleton2 = Singleton.getInstance();

          System.out.println(singleton1 == singleton2); // true
     }

     // Singleton class
     public static class Singleton {
          private static Singleton instance;

          private Singleton() {}

          public static Singleton getInstance() {
               if (instance == null) {
                    instance = new Singleton();
               }
               return instance;
          }
     }
}
