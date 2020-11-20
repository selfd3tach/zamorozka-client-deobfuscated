package skid.gay.sex.spermix.inside.shalopay.j;

import java.util.Properties;
import net.minecraft.util.ResourceLocation;

public class Q {
   
   private int g = -2130706433;
   
   private int j = Integer.MIN_VALUE;
   
   private int e = 3;
   
   private int h = 16777215;
   
   private String a;
   
   private int i = 0;
   
   private int f = 3;
   
   private int c = 1;
   
   private int d = 64;
   
   private ResourceLocation[] b;

   public int c() {
      return this.e;
   }

   public int d() {
      return this.f;
   }

   public int b() {
      return this.d;
   }

   public Q(String var1, Properties var2) {
      ArrayList var3 = new ArrayList("CustomPanorama");
      this.a = var1;
      this.b = new ResourceLocation[6];

      for(int var4 = 0; var4 < this.b.length; ++var4) {
         this.b[var4] = new ResourceLocation(String.valueOf((new StringBuilder(String.valueOf(var1))).append("/panorama_").append(var4).append(".png")));
      }

      this.c = var3.a((String)var2.getProperty("weight"), 1);
      this.d = var3.a((String)var2.getProperty("blur1"), 64);
      this.e = var3.a((String)var2.getProperty("blur2"), 3);
      this.f = var3.a((String)var2.getProperty("blur3"), 3);
      this.g = ArrayList.c(var2.getProperty("overlay1.top"), -2130706433);
      this.h = ArrayList.c(var2.getProperty("overlay1.bottom"), 16777215);
      this.i = ArrayList.c(var2.getProperty("overlay2.top"), 0);
      this.j = ArrayList.c(var2.getProperty("overlay2.bottom"), Integer.MIN_VALUE);
   }

   public String toString() {
      return String.valueOf((new StringBuilder()).append(this.a).append(", weight: ").append(this.c).append(", blur: ").append(this.d).append(" ").append(this.e).append(" ").append(this.f).append(", overlay: ").append(this.g).append(" ").append(this.h).append(" ").append(this.i).append(" ").append(this.j));
   }

   public ResourceLocation[] a() {
      return this.b;
   }
}
