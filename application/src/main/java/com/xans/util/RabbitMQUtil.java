package com.xans.util;
 
import javax.swing.JOptionPane;

import cn.hutool.core.net.NetUtil;
 
public class RabbitMQUtil {
 
    public static void main(String[] args) {
        checkServer();
    }
    public static void checkServer() {
        if(NetUtil.isUsableLocalPort(15672)) {
            JOptionPane.showMessageDialog(null, "RabbitMQ 服务器未启动 ");
            System.exit(1);
        }
    }
}