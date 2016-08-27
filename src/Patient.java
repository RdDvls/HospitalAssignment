/**
 * Created by RdDvls on 8/24/16.
 */
public class Patient extends Person {
    private boolean isSick = true;
    private int affliction;
    public static final int LUNG_CANCER = 1;
    public static final int BRAIN_CANCER = 2;
    public static final int COMMON_COLD = 3;
    public static final int STREP_THROAT =4;
    public static final int UNDIAGNOSED = -1;
    public int illness = UNDIAGNOSED;

    public int getAffliction() {
        return affliction;
    }

    public void setAffliction(int affliction) {
        this.affliction = affliction;
    }

    public boolean isSick() {
        return isSick;
    }

    public void setSick(boolean sick) {
        isSick = sick;
    }

    public Patient(String firstName, String lastName) {
        super(firstName,lastName);

    }


}