package skid.gay.sex.spermix.inside.shalopay.k;

import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.util.zip.ZipEntry;
import java.util.zip.ZipFile;

import skid.gay.sex.spermix.inside.shalopay.features.module.modules.combat.MobAura;
import skid.gay.sex.spermix.inside.shalopay.j.bx;

public class O extends MobAura {
   
   protected File a;
   
   protected ZipFile b;

   public InputStream a(String var1) {
      try {
         if (this.b == null) {
            this.b = new ZipFile(this.a);
         }

         String var2 = bx.a(var1, "/");
         ZipEntry var3 = this.b.getEntry(var2);
         return var3 == null ? null : this.b.getInputStream(var3);
      } catch (Exception var4) {
         return null;
      }
   }

   public boolean b(String var1) {
      try {
         if (this.b == null) {
            this.b = new ZipFile(this.a);
         }

         String var2 = bx.a(var1, "/");
         ZipEntry var3 = this.b.getEntry(var2);
         return var3 != null;
      } catch (IOException var4) {
         return false;
      }
   }

   public O(String var1, File var2) {
      this.a = var2;
      this.b = null;
   }

   public String a() {
      return this.a.getName();
   }

   public void b() {
      if (this.b != null) {
         try {
            this.b.close();
         } catch (Exception var2) {
         }

         this.b = null;
      }

   }
}
