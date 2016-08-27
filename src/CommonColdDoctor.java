/**
 * Created by RdDvls on 8/24/16.
 */
public class CommonColdDoctor extends HospitalDoctor implements GeneralPracticioner {
    public CommonColdDoctor(String firstName, String lastName, String college){
        super(firstName, lastName, college);
    }

//   public Treatment treatment(){
//       return new Treatment(Treatment.TREAT_COMMON_COLD);
//   }

    public Diagnosis diagnose() {
        return new Diagnosis(Diagnosis.COMMON_COLD);

    }


    public boolean treatment(Patient patient) {
        patient.setSick(false);
        return true;// succesful treatment
    }
}
