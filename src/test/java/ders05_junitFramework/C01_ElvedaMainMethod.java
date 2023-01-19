package ders05_junitFramework;

import org.bouncycastle.pqc.crypto.qtesla.QTeslaKeyEncodingTests;
import org.junit.Ignore;
import org.junit.Test;

public class C01_ElvedaMainMethod {

    @Test
    public void test01(){
        System.out.println("Test 01 calisti");
        //@Test notasyonu sayesinde her bir test method'u bagimsiz olarak calisabilir
        //eger testin icerisinde bir assertion yoksa
        //kod problem yasanmadan calisip bittiginde
        //JUnit test passed olarak raporlar
    }
    @Test @Ignore
    public void test02(){
        System.out.println("Test 02 calisti");
        // @Ignore notasyonu yazildigi method'unun calistirilmamasını saglar

    }

    @Test
    public void test03(){
        System.out.println("Test 03 calisti");
    }
}
