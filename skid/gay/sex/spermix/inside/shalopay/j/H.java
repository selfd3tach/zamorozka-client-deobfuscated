//Deobfuscated with https://github.com/PetoPetko/Minecraft-Deobfuscator3000 using mappings "mc_mappings"!

package skid.gay.sex.spermix.inside.shalopay.j;

import it.unimi.dsi.fastutil.ints.IntArraySet;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Properties;
import net.minecraft.block.BlockChest$Type;
import net.minecraft.entity.Entity;
import net.minecraft.entity.passive.AbstractHorse;
import net.minecraft.entity.passive.EntityDonkey;
import net.minecraft.entity.passive.EntityHorse;
import net.minecraft.entity.passive.EntityLlama;
import net.minecraft.entity.passive.EntityMule;
import net.minecraft.entity.passive.EntityVillager;
import net.minecraft.item.EnumDyeColor;
import net.minecraft.nbt.NBTTagCompound;
import net.minecraft.tileentity.TileEntity;
import net.minecraft.tileentity.TileEntityBeacon;
import net.minecraft.tileentity.TileEntityChest;
import net.minecraft.tileentity.TileEntityDispenser;
import net.minecraft.tileentity.TileEntityDropper;
import net.minecraft.tileentity.TileEntityEnderChest;
import net.minecraft.tileentity.TileEntityShulkerBox;
import net.minecraft.util.ResourceLocation;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.IBlockAccess;
import net.minecraft.world.IWorldNameable;
import net.minecraft.world.biome.Biome;

public class H {
   
   private static final ResourceLocation y;
   
   private static final ResourceLocation u;
   
   private aS e = null;
   
   private Map d = null;
   
   private bj g = null;
   
   private Boolean j = null;
   
   private static final J[] q;
   
   private bj l = null;
   
   private Boolean k = null;
   
   private String b = null;
   
   private static final ResourceLocation A;
   
   private static final ResourceLocation B;
   
   private EnumDyeColor[] o = null;
   
   private Boolean h = null;
   
   private I c = null;
   
   private static final ResourceLocation v;
   
   private static final ResourceLocation F;
   
   private static final J[] s;
   
   private static final ResourceLocation C;
   
   private static int[] H;
   
   private static final bG[] p = new bG[0];
   
   private bG[] m = null;
   
   private static final ResourceLocation z;
   
   private static final ResourceLocation E;
   
   private static final ResourceLocation G;
   
   private String a = null;
   
   private Biome[] f = null;
   
   private static final ResourceLocation w;
   
   private J[] n = null;
   
   private Boolean i = null;
   
   private static final J[] r;
   
   private static final EnumDyeColor[] t;
   
   private static final ResourceLocation x;
   
   private static final ResourceLocation D;

   private static bG e(String var0) {
      var0 = var0.toLowerCase();
      String[] var1 = skid.gay.sex.spermix.inside.shalopay.RadioShanson.FastAura.a(var0, ":");
      if (var1.length > 2) {
         return null;
      } else {
         String var2 = var1[0];
         String var3 = null;
         if (var1.length > 1) {
            var3 = var1[1];
         }

         int var4 = f(var2);
         if (var4 < 0) {
            return null;
         } else {
            int[] var5 = null;
            if (var3 != null) {
               var5 = a(var4, var3);
               if (var5 == null) {
                  return null;
               }
            }

            return new bG(var4, var5);
         }
      }
   }

   public ResourceLocation a(ResourceLocation var1) {
      ResourceLocation var2 = (ResourceLocation)this.d.get(var1);
      return var2 == null ? var1 : var2;
   }

   private boolean a(TileEntityEnderChest var1, BlockPos var2, IBlockAccess var3) {
      return this.a(false, false, false, true, (String)null);
   }

   private boolean c(BlockPos var1, IBlockAccess var2) {
      TileEntity var3 = var2.getTileEntity(var1);
      if (var3 instanceof TileEntityChest) {
         TileEntityChest var5 = (TileEntityChest)var3;
         return this.a(var5, var1, var2);
      } else if (var3 instanceof TileEntityEnderChest) {
         TileEntityEnderChest var4 = (TileEntityEnderChest)var3;
         return this.a(var4, var1, var2);
      } else {
         return false;
      }
   }

   private boolean b(BlockPos var1, IBlockAccess var2) {
      TileEntity var3 = var2.getTileEntity(var1);
      if (!(var3 instanceof TileEntityBeacon)) {
         return false;
      } else {
         TileEntityBeacon var4 = (TileEntityBeacon)var3;
         if (this.l != null) {
            int var5 = var4.getLevels();
            if (!this.l.a(var5)) {
               return false;
            }
         }

         if (this.e != null) {
            String var6 = var4.getName();
            if (!this.e.a(var6)) {
               return false;
            }
         }

         return true;
      }
   }

   private static J[] a(I var0) {
      if (var0 == I.RadioShanson) {
         return q;
      } else {
         return var0 == I.AutoTotem ? r : new J[0];
      }
   }

   private static void g(String var0) {
      skid.gay.sex.spermix.inside.shalopay.RadioShanson.FastAura.b(String.valueOf((new StringBuilder("[CustomGuis] ")).append(var0)));
   }

   private J a(TileEntityDispenser var1) {
      return var1 instanceof TileEntityDropper ? J.f : J.e;
   }

   private static bG[] d(String var0) {
      if (var0 == null) {
         return null;
      } else {
         ArrayList var1 = new ArrayList();
         String[] var2 = skid.gay.sex.spermix.inside.shalopay.RadioShanson.FastAura.a(var0, " ");

         for(int var3 = 0; var3 < var2.length; ++var3) {
            String var4 = var2[var3];
            bG var5 = e(var4);
            if (var5 == null) {
               g(String.valueOf((new StringBuilder("Invalid profession: ")).append(var4)));
               return p;
            }

            var1.add(var5);
         }

         if (var1.isEmpty()) {
            return null;
         } else {
            bG[] var6 = (bG[])var1.toArray(new bG[var1.size()]);
            return var6;
         }
      }
   }

   public boolean a(I var1, BlockPos var2, IBlockAccess var3) {
      if (!this.b(var1, var2, var3)) {
         return false;
      } else {
         switch(b()[var1.ordinal()]) {
         case 2:
            return this.b(var2, var3);
         case 3:
            return this.a(var2, var3);
         case 4:
            return this.c(var2, var3);
         case 5:
         case 10:
         case 11:
         case 13:
         case 14:
         default:
            return true;
         case 6:
            return this.d(var2, var3);
         case 7:
            return this.a(var2, var3);
         case 8:
            return this.a(var2, var3);
         case 9:
            return this.a(var2, var3);
         case 12:
            return this.e(var2, var3);
         }
      }
   }

   public I a() {
      return this.c;
   }

   private static int f(String var0) {
      int var1 = skid.gay.sex.spermix.inside.shalopay.RadioShanson.FastAura.a((String)var0, -1);
      if (var1 >= 0) {
         return var1;
      } else if (var0.equals("farmer")) {
         return 0;
      } else if (var0.equals("librarian")) {
         return 1;
      } else if (var0.equals("priest")) {
         return 2;
      } else if (var0.equals("blacksmith")) {
         return 3;
      } else if (var0.equals("butcher")) {
         return 4;
      } else {
         return var0.equals("nitwit") ? 5 : -1;
      }
   }

   private static ResourceLocation b(I var0) {
      switch(b()[var0.ordinal()]) {
      case 1:
         return u;
      case 2:
         return v;
      case 3:
         return w;
      case 4:
         return x;
      case 5:
         return y;
      case 6:
         return A;
      case 7:
         return B;
      case 8:
         return C;
      case 9:
         return D;
      case 10:
         return z;
      case 11:
         return G;
      case 12:
         return F;
      case 13:
         return null;
      case 14:
         return E;
      default:
         return null;
      }
   }

   private static EnumDyeColor[] b(String var0) {
      if (var0 == null) {
         return null;
      } else {
         var0 = var0.toLowerCase();
         String[] var1 = skid.gay.sex.spermix.inside.shalopay.RadioShanson.FastAura.a(var0, " ");
         EnumDyeColor[] var2 = new EnumDyeColor[var1.length];

         for(int var3 = 0; var3 < var1.length; ++var3) {
            String var4 = var1[var3];
            EnumDyeColor var5 = c(var4);
            if (var5 == null) {
               g(String.valueOf((new StringBuilder("Invalid color: ")).append(var4)));
               return t;
            }

            var2[var3] = var5;
         }

         return var2;
      }
   }

   static {
      q = new J[]{J.a, J.b, J.c, J.d};
      r = new J[]{J.e, J.f};
      s = new J[0];
      t = new EnumDyeColor[0];
      u = new ResourceLocation("textures/gui/container/anvil.png");
      v = new ResourceLocation("textures/gui/container/beacon.png");
      w = new ResourceLocation("textures/gui/container/brewing_stand.png");
      x = new ResourceLocation("textures/gui/container/generic_54.png");
      y = new ResourceLocation("textures/gui/container/crafting_table.png");
      z = new ResourceLocation("textures/gui/container/horse.png");
      A = new ResourceLocation("textures/gui/container/dispenser.png");
      B = new ResourceLocation("textures/gui/container/enchanting_table.png");
      C = new ResourceLocation("textures/gui/container/furnace.png");
      D = new ResourceLocation("textures/gui/container/hopper.png");
      E = new ResourceLocation("textures/gui/container/inventory.png");
      F = new ResourceLocation("textures/gui/container/shulker_box.png");
      G = new ResourceLocation("textures/gui/container/villager.png");
   }

   private boolean e(BlockPos var1, IBlockAccess var2) {
      TileEntity var3 = var2.getTileEntity(var1);
      if (!(var3 instanceof TileEntityShulkerBox)) {
         return false;
      } else {
         TileEntityShulkerBox var4 = (TileEntityShulkerBox)var3;
         if (this.e != null) {
            String var5 = var4.getName();
            if (!this.e.a(var5)) {
               return false;
            }
         }

         if (this.o != null) {
            EnumDyeColor var6 = var4.getColor();
            if (!skid.gay.sex.spermix.inside.shalopay.RadioShanson.FastAura.a((Object)var6, (Object[])this.o)) {
               return false;
            }
         }

         return true;
      }
   }

   public String toString() {
      return String.valueOf((new StringBuilder("name: ")).append(this.a).append(", container: ").append(this.c).append(", textures: ").append(this.d));
   }

   private static EnumDyeColor c(String var0) {
      if (var0 == null) {
         return null;
      } else {
         EnumDyeColor[] var1 = EnumDyeColor.values();

         for(int var2 = 0; var2 < var1.length; ++var2) {
            EnumDyeColor var3 = var1[var2];
            if (var3.getName().equals(var0)) {
               return var3;
            }

            if (var3.getUnlocalizedName().equals(var0)) {
               return var3;
            }
         }

         return null;
      }
   }

   public boolean a(I var1, Entity var2, IBlockAccess var3) {
      if (!this.b(var1, var2.getPosition(), var3)) {
         return false;
      } else {
         if (this.e != null) {
            String var4 = var2.getName();
            if (!this.e.a(var4)) {
               return false;
            }
         }

         switch(b()[var1.ordinal()]) {
         case 10:
            return this.b(var2, var3);
         case 11:
            return this.a(var2, var3);
         default:
            return true;
         }
      }
   }

   public boolean a(String var1) {
      if (this.a != null && this.a.length() > 0) {
         if (this.b == null) {
            g(String.valueOf((new StringBuilder("No base path found: ")).append(var1)));
            return false;
         } else if (this.c == null) {
            g(String.valueOf((new StringBuilder("No container found: ")).append(var1)));
            return false;
         } else if (this.d.isEmpty()) {
            g(String.valueOf((new StringBuilder("No texture found: ")).append(var1)));
            return false;
         } else if (this.m == p) {
            g(String.valueOf((new StringBuilder("Invalid professions or careers: ")).append(var1)));
            return false;
         } else if (this.n == s) {
            g(String.valueOf((new StringBuilder("Invalid variants: ")).append(var1)));
            return false;
         } else if (this.o == t) {
            g(String.valueOf((new StringBuilder("Invalid colors: ")).append(var1)));
            return false;
         } else {
            return true;
         }
      } else {
         g(String.valueOf((new StringBuilder("No name found: ")).append(var1)));
         return false;
      }
   }

   private J a(AbstractHorse var1) {
      if (var1 instanceof EntityHorse) {
         return J.a;
      } else if (var1 instanceof EntityDonkey) {
         return J.b;
      } else if (var1 instanceof EntityMule) {
         return J.c;
      } else {
         return var1 instanceof EntityLlama ? J.d : null;
      }
   }

   private static Map a(Properties var0, String var1, I var2, String var3, String var4) {
      HashMap var5 = new HashMap();
      String var6 = var0.getProperty(var1);
      if (var6 != null) {
         ResourceLocation var7 = b(var2);
         ResourceLocation var8 = b(var6, var4);
         if (var7 != null && var8 != null) {
            var5.put(var7, var8);
         }
      }

      String var15 = String.valueOf((new StringBuilder(String.valueOf(var1))).append("."));
      Iterator var9 = var0.keySet().iterator();

      while(var9.hasNext()) {
         Object var16 = var9.next();
         if (((String)var16).startsWith(var15)) {
            String var10 = ((String)var16).substring(var15.length());
            var10 = var10.replace('\\', '/');
            var10 = bx.c(var10, "/", ".png");
            String var11 = String.valueOf((new StringBuilder(String.valueOf(var3))).append(var10).append(".png"));
            String var12 = var0.getProperty((String)var16);
            ResourceLocation var13 = new ResourceLocation(var11);
            ResourceLocation var14 = b(var12, var4);
            var5.put(var13, var14);
         }
      }

      return var5;
   }

   private boolean d(BlockPos var1, IBlockAccess var2) {
      TileEntity var3 = var2.getTileEntity(var1);
      if (!(var3 instanceof TileEntityDispenser)) {
         return false;
      } else {
         TileEntityDispenser var4 = (TileEntityDispenser)var3;
         if (this.e != null) {
            String var5 = var4.getName();
            if (!this.e.a(var5)) {
               return false;
            }
         }

         if (this.n != null) {
            J var6 = this.a(var4);
            if (!skid.gay.sex.spermix.inside.shalopay.RadioShanson.FastAura.a((Object)var6, (Object[])this.n)) {
               return false;
            }
         }

         return true;
      }
   }

   private boolean a(Entity var1, IBlockAccess var2) {
      if (!(var1 instanceof EntityVillager)) {
         return false;
      } else {
         EntityVillager var3 = (EntityVillager)var1;
         NBTTagCompound var4 = new NBTTagCompound();
         var3.writeToNBT(var4);
         Integer var5 = var4.getInteger("Profession");
         Integer var6 = var4.getInteger("Career");
         if (var5 != null && var6 != null) {
            if (this.m != null) {
               boolean var7 = false;

               for(int var8 = 0; var8 < this.m.length; ++var8) {
                  bG var9 = this.m[var8];
                  if (var9.a(var5, var6)) {
                     var7 = true;
                     break;
                  }
               }

               if (!var7) {
                  return false;
               }
            }

            return true;
         } else {
            return false;
         }
      }
   }

   private boolean a(BlockPos var1, IBlockAccess var2) {
      TileEntity var3 = var2.getTileEntity(var1);
      if (!(var3 instanceof IWorldNameable)) {
         return false;
      } else {
         IWorldNameable var4 = (IWorldNameable)var3;
         if (this.e != null) {
            String var5 = var4.getName();
            if (!this.e.a(var5)) {
               return false;
            }
         }

         return true;
      }
   }

   private static aS a(String var0, String var1) {
      return var0 != null && var1 != null ? new aS(var0, var1) : null;
   }

   public H(Properties var1, String var2) {
      ArrayList var3 = new ArrayList("CustomGuis");
      this.a = var3.a(var2);
      this.b = var3.b(var2);
      this.c = (I)var3.a(var1.getProperty("container"), I.a(), "container");
      this.d = a(var1, "texture", this.c, "textures/gui/", this.b);
      this.e = a("name", var1.getProperty("name"));
      this.f = var3.f(var1.getProperty("biomes"));
      this.g = var3.k(var1.getProperty("heights"));
      this.h = var3.m(var1.getProperty("large"));
      this.i = var3.m(var1.getProperty("trapped"));
      this.j = var3.m(var1.getProperty("christmas"));
      this.k = var3.m(var1.getProperty("ender"));
      this.l = var3.k(var1.getProperty("levels"));
      this.m = d(var1.getProperty("professions"));
      J[] var4 = a(this.c);
      this.n = (J[])var3.a(var1.getProperty("variants"), var4, "variants", s);
      this.o = b(var1.getProperty("colors"));
   }

   // $FF: synthetic method
   static int[] b() {
      int[] var10000 = H;
      if (var10000 != null) {
         return var10000;
      } else {
         int[] var0 = new int[I.a().length];

         try {
            var0[I.ClickGUI.ordinal()] = 1;
         } catch (NoSuchFieldError var14) {
         }

         try {
            var0[I.Bind.ordinal()] = 2;
         } catch (NoSuchFieldError var13) {
         }

         try {
            var0[I.SmthLikeColorGetter.ordinal()] = 3;
         } catch (NoSuchFieldError var12) {
         }

         try {
            var0[I.TargetHUD.ordinal()] = 4;
         } catch (NoSuchFieldError var11) {
         }

         try {
            var0[I.WhatIsTheHell.ordinal()] = 5;
         } catch (NoSuchFieldError var10) {
         }

         try {
            var0[I.RotationUtils.ordinal()] = 13;
         } catch (NoSuchFieldError var9) {
         }

         try {
            var0[I.AutoTotem.ordinal()] = 6;
         } catch (NoSuchFieldError var8) {
         }

         try {
            var0[I.BowAimBot.ordinal()] = 7;
         } catch (NoSuchFieldError var7) {
         }

         try {
            var0[I.ClientLoginThread.ordinal()] = 8;
         } catch (NoSuchFieldError var6) {
         }

         try {
            var0[I.CustomMainMenu.ordinal()] = 9;
         } catch (NoSuchFieldError var5) {
         }

         try {
            var0[I.RadioShanson.ordinal()] = 10;
         } catch (NoSuchFieldError var4) {
         }

         try {
            var0[I.MobAura.ordinal()] = 14;
         } catch (NoSuchFieldError var3) {
         }

         try {
            var0[I.CommandManager.ordinal()] = 12;
         } catch (NoSuchFieldError var2) {
         }

         try {
            var0[I.ClickGUIMode.ordinal()] = 11;
         } catch (NoSuchFieldError var1) {
         }

         H = var0;
         return var0;
      }
   }

   private static ResourceLocation b(String var0, String var1) {
      if (var0 == null) {
         return null;
      } else {
         var0 = var0.trim();
         String var2 = bB.a(var0, var1);
         if (!var2.endsWith(".png")) {
            var2 = String.valueOf((new StringBuilder(String.valueOf(var2))).append(".png"));
         }

         return new ResourceLocation(String.valueOf((new StringBuilder(String.valueOf(var1))).append("/").append(var2)));
      }
   }

   private static int[] a(int var0, String var1) {
      IntArraySet var2 = new IntArraySet();
      String[] var3 = skid.gay.sex.spermix.inside.shalopay.RadioShanson.FastAura.a(var1, ",");

      for(int var4 = 0; var4 < var3.length; ++var4) {
         String var5 = var3[var4];
         int var6 = b(var0, var5);
         if (var6 < 0) {
            return null;
         }

         var2.add(var6);
      }

      int[] var7 = var2.toIntArray();
      return var7;
   }

   private boolean b(Entity var1, IBlockAccess var2) {
      if (!(var1 instanceof AbstractHorse)) {
         return false;
      } else {
         AbstractHorse var3 = (AbstractHorse)var1;
         if (this.n != null) {
            J var4 = this.a(var3);
            if (!skid.gay.sex.spermix.inside.shalopay.RadioShanson.FastAura.a((Object)var4, (Object[])this.n)) {
               return false;
            }
         }

         if (this.o != null && var3 instanceof EntityLlama) {
            EntityLlama var6 = (EntityLlama)var3;
            EnumDyeColor var5 = var6.getColor();
            if (!skid.gay.sex.spermix.inside.shalopay.RadioShanson.FastAura.a((Object)var5, (Object[])this.o)) {
               return false;
            }
         }

         return true;
      }
   }

   private boolean a(boolean var1, boolean var2, boolean var3, boolean var4, String var5) {
      if (this.h != null && this.h != var1) {
         return false;
      } else if (this.i != null && this.i != var2) {
         return false;
      } else if (this.j != null && this.j != var3) {
         return false;
      } else if (this.k != null && this.k != var4) {
         return false;
      } else {
         return this.e == null || this.e.a(var5);
      }
   }

   private boolean a(TileEntityChest var1, BlockPos var2, IBlockAccess var3) {
      boolean var4 = var1.adjacentChestXNeg != null || var1.adjacentChestXPos != null || var1.adjacentChestZNeg != null || var1.adjacentChestZPos != null;
      boolean var5 = var1.getChestType() == BlockChest$Type.TRAP;
      boolean var6 = K.a;
      boolean var7 = false;
      String var8 = var1.getName();
      return this.a(var4, var5, var6, var7, var8);
   }

   private static int b(int var0, String var1) {
      int var2 = skid.gay.sex.spermix.inside.shalopay.RadioShanson.FastAura.a((String)var1, -1);
      if (var2 >= 0) {
         return var2;
      } else {
         if (var0 == 0) {
            if (var1.equals("farmer")) {
               return 1;
            }

            if (var1.equals("fisherman")) {
               return 2;
            }

            if (var1.equals("shepherd")) {
               return 3;
            }

            if (var1.equals("fletcher")) {
               return 4;
            }
         }

         if (var0 == 1) {
            if (var1.equals("librarian")) {
               return 1;
            }

            if (var1.equals("cartographer")) {
               return 2;
            }
         }

         if (var0 == 2 && var1.equals("cleric")) {
            return 1;
         } else {
            if (var0 == 3) {
               if (var1.equals("armor")) {
                  return 1;
               }

               if (var1.equals("weapon")) {
                  return 2;
               }

               if (var1.equals("tool")) {
                  return 3;
               }
            }

            if (var0 == 4) {
               if (var1.equals("butcher")) {
                  return 1;
               }

               if (var1.equals("leather")) {
                  return 2;
               }
            }

            return var0 == 5 && var1.equals("nitwit") ? 1 : -1;
         }
      }
   }

   private boolean b(I var1, BlockPos var2, IBlockAccess var3) {
      if (this.c != var1) {
         return false;
      } else {
         if (this.f != null) {
            Biome var4 = var3.getBiome(var2);
            if (!aK.a(var4, this.f)) {
               return false;
            }
         }

         return this.g == null || this.g.a(var2.getY());
      }
   }
}
