public class ReceivedState implements PackageState {
    @Override
    public void next(Package pkg) {
        System.out.println("This package has been recieved to the destination.");
    }

    @Override
    public void previous(Package pkg) {
        pkg.setState(new DeliveredState());
    }

    @Override
    public void printStatus() {

    }
}
