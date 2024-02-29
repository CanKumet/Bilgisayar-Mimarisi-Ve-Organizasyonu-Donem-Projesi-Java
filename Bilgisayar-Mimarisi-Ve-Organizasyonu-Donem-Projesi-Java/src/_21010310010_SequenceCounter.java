
public class _21010310010_SequenceCounter {
    private int count;

    public _21010310010_SequenceCounter() {
        count = -1;
    }

    public void increment() {
        if (count < 15) {
            count++;
        }
    }

    public String getCountInBinary() {
        increment();
        return String.format("%04d", Integer.parseInt(Integer.toBinaryString(count)));

    }

    }
