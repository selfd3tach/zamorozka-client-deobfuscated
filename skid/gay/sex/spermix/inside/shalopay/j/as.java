package skid.gay.sex.spermix.inside.shalopay.j;

import java.io.BufferedOutputStream;
import java.io.EOFException;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.Proxy;
import java.net.Socket;
import java.util.LinkedList;
import java.util.List;
import java.util.regex.Pattern;

public class as {
   
   private String a = null;
   
   private int k;
   
   private int n;
   
   private Proxy c;
   
   private int b = 0;
   
   private Socket f;
   
   private List d;
   
   private long m;
   
   private boolean l;
   
   private InputStream g;
   
   private boolean p;
   
   private OutputStream h;
   
   private av i;
   
   private long o;
   
   private at j;
   
   private static final Pattern q = Pattern.compile("^[a-zA-Z]+://.*");
   
   private List e;

   private au a(List var1, boolean var2) {
      while(var1.size() <= 0) {
         this.i();
         this.wait(1000L);
      }

      this.j();
      if (var2) {
         return (au)var1.remove(0);
      } else {
         return (au)var1.get(0);
      }
   }

   private void b(Exception var1) {
      if (this.d.size() > 0) {
         au var2;
         if (!this.l) {
            var2 = (au)this.d.remove(0);
            var2.b().a(var2.a(), var1);
            var2.a(true);
         }

         while(this.d.size() > 0) {
            var2 = (au)this.d.remove(0);
            aq.a(var2);
         }
      }

   }

   public synchronized boolean a(au var1) {
      if (this.e()) {
         return false;
      } else {
         this.a(var1, this.d);
         this.a(var1, this.e);
         ++this.k;
         return true;
      }
   }

   public Proxy h() {
      return this.c;
   }

   private String a(String var1, aw var2) {
      if (q.matcher(var1).matches()) {
         return var1;
      } else if (var1.startsWith("//")) {
         return String.valueOf((new StringBuilder("http:")).append(var1));
      } else {
         String var3 = var2.a();
         if (var2.b() != 80) {
            var3 = String.valueOf((new StringBuilder(String.valueOf(var3))).append(":").append(var2.b()));
         }

         if (var1.startsWith("/")) {
            return String.valueOf((new StringBuilder("http://")).append(var3).append(var1));
         } else {
            String var4 = var2.d();
            int var5 = var4.lastIndexOf("/");
            return var5 >= 0 ? String.valueOf((new StringBuilder("http://")).append(var3).append(var4.substring(0, var5 + 1)).append(var1)) : String.valueOf((new StringBuilder("http://")).append(var3).append("/").append(var1));
         }
      }
   }

   public synchronized void b(au var1, Exception var2) {
      this.a(var2);
   }

   private synchronized void a(Exception var1) {
      if (!this.p) {
         this.p = true;
         this.b(var1);
         if (this.i != null) {
            this.i.interrupt();
         }

         if (this.j != null) {
            this.j.interrupt();
         }

         try {
            if (this.f != null) {
               this.f.close();
            }
         } catch (IOException var3) {
         }

         this.f = null;
         this.g = null;
         this.h = null;
      }

   }

   public synchronized OutputStream a() {
      while(this.h == null) {
         this.i();
         this.wait(1000L);
      }

      return this.h;
   }

   public synchronized au d() {
      return this.a(this.d, false);
   }

   private String[] a(String var1, char var2) {
      int var3 = var1.indexOf(var2);
      if (var3 < 0) {
         return new String[]{var1};
      } else {
         String var4 = var1.substring(0, var3);
         String var5 = var1.substring(var3 + 1);
         return new String[]{var4, var5};
      }
   }

   public synchronized void a(Socket var1) {
      if (!this.p) {
         if (this.f != null) {
            throw new IllegalArgumentException("Already connected");
         }

         this.f = var1;
         this.f.setTcpNoDelay(true);
         this.g = this.f.getInputStream();
         this.h = new BufferedOutputStream(this.f.getOutputStream());
         this.j();
         this.notifyAll();
      }

   }

   public synchronized void a(au var1, ax var2) {
      if (!this.p) {
         this.l = true;
         this.j();
         if (this.d.size() <= 0 || this.d.get(0) != var1) {
            throw new IllegalArgumentException(String.valueOf((new StringBuilder("Response out of order: ")).append(var1)));
         }

         this.d.remove(0);
         var1.a(true);
         String var3 = var2.a("Location");
         if (var2.a() / 100 == 3 && var3 != null && var1.a().g() < 5) {
            try {
               var3 = this.a(var3, var1.a());
               aw var7 = aq.a(var3, var1.a().h());
               var7.a(var1.a().g() + 1);
               au var5 = new au(var7, var1.b());
               aq.a(var5);
            } catch (IOException var6) {
               var1.b().a(var1.a(), (Exception)var6);
            }
         } else {
            ap var4 = var1.b();
            var4.a(var1.a(), var2);
         }

         this.a(var2);
      }

   }

   public synchronized InputStream b() {
      while(this.g == null) {
         this.i();
         this.wait(1000L);
      }

      return this.g;
   }

   private void j() {
      this.o = System.currentTimeMillis();
   }

   private void a(au var1, List var2) {
      var2.add(var1);
      this.notifyAll();
   }

   public int g() {
      return this.b;
   }

   public synchronized au c() {
      if (this.e.size() <= 0 && this.h != null) {
         this.h.flush();
      }

      return this.a(this.e, true);
   }

   public String f() {
      return this.a;
   }

   private void a(ax var1) {
      String var2 = var1.a("Connection");
      if (var2 != null && !var2.toLowerCase().equals("keep-alive")) {
         this.a((Exception)(new EOFException("Connection not keep-alive")));
      }

      String var3 = var1.a("Keep-Alive");
      if (var3 != null) {
         String[] var4 = skid.gay.sex.spermix.inside.shalopay.RadioShanson.FastAura.a(var3, ",;");

         for(int var5 = 0; var5 < var4.length; ++var5) {
            String var6 = var4[var5];
            String[] var7 = this.a(var6, '=');
            if (var7.length >= 2) {
               int var8;
               if (var7[0].equals("timeout")) {
                  var8 = skid.gay.sex.spermix.inside.shalopay.RadioShanson.FastAura.a((String)var7[1], -1);
                  if (var8 > 0) {
                     this.m = (long)(var8 * 1000);
                  }
               }

               if (var7[0].equals("max")) {
                  var8 = skid.gay.sex.spermix.inside.shalopay.RadioShanson.FastAura.a((String)var7[1], -1);
                  if (var8 > 0) {
                     this.n = var8;
                  }
               }
            }
         }
      }

   }

   public as(String var1, int var2, Proxy var3) {
      this.c = Proxy.NO_PROXY;
      this.d = new LinkedList();
      this.e = new LinkedList();
      this.f = null;
      this.g = null;
      this.h = null;
      this.i = null;
      this.j = null;
      this.k = 0;
      this.l = false;
      this.m = 5000L;
      this.n = 1000;
      this.o = System.currentTimeMillis();
      this.p = false;
      this.a = var1;
      this.b = var2;
      this.c = var3;
      this.i = new av(this);
      this.i.start();
      this.j = new at(this);
      this.j.start();
   }

   public synchronized void b(au var1) {
      if (!this.p) {
         this.j();
      }

   }

   public synchronized void a(au var1, Exception var2) {
      this.a(var2);
   }

   public synchronized boolean e() {
      if (this.p) {
         return true;
      } else {
         return this.k >= this.n;
      }
   }

   private void i() {
      if (this.f != null) {
         long var1 = this.m;
         if (this.d.size() > 0) {
            var1 = 5000L;
         }

         long var3 = System.currentTimeMillis();
         if (var3 > this.o + var1) {
            this.a((Exception)(new InterruptedException(String.valueOf((new StringBuilder("Timeout ")).append(var1)))));
         }
      }

   }
}
