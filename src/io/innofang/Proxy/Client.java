package io.innofang.Proxy;

/**
 * Created by Inno Fang on 2017/4/8.
 */
public class Client {
    public static void main(String[] args) {
        IPicker picker = new RealPicker();
        ProxyPicker proxyPicker = new ProxyPicker(picker);

        proxyPicker.receiveMessage();
        proxyPicker.takeCourier();
        proxyPicker.signatureAcceptance();
    }
}
