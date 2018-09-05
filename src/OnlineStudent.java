public class OnlineStudent extends Student{

    private boolean mTechFee;

    public OnlineStudent(String pId, String pFname, String pLname){
        super(pId, pFname,pLname);

        }

    @Override
    public void calcTuition() {
        double t = getCredits() * TuitionConstants.ONLINE_CREDIT_RATE;

        if (mTechFee) t += TuitionConstants.ONLINE_TECH_FEE;

        setTuition(t);
    }

    public boolean getTechFee(){
        return mTechFee;
    }

    public void setTechFee(boolean pTechFee) {
        mTechFee = pTechFee;
    }
}
