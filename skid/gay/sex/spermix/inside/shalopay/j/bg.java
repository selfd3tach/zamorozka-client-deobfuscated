package skid.gay.sex.spermix.inside.shalopay.j;

import java.util.ArrayList;
import java.util.Properties;
import net.minecraft.entity.EntityLiving;
import net.minecraft.util.ResourceLocation;
import net.minecraft.world.biome.Biome;

public class bg {
   
   public String b = null;
   
   public String a = null;
   
   public bh[] d = null;
   
   public ResourceLocation[] c = null;

   public bg(String var1, ResourceLocation[] var2) {
      ArrayList var3 = new ArrayList("RandomMobs");
      this.a = var3.a(var1);
      this.b = var3.b(var1);
      this.c = var2;
   }

   private bj a(Properties var1, int var2) {
      String var3 = var1.getProperty(String.valueOf((new StringBuilder("minHeight.")).append(var2)));
      String var4 = var1.getProperty(String.valueOf((new StringBuilder("maxHeight.")).append(var2)));
      if (var3 == null && var4 == null) {
         return null;
      } else {
         int var5 = 0;
         if (var3 != null) {
            var5 = FastAura.a((String)var3, -1);
            if (var5 < 0) {
               FastAura.b(String.valueOf((new StringBuilder("Invalid minHeight: ")).append(var3)));
               return null;
            }
         }

         int var6 = 256;
         if (var4 != null) {
            var6 = FastAura.a((String)var4, -1);
            if (var6 < 0) {
               FastAura.b(String.valueOf((new StringBuilder("Invalid maxHeight: ")).append(var4)));
               return null;
            }
         }

         if (var6 < 0) {
            FastAura.b(String.valueOf((new StringBuilder("Invalid minHeight, maxHeight: ")).append(var3).append(", ").append(var4)));
            return null;
         } else {
            bj var7 = new bj();
            var7.a(new bi(var5, var6));
            return var7;
         }
      }
   }

   private bh[] a(Properties var1, ResourceLocation var2, ArrayList var3) {
      ArrayList var4 = new ArrayList();
      int var5 = var1.size();

      for(int var6 = 0; var6 < var5; ++var6) {
         int var7 = var6 + 1;
         String var8 = var1.getProperty(String.valueOf((new StringBuilder("skins.")).append(var7)));
         if (var8 != null) {
            int[] var9 = var3.i(var8);
            int[] var10 = var3.i(var1.getProperty(String.valueOf((new StringBuilder("weights.")).append(var7))));
            Biome[] var11 = var3.f(var1.getProperty(String.valueOf((new StringBuilder("biomes.")).append(var7))));
            bj var12 = var3.k(var1.getProperty(String.valueOf((new StringBuilder("heights.")).append(var7))));
            if (var12 == null) {
               var12 = this.a(var1, var7);
            }

            bh var13 = new bh(var2, var9, var10, var11, var12);
            var4.add(var13);
         }
      }

      bh[] var14 = (bh[])var4.toArray(new bh[var4.size()]);
      return var14;
   }

   public boolean a(String var1) {
      if (this.c == null && this.d == null) {
         FastAura.b(String.valueOf((new StringBuilder("No skins specified: ")).append(var1)));
         return false;
      } else {
         int var2;
         if (this.d != null) {
            for(var2 = 0; var2 < this.d.length; ++var2) {
               bh var3 = this.d[var2];
               if (!var3.a(var1)) {
                  return false;
               }
            }
         }

         if (this.c != null) {
            for(var2 = 0; var2 < this.c.length; ++var2) {
               ResourceLocation var4 = this.c[var2];
               if (!FastAura.b(var4)) {
                  FastAura.b(String.valueOf((new StringBuilder("Texture not found: ")).append(var4.getResourcePath())));
                  return false;
               }
            }
         }

         return true;
      }
   }

   public bg(Properties var1, String var2, ResourceLocation var3) {
      ArrayList var4 = new ArrayList("RandomMobs");
      this.a = var4.a(var2);
      this.b = var4.b(var2);
      this.d = this.a(var1, var3, var4);
   }

   public ResourceLocation a(ResourceLocation var1, EntityLiving var2) {
      int var3;
      if (this.d != null) {
         for(var3 = 0; var3 < this.d.length; ++var3) {
            bh var4 = this.d[var3];
            if (var4.a(var2)) {
               return var4.a(var1, var2.randomMobsId);
            }
         }
      }

      if (this.c != null) {
         var3 = var2.randomMobsId;
         int var5 = var3 % this.c.length;
         return this.c[var5];
      } else {
         return var1;
      }
   }
}
