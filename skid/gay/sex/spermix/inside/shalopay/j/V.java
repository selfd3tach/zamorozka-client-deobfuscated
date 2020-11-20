package skid.gay.sex.spermix.inside.shalopay.j;

import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import net.minecraft.block.Block;
import net.minecraft.client.multiplayer.WorldClient;
import net.minecraft.client.renderer.RenderGlobal;
import net.minecraft.entity.Entity;
import net.minecraft.entity.EntityLivingBase;
import net.minecraft.entity.item.EntityItem;
import net.minecraft.entity.item.EntityTNTPrimed;
import net.minecraft.entity.monster.EntityBlaze;
import net.minecraft.entity.monster.EntityCreeper;
import net.minecraft.entity.monster.EntityMagmaCube;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.entity.projectile.EntityFireball;
import net.minecraft.init.Blocks;
import net.minecraft.init.Items;
import net.minecraft.inventory.EntityEquipmentSlot;
import net.minecraft.item.Item;
import net.minecraft.item.ItemBlock;
import net.minecraft.item.ItemStack;
import net.minecraft.network.datasync.DataParameter;
import net.minecraft.network.datasync.DataSerializers;
import net.minecraft.util.IntegerCache;
import net.minecraft.util.math.BlockPos;

public class V {
   
   private static long b = 0L;
   
   private static final DataParameter c;
   
   private static Map a = new HashMap();

   public static int a(BlockPos var0, int var1) {
      double var2 = a(var0);
      var1 = a(var2, var1);
      return var1;
   }

   private static void c(RenderGlobal var0) {
      WorldClient var1 = var0.getWorld();
      if (var1 != null) {
         Iterator var3 = var1.getLoadedEntityList().iterator();

         while(var3.hasNext()) {
            Entity var2 = (Entity)var3.next();
            int var4 = a(var2);
            Integer var5;
            U var6;
            if (var4 > 0) {
               var5 = IntegerCache.getInteger(var2.getEntityId());
               var6 = (U)a.get(var5);
               if (var6 == null) {
                  var6 = new U(var2);
                  a.put(var5, var6);
               }
            } else {
               var5 = IntegerCache.getInteger(var2.getEntityId());
               var6 = (U)a.remove(var5);
               if (var6 != null) {
                  var6.b(var0);
               }
            }
         }
      }

   }

   public static void b(Entity var0, RenderGlobal var1) {
      synchronized(a) {
         U var3 = (U)a.remove(IntegerCache.getInteger(var0.getEntityId()));
         if (var3 != null) {
            var3.b(var1);
         }

      }
   }

   public static int a(double var0, int var2) {
      if (var0 > 0.0D) {
         int var3 = (int)(var0 * 16.0D);
         int var4 = var2 & 255;
         if (var3 > var4) {
            var2 &= -256;
            var2 |= var3;
         }
      }

      return var2;
   }

   public static void b(RenderGlobal var0) {
      synchronized(a) {
         Collection var2 = a.values();
         Iterator var3 = var2.iterator();

         while(var3.hasNext()) {
            U var4 = (U)var3.next();
            var3.remove();
            var4.b(var0);
         }

      }
   }

   public static double a(BlockPos var0) {
      double var1 = 0.0D;
      synchronized(a) {
         Iterator var5 = a.values().iterator();

         while(true) {
            if (!var5.hasNext()) {
               break;
            }

            U var4 = (U)var5.next();
            int var6 = var4.d();
            if (var6 > 0) {
               double var7 = var4.a();
               double var9 = var4.b();
               double var11 = var4.c();
               double var13 = (double)var0.getX() - var7;
               double var15 = (double)var0.getY() - var9;
               double var17 = (double)var0.getZ() - var11;
               double var19 = var13 * var13 + var15 * var15 + var17 * var17;
               if (var4.e() && !FastAura.ak()) {
                  var6 = FastAura.a(var6 - 2, 0, 15);
                  var19 *= 2.0D;
               }

               if (var19 <= 56.25D) {
                  double var21 = Math.sqrt(var19);
                  double var23 = 1.0D - var21 / 7.5D;
                  double var25 = var23 * (double)var6;
                  if (var25 > var1) {
                     var1 = var25;
                  }
               }
            }
         }
      }

      double var3 = FastAura.a(var1, 0.0D, 15.0D);
      return var3;
   }

   static {
      c = new DataParameter(6, DataSerializers.OPTIONAL_ITEM_STACK);
   }

   public static ItemStack a(EntityItem var0) {
      ItemStack var1 = (ItemStack)var0.getDataManager().get(c);
      return var1;
   }

   public static int a(Entity var0) {
      if (var0 == FastAura.R().getRenderViewEntity() && !FastAura.bf()) {
         return 0;
      } else {
         if (var0 instanceof EntityPlayer) {
            EntityPlayer var1 = (EntityPlayer)var0;
            if (var1.isSpectator()) {
               return 0;
            }
         }

         if (var0.isBurning()) {
            return 15;
         } else if (var0 instanceof EntityFireball) {
            return 15;
         } else if (var0 instanceof EntityTNTPrimed) {
            return 15;
         } else if (var0 instanceof EntityBlaze) {
            EntityBlaze var13 = (EntityBlaze)var0;
            return var13.isCharged() ? 15 : 10;
         } else if (var0 instanceof EntityMagmaCube) {
            EntityMagmaCube var12 = (EntityMagmaCube)var0;
            return (double)var12.squishFactor > 0.6D ? 13 : 8;
         } else {
            if (var0 instanceof EntityCreeper) {
               EntityCreeper var9 = (EntityCreeper)var0;
               if ((double)var9.getCreeperFlashIntensity(0.0F) > 0.001D) {
                  return 15;
               }
            }

            ItemStack var2;
            if (var0 instanceof EntityLivingBase) {
               EntityLivingBase var11 = (EntityLivingBase)var0;
               var2 = var11.getHeldItemMainhand();
               int var3 = a(var2);
               ItemStack var4 = var11.getHeldItemOffhand();
               int var5 = a(var4);
               ItemStack var6 = var11.getItemStackFromSlot(EntityEquipmentSlot.HEAD);
               int var7 = a(var6);
               int var8 = Math.max(var3, var5);
               return Math.max(var8, var7);
            } else if (var0 instanceof EntityItem) {
               EntityItem var10 = (EntityItem)var0;
               var2 = a(var10);
               return a(var2);
            } else {
               return 0;
            }
         }
      }
   }

   public static void a(RenderGlobal var0) {
      long var1 = System.currentTimeMillis();
      if (var1 >= b + 50L) {
         b = var1;
         synchronized(a) {
            c(var0);
            if (a.size() > 0) {
               Iterator var5 = a.values().iterator();

               while(var5.hasNext()) {
                  U var4 = (U)var5.next();
                  var4.a(var0);
               }
            }
         }
      }

   }

   public static void a() {
      synchronized(a) {
         a.clear();
      }
   }

   public static int b() {
      synchronized(a) {
         return a.size();
      }
   }

   public static int a(Entity var0, int var1) {
      double var2 = (double)a(var0);
      var1 = a(var2, var1);
      return var1;
   }

   public static void a(Entity var0, RenderGlobal var1) {
   }

   public static int a(ItemStack var0) {
      if (var0 == null) {
         return 0;
      } else {
         Item var1 = var0.getItem();
         if (var1 instanceof ItemBlock) {
            ItemBlock var2 = (ItemBlock)var1;
            Block var3 = var2.getBlock();
            if (var3 != null) {
               return var3.getLightValue(var3.getDefaultState());
            }
         }

         if (var1 == Items.LAVA_BUCKET) {
            return Blocks.LAVA.getLightValue(Blocks.LAVA.getDefaultState());
         } else if (var1 != Items.BLAZE_ROD && var1 != Items.BLAZE_POWDER) {
            if (var1 == Items.GLOWSTONE_DUST) {
               return 8;
            } else if (var1 == Items.PRISMARINE_CRYSTALS) {
               return 8;
            } else if (var1 == Items.MAGMA_CREAM) {
               return 8;
            } else {
               return var1 == Items.NETHER_STAR ? Blocks.BEACON.getLightValue(Blocks.BEACON.getDefaultState()) / 2 : 0;
            }
         } else {
            return 10;
         }
      }
   }
}
