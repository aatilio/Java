package FTX;

public class Targeta {
    private String numTargeta = "1111222233334444";
    private int cvv = 456;
    private String vencimiento = "02/27";

    public String getNumTargeta() {
        return numTargeta;
    }

    public void setNumTargeta(String numTargeta) {
        this.numTargeta = numTargeta;
    }

    public int getCvv() {
        return cvv;
    }

    public void setCvv(int cvv) {
        this.cvv = cvv;
    }

    public String getVencimiento() {
        return vencimiento;
    }

    public void setVencimiento(String vencimiento) {
        this.vencimiento = vencimiento;
    }

    public boolean esValidoLaTargeta(String num, String data) {
        if (num.equals(numTargeta) && data.equals(vencimiento)) {
            return true;
        } else {
            return false;
        }
    }

}