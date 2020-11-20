package skid.gay.sex.spermix.inside.shalopay.features.module;

import skid.gay.sex.spermix.inside.shalopay.features.idk.n;
import net.minecraft.client.Minecraft;

public class Module {
   
   private static boolean f;
   
   protected int a;
   
   private String d;
   
   protected boolean b;
   
   private ModuleCategory e;
   
   public static Minecraft mc = Minecraft.getMinecraft();

   public int l() {
      return this.a;
   }

   public boolean a(String var1) {
      return true;
   }

   public boolean a(boolean var1) {
      this.e();
      if (var1) {
         n.c();
         this.f();
         this.b = true;
      } else {
         this.g();
         this.b = false;
      }

      return var1;
   }

   public String a() {
      return this.d;
   }

   public boolean c() {
      return this.b;
   }

   public void g() {
   }

   public void k() {
      f = !f;
      this.e();
      if (f) {
         this.f();
      } else {
         this.g();
      }

   }

   public void f() {
   }

   public void i() {
   }

   public ModuleCategory b() {
      return this.e;
   }

   public void j() {
   }

   public void e() {
   }

   public void a(int var1) {
      this.a = var1;
   }

   public void d() {
      this.a(!this.c());
   }

   public Module(String name, int keyBind, ModuleCategory category) {
      this.d = name;
      this.a = keyBind;
      this.e = category;
      this.j();
   }

   public void h() {
   }
}
