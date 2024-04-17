package com.hspedu.interface_;

public class MysqlDB implements DBInterface {
    @Override
    public void connect() {
        System.out.println("Mysql连接");
    }

    @Override
    public void close() {
        System.out.println("Mysql关闭");
    }
}
