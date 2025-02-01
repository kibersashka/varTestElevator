package example;

public class Processs {
    public Processs() {

    }
    Elevator elevatorCH1 = new EvenElevator(ElevatorState.STAND);

    Elevator elevatorNCH1 = new OddElevator(ElevatorState.STAND);

    Elevator staffElevator = new StaffElevator(ElevatorState.STAND);
    Elevator[] elevators = new Elevator[]{elevatorCH1, elevatorCH1, elevatorNCH1, elevatorNCH1, elevatorCH1, elevatorCH1, staffElevator, staffElevator, staffElevator};
    CallElevator callElevator1 = new CallElevator(5, CallTools.EVEN);
    CallElevator callElevator4 = new CallElevator(9, CallTools.STAFF);
    CallElevator callElevator2 = new CallElevator(15, CallTools.STAFF);
    CallElevator callElevator3 = new CallElevator(12, CallTools.ODD);
    CallElevator[] callElevators = new CallElevator[]{callElevator1, callElevator2, callElevator3, callElevator4};
    CallElevator callElevatorNew = new CallElevator();
    int h = 0;
    CallElevator callElevatorLast = new CallElevator();
    CallElevator callElevatorLastLast = new CallElevator();

    public void doElevator() throws NoHaveFreeElevatorException {
        for (int j = 0; j < 1000; j++) {
            System.out.print(j + " ");
            if (j % 20 == 0) {
                callElevatorLastLast = callElevatorLast;
                callElevatorLast = callElevatorNew;
                callElevatorNew = callElevators[(int) (Math.random() * 4)];
                System.out.println(callElevatorNew);


            }
            freeElevatorStaff(elevators, callElevatorNew);
            freeElevatorStaff(elevators, callElevatorLast);
            freeElevatorStaff(elevators, callElevatorLastLast);

        }

    }

    public static void freeElevatorStaff(Elevator[] elevator, CallElevator callElevator) {
        for (int i = 0; i < elevator.length; i++) {
            if (elevator[i].possibilityCall(callElevator)) {
                elevator[i].setEndFloor(callElevator.getEndFloor());
                elevator[i].changeFloor();
                System.out.println(elevator[i]);
                break;
            }
        }

    }
}
    /*
    public static void freeElevatorEven (Elevator[] elevator, CallElevator callElevator){
            for (int i = 0; i < elevator.length; i++) {
                if (elevator[i].possibilityCall(callElevator)) {
                    elevator[i].setEndFloor(callElevator.getEndFloor());
                    elevator[i].changeFloor();
                    System.out.println(elevator[i]);
                    break;
                }

        }

    }
    public static void freeElevatorOdd(Elevator[] elevator, CallElevator callElevator){
        for (int j = 0; j < 3; j++) {
            for (int i = 0; i < elevator.length; i++) {
                if (elevator[i].possibilityCall(callElevator)) {
                    elevator[i].setEndFloor(callElevator.getEndFloor());
                    elevator[i].changeFloor();
                    System.out.println(elevator[i]);
                    break;
                }
            }
        }

    }
}
//currentElevator = freeElevator(elevators, callElevator);
                /*    if (elevator[i].possibilityCall(callElevator)) {
                        System.out.println(elevator[i]);
                        elevator[i].setEndFloor(callElevator.getEndFloor());
                        while (elevator[i].getCurrentFloor() != callElevator.getEndFloor()) {
                            elevator[i].changeFloor();
                            System.out.println(elevator[i]);
                        }
                        while (elevator[i].getCurrentFloor() != 1) {
                            elevator[i].changeFloor();
                            if (elevator[i].getCurrentFloor() == 1) {
                                elevator[i].changeFloor();
                            }
                        }

                        System.out.println(elevator[i]);
                        System.out.println("поездка окончена");
                        break;
                    }

                 */



