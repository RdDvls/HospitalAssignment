/**
 * Created by RdDvls on 8/24/16.
 */
public class Diagnosis {
    public static final int LUNG_CANCER = 1;
    public static final int BRAIN_CANCER = 2;
    public static final int COMMON_COLD = 3;
    public static final int STREP_THROAT =4;
    public static final int UNDIAGNOSED = -1;
    public int illness = UNDIAGNOSED;

    public static int getLungCancer() {
        return LUNG_CANCER;
    }

    public static int getBrainCancer() {
        return BRAIN_CANCER;
    }

    public static int getCommonCold() {
        return COMMON_COLD;
    }

    public static int getStrepThroat() {
        return STREP_THROAT;
    }

    public static int getUNDIAGNOSED() {
        return UNDIAGNOSED;
    }

    public int getIllness() {
        return illness;
    }

    public void setIllness(int illness) {
        this.illness = illness;
    }

    public Diagnosis(int illness) {
        this.illness = illness;
    }

}
