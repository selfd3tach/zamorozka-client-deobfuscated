//Deobfuscated with https://github.com/PetoPetko/Minecraft-Deobfuscator3000 using mappings "mc_mappings"!

package skid.gay.sex.spermix.inside.shalopay.features.newmegospeed;

import java.awt.Color;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;
import skid.gay.sex.spermix.inside.shalopay.features.idk.C;
import skid.gay.sex.spermix.inside.shalopay.features.module.modules.combat.MatrixAura;
import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.client.Minecraft;
import net.minecraft.client.entity.EntityPlayerSP;
import net.minecraft.client.gui.FontRenderer;
import net.minecraft.client.gui.Gui;
import net.minecraft.client.gui.GuiScreen;
import net.minecraft.client.gui.ScaledResolution;
import net.minecraft.client.gui.inventory.GuiInventory;
import net.minecraft.entity.Entity;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.ItemBlock;
import net.minecraft.item.ItemStack;
import net.minecraft.util.ResourceLocation;

import org.lwjgl.opengl.GL11;
import skid.gay.sex.spermix.inside.shalopay.features.module.SmthLikeModuleRegister;
import skid.gay.sex.spermix.inside.shalopay.features.smthLikeInit.Main;
import skid.gay.sex.spermix.inside.shalopay.features.module.Module;

public class TargetHUD extends GuiScreen {
   
   private static final ResourceLocation c = new ResourceLocation("textures/gui/icons.png");
   
   public static List b = new ArrayList();
   
   public static Minecraft a = Minecraft.getMinecraft();

   public static void b() {
      ScaledResolution var0 = new ScaledResolution(Minecraft.getMinecraft());
      FontRenderer var1 = a.fontRendererObj;
      byte var2 = 1;
      boolean var3 = true;
      boolean var4 = true;
      boolean var5 = false;
      new ArrayList();
      boolean var10000;
      if (Minecraft.player.isEntityAlive() && Minecraft.player.isInsideOfMaterial(Material.WATER)) {
         var10000 = true;
      } else {
         var10000 = false;
      }

      Object var8 = null;
      if (Main.a.a("Model").e()) {
         GuiInventory.drawEntityOnScreen(650, 350, 35, 1.0F, 1.0F, Minecraft.player);
      }

      if (SmthLikeModuleRegister.a(skid.gay.sex.spermix.inside.shalopay.features.hud.InfoBoard.class).c()) {
         a.fontRendererObj.drawStringWithShadow(String.valueOf((new StringBuilder("Fps: ")).append(Minecraft.debugFPS)), (float)(width / 100), (float)(height / 3), -16739881);
         a.fontRendererObj.drawStringWithShadow(String.valueOf((new StringBuilder("Ping: ")).append(a.getCurrentServerData().pingToServer)), (float)(width / 100), (float)(height * 2 / 5), -16739881);
      }

      if (SmthLikeModuleRegister.a(skid.gay.sex.spermix.inside.shalopay.features.module.modules.world.Scaffold.class).c()) {
         for(int var10 = 0; var10 < 9; ++var10) {
            ItemStack var11 = Minecraft.player.inventory.getStackInSlot(var10);
            if (!C.a(var11) && var11.getItem() instanceof ItemBlock && Block.getBlockFromItem(var11.getItem()).getDefaultState().isFullBlock()) {
               GuiScreen.fontRendererObj.drawStringWithShadow(String.valueOf((new StringBuilder()).append(var11.getCount())), (float)(width / 2), (float)(height / 2), -16739881);
               itemRender.renderItemAndEffectIntoGUI(var11, var0.getScaledWidth() - 340, var0.getScaledHeight() - 170);
               break;
            }
         }
      }

      if (SmthLikeModuleRegister.a(skid.gay.sex.spermix.inside.shalopay.features.hud.TextRadar.class).c()) {
         int[] var18 = new int[]{height / 2};
         Iterator var12 = a.world.loadedEntityList.iterator();

         while(var12.hasNext()) {
            Object var20 = var12.next();
            Entity var13 = (Entity)var20;
            if (var13 instanceof EntityPlayer && !(var13 instanceof EntityPlayerSP)) {
               float var14 = Minecraft.player.getDistanceToEntity(var13);
               float var15 = (float)Math.round(Minecraft.player.getDistanceToEntity(var13) * 100.0F / 100.0F);
               if (var14 < 10.0F) {
                  if (Main.a.a("Left Edge").e()) {
                     a.fontRendererObj.drawStringWithShadow(String.valueOf((new StringBuilder("§f")).append(var13.getName()).append(" §3").append(var15)), (float)(width / 100), (float)var18[0], -16739881);
                     var18[0] += var1.FONT_HEIGHT - 1;
                  }

                  if (Main.a.a("Centre").e()) {
                     a.fontRendererObj.drawStringWithShadow(String.valueOf((new StringBuilder("§f")).append(var13.getName()).append(" §3").append(var15)), (float)(width / 2), (float)(var18[0] * 3 / 2), -16739881);
                     var18[0] -= var1.FONT_HEIGHT - 1;
                  }
               }
            }
         }
      }

      String var19 = "Zamorozka";
      char var21 = var19.charAt(0);
      String var22 = var19.substring(1);
      if (!SmthLikeModuleRegister.a(skid.gay.sex.spermix.inside.shalopay.features.hud.Logo.class).c()) {
         Main.h.f.a(String.valueOf((new StringBuilder("§3")).append(String.valueOf(var21)).append("§f").append(var22)), 1.0D, 5.0D, -16739881);
      }

      if (Main.a.a("InfoBoard").e()) {
         GuiInventory.drawEntityOnScreen(var0.getScaledWidth() - 20, var0.getScaledWidth() - 335, 35, 30.0F, Minecraft.player.rotationPitch, Minecraft.player);
         Gui.drawRect((double)(var0.getScaledWidth() + 600), 250.0D, (double)(var0.getScaledWidth() - 160), (double)(var0.getScaledWidth() - 50), -2012213232);
         if (Minecraft.player.getHealth() <= 20.0F) {
            Gui.drawRect((double)(var0.getScaledWidth() - 60), 290.0D, (double)(var0.getScaledWidth() - 150), 300.0D, -14880362);
         }

         if (Minecraft.player.getHealth() <= 15.0F) {
            Gui.drawRect((double)(var0.getScaledWidth() - 60), 290.0D, (double)(var0.getScaledWidth() - 150), 300.0D, -196692);
         }

         if (Minecraft.player.getHealth() <= 10.0F) {
            Gui.drawRect((double)(var0.getScaledWidth() - 60), 290.0D, (double)(var0.getScaledWidth() - 150), 300.0D, -20564);
         }

         if (Minecraft.player.getHealth() <= 5.0F) {
            Gui.drawRect((double)(var0.getScaledWidth() - 60), 290.0D, (double)(var0.getScaledWidth() - 150), 300.0D, -63232);
         }

         if (Minecraft.player.getHealth() == 0.0F) {
            Gui.drawRect((double)(var0.getScaledWidth() - 60), 290.0D, (double)(var0.getScaledWidth() - 150), 300.0D, -2012213232);
         }

         Gui.drawRect((double)(var0.getScaledHeight() + 180), 310.0D, (double)((float)(var0.getScaledWidth() - 78) + Minecraft.player.getFoodStats().getSaturationLevel()), 320.0D, -32172);
         var1.drawStringWithShadow(String.valueOf((new StringBuilder("§5§lFPS: ")).append(Minecraft.debugFPS)), 534.0F, 325.0F, -32172);
         var1.drawStringWithShadow(String.valueOf((new StringBuilder("§F§lPING: ")).append(a.getCurrentServerData().pingToServer)), 570.0F, 325.0F, -32172);
         var1.drawStringWithShadow(String.valueOf((new StringBuilder(" §7§l ")).append(a.getCurrentServerData().gameVersion)), 535.0F, 340.0F, -32172);
      }

      if (Main.a.a("PlayerBoard").e()) {
         List var23 = a.world.playerEntities;

         for(int var25 = 0; var25 < var23.size(); ++var25) {
            if (((EntityPlayer)var23.get(var25)).getName() != Minecraft.player.getName()) {
               EntityPlayer var26 = (EntityPlayer)var23.get(1);
               if (Minecraft.player.getDistanceToEntity(var26) > Minecraft.player.getDistanceToEntity((Entity)var23.get(var25))) {
                  var26 = (EntityPlayer)var23.get(var25);
               }

               float var16 = Minecraft.player.getDistanceToEntity(var26);
               if ((double)var16 < Main.a.a("Distance").f() && (SmthLikeModuleRegister.a(skid.gay.sex.spermix.inside.shalopay.features.module.modules.combat.Aura.class).c() || SmthLikeModuleRegister.a(skid.gay.sex.spermix.inside.shalopay.features.module.modules.combat.KillAura.class).c() || SmthLikeModuleRegister.a(skid.gay.sex.spermix.inside.shalopay.features.module.modules.combat.JetAura.class).c() || SmthLikeModuleRegister.a(MatrixAura.class).c())) {
                  GuiInventory.drawEntityOnScreen(var0.getScaledWidth() - 20, var0.getScaledWidth() - 335, 35, 30.0F, var26.rotationPitch, var26);
                  Gui.drawRect((double)(var0.getScaledWidth() + 600), 250.0D, (double)(var0.getScaledWidth() - 160), (double)(var0.getScaledWidth() - 50), -2012213232);
                  if (Minecraft.player.getHealth() <= 20.0F) {
                     Gui.drawRect((double)(var0.getScaledWidth() - 60), 290.0D, (double)(var0.getScaledWidth() - 150), 300.0D, -14880362);
                  }

                  if (var26.getHealth() <= 15.0F) {
                     Gui.drawRect((double)(var0.getScaledWidth() - 60), 290.0D, (double)(var0.getScaledWidth() - 150), 300.0D, -196692);
                  }

                  if (var26.getHealth() <= 10.0F) {
                     Gui.drawRect((double)(var0.getScaledWidth() - 60), 290.0D, (double)(var0.getScaledWidth() - 150), 300.0D, -20564);
                  }

                  if (var26.getHealth() <= 5.0F) {
                     Gui.drawRect((double)(var0.getScaledWidth() - 60), 290.0D, (double)(var0.getScaledWidth() - 150), 300.0D, -63232);
                  }

                  if (var26.getHealth() == 0.0F) {
                     Gui.drawRect((double)(var0.getScaledWidth() - 60), 290.0D, (double)(var0.getScaledWidth() - 150), 300.0D, -2012213232);
                  }

                  Gui.drawRect((double)(var0.getScaledHeight() + 180), 310.0D, (double)((float)(var0.getScaledWidth() - 78) + var26.getFoodStats().getSaturationLevel()), 320.0D, -32172);
                  var1.drawStringWithShadow(var26.getGameProfile().getName(), 534.0F, 325.0F, -32172);
                  var1.drawStringWithShadow(String.valueOf((new StringBuilder("Health: ")).append(var26.getHealth())), 600.0F, 325.0F, -32172);
                  var1.drawStringWithShadow("§5§l[Z]§F§lAMOROZKA", 530.0F, 255.0F, -32172);
               }
            }
         }
      }

      a(var0);
      int var24 = var0.getScaledWidth();
      int var17 = var2 + 1;
   }

   private static void a(ScaledResolution var0) {
      byte var1 = 5;
      int var2 = var0.getScaledWidth();
      byte var3 = 1;
      byte var4 = 0;
      Main.a.a("RainBow").c().equalsIgnoreCase("Enable");
      if (Main.a.a("RainBow").c().equalsIgnoreCase("Enable")) {
         FontRenderer var5 = a.fontRendererObj;
         int[] var6 = new int[]{2};
         SmthLikeModuleRegister.a().stream().filter(Module::c).sorted(Comparator.comparingInt((var1x) -> {
            return -var5.getStringWidth(var1x.a());
         })).forEach((var4x) -> {
            if (var4x.a() != "ClickGUI" && var4x.a() != "SaveModule") {
               var5.drawStringWithShadow(var4x.a(), (float)(var0.getScaledWidth() - 2 - var5.getStringWidth(var4x.a())), (float)(var6[0] - 1), a(10000000L * (long)var4, 1.0F).getRGB());
               var6[0] += var5.FONT_HEIGHT;
            }

         });
         int var10 = var1 + 10;
         int var11 = var3 + 1;
      }

      int var12 = var0.getScaledWidth();
      if (Main.a.a("RainBow").c().equalsIgnoreCase("Disable")) {
         float[] var10000 = new float[]{0.125F, 0.125F, 0.125F};

         try {
            FontRenderer var7 = a.fontRendererObj;
            int[] var8;
            if (Main.a.a("TestArrey").e()) {
               var8 = new int[]{1};
               if (Main.a.a("UpArrey").e()) {
                  SmthLikeModuleRegister.a().stream().filter(Module::c).sorted(Comparator.comparingInt((var0x) -> {
                     return -skid.gay.sex.spermix.inside.shalopay.MobAura.TargetHUD.ClientLoginThread.SmthLikeColorGetter.a(var0x.a());
                  })).forEach((var3x) -> {
                     if (var3x.a() != "ClickGUI" && var3x.a() != "SaveModule") {
                        Gui.drawRect((double)(var12 - 2 - skid.gay.sex.spermix.inside.shalopay.MobAura.TargetHUD.ClientLoginThread.SmthLikeColorGetter.a(var3x.a())), (double)(var8[0] - 1), (double)(var12 + skid.gay.sex.spermix.inside.shalopay.MobAura.TargetHUD.ClientLoginThread.SmthLikeColorGetter.a(var3x.a())), (double)(var8[0] + 6), -2012213232);
                        Gui.drawRect((double)(var12 - 2 - skid.gay.sex.spermix.inside.shalopay.MobAura.TargetHUD.ClientLoginThread.SmthLikeColorGetter.a(var3x.a())), (double)(var8[0] + 6), (double)(var12 + skid.gay.sex.spermix.inside.shalopay.MobAura.TargetHUD.ClientLoginThread.SmthLikeColorGetter.a(var3x.a())), (double)(var8[0] + 7), -8529921);
                        Gui.drawRect((double)(var12 - 2 - skid.gay.sex.spermix.inside.shalopay.MobAura.TargetHUD.ClientLoginThread.SmthLikeColorGetter.a(var3x.a())), (double)(var8[0] - 1), (double)(var12 + skid.gay.sex.spermix.inside.shalopay.MobAura.TargetHUD.ClientLoginThread.SmthLikeColorGetter.a(var3x.a())), (double)(var8[0] + 7), -2012213232);
                        char var4 = var3x.a().charAt(0);
                        String var5 = var3x.a().substring(1);
                        skid.gay.sex.spermix.inside.shalopay.MobAura.TargetHUD.ClientLoginThread.SmthLikeColorGetter.a(String.valueOf((new StringBuilder("§3")).append(String.valueOf(var4)).append("§f").append(var5)), (double)(var12 - 2 - skid.gay.sex.spermix.inside.shalopay.MobAura.TargetHUD.ClientLoginThread.SmthLikeColorGetter.a(var3x.a())), (double)var8[0], 15132410);
                        var8[0] += var7.FONT_HEIGHT - 1;
                     }

                  });
               }
            } else {
               if (Main.a.a("UpArrey").e()) {
                  var8 = new int[]{1};
                  SmthLikeModuleRegister.a().stream().filter(Module::c).sorted(Comparator.comparingInt((var0x) -> {
                     return -skid.gay.sex.spermix.inside.shalopay.MobAura.TargetHUD.ClientLoginThread.SmthLikeColorGetter.a(var0x.a());
                  })).forEach((var3x) -> {
                     if (var3x.a() != "ClickGUI" && var3x.a() != "SaveModule") {
                        Gui.drawRect((double)(var12 - 2 - skid.gay.sex.spermix.inside.shalopay.MobAura.TargetHUD.ClientLoginThread.SmthLikeColorGetter.a(var3x.a())), (double)(var8[0] - 1), (double)(var12 + skid.gay.sex.spermix.inside.shalopay.MobAura.TargetHUD.ClientLoginThread.SmthLikeColorGetter.a(var3x.a())), (double)(var8[0] + 7), -2012213232);
                        char var4 = var3x.a().charAt(0);
                        String var5 = var3x.a().substring(1);
                        skid.gay.sex.spermix.inside.shalopay.MobAura.TargetHUD.ClientLoginThread.SmthLikeColorGetter.a(String.valueOf((new StringBuilder("§3")).append(String.valueOf(var4)).append("§f").append(var5)), (double)(var12 - 2 - skid.gay.sex.spermix.inside.shalopay.MobAura.TargetHUD.ClientLoginThread.SmthLikeColorGetter.a(var3x.a())), (double)var8[0], 15132410);
                        var8[0] += var7.FONT_HEIGHT - 1;
                     }

                  });
               }

               if (Main.a.a("DownArrey").e()) {
                  var8 = new int[]{(int)((double)(height / 11) * 10.8D)};
                  SmthLikeModuleRegister.a().stream().filter(Module::c).sorted(Comparator.comparingInt((var0x) -> {
                     return -skid.gay.sex.spermix.inside.shalopay.MobAura.TargetHUD.ClientLoginThread.SmthLikeColorGetter.a(var0x.a());
                  })).forEach((var3x) -> {
                     if (var3x.a() != "ClickGUI" && var3x.a() != "SaveModule") {
                        char var4 = var3x.a().charAt(0);
                        String var5 = var3x.a().substring(1);
                        skid.gay.sex.spermix.inside.shalopay.MobAura.TargetHUD.ClientLoginThread.SmthLikeColorGetter.a(String.valueOf((new StringBuilder("§3")).append(String.valueOf(var4)).append("§f").append(var5)), (double)(var12 - 2 - skid.gay.sex.spermix.inside.shalopay.MobAura.TargetHUD.ClientLoginThread.SmthLikeColorGetter.a(var3x.a())), (double)var8[0], 15132410);
                        var8[0] -= var7.FONT_HEIGHT + 1;
                     }

                  });
               }
            }
         } catch (Exception var9) {
         }
      }

      if (Main.a.a("ArmorStatus").e()) {
         Gui.drawRect((double)(var0.getScaledWidth() - 252), (double)(var0.getScaledHeight() - 56), (double)(var0.getScaledWidth() - 315), (double)(var0.getScaledHeight() - 40), -2012213232);
         itemRender.renderItemAndEffectIntoGUI(Minecraft.player.inventory.armorItemInSlot(0), var0.getScaledWidth() - 270, var0.getScaledHeight() - 57);
         itemRender.renderItemOverlayIntoGUI(Minecraft.getMinecraft().fontRendererObj, Minecraft.player.inventory.armorItemInSlot(0), var0.getScaledWidth() - 270, var0.getScaledHeight() - 56, (String)null);
         itemRender.renderItemAndEffectIntoGUI(Minecraft.player.inventory.armorItemInSlot(1), var0.getScaledWidth() - 285, var0.getScaledHeight() - 57);
         itemRender.renderItemOverlayIntoGUI(Minecraft.getMinecraft().fontRendererObj, Minecraft.player.inventory.armorItemInSlot(1), var0.getScaledWidth() - 285, var0.getScaledHeight() - 56, (String)null);
         itemRender.renderItemAndEffectIntoGUI(Minecraft.player.inventory.armorItemInSlot(2), var0.getScaledWidth() - 300, var0.getScaledHeight() - 57);
         itemRender.renderItemOverlayIntoGUI(Minecraft.getMinecraft().fontRendererObj, Minecraft.player.inventory.armorItemInSlot(2), var0.getScaledWidth() - 300, var0.getScaledHeight() - 56, (String)null);
         itemRender.renderItemAndEffectIntoGUI(Minecraft.player.inventory.armorItemInSlot(3), var0.getScaledWidth() - 315, var0.getScaledHeight() - 57);
         itemRender.renderItemOverlayIntoGUI(Minecraft.getMinecraft().fontRendererObj, Minecraft.player.inventory.armorItemInSlot(3), var0.getScaledWidth() - 315, var0.getScaledHeight() - 56, (String)null);
         GL11.glDisable(2884);
         GL11.glEnable(3008);
         GL11.glDisable(3042);
         GL11.glDisable(2896);
         GL11.glDisable(2884);
         GL11.glClear(256);
      }

   }

   public static Color a(long var0, float var2) {
      float var3 = (float)(System.nanoTime() * -5L + var0) / 1.0E10F % 1.0F;
      long var4 = Long.parseLong(Integer.toHexString(Integer.valueOf(Color.HSBtoRGB(var3, 1.0F, 1.0F))), 16);
      Color var6 = new Color((int)var4);
      return new Color((float)var6.getRed() / 255.0F * var2, (float)var6.getGreen() / 255.0F * var2, (float)var6.getBlue() / 255.0F * var2);
   }

   public static void a() {
      b();
   }
}
