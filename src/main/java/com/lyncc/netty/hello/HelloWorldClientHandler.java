package com.lyncc.netty.hello;

import io.netty.channel.ChannelHandlerContext;
import io.netty.channel.ChannelInboundHandlerAdapter;

public class HelloWorldClientHandler extends ChannelInboundHandlerAdapter{
    
    
      @Override
      public void channelActive(ChannelHandlerContext ctx) {
          System.out.println("HelloWorldClientHandler1 Active");
          ctx.fireChannelActive();
      }
  
      @Override
      public void channelRead(ChannelHandlerContext ctx, Object msg) {
         System.out.println("HelloWorldClientHandler1 read Message:"+msg);
      }
      
      @Override
    public void channelInactive(ChannelHandlerContext ctx) throws Exception {
          System.out.println("HelloWorldClientHandler1 inActive===========");
        super.channelInactive(ctx);
    }
  
  
     @Override
     public void exceptionCaught(ChannelHandlerContext ctx, Throwable cause) {
         cause.printStackTrace();
         ctx.close();
      }

}
