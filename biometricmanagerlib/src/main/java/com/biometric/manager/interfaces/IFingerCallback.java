package com.biometric.manager.interfaces;

public interface IFingerCallback {

    void onError(String error);

    void onHelp(String help);

    void onSucceed();

    void onFailed();

    void onCancel();

    void onChange();
}
