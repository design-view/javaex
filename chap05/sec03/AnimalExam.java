package chap05.sec03;

public class AnimalExam {
    public static void main(String[] args) {
        Dog dog = new Dog();
        Cat cat = new Cat();
        dog.sound();
        cat.sound();

        Animal animal1 = dog;
        Animal animal2 = new Cat();

    }
    //메서드
    public static void animalCh(Animal animal){
        if(animal instanceof Cat){
            Cat cat = (Cat) animal;
        }
    }
}
