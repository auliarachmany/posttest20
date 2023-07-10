package com.posttestday20;

import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;
import org.openqa.selenium.support.PageFactory;

public class AddTransaksiPengeluaran {
    public AndroidDriver<MobileElement> driver;

    public AddTransaksiPengeluaran(AndroidDriver<MobileElement> driver) {
        this.driver = driver;
        PageFactory.initElements(new AppiumFieldDecorator(driver), this);
    }

    @AndroidFindBy(id = "com.android.permissioncontroller:id/permission_allow_button")
    MobileElement btnIzinkanPermission;

    @AndroidFindBy(id = "android:id/button2")
    MobileElement btnTutup;

    @AndroidFindBy(id = "com.chad.financialrecord:id/fabMenu")
    MobileElement btnAdd;

    @AndroidFindBy(id = "com.chad.financialrecord:id/tvDate")
    MobileElement selectTanggal;

    @AndroidFindBy(xpath = "//android.view.View[@content-desc=\"07 Juli 2023\"]")
    MobileElement choose7Juli;

    @AndroidFindBy(id = "android:id/button1")
    MobileElement btnOk;

    @AndroidFindBy(id = "com.chad.financialrecord:id/spCategory")
    MobileElement selectCategory;

    @AndroidFindBy(xpath = "/hierarchy/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.ListView/android.widget.LinearLayout[2]/android.widget.LinearLayout/android.widget.TextView")
    MobileElement chooseMakanan;

    @AndroidFindBy(id = "com.chad.financialrecord:id/etAmount")
    MobileElement inputJumlah;

    @AndroidFindBy(id = "com.chad.financialrecord:id/etNote")
    MobileElement inputKeterangan;

    @AndroidFindBy(id = "com.chad.financialrecord:id/btSave")
    MobileElement btnSave;

    @AndroidFindBy(id = "com.chad.financialrecord:id/tvDesc")
    MobileElement txtPengeluaran;

    public void btnAdd() {
        btnIzinkanPermission.click();
        btnTutup.click();
        btnAdd.click();
    }

    public void transaksiPengeluaran() {
        selectTanggal.click();
        choose7Juli.click();
        btnOk.click();
        selectCategory.click();
        chooseMakanan.click();
        inputJumlah.sendKeys("100");
        inputKeterangan.sendKeys("nasi goreng");
        btnSave.click();
    }

    public String getTxtPengeluaran() {
        return txtPengeluaran.getText();
    }
}
