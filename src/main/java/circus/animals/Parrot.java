package circus.animals;

public class Parrot extends Bird {
    @Override
    public String speak() {
        return "Polly wants a cracker";
    }

    public int getValue() {
        return 20;
    }
//    @Override
//    public String toString() {
//        return "I'm a parrot";
//    }
}
