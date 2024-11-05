import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.function.Executable;

import static org.junit.jupiter.api.Assertions.*;

class HinhChuNhatTest {

    @org.junit.jupiter.api.Test
    void getChieuDai() {
        HinhChuNhat hcn = new HinhChuNhat();
        Assertions.assertEquals(1.0, hcn.getChieuDai());
    }

    @org.junit.jupiter.api.Test
    void setChieuDai() {
        HinhChuNhat hcn = new HinhChuNhat(3, 4);
        hcn.setChieuDai(5);
        Assertions.assertEquals(5, hcn.getChieuDai());

        // test: neu canh am: -> nem ra exception: RuntimeException "Canh khong am"
        Exception exception = Assertions.assertThrows(RuntimeException.class, new Executable() {
            @Override
            public void execute() throws Throwable {
                // Code thuc thi
                hcn.setChieuDai(-1);
            }
        });
        Assertions.assertEquals("Canh khong am", exception.getMessage());
    }

    @org.junit.jupiter.api.Test
    void getChieuRong() {
        HinhChuNhat hcn = new HinhChuNhat();
        Assertions.assertEquals(1.0, hcn.getChieuRong());
    }

    @org.junit.jupiter.api.Test
    void dienTich() {
        HinhChuNhat hcn = new HinhChuNhat(45.567,87.262);
        Assertions.assertEquals(3976.27, hcn.dienTich());
    }

}