package com.saic20200725.demo.controller;

import java.io.FileInputStream;
import java.io.IOException;
import java.nio.ByteBuffer;
import java.nio.channels.FileChannel;
import java.nio.channels.spi.SelectorProvider;

/**
 * @author tony liu
 * @description：TODO
 * @date 2020/7/26 15:44
 */
public class Main {

    static private  final  byte [] message ={42,87,94,123,46,85,61,68,};
    public static void main(String[] args) throws IOException {
       FileInputStream fileInputStream=new FileInputStream("E://NioReadWrite/test.txt");
        FileChannel fileChannel=fileInputStream.getChannel();
        SelectorProvider.provider().openSelector();
        ByteBuffer byteBuffer=ByteBuffer.allocate(1024);
         fileChannel.read(byteBuffer);
              byteBuffer.flip();
              while (byteBuffer.hasRemaining()){
               System.out.println(byteBuffer.get()+"  ");
              }
              fileChannel.close();
              fileInputStream.close();
    }

}
