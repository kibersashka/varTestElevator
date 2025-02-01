package example;

public class CallElevator implements  Call{
    private Integer endFloor;
    private CallTools state;

    public CallElevator() {}

    public CallElevator(Integer endFloor, CallTools state) {
        this.endFloor = endFloor;
        this.state = state;
    }

    @Override
    public Integer getEndFloor() {
        return endFloor;
    }

    @Override
    public CallTools getState() {
        return state;
    }
    @Override
    public String toString() {
        return state + " " + endFloor;
    }
}
