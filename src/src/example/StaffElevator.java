package example;

public class StaffElevator extends Elevator{
    private CallTools name = CallTools.STAFF;

    public StaffElevator(ElevatorState state) {
        super(state);
    }

    @Override
    public ElevatorState state() {
        return state;
    }

    @Override
    public boolean canCall(Integer endFloor) {
        return true;
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
