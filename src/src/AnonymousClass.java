import java.util.List;

public class AnonymousClass {
    public static void main(String[] args) {
        Person poison = new Person() {



            //end of method
        };

    Runnable myAnonRunnable=new Runnable() {
        @Override
        //if you want to create one subclass
        //or one that impliments an interface
        public void run() {
            System.out.println("IM runnable");
        }
    };
    myAnonRunnable.run();

    }
}
