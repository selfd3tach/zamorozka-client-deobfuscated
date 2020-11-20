package skid.gay.sex.spermix.inside.shalopay.j;

import java.io.FileNotFoundException;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Calendar;
import java.util.List;
import java.util.Properties;
import net.minecraft.client.Minecraft;
import net.minecraft.client.gui.GuiEnchantment;
import net.minecraft.client.gui.GuiHopper;
import net.minecraft.client.gui.GuiMerchant;
import net.minecraft.client.gui.GuiRepair;
import net.minecraft.client.gui.GuiScreen;
import net.minecraft.client.gui.inventory.GuiBeacon;
import net.minecraft.client.gui.inventory.GuiBrewingStand;
import net.minecraft.client.gui.inventory.GuiChest;
import net.minecraft.client.gui.inventory.GuiContainer;
import net.minecraft.client.gui.inventory.GuiContainerCreative;
import net.minecraft.client.gui.inventory.GuiCrafting;
import net.minecraft.client.gui.inventory.GuiDispenser;
import net.minecraft.client.gui.inventory.GuiFurnace;
import net.minecraft.client.gui.inventory.GuiInventory;
import net.minecraft.client.gui.inventory.GuiScreenHorseInventory;
import net.minecraft.client.gui.inventory.GuiShulkerBox;
import net.minecraft.client.multiplayer.WorldClient;
import net.minecraft.client.resources.IResourcePack;
import net.minecraft.entity.Entity;
import net.minecraft.util.ResourceLocation;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.IBlockAccess;

public class K {
   
   public static boolean a = b();
   
   private static H[][] d = null;
   
   private static Minecraft b = FastAura.R();
   
   private static aY c = null;

   public static ResourceLocation a(ResourceLocation var0) {
      if (d == null) {
         return var0;
      } else {
         GuiScreen var1 = b.currentScreen;
         if (!(var1 instanceof GuiContainer)) {
            return var0;
         } else if (var0.getResourceDomain().equals("minecraft") && var0.getResourcePath().startsWith("textures/gui/")) {
            if (c == null) {
               return var0;
            } else {
               WorldClient var2 = b.world;
               if (var2 == null) {
                  return var0;
               } else if (var1 instanceof GuiContainerCreative) {
                  return a(I.RotationUtils, (BlockPos)Minecraft.player.getPosition(), var2, var0);
               } else if (var1 instanceof GuiInventory) {
                  return a(I.MobAura, (BlockPos)Minecraft.player.getPosition(), var2, var0);
               } else {
                  BlockPos var3 = c.b();
                  if (var3 != null) {
                     if (var1 instanceof GuiRepair) {
                        return a(I.ClickGUI, (BlockPos)var3, var2, var0);
                     }

                     if (var1 instanceof GuiBeacon) {
                        return a(I.Bind, (BlockPos)var3, var2, var0);
                     }

                     if (var1 instanceof GuiBrewingStand) {
                        return a(I.SmthLikeColorGetter, (BlockPos)var3, var2, var0);
                     }

                     if (var1 instanceof GuiChest) {
                        return a(I.TargetHUD, (BlockPos)var3, var2, var0);
                     }

                     if (var1 instanceof GuiCrafting) {
                        return a(I.WhatIsTheHell, (BlockPos)var3, var2, var0);
                     }

                     if (var1 instanceof GuiDispenser) {
                        return a(I.AutoTotem, (BlockPos)var3, var2, var0);
                     }

                     if (var1 instanceof GuiEnchantment) {
                        return a(I.BowAimBot, (BlockPos)var3, var2, var0);
                     }

                     if (var1 instanceof GuiFurnace) {
                        return a(I.ClientLoginThread, (BlockPos)var3, var2, var0);
                     }

                     if (var1 instanceof GuiHopper) {
                        return a(I.CustomMainMenu, (BlockPos)var3, var2, var0);
                     }

                     if (var1 instanceof GuiShulkerBox) {
                        return a(I.CommandManager, (BlockPos)var3, var2, var0);
                     }
                  }

                  Entity var4 = c.c();
                  if (var4 != null) {
                     if (var1 instanceof GuiScreenHorseInventory) {
                        return a(I.RadioShanson, (Entity)var4, var2, var0);
                     }

                     if (var1 instanceof GuiMerchant) {
                        return a(I.ClickGUIMode, (Entity)var4, var2, var0);
                     }
                  }

                  return var0;
               }
            }
         } else {
            return var0;
         }
      }
   }

   private static boolean b() {
      Calendar var0 = Calendar.getInstance();
      return var0.get(2) + 1 == 12 && var0.get(5) >= 24 && var0.get(5) <= 26;
   }

   private static ResourceLocation a(I var0, BlockPos var1, IBlockAccess var2, ResourceLocation var3) {
      H[] var4 = d[var0.ordinal()];
      if (var4 == null) {
         return var3;
      } else {
         for(int var5 = 0; var5 < var4.length; ++var5) {
            H var6 = var4[var5];
            if (var6.a(var0, var1, var2)) {
               return var6.a(var3);
            }
         }

         return var3;
      }
   }

   public static void a() {
      d = null;
      if (FastAura.bh()) {
         ArrayList var0 = new ArrayList();
         IResourcePack[] var1 = FastAura.U();

         for(int var2 = var1.length - 1; var2 >= 0; --var2) {
            IResourcePack var3 = var1[var2];
            a((IResourcePack)var3, var0);
         }

         d = a((List)var0);
      }

   }

   private static void a(IResourcePack var0, List var1) {
      String[] var2 = bu.a((IResourcePack)var0, (String)"optifine/gui/container/", (String)".properties", (String[])null);
      Arrays.sort(var2);

      for(int var3 = 0; var3 < var2.length; ++var3) {
         String var4 = var2[var3];
         FastAura.a(String.valueOf((new StringBuilder("CustomGuis: ")).append(var4)));

         try {
            ResourceLocation var5 = new ResourceLocation(var4);
            InputStream var6 = var0.getInputStream(var5);
            if (var6 == null) {
               FastAura.b(String.valueOf((new StringBuilder("CustomGuis file not found: ")).append(var4)));
            } else {
               Properties var7 = new Properties();
               var7.load(var6);
               var6.close();
               H var8 = new H(var7, var4);
               if (var8.a(var4)) {
                  a(var8, var1);
               }
            }
         } catch (FileNotFoundException var9) {
            FastAura.b(String.valueOf((new StringBuilder("CustomGuis file not found: ")).append(var4)));
         } catch (Exception var10) {
            var10.printStackTrace();
         }
      }

   }

   private static void a(H var0, List var1) {
      if (var0.a() == null) {
         a(String.valueOf((new StringBuilder("Invalid container: ")).append(var0.a())));
      } else {
         int var2 = var0.a().ordinal();

         while(var1.size() <= var2) {
            var1.add((Object)null);
         }

         Object var3 = (List)var1.get(var2);
         if (var3 == null) {
            var3 = new ArrayList();
            var1.set(var2, var3);
         }

         ((List)var3).add(var0);
      }

   }

   private static H[][] a(List var0) {
      if (var0.isEmpty()) {
         return null;
      } else {
         H[][] var1 = new H[I.a().length][];

         for(int var2 = 0; var2 < var1.length; ++var2) {
            if (var0.size() > var2) {
               List var3 = (List)var0.get(var2);
               if (var3 != null) {
                  H[] var4 = (H[])var3.toArray(new H[var3.size()]);
                  var1[var2] = var4;
               }
            }
         }

         return var1;
      }
   }

   private static ResourceLocation a(I var0, Entity var1, IBlockAccess var2, ResourceLocation var3) {
      H[] var4 = d[var0.ordinal()];
      if (var4 == null) {
         return var3;
      } else {
         for(int var5 = 0; var5 < var4.length; ++var5) {
            H var6 = var4[var5];
            if (var6.a(var0, var1, var2)) {
               return var6.a(var3);
            }
         }

         return var3;
      }
   }

   private static void a(String var0) {
      FastAura.b(String.valueOf((new StringBuilder("[CustomGuis] ")).append(var0)));
   }

   public static void a(aY var0) {
      c = var0;
   }
}
