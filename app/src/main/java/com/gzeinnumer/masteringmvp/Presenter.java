package com.gzeinnumer.masteringmvp;

public class Presenter {
    Interfaces interfaces;

    public Presenter(Interfaces interfaces){
        this.interfaces = interfaces;
    }

    public void getPesan(String s){
        if (s.equals("1")){
            interfaces.onGetDataSuccess("satu");
        } else {
            interfaces.onGetDataFailure("tunggu");
        }
    }

    public void loadData(String url){
        ///retrofit
        //onresponse
        interfaces.onGetDataSuccess("data didapatkan");
    }
}
