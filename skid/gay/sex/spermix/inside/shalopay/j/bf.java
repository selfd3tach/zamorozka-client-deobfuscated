package skid.gay.sex.spermix.inside.shalopay.j;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Properties;
import java.util.Random;
import java.util.UUID;
import net.minecraft.client.renderer.RenderGlobal;
import net.minecraft.entity.Entity;
import net.minecraft.entity.EntityLiving;
import net.minecraft.util.ResourceLocation;
import net.minecraft.world.World;

public class bf {
   
   private static boolean c = false;
   
   private static Random d = new Random();
   
   private static RenderGlobal b = null;
   
   private static final String[] f = new String[]{"_armor", "_eyes", "_exploding", "_shooting", "_fur", "_eyes", "_invulnerable", "_angry", "_tame", "_collar"};
   
   private static Map a = new HashMap();
   
   private static boolean e = false;

   public static void a() {
      a.clear();
      if (FastAura.aA()) {
         b();
      }

   }

   private static String a(String var0) {
      for(int var1 = 0; var1 < f.length; ++var1) {
         String var2 = f[var1];
         if (var0.endsWith(var2)) {
            String var3 = var0.substring(0, var0.length() - var2.length());
            return var3;
         }
      }

      return null;
   }

   private static ResourceLocation e(ResourceLocation var0) {
      ResourceLocation var1 = b(var0);
      if (var1 == null) {
         return null;
      } else {
         String var2 = var1.getResourceDomain();
         String var3 = var1.getResourcePath();
         String var4 = var3;
         if (var3.endsWith(".png")) {
            var4 = var3.substring(0, var3.length() - ".png".length());
         }

         String var5 = String.valueOf((new StringBuilder(String.valueOf(var4))).append(".properties"));
         ResourceLocation var6 = new ResourceLocation(var2, var5);
         if (FastAura.b(var6)) {
            return var6;
         } else {
            String var7 = a(var4);
            if (var7 == null) {
               return null;
            } else {
               ResourceLocation var8 = new ResourceLocation(var2, String.valueOf((new StringBuilder(String.valueOf(var7))).append(".properties")));
               return FastAura.b(var8) ? var8 : null;
            }
         }
      }
   }

   public static ResourceLocation a(ResourceLocation var0, int var1) {
      if (var0 == null) {
         return null;
      } else {
         String var2 = var0.getResourcePath();
         int var3 = var2.lastIndexOf(46);
         if (var3 < 0) {
            return null;
         } else {
            String var4 = var2.substring(0, var3);
            String var5 = var2.substring(var3);
            String var6 = String.valueOf((new StringBuilder(String.valueOf(var4))).append(var1).append(var5));
            ResourceLocation var7 = new ResourceLocation(var0.getResourceDomain(), var6);
            return var7;
         }
      }
   }

   private static bg d(ResourceLocation var0) {
      String var1 = var0.getResourcePath();
      ResourceLocation var2 = e(var0);
      if (var2 != null) {
         bg var3 = a(var2, var0);
         if (var3 != null) {
            return var3;
         }
      }

      ResourceLocation[] var4 = f(var0);
      return new bg(var1, var4);
   }

   public static ResourceLocation a(ResourceLocation var0) {
      if (e) {
         return var0;
      } else {
         ResourceLocation var8;
         try {
            e = true;
            if (!c) {
               b();
            }

            if (b == null) {
               ResourceLocation var1 = var0;
               return var1;
            }

            Entity var2 = b.renderedEntity;
            if (var2 instanceof EntityLiving) {
               EntityLiving var3 = (EntityLiving)var2;
               String var4 = var0.getResourcePath();
               if (!var4.startsWith("textures/entity/")) {
                  var8 = var0;
                  return var8;
               }

               bg var5 = c(var0);
               if (var5 == null) {
                  var8 = var0;
                  return var8;
               }

               ResourceLocation var6 = var5.a(var0, var3);
               var8 = var6;
               return var8;
            }

            var8 = var0;
         } finally {
            e = false;
         }

         return var8;
      }
   }

   private static ResourceLocation[] f(ResourceLocation var0) {
      ArrayList var1 = new ArrayList();
      var1.add(var0);
      ResourceLocation var2 = b(var0);
      if (var2 == null) {
         return null;
      } else {
         for(int var3 = 1; var3 < var1.size() + 10; ++var3) {
            int var4 = var3 + 1;
            ResourceLocation var5 = a(var2, var4);
            if (FastAura.b(var5)) {
               var1.add(var5);
            }
         }

         if (var1.size() <= 1) {
            return null;
         } else {
            ResourceLocation[] var6 = (ResourceLocation[])var1.toArray(new ResourceLocation[var1.size()]);
            FastAura.a(String.valueOf((new StringBuilder("RandomMobs: ")).append(var0.getResourcePath()).append(", variants: ").append(var6.length)));
            return var6;
         }
      }
   }

   public static void a(Entity var0, World var1) {
      if (var0 instanceof EntityLiving && var1 != null) {
         EntityLiving var2 = (EntityLiving)var0;
         var2.spawnPosition = var2.getPosition();
         var2.spawnBiome = var1.getBiome(var2.spawnPosition);
         UUID var3 = var2.getUniqueID();
         long var4 = var3.getLeastSignificantBits();
         int var6 = (int)(var4 & 2147483647L);
         var2.randomMobsId = var6;
      }

   }

   public static ResourceLocation b(ResourceLocation var0) {
      String var1 = var0.getResourcePath();
      if (!var1.startsWith("textures/entity/")) {
         return null;
      } else {
         String var2 = String.valueOf((new StringBuilder("mcpatcher/mob/")).append(var1.substring("textures/entity/".length())));
         return new ResourceLocation(var0.getResourceDomain(), var2);
      }
   }

   private static void b() {
      b = FastAura.X();
      if (b != null) {
         c = true;
         ArrayList var0 = new ArrayList();
         var0.add("bat");
         var0.add("blaze");
         var0.add("cat/black");
         var0.add("cat/ocelot");
         var0.add("cat/red");
         var0.add("cat/siamese");
         var0.add("chicken");
         var0.add("cow/cow");
         var0.add("cow/mooshroom");
         var0.add("creeper/creeper");
         var0.add("enderman/enderman");
         var0.add("enderman/enderman_eyes");
         var0.add("ghast/ghast");
         var0.add("ghast/ghast_shooting");
         var0.add("iron_golem");
         var0.add("pig/pig");
         var0.add("sheep/sheep");
         var0.add("sheep/sheep_fur");
         var0.add("silverfish");
         var0.add("skeleton/skeleton");
         var0.add("skeleton/wither_skeleton");
         var0.add("slime/slime");
         var0.add("slime/magmacube");
         var0.add("snowman");
         var0.add("spider/cave_spider");
         var0.add("spider/spider");
         var0.add("spider_eyes");
         var0.add("squid");
         var0.add("villager/villager");
         var0.add("villager/butcher");
         var0.add("villager/farmer");
         var0.add("villager/librarian");
         var0.add("villager/priest");
         var0.add("villager/smith");
         var0.add("wither/wither");
         var0.add("wither/wither_armor");
         var0.add("wither/wither_invulnerable");
         var0.add("wolf/wolf");
         var0.add("wolf/wolf_angry");
         var0.add("wolf/wolf_collar");
         var0.add("wolf/wolf_tame");
         var0.add("zombie_pigman");
         var0.add("zombie/zombie");
         var0.add("zombie/zombie_villager");

         for(int var1 = 0; var1 < var0.size(); ++var1) {
            String var2 = (String)var0.get(var1);
            String var3 = String.valueOf((new StringBuilder("textures/entity/")).append(var2).append(".png"));
            ResourceLocation var4 = new ResourceLocation(var3);
            if (!FastAura.b(var4)) {
               FastAura.b(String.valueOf((new StringBuilder("Not found: ")).append(var4)));
            }

            c(var4);
         }
      }

   }

   private static bg c(ResourceLocation var0) {
      String var1 = var0.getResourcePath();
      bg var2 = (bg)a.get(var1);
      if (var2 == null) {
         var2 = d(var0);
         a.put(var1, var2);
      }

      return var2;
   }

   public static void a(World var0, World var1) {
      if (var1 != null) {
         List var2 = var1.getLoadedEntityList();

         for(int var3 = 0; var3 < var2.size(); ++var3) {
            Entity var4 = (Entity)var2.get(var3);
            a(var4, var1);
         }
      }

   }

   private static bg a(ResourceLocation var0, ResourceLocation var1) {
      try {
         String var2 = var0.getResourcePath();
         FastAura.a(String.valueOf((new StringBuilder("RandomMobs: ")).append(var1.getResourcePath()).append(", variants: ").append(var2)));
         InputStream var3 = FastAura.a(var0);
         if (var3 == null) {
            FastAura.b(String.valueOf((new StringBuilder("RandomMobs properties not found: ")).append(var2)));
            return null;
         } else {
            Properties var4 = new Properties();
            var4.load(var3);
            var3.close();
            bg var5 = new bg(var4, var2, var1);
            return !var5.a(var2) ? null : var5;
         }
      } catch (FileNotFoundException var6) {
         FastAura.b(String.valueOf((new StringBuilder("RandomMobs file not found: ")).append(var1.getResourcePath())));
         return null;
      } catch (IOException var7) {
         var7.printStackTrace();
         return null;
      }
   }
}
