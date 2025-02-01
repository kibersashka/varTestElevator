package example;

public class EvenElevator extends Elevator{
    private CallTools name = CallTools.EVEN;

    public EvenElevator(ElevatorState state) {
        super( state);
    }



    @Override
    public ElevatorState state() {
        return state;
    }

    @Override
    public boolean canCall(Integer endFloor) {
        return endFloor % 2 != 0;
    }
    public boolean possibilityCall(CallElevator callElevator) throws NoHaveFreeElevatorException{
        if (name.equals(callElevator.getState()) && canCall(callElevator.getEndFloor())) {
            return true;
        }
        return false;
    }


    public CallTools getName() {
        return name;
    }
    @Override
    public String toString() {
        return name + " " + state + " " + currentFloor;
    }

}
