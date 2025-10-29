package thigk1.NguyenPhucTamHuy;

public class CongTrinh {

    String tenCongTrinh;
    String thoiGian;
    int hinhAnh;

    public CongTrinh(String tenCongTrinh, String thoiGian, int hinhAnh) {
        this.tenCongTrinh = tenCongTrinh;
        this.thoiGian = thoiGian;
        this.hinhAnh = hinhAnh;
    }

    public String getTenCongTrinh() {
        return tenCongTrinh;
    }

    public String getThoiGian() {
        return thoiGian;
    }

    public int getHinhAnh() {
        return hinhAnh;
    }
}
