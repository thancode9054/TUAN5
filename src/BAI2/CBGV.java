package BAI2;

public class CBGV extends Nguoi {
    private int luongCung;
    private int luongThuong;
    private int tienPhat;
    private int luongThucLinh;

    public CBGV(String hoTen, int tuoi, String queQuan, int maSoGV, int luongCung, int luongThuong, int tienPhat) {
        super(hoTen, tuoi, queQuan, maSoGV);
        this.luongCung = luongCung;
        this.luongThuong = luongThuong;
        this.tienPhat = tienPhat;
    }

    public int getLuongCung() {
        return luongCung;
    }

    public void setLuongCung(int luongCung) {
        this.luongCung = luongCung;
    }

    public int getLuongThuong() {
        return luongThuong;
    }

    public void setLuongThuong(int luongThuong) {
        this.luongThuong = luongThuong;
    }

    public int getTienPhat() {
        return tienPhat;
    }

    public void setTienPhat(int tienPhat) {
        this.tienPhat = tienPhat;
    }

    public int getLuongThucLinh() {
        this.luongThucLinh=this.luongCung+this.luongThuong-this.tienPhat;
        return luongThucLinh ;
    }
    public void setLuongThucLinh(int luongThucLinh){
        this.luongThucLinh=luongThucLinh;
    }

}
