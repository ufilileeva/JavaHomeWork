package lessonSix;

public abstract class Animal {
    private String nickname;

    public Animal(String nickname){
        this.nickname = nickname;
    }

    public abstract void Swim(int obstruction);

    public abstract void Run(int obstruction);

    public String getNickname() {
        return nickname;
    }

    public void setNickname(String nickname) {
        this.nickname = nickname;
    }

}
