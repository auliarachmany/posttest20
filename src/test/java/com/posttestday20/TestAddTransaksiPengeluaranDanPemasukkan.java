package com.posttestday20;

import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.net.MalformedURLException;
import java.net.URL;

public class TestAddTransaksiPengeluaranDanPemasukkan {
    private static AndroidDriver<MobileElement> driver;
    private AddTransaksiPengeluaran addTransaksiPengeluaran;

    private AddTransaksiPemasukan addTransaksiPemasukan;

    @BeforeClass
    public void setUp() throws MalformedURLException {
        DesiredCapabilities capabilities = new DesiredCapabilities();
        capabilities.setCapability("deviceName", "M2010J19CG");
        capabilities.setCapability("platformName", "Android");
        capabilities.setCapability("platformVersion", "10.0.0");
        capabilities.setCapability("appPackage", "com.chad.financialrecord");
        capabilities.setCapability("appActivity", "com.rookie.catatankeuangan.feature.splash.SplashActivity");

        driver = new AndroidDriver<MobileElement>(new URL("http://127.0.0.1:4723/wd/hub"), capabilities);
    }

    @BeforeMethod
    public void pageObject() {
        addTransaksiPengeluaran = new AddTransaksiPengeluaran(driver);
        addTransaksiPemasukan  = new AddTransaksiPemasukan(driver);
    }

    @Test(priority = 1)
    public void testAddTransaksiPengeluaran() {
        addTransaksiPengeluaran.btnAdd();
        addTransaksiPengeluaran.transaksiPengeluaran();
        Assert.assertEquals(addTransaksiPengeluaran.getTxtPengeluaran(), "nasi goreng");
    }

    @Test(priority = 2)
    public void testAddTransaksiPemasukkan() {
        addTransaksiPemasukan.btnAdd();
        addTransaksiPemasukan.transaksiPemasukkan();
        Assert.assertEquals(addTransaksiPemasukan.getTxtPemasukkan(), "emas");
    }

    @AfterClass
    public void closeApp() {
        driver.quit();
    }
}
