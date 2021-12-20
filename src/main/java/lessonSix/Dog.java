package lessonSix;

public class Dog extends Animal {
    private static int dogsCount = 0;

    public Dog(String nickname) {
        super(nickname);
        dogsCount++;
    }

    @Override
    public void Swim(int obstruction) {
        if (obstruction > 10) {
            System.out.println("Собаки не могут плыть более 10 м.");
        } else {
            if (obstruction <= 0) {
                System.out.println("Введено некорректное значение длины препятствия");
            } else {
                System.out.println(getNickname() + " проплыл " + obstruction + " м.");
            }
        }
    }

    @Override
    public void Run(int obstruction) {
        if (obstruction > 10) {
            System.out.println("Собаки не могут пробежать более 500 м.");
        } else {
            if (obstruction <= 0) {
                System.out.println("Введено некорректное значение длины препятствия");
            } else {
                System.out.println(getNickname() + " пробежал " + obstruction + " м.");
                ;
            }
        }
    }

    public static int getDogsCount(){
        return dogsCount;
    }
}