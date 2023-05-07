package BAI2;

public class kq {
    public static void main(String[] args) {
        CBGV ql = new CBGV("Dong Van Dat", 20, "Ha Tinh", 99382, 10000, 2000, 2000);
        System.out.println("------------------THONG TIN QUAN LI THANH TOAN GV-------------------------");
        System.out.println("Ho ten: "+ql.getHoTen()+"\nTuoi: "+ql.getTuoi()+"\nQue quan: "+ql.getQueQuan()+"\nMa so giao vien: "+ql.getMaSoGV()+"\nLuong cung "+ql.getLuongCung()+"\nLuong thuong: "+ql.getLuongThuong()+"\nTien phat "+ql.getTienPhat()+"\nLuong thuc linh: "+ql.getLuongThucLinh());
    }
}
