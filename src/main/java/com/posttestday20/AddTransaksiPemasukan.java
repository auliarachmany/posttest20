package com.posttestday20;

import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;
import org.openqa.selenium.support.PageFactory;

public class AddTransaksiPemasukan {

    public AndroidDriver<MobileElement> driver;

    public AddTransaksiPemasukan(AndroidDriver<MobileElement> driver) {
        this.driver = driver;
        PageFactory.initElements(new AppiumFieldDecorator(driver), this);
    }

    @AndroidFindBy(id = "com.chad.financialrecord:id/fabMenu")
    MobileElement btnAdd;

    @AndroidFindBy(id = "com.chad.financialrecord:id/btnIncome")
    MobileElement btnPemasukan;

    @AndroidFindBy(id = "com.chad.financialrecord:id/tvDate")
    MobileElement selectTanggal;

    @AndroidFindBy(xpath = "//android.view.View[@content-desc=\"07 Juli 2023\"]")
    MobileElement choose7Juli;

    @AndroidFindBy(id = "android:id/button1")
    MobileElement btnOk;

    @AndroidFindBy(id = "com.chad.financialrecord:id/spCategory")
    MobileElement selectCategory;

    @AndroidFindBy(xpath = "/hierarchy/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.ListView/android.widget.LinearLayout[5]/android.widget.LinearLayout/android.widget.TextView")
    MobileElement chooseInvestasi;

    @AndroidFindBy(id = "com.chad.financialrecord:id/etAmount")
    MobileElement inputJumlah;

    @AndroidFindBy(id = "com.chad.financialrecord:id/etNote")
    MobileElement inputKeterangan;

    @AndroidFindBy(id = "com.chad.financialrecord:id/btSave")
    MobileElement btnSave;

    @AndroidFindBy(xpath = "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.RelativeLayout/android.widget.LinearLayout/android.view.ViewGroup[2]/android.widget.RelativeLayout/androidx.drawerlayout.widget.DrawerLayout/android.widget.LinearLayout/android.widget.RelativeLayout/android.widget.LinearLayout/android.widget.LinearLayout/androidx.viewpager.widget.ViewPager/android.widget.RelativeLayout/android.widget.RelativeLayout/android.widget.ExpandableListView/android.widget.LinearLayout[1]/android.widget.LinearLayout/android.widget.TextView[2]")
    MobileElement txtPemasukkan;

    public void btnAdd() {
        btnAdd.click();
    }

    public void transaksiPemasukkan() {
        btnPemasukan.click();
        selectTanggal.click();
        choose7Juli.click();
        btnOk.click();
        selectCategory.click();
        chooseInvestasi.click();
        inputJumlah.sendKeys("100");
        inputKeterangan.sendKeys("emas");
        btnSave.click();
    }

    public String getTxtPemasukkan() {
        return txtPemasukkan.getText();
    }

}
