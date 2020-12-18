public class OrderedState  implements PackageState{
    @Override
    public void next(Package pkg) {
        pkg.setState(new DeliveredState());
    }

    @Override
    public void previous(Package pkg) {
        System.out.println("The package is in its initial  state.");
    }

    @Override
    public void printStatus() {
        System.out.println("Package is ordered, and not delivered  yet.");
    }
}
