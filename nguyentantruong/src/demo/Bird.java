package demo;

public class Bird extends Animal{
   private int wing;

    public Bird(int wing) {
        this.wing = wing;
    }

    public Bird(int foot, int tail, int wing) {
        super(foot, tail);
        this.wing = wing;
    }

    public Bird() {

    }

    public Bird(int foot, int tail) {
        super(foot, tail);
    }

    @Override
    public void eat() {

    }

    @Override
    public int getFoot() {
        return super.getFoot();
    }

    @Override
    public void setFoot(int foot) {
        super.setFoot(foot);
    }

    @Override
    public int getTail() {
        return super.getTail();
    }

    @Override
    public void setTail(int tail) {
        super.setTail(tail);
    }

    @Override
    public String toString() {
        return super.toString();
    }
}
