package skid.gay.sex.spermix.inside.shalopay.j;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Properties;
import java.util.Random;
import java.util.Set;
import net.minecraft.block.Block;
import net.minecraft.block.BlockRedstoneWire;
import net.minecraft.block.BlockStem;
import net.minecraft.block.material.MapColor;
import net.minecraft.block.material.Material;
import net.minecraft.block.state.BlockStateBase;
import net.minecraft.block.state.IBlockState;
import net.minecraft.client.Minecraft;
import net.minecraft.client.particle.Particle;
import net.minecraft.client.renderer.block.model.BakedQuad;
import net.minecraft.client.renderer.color.BlockColors;
import net.minecraft.entity.Entity;
import net.minecraft.init.Biomes;
import net.minecraft.init.Blocks;
import net.minecraft.item.EnumDyeColor;
import net.minecraft.item.Item;
import net.minecraft.item.ItemMonsterPlacer;
import net.minecraft.item.ItemStack;
import net.minecraft.nbt.NBTTagCompound;
import net.minecraft.potion.Potion;
import net.minecraft.util.ResourceLocation;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.math.MathHelper;
import net.minecraft.util.math.Vec3d;
import net.minecraft.world.DimensionType;
import net.minecraft.world.IBlockAccess;
import net.minecraft.world.World;
import net.minecraft.world.biome.Biome;
import skid.gay.sex.spermix.inside.shalopay.features.idk.RenderUtils;
import skid.gay.sex.spermix.inside.shalopay.features.idk.TimeUtils;

import org.apache.commons.lang3.tuple.ImmutablePair;
import org.apache.commons.lang3.tuple.Pair;

public class ColorPicker {
   
   private static int[] N = null;
   
   private static TimeUtils[] r = null;
   
   private static int I = -1;
   
   private static TimeUtils A = null;
   
   private static TimeUtils C = null;
   
   private static TimeUtils e = null;
   
   private static int s = 0;
   
   private static int[] S = null;
   
   private static final G aa;
   
   private static RenderUtils k = new RenderUtils();
   
   private static TimeUtils d = null;
   
   private static final G X;
   
   private static float[][] u = new float[16][3];
   
   private static int F = -1;
   
   private static RenderUtils o = new RenderUtils();
   
   public static Random a;
   
   private static boolean D = true;
   
   private static TimeUtils l = null;
   
   private static int[] R = null;
   
   private static TimeUtils p = null;
   
   private static int E = -1;
   
   private static TimeUtils j = null;
   
   private static TimeUtils g = null;
   
   private static Vec3d K = null;
   
   private static TimeUtils[][] i = null;
   
   private static TimeUtils n = null;
   
   private static float[][] Q = null;
   
   private static float[][] t = new float[16][3];
   
   private static int G = -1;
   
   private static int H = -1;
   
   private static final IBlockState U;
   
   private static TimeUtils[] h = null;
   
   private static int[] O = null;
   
   private static final G Y;
   
   private static final G W;
   
   private static TimeUtils B = null;
   
   private static int x = -1;
   
   private static TimeUtils z = null;
   
   private static RenderUtils m = new RenderUtils();
   
   private static float[][] P = null;
   
   private static String b = "vanilla";
   
   private static TimeUtils f = null;
   
   private static final G Z;
   
   private static int[] T = null;
   
   private static TimeUtils c = null;
   
   private static TimeUtils y = null;
   
   private static TimeUtils v = null;
   
   private static Vec3d L = null;
   
   private static int J = -1;
   
   private static int[] ab;
   
   private static final IBlockState V;
   
   private static RenderUtils q = new RenderUtils();
   
   private static Vec3d M = null;
   
   private static TimeUtils w = null;

   public static TimeUtils a(String var0, int var1, int var2) {
      try {
         ResourceLocation var3 = new ResourceLocation(var0);
         if (!skid.gay.sex.spermix.inside.shalopay.RadioShanson.FastAura.b(var3)) {
            return null;
         } else {
            e(String.valueOf((new StringBuilder("Colormap ")).append(var0)));
            Properties var4 = new Properties();
            String var5 = bx.a(var0, ".png", ".properties");
            ResourceLocation var6 = new ResourceLocation(var5);
            if (skid.gay.sex.spermix.inside.shalopay.RadioShanson.FastAura.b(var6)) {
               InputStream var7 = skid.gay.sex.spermix.inside.shalopay.RadioShanson.FastAura.a(var6);
               var4.load(var7);
               var7.close();
               e(String.valueOf((new StringBuilder("Colormap properties: ")).append(var5)));
            } else {
               var4.put("format", b);
               var4.put("source", var0);
               var5 = var0;
            }

            TimeUtils var9 = new TimeUtils(var4, var5, var1, var2, b);
            return !var9.a(var5) ? null : var9;
         }
      } catch (Exception var8) {
         var8.printStackTrace();
         return null;
      }
   }

   private static int b(Properties var0, String var1) {
      String var2 = var0.getProperty(var1);
      if (var2 == null) {
         return -1;
      } else {
         var2 = var2.trim();
         int var3 = b(var2);
         if (var3 < 0) {
            f(String.valueOf((new StringBuilder("Invalid color: ")).append(var1).append(" = ").append(var2)));
            return var3;
         } else {
            e(String.valueOf((new StringBuilder(String.valueOf(var1))).append(" = ").append(var2)));
            return var3;
         }
      }
   }

   public static Vec3d a(Vec3d var0, World var1, Entity var2, float var3) {
      DimensionType var4 = var1.provider.getDimensionType();
      switch(i()[var4.ordinal()]) {
      case 1:
         Minecraft var5 = Minecraft.getMinecraft();
         var0 = b(var0, var5.world, var2.posX, var2.posY + 1.0D, var2.posZ);
         break;
      case 2:
         var0 = a(var0);
         break;
      case 3:
         var0 = b(var0);
      }

      return var0;
   }

   public static int a(int var0) {
      return H < 0 ? var0 : H;
   }

   protected static Biome a(IBlockAccess var0, BlockPos var1) {
      Biome var2 = var0.getBiome(var1);
      if (var2 == Biomes.SWAMPLAND && !skid.gay.sex.spermix.inside.shalopay.RadioShanson.FastAura.az()) {
         var2 = Biomes.PLAINS;
      }

      return var2;
   }

   private static int k() {
      int var0 = 0;
      Iterator var2 = Potion.REGISTRY.getKeys().iterator();

      while(var2.hasNext()) {
         ResourceLocation var1 = (ResourceLocation)var2.next();
         Potion var3 = (Potion)Potion.REGISTRY.getObject(var1);
         int var4 = Potion.getIdFromPotion(var3);
         if (var4 > var0) {
            var0 = var4;
         }
      }

      return var0;
   }

   public static int a(Potion var0, int var1) {
      int var2 = 0;
      if (var0 != null) {
         var2 = Potion.getIdFromPotion(var0);
      }

      return b(var2, var1);
   }

   public static Vec3d a(IBlockAccess var0, double var1, double var3, double var5) {
      return a(var0, var1, var3, var5, n, o);
   }

   private static int a(Block var0, IBlockAccess var1, BlockPos var2, bs var3) {
      TimeUtils var4 = z;
      if (var0 == Blocks.PUMPKIN_STEM && B != null) {
         var4 = B;
      }

      if (var0 == Blocks.MELON_STEM && A != null) {
         var4 = A;
      }

      if (var4 == null) {
         return -1;
      } else {
         int var5 = var3.b();
         return var4.a(var5);
      }
   }

   public static float[] a(EnumDyeColor var0, float[] var1) {
      return a(var0, P, var1);
   }

   public static Vec3d b(IBlockAccess var0, double var1, double var3, double var5) {
      return a(var0, var1, var3, var5, p, q);
   }

   public static void b() {
      D = e == null && d == null && g == null && f == null && skid.gay.sex.spermix.inside.shalopay.RadioShanson.FastAura.az() && skid.gay.sex.spermix.inside.shalopay.RadioShanson.FastAura.aB();
   }

   public static float[] b(EnumDyeColor var0, float[] var1) {
      return a(var0, Q, var1);
   }

   private static int a(Properties var0, String[] var1) {
      for(int var2 = 0; var2 < var1.length; ++var2) {
         String var3 = var1[var2];
         int var4 = b(var0, var3);
         if (var4 >= 0) {
            return var4;
         }
      }

      return -1;
   }

   private static float[] a(EnumDyeColor var0, float[][] var1, float[] var2) {
      if (var1 == null) {
         return var2;
      } else if (var0 == null) {
         return var2;
      } else {
         float[] var3 = var1[var0.ordinal()];
         return var3 == null ? var2 : var3;
      }
   }

   // $FF: synthetic method
   static TimeUtils h() {
      return c;
   }

   private static void e(String var0) {
      skid.gay.sex.spermix.inside.shalopay.RadioShanson.FastAura.a(String.valueOf((new StringBuilder("CustomColors: ")).append(var0)));
   }

   private static void a(TimeUtils var0, List var1, int var2) {
      while(var2 >= var1.size()) {
         var1.add((Object)null);
      }

      Object var3 = (List)var1.get(var2);
      if (var3 == null) {
         var3 = new ArrayList();
         var1.set(var2, var3);
      }

      ((List)var3).add(var0);
   }

   private static int[] a(Properties var0, String var1, String var2, String var3) {
      ArrayList var4 = new ArrayList();
      Set var5 = var0.keySet();
      int var6 = 0;
      Iterator var8 = var5.iterator();

      while(true) {
         while(true) {
            Object var7;
            String var9;
            do {
               if (!var8.hasNext()) {
                  if (var6 <= 0) {
                     return null;
                  }

                  e(String.valueOf((new StringBuilder(String.valueOf(var3))).append(" colors: ").append(var6)));
                  int[] var13 = new int[var4.size()];

                  for(int var14 = 0; var14 < var13.length; ++var14) {
                     var13[var14] = (Integer)var4.get(var14);
                  }

                  return var13;
               }

               var7 = var8.next();
               var9 = var0.getProperty((String)var7);
            } while(!((String)var7).startsWith(var2));

            String var10 = bx.a((String)var7, var2);
            int var11 = skid.gay.sex.spermix.inside.shalopay.RadioShanson.W.b(var10);
            if (var11 < 0) {
               var11 = skid.gay.sex.spermix.inside.shalopay.RadioShanson.W.a((new ResourceLocation(var10)).toString());
            }

            if (var11 < 0) {
               f(String.valueOf((new StringBuilder("Invalid spawn egg name: ")).append(var7)));
            } else {
               int var12 = b(var9);
               if (var12 < 0) {
                  f(String.valueOf((new StringBuilder("Invalid spawn egg color: ")).append(var7).append(" = ").append(var9)));
               } else {
                  while(var4.size() <= var11) {
                     var4.add(-1);
                  }

                  var4.set(var11, var12);
                  ++var6;
               }
            }
         }
      }
   }

   private static Vec3d a(Vec3d var0) {
      return K == null ? var0 : K;
   }

   public static void a(Particle var0) {
      if (F >= 0) {
         int var1 = F;
         int var2 = var1 >> 16 & 255;
         int var3 = var1 >> 8 & 255;
         int var4 = var1 & 255;
         float var5 = (float)var2 / 255.0F;
         float var6 = (float)var3 / 255.0F;
         float var7 = (float)var4 / 255.0F;
         var0.setRBGColorF(var5, var6, var7);
      }

   }

   private static Pair j() {
      String var0 = "mcpatcher/lightmap/world";
      String var1 = ".png";
      String[] var2 = bu.a(var0, var1);
      HashMap var3 = new HashMap();

      int var7;
      for(int var4 = 0; var4 < var2.length; ++var4) {
         String var5 = var2[var4];
         String var6 = bx.c(var5, var0, var1);
         var7 = skid.gay.sex.spermix.inside.shalopay.RadioShanson.FastAura.a(var6, Integer.MIN_VALUE);
         if (var7 == Integer.MIN_VALUE) {
            f(String.valueOf((new StringBuilder("Invalid dimension ID: ")).append(var6).append(", path: ").append(var5)));
         } else {
            var3.put(var7, var5);
         }
      }

      Set var15 = var3.keySet();
      Integer[] var16 = (Integer[])var15.toArray(new Integer[var15.size()]);
      Arrays.sort(var16);
      if (var16.length <= 0) {
         return new ImmutablePair((Object)null, 0);
      } else {
         int var17 = var16[0];
         var7 = var16[var16.length - 1];
         int var8 = var7 - var17 + 1;
         TimeUtils[] var9 = new TimeUtils[var8];

         for(int var10 = 0; var10 < var16.length; ++var10) {
            Integer var11 = var16[var10];
            String var12 = (String)var3.get(var11);
            TimeUtils var13 = a((String)var12, -1, -1);
            if (var13 != null) {
               if (var13.e() < 16) {
                  f(String.valueOf((new StringBuilder("Invalid lightmap width: ")).append(var13.e()).append(", path: ").append(var12)));
               } else {
                  int var14 = var11 - var17;
                  var9[var14] = var13;
               }
            }
         }

         return new ImmutablePair(var9, var17);
      }
   }

   public static int b(int var0, int var1) {
      if (T == null) {
         return var1;
      } else if (var0 >= 0 && var0 < T.length) {
         int var2 = T[var0];
         return var2 < 0 ? var1 : var2;
      } else {
         return var1;
      }
   }

   // $FF: synthetic method
   static TimeUtils e() {
      return f;
   }

   public static void b(Particle var0) {
      if (C != null) {
         int var1 = C.a();
         int var2 = var1 >> 16 & 255;
         int var3 = var1 >> 8 & 255;
         int var4 = var1 & 255;
         float var5 = (float)var2 / 255.0F;
         float var6 = (float)var3 / 255.0F;
         float var7 = (float)var4 / 255.0F;
         var0.setRBGColorF(var5, var6, var7);
      }

   }

   private static int b(IBlockAccess var0, BlockPos var1) {
      return G < 0 ? c().colorMultiplier(Blocks.WATERLILY.getDefaultState(), var0, var1, 0) : G;
   }

   private static int a(ItemMonsterPlacer var0, ItemStack var1, int var2, int var3) {
      if (N == null && O == null) {
         return var3;
      } else {
         NBTTagCompound var4 = var1.getTagCompound();
         if (var4 == null) {
            return var3;
         } else {
            NBTTagCompound var5 = var4.getCompoundTag("EntityTag");
            if (var5 == null) {
               return var3;
            } else {
               String var6 = var5.getString("id");
               int var7 = skid.gay.sex.spermix.inside.shalopay.RadioShanson.W.a(var6);
               int[] var8 = var2 == 0 ? N : O;
               if (var8 == null) {
                  return var3;
               } else if (var7 >= 0 && var7 < var8.length) {
                  int var9 = var8[var7];
                  return var9 < 0 ? var3 : var9;
               } else {
                  return var3;
               }
            }
         }
      }
   }

   public static int a(BakedQuad var0, IBlockState var1, IBlockAccess var2, BlockPos var3, bs var4) {
      Block var5 = var1.getBlock();
      IBlockState var6 = var4.g();
      if (i != null) {
         if (!var0.hasTintIndex()) {
            if (var5 == Blocks.GRASS) {
               var6 = U;
            }

            if (var5 == Blocks.REDSTONE_WIRE) {
               return -1;
            }
         }

         if (var5 == Blocks.DOUBLE_PLANT && var4.b() >= 8) {
            var3 = var3.down();
            var6 = var2.getBlockState(var3);
         }

         TimeUtils var7 = a(var6);
         if (var7 != null) {
            if (skid.gay.sex.spermix.inside.shalopay.RadioShanson.FastAura.aB() && !var7.c()) {
               return a((IBlockState)var1, (IBlockAccess)var2, (BlockPos)var3, (G)var7, (ClientLoginThread)var4.h());
            }

            return var7.a(var2, var3);
         }
      }

      if (!var0.hasTintIndex()) {
         return -1;
      } else if (var5 == Blocks.WATERLILY) {
         return b(var2, var3);
      } else if (var5 == Blocks.REDSTONE_WIRE) {
         return b(var4.g());
      } else if (var5 instanceof BlockStem) {
         return a(var5, var2, var3, var4);
      } else if (D) {
         return -1;
      } else {
         int var9 = var4.b();
         G var8;
         if (var5 != Blocks.GRASS && var5 != Blocks.TALLGRASS && var5 != Blocks.DOUBLE_PLANT) {
            if (var5 == Blocks.DOUBLE_PLANT) {
               var8 = W;
               if (var9 >= 8) {
                  var3 = var3.down();
               }
            } else if (var5 == Blocks.LEAVES) {
               switch(var9 & 3) {
               case 0:
                  var8 = X;
                  break;
               case 1:
                  var8 = Y;
                  break;
               case 2:
                  var8 = Z;
                  break;
               default:
                  var8 = X;
               }
            } else if (var5 == Blocks.LEAVES2) {
               var8 = X;
            } else {
               if (var5 != Blocks.VINE) {
                  return -1;
               }

               var8 = X;
            }
         } else {
            var8 = W;
         }

         return skid.gay.sex.spermix.inside.shalopay.RadioShanson.FastAura.aB() && !var8.c() ? a(var1, var2, var3, var8, var4.h()) : var8.a(var6, var2, var3);
      }
   }

   private static int a(IBlockState var0, int var1) {
      Block var2 = var0.getBlock();
      if (!(var2 instanceof BlockRedstoneWire)) {
         return var1;
      } else {
         Comparable var3 = var0.getValue(BlockRedstoneWire.POWER);
         if (!(var3 instanceof Integer)) {
            return var1;
         } else {
            Integer var4 = (Integer)var3;
            return var4;
         }
      }
   }

   private static String a(String var0, String var1, String[] var2, String var3) {
      try {
         ResourceLocation var4 = new ResourceLocation(var0);
         InputStream var5 = skid.gay.sex.spermix.inside.shalopay.RadioShanson.FastAura.a(var4);
         if (var5 == null) {
            return var3;
         } else {
            Properties var6 = new Properties();
            var6.load(var5);
            var5.close();
            String var7 = var6.getProperty(var1);
            if (var7 == null) {
               return var3;
            } else {
               List var8 = Arrays.asList(var2);
               if (!var8.contains(var7)) {
                  f(String.valueOf((new StringBuilder("Invalid value: ")).append(var1).append("=").append(var7)));
                  f(String.valueOf((new StringBuilder("Expected values: ")).append(skid.gay.sex.spermix.inside.shalopay.RadioShanson.FastAura.a((Object[])var2))));
                  return var3;
               } else {
                  e(String.valueOf((new StringBuilder()).append(var1).append("=").append(var7)));
                  return var7;
               }
            }
         }
      } catch (FileNotFoundException var9) {
         return var3;
      } catch (IOException var10) {
         var10.printStackTrace();
         return var3;
      }
   }

   private static int[] e(Properties var0, String var1, String var2, String var3) {
      int[] var4 = new int[k()];
      Arrays.fill(var4, -1);
      int var5 = 0;
      Iterator var7 = var0.keySet().iterator();

      while(true) {
         while(true) {
            Object var6;
            String var8;
            do {
               if (!var7.hasNext()) {
                  if (var5 <= 0) {
                     return null;
                  }

                  e(String.valueOf((new StringBuilder(String.valueOf(var3))).append(" colors: ").append(var5)));
                  return var4;
               }

               var6 = var7.next();
               var8 = var0.getProperty((String)var6);
            } while(!((String)var6).startsWith(var2));

            int var9 = c((String)var6);
            int var10 = b(var8);
            if (var9 >= 0 && var9 < var4.length && var10 >= 0) {
               var4[var9] = var10;
               ++var5;
            } else {
               f(String.valueOf((new StringBuilder("Invalid color: ")).append(var6).append(" = ").append(var8)));
            }
         }
      }
   }

   static {
      U = Blocks.DIRT.getDefaultState();
      V = Blocks.WATER.getDefaultState();
      a = new Random();
      W = new B();
      X = new C();
      Y = new D();
      Z = new E();
      aa = new F();
   }

   private static Vec3d c(Properties var0, String var1) {
      int var2 = b(var0, var1);
      if (var2 < 0) {
         return null;
      } else {
         int var3 = var2 >> 16 & 255;
         int var4 = var2 >> 8 & 255;
         int var5 = var2 & 255;
         float var6 = (float)var3 / 255.0F;
         float var7 = (float)var4 / 255.0F;
         float var8 = (float)var5 / 255.0F;
         return new Vec3d((double)var6, (double)var7, (double)var8);
      }
   }

   private static TimeUtils a(String var0, String[] var1, int var2, int var3) {
      for(int var4 = 0; var4 < var1.length; ++var4) {
         String var5 = var1[var4];
         var5 = String.valueOf((new StringBuilder(String.valueOf(var0))).append(var5));
         TimeUtils var6 = a(var5, var2, var3);
         if (var6 != null) {
            return var6;
         }
      }

      return null;
   }

   public static int a(int var0, int var1) {
      if (R == null) {
         return var1;
      } else if (var0 >= 0 && var0 < R.length) {
         int var2 = R[var0];
         return var2 < 0 ? var1 : var2;
      } else {
         return var1;
      }
   }

   public static void a() {
      b = "vanilla";
      c = null;
      e = null;
      d = null;
      g = null;
      f = null;
      j = null;
      l = null;
      n = null;
      p = null;
      v = null;
      w = null;
      x = -1;
      y = null;
      z = null;
      C = null;
      r = null;
      E = -1;
      F = -1;
      G = -1;
      H = -1;
      I = -1;
      J = -1;
      K = null;
      L = null;
      M = null;
      h = null;
      i = null;
      D = true;
      N = null;
      O = null;
      P = null;
      Q = null;
      R = null;
      a(S);
      T = null;
      b = a("mcpatcher/color.properties", "palette.format", skid.gay.sex.spermix.inside.shalopay.RadioShanson.TimeUtils.SmthLikeColorGetter, "vanilla");
      String var0 = "mcpatcher/colormap/";
      String[] var1 = new String[]{"water.png", "watercolorX.png"};
      c = a((String)var0, (String[])var1, 256, 256);
      b();
      if (skid.gay.sex.spermix.inside.shalopay.RadioShanson.FastAura.aC()) {
         String[] var2 = new String[]{"pine.png", "pinecolor.png"};
         d = a((String)var0, (String[])var2, 256, 256);
         String[] var3 = new String[]{"birch.png", "birchcolor.png"};
         e = a((String)var0, (String[])var3, 256, 256);
         String[] var4 = new String[]{"swampgrass.png", "swampgrasscolor.png"};
         g = a((String)var0, (String[])var4, 256, 256);
         String[] var5 = new String[]{"swampfoliage.png", "swampfoliagecolor.png"};
         f = a((String)var0, (String[])var5, 256, 256);
         String[] var6 = new String[]{"sky0.png", "skycolor0.png"};
         j = a((String)var0, (String[])var6, 256, 256);
         String[] var7 = new String[]{"fog0.png", "fogcolor0.png"};
         l = a((String)var0, (String[])var7, 256, 256);
         String[] var8 = new String[]{"underwater.png", "underwatercolor.png"};
         n = a((String)var0, (String[])var8, 256, 256);
         String[] var9 = new String[]{"underlava.png", "underlavacolor.png"};
         p = a((String)var0, (String[])var9, 256, 256);
         String[] var10 = new String[]{"redstone.png", "redstonecolor.png"};
         v = a((String)var0, (String[])var10, 16, 1);
         w = a((String)String.valueOf((new StringBuilder(String.valueOf(var0))).append("xporb.png")), -1, -1);
         y = a((String)String.valueOf((new StringBuilder(String.valueOf(var0))).append("durability.png")), -1, -1);
         String[] var11 = new String[]{"stem.png", "stemcolor.png"};
         z = a((String)var0, (String[])var11, 8, 1);
         B = a((String)String.valueOf((new StringBuilder(String.valueOf(var0))).append("pumpkinstem.png")), 8, 1);
         A = a((String)String.valueOf((new StringBuilder(String.valueOf(var0))).append("melonstem.png")), 8, 1);
         String[] var12 = new String[]{"myceliumparticle.png", "myceliumparticlecolor.png"};
         C = a((String)var0, (String[])var12, -1, -1);
         Pair var13 = j();
         r = (TimeUtils[])var13.getLeft();
         s = (Integer)var13.getRight();
         a("mcpatcher/color.properties");
         i = a((String[])(new String[]{String.valueOf((new StringBuilder(String.valueOf(var0))).append("custom/")), String.valueOf((new StringBuilder(String.valueOf(var0))).append("blocks/"))}), (TimeUtils[])h, 256, 256);
         b();
      }

   }

   private static int[] c(Properties var0, String var1, String var2, String var3) {
      int[] var4 = new int[32];
      Arrays.fill(var4, -1);
      int var5 = 0;
      Iterator var7 = var0.keySet().iterator();

      while(true) {
         while(true) {
            Object var6;
            String var8;
            do {
               if (!var7.hasNext()) {
                  if (var5 <= 0) {
                     return null;
                  }

                  e(String.valueOf((new StringBuilder(String.valueOf(var3))).append(" colors: ").append(var5)));
                  return var4;
               }

               var6 = var7.next();
               var8 = var0.getProperty((String)var6);
            } while(!((String)var6).startsWith(var2));

            String var9 = bx.a((String)var6, var2);
            int var10 = skid.gay.sex.spermix.inside.shalopay.RadioShanson.FastAura.a((String)var9, -1);
            int var11 = b(var8);
            if (var10 >= 0 && var10 < var4.length && var11 >= 0) {
               var4[var10] = var11;
               ++var5;
            } else {
               f(String.valueOf((new StringBuilder("Invalid color: ")).append(var6).append(" = ").append(var8)));
            }
         }
      }
   }

   private static int[] d(Properties var0, String var1, String var2, String var3) {
      int[] var4 = new int[MapColor.COLORS.length];
      Arrays.fill(var4, -1);
      int var5 = 0;
      Iterator var7 = var0.keySet().iterator();

      while(true) {
         while(true) {
            Object var6;
            String var8;
            do {
               if (!var7.hasNext()) {
                  if (var5 <= 0) {
                     return null;
                  }

                  e(String.valueOf((new StringBuilder(String.valueOf(var3))).append(" colors: ").append(var5)));
                  return var4;
               }

               var6 = var7.next();
               var8 = var0.getProperty((String)var6);
            } while(!((String)var6).startsWith(var2));

            String var9 = bx.a((String)var6, var2);
            int var10 = d(var9);
            int var11 = b(var8);
            if (var10 >= 0 && var10 < var4.length && var11 >= 0) {
               var4[var10] = var11;
               ++var5;
            } else {
               f(String.valueOf((new StringBuilder("Invalid color: ")).append(var6).append(" = ").append(var8)));
            }
         }
      }
   }

   private static void a(String var0) {
      try {
         ResourceLocation var1 = new ResourceLocation(var0);
         InputStream var2 = skid.gay.sex.spermix.inside.shalopay.RadioShanson.FastAura.a(var1);
         if (var2 == null) {
            return;
         }

         e(String.valueOf((new StringBuilder("Loading ")).append(var0)));
         Properties var3 = new Properties();
         var3.load(var2);
         var2.close();
         E = a(var3, new String[]{"particle.water", "drop.water"});
         F = b(var3, "particle.portal");
         G = b(var3, "lilypad");
         H = b(var3, "text.xpbar");
         I = b(var3, "text.boss");
         J = b(var3, "text.sign");
         K = c(var3, "fog.nether");
         L = c(var3, "fog.end");
         M = c(var3, "sky.end");
         h = a(var3, var0);
         N = a(var3, var0, "egg.shell.", "Spawn egg shell");
         O = a(var3, var0, "egg.spots.", "Spawn egg spot");
         P = b(var3, var0, "collar.", "Wolf collar");
         Q = b(var3, var0, "sheep.", "Sheep");
         R = c(var3, var0, "text.code.", "Text");
         int[] var4 = d(var3, var0, "map.", "Map");
         if (var4 != null) {
            if (S == null) {
               S = l();
            }

            a(var4);
         }

         T = e(var3, var0, "potion.", "Potion");
         x = skid.gay.sex.spermix.inside.shalopay.RadioShanson.FastAura.a((String)var3.getProperty("xporb.time"), -1);
      } catch (FileNotFoundException var5) {
         return;
      } catch (IOException var6) {
         var6.printStackTrace();
      }

   }

   private static void a(int[] var0) {
      if (var0 != null) {
         MapColor[] var1 = MapColor.COLORS;
         boolean var2 = false;

         for(int var3 = 0; var3 < var1.length && var3 < var0.length; ++var3) {
            MapColor var4 = var1[var3];
            if (var4 != null) {
               int var5 = var0[var3];
               if (var5 >= 0 && var4.colorValue != var5) {
                  var4.colorValue = var5;
                  var2 = true;
               }
            }
         }

         if (var2) {
            Minecraft.getMinecraft().getTextureManager().reloadBannerTextures();
         }
      }

   }

   private static Vec3d b(Vec3d var0) {
      return L == null ? var0 : L;
   }

   private static int a(IBlockState var0, IBlockAccess var1, BlockPos var2, G var3, ClientLoginThread var4) {
      int var5 = 0;
      int var6 = 0;
      int var7 = 0;
      int var8 = var2.getX();
      int var9 = var2.getY();
      int var10 = var2.getZ();
      ClientLoginThread var11 = var4;

      int var12;
      int var13;
      int var14;
      for(var12 = var8 - 1; var12 <= var8 + 1; ++var12) {
         for(var13 = var10 - 1; var13 <= var10 + 1; ++var13) {
            var11.a(var12, var9, var13);
            var14 = var3.a(var0, var1, var11);
            var5 += var14 >> 16 & 255;
            var6 += var14 >> 8 & 255;
            var7 += var14 & 255;
         }
      }

      var12 = var5 / 9;
      var13 = var6 / 9;
      var14 = var7 / 9;
      return var12 << 16 | var13 << 8 | var14;
   }

   public static int b(int var0) {
      return J < 0 ? var0 : J;
   }

   private static void f(String var0) {
      skid.gay.sex.spermix.inside.shalopay.RadioShanson.FastAura.b(String.valueOf((new StringBuilder("CustomColors: ")).append(var0)));
   }

   private static int b(String var0) {
      if (var0 == null) {
         return -1;
      } else {
         var0 = var0.trim();

         try {
            int var1 = Integer.parseInt(var0, 16) & 16777215;
            return var1;
         } catch (NumberFormatException var2) {
            return -1;
         }
      }
   }

   public static void a(Particle var0, IBlockAccess var1, double var2, double var4, double var6) {
      if (v != null) {
         IBlockState var8 = var1.getBlockState(new BlockPos(var2, var4, var6));
         int var9 = a((IBlockState)var8, 15);
         int var10 = v.a(var9);
         int var11 = var10 >> 16 & 255;
         int var12 = var10 >> 8 & 255;
         int var13 = var10 & 255;
         float var14 = (float)var11 / 255.0F;
         float var15 = (float)var12 / 255.0F;
         float var16 = (float)var13 / 255.0F;
         var0.setRBGColorF(var14, var15, var16);
      }

   }

   private static int[] l() {
      MapColor[] var0 = MapColor.COLORS;
      int[] var1 = new int[var0.length];
      Arrays.fill(var1, -1);

      for(int var2 = 0; var2 < var0.length && var2 < var1.length; ++var2) {
         MapColor var3 = var0[var2];
         if (var3 != null) {
            var1[var2] = var3.colorValue;
         }
      }

      return var1;
   }

   public static BlockColors c() {
      return Minecraft.getMinecraft().getBlockColors();
   }

   public static Vec3d a(IBlockAccess var0, double var1, double var3, double var5, TimeUtils var7, RenderUtils var8) {
      if (var7 == null) {
         return null;
      } else {
         int var9 = var7.a(var0, var1, var3, var5, 3);
         int var10 = var9 >> 16 & 255;
         int var11 = var9 >> 8 & 255;
         int var12 = var9 & 255;
         float var13 = (float)var10 / 255.0F;
         float var14 = (float)var11 / 255.0F;
         float var15 = (float)var12 / 255.0F;
         Vec3d var16 = var8.a((double)var13, (double)var14, (double)var15);
         return var16;
      }
   }

   // $FF: synthetic method
   static TimeUtils f() {
      return d;
   }

   private static int b(IBlockState var0) {
      if (v == null) {
         return -1;
      } else {
         int var1 = a((IBlockState)var0, 15);
         int var2 = v.a(var1);
         return var2;
      }
   }

   private static Vec3d c(Vec3d var0) {
      return M == null ? var0 : M;
   }

   // $FF: synthetic method
   static TimeUtils d() {
      return g;
   }

   private static float[][] b(Properties var0, String var1, String var2, String var3) {
      EnumDyeColor[] var4 = EnumDyeColor.values();
      HashMap var5 = new HashMap();

      for(int var6 = 0; var6 < var4.length; ++var6) {
         EnumDyeColor var7 = var4[var6];
         var5.put(var7.getName(), var7);
      }

      float[][] var15 = new float[var4.length][];
      int var16 = 0;
      Iterator var9 = var0.keySet().iterator();

      while(true) {
         while(true) {
            Object var8;
            String var10;
            do {
               if (!var9.hasNext()) {
                  if (var16 <= 0) {
                     return null;
                  }

                  e(String.valueOf((new StringBuilder(String.valueOf(var3))).append(" colors: ").append(var16)));
                  return var15;
               }

               var8 = var9.next();
               var10 = var0.getProperty((String)var8);
            } while(!((String)var8).startsWith(var2));

            String var11 = bx.a((String)var8, var2);
            if (var11.equals("lightBlue")) {
               var11 = "light_blue";
            }

            EnumDyeColor var12 = (EnumDyeColor)var5.get(var11);
            int var13 = b(var10);
            if (var12 != null && var13 >= 0) {
               float[] var14 = new float[]{(float)(var13 >> 16 & 255) / 255.0F, (float)(var13 >> 8 & 255) / 255.0F, (float)(var13 & 255) / 255.0F};
               var15[var12.ordinal()] = var14;
               ++var16;
            } else {
               f(String.valueOf((new StringBuilder("Invalid color: ")).append(var8).append(" = ").append(var10)));
            }
         }
      }
   }

   // $FF: synthetic method
   static int[] i() {
      int[] var10000 = ab;
      if (var10000 != null) {
         return var10000;
      } else {
         int[] var0 = new int[DimensionType.values().length];

         try {
            var0[DimensionType.NETHER.ordinal()] = 2;
         } catch (NoSuchFieldError var3) {
         }

         try {
            var0[DimensionType.OVERWORLD.ordinal()] = 1;
         } catch (NoSuchFieldError var2) {
         }

         try {
            var0[DimensionType.THE_END.ordinal()] = 3;
         } catch (NoSuchFieldError var1) {
         }

         ab = var0;
         return var0;
      }
   }

   private static int d(String var0) {
      if (var0 == null) {
         return -1;
      } else if (var0.equals("air")) {
         return MapColor.AIR.colorIndex;
      } else if (var0.equals("grass")) {
         return MapColor.GRASS.colorIndex;
      } else if (var0.equals("sand")) {
         return MapColor.SAND.colorIndex;
      } else if (var0.equals("cloth")) {
         return MapColor.CLOTH.colorIndex;
      } else if (var0.equals("tnt")) {
         return MapColor.TNT.colorIndex;
      } else if (var0.equals("ice")) {
         return MapColor.ICE.colorIndex;
      } else if (var0.equals("iron")) {
         return MapColor.IRON.colorIndex;
      } else if (var0.equals("foliage")) {
         return MapColor.FOLIAGE.colorIndex;
      } else if (var0.equals("clay")) {
         return MapColor.CLAY.colorIndex;
      } else if (var0.equals("dirt")) {
         return MapColor.DIRT.colorIndex;
      } else if (var0.equals("stone")) {
         return MapColor.STONE.colorIndex;
      } else if (var0.equals("water")) {
         return MapColor.WATER.colorIndex;
      } else if (var0.equals("wood")) {
         return MapColor.WOOD.colorIndex;
      } else if (var0.equals("quartz")) {
         return MapColor.QUARTZ.colorIndex;
      } else if (var0.equals("gold")) {
         return MapColor.GOLD.colorIndex;
      } else if (var0.equals("diamond")) {
         return MapColor.DIAMOND.colorIndex;
      } else if (var0.equals("lapis")) {
         return MapColor.LAPIS.colorIndex;
      } else if (var0.equals("emerald")) {
         return MapColor.EMERALD.colorIndex;
      } else if (var0.equals("podzol")) {
         return MapColor.OBSIDIAN.colorIndex;
      } else if (var0.equals("netherrack")) {
         return MapColor.NETHERRACK.colorIndex;
      } else if (!var0.equals("snow") && !var0.equals("white")) {
         if (!var0.equals("adobe") && !var0.equals("orange")) {
            if (var0.equals("magenta")) {
               return MapColor.MAGENTA.colorIndex;
            } else if (!var0.equals("light_blue") && !var0.equals("lightBlue")) {
               if (var0.equals("yellow")) {
                  return MapColor.YELLOW.colorIndex;
               } else if (var0.equals("lime")) {
                  return MapColor.LIME.colorIndex;
               } else if (var0.equals("pink")) {
                  return MapColor.PINK.colorIndex;
               } else if (var0.equals("gray")) {
                  return MapColor.GRAY.colorIndex;
               } else if (var0.equals("silver")) {
                  return MapColor.SILVER.colorIndex;
               } else if (var0.equals("cyan")) {
                  return MapColor.CYAN.colorIndex;
               } else if (var0.equals("purple")) {
                  return MapColor.PURPLE.colorIndex;
               } else if (var0.equals("blue")) {
                  return MapColor.BLUE.colorIndex;
               } else if (var0.equals("brown")) {
                  return MapColor.BROWN.colorIndex;
               } else if (var0.equals("green")) {
                  return MapColor.GREEN.colorIndex;
               } else if (var0.equals("red")) {
                  return MapColor.RED.colorIndex;
               } else {
                  return var0.equals("black") ? MapColor.BLACK.colorIndex : -1;
               }
            } else {
               return MapColor.LIGHT_BLUE.colorIndex;
            }
         } else {
            return MapColor.ADOBE.colorIndex;
         }
      } else {
         return MapColor.SNOW.colorIndex;
      }
   }

   private static int c(String var0) {
      if (var0.equals("potion.water")) {
         return 0;
      } else {
         var0 = bx.b(var0, "potion.", "effect.");
         Iterator var2 = Potion.REGISTRY.getKeys().iterator();

         while(var2.hasNext()) {
            ResourceLocation var1 = (ResourceLocation)var2.next();
            Potion var3 = (Potion)Potion.REGISTRY.getObject(var1);
            if (var3.getName().equals(var0)) {
               return Potion.getIdFromPotion(var3);
            }
         }

         return -1;
      }
   }

   private static TimeUtils[] a(Properties var0, String var1) {
      ArrayList var2 = new ArrayList();
      String var3 = "palette.block.";
      HashMap var4 = new HashMap();
      Iterator var6 = var0.keySet().iterator();

      String var7;
      while(var6.hasNext()) {
         Object var5 = var6.next();
         var7 = var0.getProperty((String)var5);
         if (((String)var5).startsWith(var3)) {
            var4.put(var5, var7);
         }
      }

      String[] var16 = (String[])var4.keySet().toArray(new String[var4.size()]);

      for(int var17 = 0; var17 < var16.length; ++var17) {
         var7 = var16[var17];
         String var8 = var0.getProperty(var7);
         e(String.valueOf((new StringBuilder("Block palette: ")).append(var7).append(" = ").append(var8)));
         String var9 = var7.substring(var3.length());
         String var10 = bB.a(var1);
         var9 = bB.a(var9, var10);
         TimeUtils var11 = a((String)var9, 256, 256);
         if (var11 == null) {
            f(String.valueOf((new StringBuilder("Colormap not found: ")).append(var9)));
         } else {
            ArrayList var12 = new ArrayList("CustomColors");
            aJ[] var13 = var12.c(var8);
            if (var13 != null && var13.length > 0) {
               for(int var14 = 0; var14 < var13.length; ++var14) {
                  aJ var15 = var13[var14];
                  var11.a(var15);
               }

               var2.add(var11);
            } else {
               f(String.valueOf((new StringBuilder("Invalid match blocks: ")).append(var8)));
            }
         }
      }

      if (var2.size() <= 0) {
         return null;
      } else {
         TimeUtils[] var18 = (TimeUtils[])var2.toArray(new TimeUtils[var2.size()]);
         return var18;
      }
   }

   public static void a(Particle var0, IBlockAccess var1, double var2, double var4, double var6, bs var8) {
      if (c != null || i != null) {
         BlockPos var9 = new BlockPos(var2, var4, var6);
         var8.a(var1, V, var9);
         int var10 = a(var1, V, var9, var8);
         int var11 = var10 >> 16 & 255;
         int var12 = var10 >> 8 & 255;
         int var13 = var10 & 255;
         float var14 = (float)var11 / 255.0F;
         float var15 = (float)var12 / 255.0F;
         float var16 = (float)var13 / 255.0F;
         if (E >= 0) {
            int var17 = E >> 16 & 255;
            int var18 = E >> 8 & 255;
            int var19 = E & 255;
            var14 *= (float)var17 / 255.0F;
            var15 *= (float)var18 / 255.0F;
            var16 *= (float)var19 / 255.0F;
         }

         var0.setRBGColorF(var14, var15, var16);
      }

   }

   public static int a(ItemStack var0, int var1, int var2) {
      if (var0 == null) {
         return var2;
      } else {
         Item var3 = var0.getItem();
         if (var3 == null) {
            return var2;
         } else {
            return var3 instanceof ItemMonsterPlacer ? a((ItemMonsterPlacer)var3, var0, var1, var2) : var2;
         }
      }
   }

   public static Vec3d b(Vec3d var0, World var1, Entity var2, float var3) {
      DimensionType var4 = var1.provider.getDimensionType();
      switch(i()[var4.ordinal()]) {
      case 1:
         Minecraft var5 = Minecraft.getMinecraft();
         var0 = a((Vec3d)var0, var5.world, var2.posX, var2.posY + 1.0D, var2.posZ);
      case 2:
      default:
         break;
      case 3:
         var0 = c(var0);
      }

      return var0;
   }

   public static float a(float var0) {
      if (x <= 0) {
         return var0;
      } else {
         float var1 = 628.0F / (float)x;
         return var0 * var1;
      }
   }

   private static TimeUtils a(IBlockState var0) {
      if (i == null) {
         return null;
      } else if (!(var0 instanceof BlockStateBase)) {
         return null;
      } else {
         BlockStateBase var1 = (BlockStateBase)var0;
         int var2 = var1.getBlockId();
         if (var2 >= 0 && var2 < i.length) {
            TimeUtils[] var3 = i[var2];
            if (var3 == null) {
               return null;
            } else {
               for(int var4 = 0; var4 < var3.length; ++var4) {
                  TimeUtils var5 = var3[var4];
                  if (var5.a(var1)) {
                     return var5;
                  }
               }

               return null;
            }
         } else {
            return null;
         }
      }
   }

   private static void a(float[][] var0, float var1, int var2, int var3, float[][] var4) {
      int var5 = (int)Math.floor((double)var1);
      int var6 = (int)Math.ceil((double)var1);
      if (var5 == var6) {
         for(int var7 = 0; var7 < 16; ++var7) {
            float[] var8 = var0[var2 + var7 * var3 + var5];
            float[] var9 = var4[var7];

            for(int var10 = 0; var10 < 3; ++var10) {
               var9[var10] = var8[var10];
            }
         }
      } else {
         float var14 = 1.0F - (var1 - (float)var5);
         float var15 = 1.0F - ((float)var6 - var1);

         for(int var16 = 0; var16 < 16; ++var16) {
            float[] var17 = var0[var2 + var16 * var3 + var5];
            float[] var11 = var0[var2 + var16 * var3 + var6];
            float[] var12 = var4[var16];

            for(int var13 = 0; var13 < 3; ++var13) {
               var12[var13] = var17[var13] * var14 + var11[var13] * var15;
            }
         }
      }

   }

   public static boolean a(World var0, float var1, int[] var2, boolean var3) {
      if (var0 == null) {
         return false;
      } else if (r == null) {
         return false;
      } else {
         int var4 = var0.provider.getDimensionType().getId();
         int var5 = var4 - s;
         if (var5 >= 0 && var5 < r.length) {
            TimeUtils var6 = r[var5];
            if (var6 == null) {
               return false;
            } else {
               int var7 = var6.f();
               if (var3 && var7 < 64) {
                  return false;
               } else {
                  int var8 = var6.e();
                  if (var8 < 16) {
                     f(String.valueOf((new StringBuilder("Invalid lightmap width: ")).append(var8).append(" for dimension: ").append(var4)));
                     r[var5] = null;
                     return false;
                  } else {
                     int var9 = 0;
                     if (var3) {
                        var9 = var8 * 16 * 2;
                     }

                     float var10 = 1.1666666F * (var0.getSunBrightness(1.0F) - 0.2F);
                     if (var0.getLastLightningBolt() > 0) {
                        var10 = 1.0F;
                     }

                     var10 = skid.gay.sex.spermix.inside.shalopay.RadioShanson.FastAura.a(var10);
                     float var11 = var10 * (float)(var8 - 1);
                     float var12 = skid.gay.sex.spermix.inside.shalopay.RadioShanson.FastAura.a(var1 + 0.5F) * (float)(var8 - 1);
                     float var13 = skid.gay.sex.spermix.inside.shalopay.RadioShanson.FastAura.a(skid.gay.sex.spermix.inside.shalopay.RadioShanson.FastAura.aL().gammaSetting);
                     boolean var14 = var13 > 1.0E-4F;
                     float[][] var15 = var6.b();
                     a(var15, var11, var9, var8, t);
                     a(var15, var12, var9 + 16 * var8, var8, u);
                     float[] var16 = new float[3];

                     for(int var17 = 0; var17 < 16; ++var17) {
                        for(int var18 = 0; var18 < 16; ++var18) {
                           int var19;
                           for(var19 = 0; var19 < 3; ++var19) {
                              float var20 = skid.gay.sex.spermix.inside.shalopay.RadioShanson.FastAura.a(t[var17][var19] + u[var18][var19]);
                              if (var14) {
                                 float var21 = 1.0F - var20;
                                 var21 = 1.0F - var21 * var21 * var21 * var21;
                                 var20 = var13 * var21 + (1.0F - var13) * var20;
                              }

                              var16[var19] = var20;
                           }

                           var19 = (int)(var16[0] * 255.0F);
                           int var22 = (int)(var16[1] * 255.0F);
                           int var23 = (int)(var16[2] * 255.0F);
                           var2[var17 * 16 + var18] = -16777216 | var19 << 16 | var22 << 8 | var23;
                        }
                     }

                     return true;
                  }
               }
            }
         } else {
            return false;
         }
      }
   }

   public static int a(IBlockAccess var0, IBlockState var1, BlockPos var2, bs var3) {
      Block var4 = var1.getBlock();
      Object var5 = a(var1);
      if (var5 == null && var1.getMaterial() == Material.WATER) {
         var5 = aa;
      }

      if (var5 == null) {
         return c().colorMultiplier(var1, var0, var2, 0);
      } else {
         return skid.gay.sex.spermix.inside.shalopay.RadioShanson.FastAura.aB() && !((G)var5).c() ? a((IBlockState)var1, (IBlockAccess)var0, (BlockPos)var2, (G)var5, (ClientLoginThread)var3.h()) : ((G)var5).a(var1, var0, var2);
      }
   }

   private static void a(TimeUtils var0, List var1) {
      int[] var2 = var0.g();
      if (var2 != null && var2.length > 0) {
         for(int var3 = 0; var3 < var2.length; ++var3) {
            int var4 = var2[var3];
            if (var4 < 0) {
               f(String.valueOf((new StringBuilder("Invalid block ID: ")).append(var4)));
            } else {
               a(var0, var1, var4);
            }
         }
      } else {
         f(String.valueOf((new StringBuilder("No match blocks: ")).append(skid.gay.sex.spermix.inside.shalopay.RadioShanson.FastAura.a(var2))));
      }

   }

   private static TimeUtils[][] a(List var0) {
      TimeUtils[][] var1 = new TimeUtils[var0.size()][];

      for(int var2 = 0; var2 < var0.size(); ++var2) {
         List var3 = (List)var0.get(var2);
         if (var3 != null) {
            TimeUtils[] var4 = (TimeUtils[])var3.toArray(new TimeUtils[var3.size()]);
            var1[var2] = var4;
         }
      }

      return var1;
   }

   public static Vec3d a(Vec3d var0, IBlockAccess var1, double var2, double var4, double var6) {
      if (j == null) {
         return var0;
      } else {
         int var8 = j.a(var1, var2, var4, var6, 3);
         int var9 = var8 >> 16 & 255;
         int var10 = var8 >> 8 & 255;
         int var11 = var8 & 255;
         float var12 = (float)var9 / 255.0F;
         float var13 = (float)var10 / 255.0F;
         float var14 = (float)var11 / 255.0F;
         float var15 = (float)var0.xCoord / 0.5F;
         float var16 = (float)var0.yCoord / 0.66275F;
         float var17 = (float)var0.zCoord;
         var12 *= var15;
         var13 *= var16;
         var14 *= var17;
         Vec3d var18 = k.a((double)var12, (double)var13, (double)var14);
         return var18;
      }
   }

   private static Vec3d b(Vec3d var0, IBlockAccess var1, double var2, double var4, double var6) {
      if (l == null) {
         return var0;
      } else {
         int var8 = l.a(var1, var2, var4, var6, 3);
         int var9 = var8 >> 16 & 255;
         int var10 = var8 >> 8 & 255;
         int var11 = var8 & 255;
         float var12 = (float)var9 / 255.0F;
         float var13 = (float)var10 / 255.0F;
         float var14 = (float)var11 / 255.0F;
         float var15 = (float)var0.xCoord / 0.753F;
         float var16 = (float)var0.yCoord / 0.8471F;
         float var17 = (float)var0.zCoord;
         var12 *= var15;
         var13 *= var16;
         var14 *= var17;
         Vec3d var18 = m.a((double)var12, (double)var13, (double)var14);
         return var18;
      }
   }

   public static int a(float var0, int var1) {
      if (y == null) {
         return var1;
      } else {
         int var2 = (int)(var0 * (float)y.d());
         int var3 = y.a(var2);
         return var3;
      }
   }

   // $FF: synthetic method
   static TimeUtils g() {
      return e;
   }

   public static int b(float var0) {
      if (w == null) {
         return -1;
      } else {
         int var1 = (int)Math.round((double)((MathHelper.sin(var0) + 1.0F) * (float)(w.d() - 1)) / 2.0D);
         int var2 = w.a(var1);
         return var2;
      }
   }

   private static TimeUtils[][] a(String[] var0, TimeUtils[] var1, int var2, int var3) {
      String[] var4 = bu.a(var0, new String[]{".properties"});
      Arrays.sort(var4);
      ArrayList var5 = new ArrayList();

      int var6;
      for(var6 = 0; var6 < var4.length; ++var6) {
         String var7 = var4[var6];
         e(String.valueOf((new StringBuilder("Block colormap: ")).append(var7)));

         try {
            ResourceLocation var8 = new ResourceLocation("minecraft", var7);
            InputStream var9 = skid.gay.sex.spermix.inside.shalopay.RadioShanson.FastAura.a(var8);
            if (var9 == null) {
               f(String.valueOf((new StringBuilder("File not found: ")).append(var7)));
            } else {
               Properties var10 = new Properties();
               var10.load(var9);
               TimeUtils var11 = new TimeUtils(var10, var7, var2, var3, b);
               if (var11.a(var7) && var11.b(var7)) {
                  a((TimeUtils)var11, (List)var5);
               }
            }
         } catch (FileNotFoundException var12) {
            f(String.valueOf((new StringBuilder("File not found: ")).append(var7)));
         } catch (Exception var13) {
            var13.printStackTrace();
         }
      }

      if (var1 != null) {
         for(var6 = 0; var6 < var1.length; ++var6) {
            TimeUtils var15 = var1[var6];
            a((TimeUtils)var15, (List)var5);
         }
      }

      if (var5.size() <= 0) {
         return null;
      } else {
         TimeUtils[][] var14 = a((List)var5);
         return var14;
      }
   }
}
