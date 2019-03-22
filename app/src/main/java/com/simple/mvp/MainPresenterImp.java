package com.simple.mvp;


public class MainPresenterImp implements MainPresenter{
    MainView mainView;

    public MainPresenterImp(MainView mainView) {this.mainView =mainView;}


    @Override
    public void hitungLuas(Double alas, Double tinggi) {
        Double luas = alas*tinggi;
        mainView.updateTextHasil(luas);
    }

    @Override
    public void hitungKeliling(Double sisia, Double sisib) {
        Double keliling = 2*(sisia+sisib);
        mainView.updateTextKeliling(keliling);
    }
}
