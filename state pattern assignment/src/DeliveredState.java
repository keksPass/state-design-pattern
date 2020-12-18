public class DeliveredState implements PackageState {
    @Override
    public void next(Package pkg) {
        pkg.setState(new ReceivedState());
    }

    @Override
    public void previous(Package pkg) {
        pkg.setState(new OrderedState());
    }

    @Override
    public void printStatus() {
        System.out.println("Package is delivered to the post but is  not received yet.");
    }
}
