package zenproject.meditation.android.sketch.performers.flowers;

public class PaintStepSkipper {
    private final int framesToSkip;
    private int step;

    public PaintStepSkipper(int framesToSkip) {
        this.framesToSkip = framesToSkip;
    }

    public boolean hasToSkipStep() {
        return step % (framesToSkip + 1) != 0;
    }

    public void recordStep() {
        step++;
    }
}