public abstract class Student implements Comparable<Student> {
    private int mCredits =0;
    private String mFname = "";
    private String mId = "";
    private String mLname = "";
    private double mTuition = 0;

    public Student (String pId, String pFname, String pLname){
        mId = pId;
        mFname = pFname;
        mLname = pLname;

    }

    public void calcTuition(){

    }


    @Override
    public int compareTo(Student pStudent) {
       return getId().compareTo(pStudent.getId());
    }

    public int getCredits(){
        return mCredits;
    }

    public String getFirstName(){
        return mFname;
    }

    public String getId(){
        return mId;
    }

    public String getLastName(){
        return mLname;
    }

    public double getTuition(){
        return mTuition;
    }

    public void setCredits(int pCredits){
        mCredits += pCredits;
    }

    public void setFname(String pFname){
        mFname = pFname;
    }

    public void setId(String pID){
        mId = pID;
    }

    public void setLname (String pLname){
        mLname = pLname;
    }

    protected void setTuition(double pTuition){
        mTuition = pTuition;
    }

}
