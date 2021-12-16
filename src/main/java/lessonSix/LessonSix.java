package lessonSix;

public class LessonSix {
    public static void main(String[] args) {
        Cat cat1 = new Cat("Cat1");
        Cat cat2 = new Cat("Cat2");
        Cat cat3 = new Cat("Cat3");
        Cat cat4 = new Cat("Cat4");

        Dog dog1 = new Dog("Dog1");
        Dog dog2 = new Dog("Dog2");
        Dog dog3 = new Dog("Dog3");

        cat1.Run(10);
        cat1.Swim(10);
        cat2.Run(0);
        cat2.Swim(0);
        cat3.Run(203);
        cat3.Swim(203);
        cat4.Run(199);
        cat4.Swim(199);

        dog1.Run(300);
        dog1.Swim(300);
        dog2.Run(0);
        dog2.Swim(0);
        dog3.Run(503);
        dog3.Swim(503);

        System.out.println("Котов создано: " + Cat.getCatsCount() + ".\nСобак создано: " + Dog.getDogsCount() +".\nВсего животных создано: " + (Cat.getCatsCount()+Dog.getDogsCount()));
    }
}
