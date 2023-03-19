public class NhanVien
{
public String ten;
public long luong;

    public NhanVien(){}
    public NhanVien(String ten, long luong) {
        this.ten = ten;
        this.luong = luong;
    }

    public String getTen() {
        return ten;
    }

    public void setTen(String ten) {
        this.ten = ten;
    }

    public double getLuong() {
        return luong;
    }

    public void setLuong(long luong) {
        this.luong = luong;
    }
    public String loainhanvien()
    {
    String loainhanvien;
    System.out.println("nhap loai nhan vien ");
    System.out.println("1: nhanvienfulltime ");
    System.out.println("2: nhanvienparttime ");
    Scanner sc = new Scanner(System.in);
    loainhanvien = sc.nextLine();
    return loainhanvien;
    }
    public void tinhluong()
    {
    }
    public void xuatthongtin()
    {
    }

}
class NhanVienFullTime extends NhanVien
{
    public NhanVienFullTime(String ten, long luong) {
        super(ten, luong);
    }
    @Override 
    public void tinhluong()
    {
   
    }
    public void xuatthongtin()
    {
    System.out.println("luong nhan vien fulltime" );
    System.out.println("luong nhan vien fullttime" );
    }
}
class NhanVienPartTime extends NhanVien
{
    public NhanVienPartTime(String ten, long luong) {
        super(ten, luong);
    }
    @Override 
    public void tinhluong()
    {
    }
    public void xuatthongtin()
    {
    System.out.println("luong nhan vien parttime " );
    System.out.println("luong nhan vien parttime " );
    }
}
class main{
    public static void main(String[]args){
    }
}
