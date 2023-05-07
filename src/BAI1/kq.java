package BAI1;

public class kq {
    public static void main(String[] args) {
        System.out.println("-----------------------THONG TIN CONG NHAN-----------------------");
        CongNhan cn = new CongNhan("Dong Van Dat", 20, "Nam", "Ha Tinh", 10);
        System.out.println("Ho va Ten: " + cn.getHoTen() + "\nTuoi: " + cn.getTuoi() + "\nGioi tinh: "
                + cn.getGioiTinh() + "\nDia chi: " + cn.getDiaChi() + "\nbac: " + cn.getBac());
        System.out.println("----------------------THONG TIN KI SU-----------------------------");
        KiSu ks = new KiSu("Dong Truong Chinh", 29, "Nam", "Ha Tinh", "CNTT");
        System.out.println("Ho va Ten: " + ks.getHoTen() + "\nTuoi: " + ks.getTuoi() + "\nGioi tinh: "
                + ks.getGioiTinh() + "\nDia Chi: " + ks.getDiaChi() + "\nNganh dao tao: " + ks.getNganhDaoTao());

        System.out.println("----------------------THONG TIN NHAN VIEN-------------------------");
        NhanVien nv = new NhanVien("Dong Thi Minh", 32, "Nu", "Ha Tinh", "Sale");
        System.out.println("Ho va Ten: " + nv.getHoTen() + "\nTuoi: " + nv.getTuoi() + "\nGioi tinh: "
                + nv.getGioiTinh() + "\nDia Chi: " + nv.getDiaChi() + "\nCong viec: " + nv.getCongViec());
    }

}
