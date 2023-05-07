package BAI2;

public class Nguoi {
    private String hoTen;
    private int tuoi;
    private String queQuan;
    private int maSoGV;

    public Nguoi(String hoTen, int tuoi, String queQuan, int maSoGV) {
        this.hoTen = hoTen;
        this.tuoi = tuoi;
        this.queQuan = queQuan;
        this.maSoGV = maSoGV;
    }

    public String getHoTen() {
        return hoTen;
    }

    public void setHoTen(String hoTen) {
        this.hoTen = hoTen;
    }

    public int getTuoi() {
        return tuoi;
    }

    public void setTuoi(int tuoi) {
        this.tuoi = tuoi;
    }

    public String getQueQuan() {
        return queQuan;
    }

    public void setQueQuan(String queQuan) {
        this.queQuan = queQuan;
    }

    public int getMaSoGV() {
        return maSoGV;
    }

    public void setMaSoGV(int maSoGV) {
        this.maSoGV = maSoGV;
    }
}
