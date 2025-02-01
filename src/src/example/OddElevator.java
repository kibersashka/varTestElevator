package example;

public class OddElevator extends Elevator{
    private CallTools name = CallTools.ODD;

    public OddElevator(ElevatorState state) {
        super(state);
    }

    @Override
    public ElevatorState state() {
        return state;
    }

    @Override
    public boolean canCall(Integer endFloor) {
        return endFloor % 2 == 0;
    }


    public CallTools getName() {
        return name;
    }
    @Override
    public String toString() {
        return name + " " + state + " " + currentFloor;
    }
    public boolean possibilityCall(CallElevator callElevator) throws NoHaveFreeElevatorException{
        if (name.equals(callElevator.getState()) && canCall(callElevator.getEndFloor())) {
            return true;
        }
        return false;
    }




}
