package racingcar.car;

public class Car implements Comparable {

    public static final int FORWARD_MOVE_INIT_COUNT = 0;
    public static final String COLON = " : ";
    public static final String DASH = "-";
    private int forwardMoveCount;
    private final String name;

    private Car(String name) {
        this.name = name;
        this.forwardMoveCount = FORWARD_MOVE_INIT_COUNT;
    }

    public static Car of(String name) {
        return new Car(name);
    }

    public void move() {
        this.forwardMoveCount++;
    }

    public String makeResult() {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append(name);
        stringBuilder.append(COLON);
        stringBuilder.append(DASH.repeat(forwardMoveCount));
        return stringBuilder.toString();
    }

    public String getName() {
        return this.name;
    }

    @Override
    public int compareTo(Object o) {
        Car otherCar = (Car) o;
        return Integer.compare(otherCar.forwardMoveCount, this.forwardMoveCount);
    }

    public boolean isSameForwardMoveCount(Car otherCar) {
        if (this.forwardMoveCount == otherCar.forwardMoveCount) return true;
        return false;
    }

    public int getForwardMoveCount() {
        return this.forwardMoveCount;
    }
}
