import javax.xml.namespace.QName;

public class Dog extends Pet implements Trainable{
        public Dog(String name, int age){
            super(name, age);
        }
         @Override
        public void makeSound(){
            System.out.println("Buddy says: Woof woof");
        }
        @Override
      public void performTrick(){
            System.out.println("Training: "+ name + "Sits and shakes");
        }
}
