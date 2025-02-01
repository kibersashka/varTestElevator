package example;

public abstract class Elevator implements ElevatorTools, Step{
    protected ElevatorState state;
    protected Integer currentFloor = 1;
    protected Integer endFloor = 1 ;
    private CallTools name;


    public Elevator(ElevatorState state){
        this.state = state;


    }
    public Elevator() {}

    public Integer getEndFloor() {
        return endFloor;
    }

    public void setEndFloor(Integer endFloor) {
        this.endFloor = endFloor;
    }

    public void setState(ElevatorState state) {
        this.state = state;
    }

    public abstract ElevatorState state();

    public abstract boolean canCall(Integer endFloor);
    public boolean isFree () {
        return state == ElevatorState.STAND;
    }
    public abstract boolean possibilityCall(CallElevator callElevator);


    public Integer getCurrentFloor() {
        return currentFloor;
    }
    @Override
    public String toString() {
        return name + " " + state + " " + currentFloor;
    }

    public void changeFloor() throws ElevatorBreakExseption{
        switch (state) {
            case ElevatorState.UP:
                if (currentFloor == endFloor) {
                    state = ElevatorState.DOWN;
                    break;
                }
                currentFloor += 1;
                break;
            case ElevatorState.DOWN:
                if (currentFloor == 1) {

                    state = ElevatorState.STAND;
                    endFloor = 1;
                    break;
                }
                currentFloor -= 1;
                break;
            case ElevatorState.NOTWORKING:
                throw new ElevatorBreakExseption("not work");
            case ElevatorState.STAND:
                if (currentFloor == 1 && endFloor > 1) {
                    state = ElevatorState.UP;
                    break;
                }
                break;
        }
    }
}
