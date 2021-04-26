

public class Track implements Obstaclable{
    int length;

    public Track(int lenght) {
        this.length = lenght;
    }

    @Override
    public boolean toRun(int maxLength) {
        return (maxLength >= length);
    }

    @Override
    public boolean toJump(int maxHeight) {
        return false;
    }

    @Override
    public String toString() {
        return "Беговая дорожка длиной " + length + " км";
    }
}
