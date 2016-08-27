/**
 * Created by RdDvls on 8/24/16.
 */
public class SurgicalOncologist extends HospitalDoctor implements Surgeon {
    public SurgicalOncologist(String firstName, String lastName, String college){
        super(firstName, lastName, college);
    }
    public Diagnosis diagnose(){
        return new Diagnosis(Diagnosis.BRAIN_CANCER);
    }

    public boolean operate(Patient patient){
        patient.setSick(false);
        return true; //successful operation!
    }
}
