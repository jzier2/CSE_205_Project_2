public class OnCampusStudent extends Student implements Comparable<Student> {

    private boolean mResident;
    private double mProgramFee = 0;

    public OnCampusStudent(String pId, String pFname, String pLname){
        super(pId, pFname,pLname);
    }

    @Override
    public void calcTuition() {

        double t;

        if (getResidency()) t = TuitionConstants.ONCAMP_RES_BASE;
        else t = TuitionConstants.ONCAMP_NONRES_BASE;

        t += getProgramFee();

        if (getCredits() > TuitionConstants.MAX_CREDITS) {
            t += ((getCredits()) - TuitionConstants.MAX_CREDITS) * TuitionConstants.ONCAMP_ADD_CREDITS;
        }

        setTuition(t);

    }

    public double getProgramFee(){
        return mProgramFee;
    }

    public boolean getResidency(){
        return mResident;
    }

    public void setProgramFee(Double pProgramFee){
        mProgramFee = pProgramFee;
    }

    public void setResidency(boolean pResident){
        mResident = pResident;
    }
}
