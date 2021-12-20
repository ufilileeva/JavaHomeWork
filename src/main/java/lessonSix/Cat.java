package lessonSix;

public class Cat extends Animal{
    private static int catsCount = 0;

    public Cat(String nickname) {
        super(nickname);
        catsCount++;
    }

    @Override
    public void Swim(int obstruction) {
        System.out.println("Коты не могут плавать");
    }

    @Override
    public void Run(int obstruction) {
        if (obstruction>200){
            System.out.println("Коты не могут бежать более 200 м.");
        } else {
            if (obstruction<=0){
                System.out.println("Введено некорректное значение длины препятствия");
            } else {
                System.out.println(getNickname() + " пробежал " + obstruction + " м.");
            }
        }
    }

    public static int getCatsCount() {
        return catsCount;
    }
}