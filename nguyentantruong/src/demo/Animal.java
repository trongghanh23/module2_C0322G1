package demo;

public abstract class Animal {
    private int foot;
    private int tail;

    public Animal() {
    }

    public Animal(int foot, int tail) {
        this.foot = foot;
        this.tail = tail;
    }
    public abstract void eat();

    public int getFoot() {
        return foot;
    }

    public void setFoot(int foot) {
        this.foot = foot;
    }

    public int getTail() {
        return tail;
    }

    public void setTail(int tail) {
        this.tail = tail;
    }

    @Override
    public String toString() {
        return "Animal{" +
                "foot=" + foot +
                ", tail=" + tail +
                '}';
    }
}
