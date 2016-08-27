/**
 * Created by RdDvls on 8/24/16.
 */
public  class HospitalDoctor extends Person implements Doctor {
    private String college;

    public HospitalDoctor(String firstName, String lastName, String college){
        super(firstName, lastName);
        this.college = college;
    }

    public String getCollege() {
        return college;
    }

    public void setCollege(String college) {
        this.college = college;
    }

    public  Diagnosis diagnose(){
        return new Diagnosis(Diagnosis.COMMON_COLD);
    }

}
