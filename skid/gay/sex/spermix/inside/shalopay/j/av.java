package skid.gay.sex.spermix.inside.shalopay.j;

import java.io.OutputStream;
import java.net.InetSocketAddress;
import java.net.Proxy;
import java.net.Socket;
import java.nio.charset.Charset;
import java.util.Iterator;
import java.util.Map;

public class av extends Thread {
   
   private as a = null;
   
   private static Charset b = Charset.forName("ASCII");

   public av(as var1) {
      super("HttpPipelineSender");
      this.a = var1;
   }

   private void a(aw var1, OutputStream var2) {
      this.a(var2, String.valueOf((new StringBuilder(String.valueOf(var1.c()))).append(" ").append(var1.d()).append(" ").append(var1.e()).append("\r\n")));
      Map var3 = var1.f();
      Iterator var5 = var3.keySet().iterator();

      while(var5.hasNext()) {
         String var4 = (String)var5.next();
         String var6 = (String)var1.f().get(var4);
         this.a(var2, String.valueOf((new StringBuilder(String.valueOf(var4))).append(": ").append(var6).append("\r\n")));
      }

      this.a(var2, "\r\n");
   }

   public void run() {
      au var1 = null;

      try {
         this.a();

         while(!Thread.interrupted()) {
            var1 = this.a.c();
            aw var2 = var1.a();
            OutputStream var3 = this.a.a();
            this.a(var2, var3);
            this.a.b(var1);
         }
      } catch (InterruptedException var4) {
         return;
      } catch (Exception var5) {
         this.a.a(var1, var5);
      }

   }

   private void a() {
      String var1 = this.a.f();
      int var2 = this.a.g();
      Proxy var3 = this.a.h();
      Socket var4 = new Socket(var3);
      var4.connect(new InetSocketAddress(var1, var2), 5000);
      this.a.a(var4);
   }

   private void a(OutputStream var1, String var2) {
      byte[] var3 = var2.getBytes(b);
      var1.write(var3);
   }
}
