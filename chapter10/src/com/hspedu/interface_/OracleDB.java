package com.hspedu.interface_;

public class OracleDB implements DBInterface {
    @Override
    public void connect() {
        System.out.println("Oracle连接");
    }

    @Override
    public void close() {
        System.out.println("Oracle关闭");
    }
}
