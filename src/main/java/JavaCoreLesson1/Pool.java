package JavaCoreLesson1;

public class Pool {

    private int lenght;

    public Pool(int lenght) {
        this.lenght = lenght;
    }

    public int getLenght() {
        return lenght;
    }

    public void setLenght(int lenght) {
        this.lenght = lenght;
    }

    @Override
    public String toString() {
        return "Pool{" +
                "lenght=" + lenght +
                '}';
    }
}
