package skid.gay.sex.spermix.inside.shalopay.k;

import java.io.BufferedInputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.InputStream;

import skid.gay.sex.spermix.inside.shalopay.features.module.modules.combat.MobAura;
import skid.gay.sex.spermix.inside.shalopay.j.bx;

public class K extends MobAura {
   
   protected File a;

   public boolean b(String var1) {
      File var2 = new File(this.a, var1.substring(1));
      return !var2.exists() ? false : var2.isDirectory();
   }

   public K(String var1, File var2) {
      this.a = var2;
   }

   public void b() {
   }

   public InputStream a(String var1) {
      try {
         String var2 = bx.c(var1, "/", "/");
         File var3 = new File(this.a, var2);
         return !var3.exists() ? null : new BufferedInputStream(new FileInputStream(var3));
      } catch (Exception var4) {
         return null;
      }
   }

   public String a() {
      return this.a.getName();
   }
}
