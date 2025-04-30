public class AutoBody {
    public int oneOne;
    public int oneTwo;

    public AutoBody(int oneOne, int oneTwo) {
        this.oneOne = oneOne;
        this.oneTwo = oneTwo;
    }

    @Override
    public String toString() {
        return "AutoBody{" +
                "oneOne=" + oneOne +
                ", oneTwo=" + oneTwo +
                '}';
    }
}
