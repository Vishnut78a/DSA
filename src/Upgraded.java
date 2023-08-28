public class Upgraded implements Engine{
    @Override
    public void start() {
        System.out.println("ELectric Engine Starts");
    }

    @Override
    public void stop() {
        System.out.println("ELectric Engine Stops");
    }

    @Override
    public void brake() {
        System.out.println("ELectric Engine brake pushed");
    }

    @Override
    public void acc() {
        System.out.println("ELectric Engine accelerated");
    }
}
