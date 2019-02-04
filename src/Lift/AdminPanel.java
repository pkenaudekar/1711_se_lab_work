package Lift;

public class AdminPanel {
    public static AdminPanel objInstance = null;
    private int versionNum;

    private AdminPanel(){
        versionNum = 5;
    }

    public static AdminPanel getInstance(){
        if(objInstance == null)
        {
            objInstance = new AdminPanel();
        }
        return objInstance;
    }

    public int getVersionNum(){
        return versionNum;
    }

    public void setVersionNum(int versionNum){
        this.versionNum = versionNum;
    }

}
