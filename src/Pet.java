abstract class Pet {
    public String name = "";
    public int age = 0;

    public Pet(String name, int age){
        this.name = name;
        this.age = age;
    }

    public void makeSound(){

    }
    public void displayInfo(){
        System.out.println("Pet name: " + name + "," + "Age: " +  age);
    }

}
