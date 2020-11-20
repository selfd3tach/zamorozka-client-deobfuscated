package skid.gay.sex.spermix.inside.shalopay.features.module.modules.combat;

import java.awt.Color;
import java.util.Iterator;
import java.util.List;
import skid.gay.sex.spermix.inside.shalopay.features.idk.RenderUtils;
import net.minecraft.client.Minecraft;
import net.minecraft.client.gui.GuiPlayerTabOverlay;
import net.minecraft.client.network.NetHandlerPlayClient;
import net.minecraft.client.network.NetworkPlayerInfo;
import net.minecraft.entity.Entity;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.util.EnumFacing;
import net.minecraft.util.EnumHand;
import net.minecraft.util.math.Vec3d;
import skid.gay.sex.spermix.inside.shalopay.features.smthLikeInit.Main;
import skid.gay.sex.spermix.inside.shalopay.features.module.Module;
import skid.gay.sex.spermix.inside.shalopay.features.module.ModuleCategory;

public class Aura extends Module {
   
   float e = 3.0F;
   
   int d;

   private void m() {
      List var1 = mc.world.playerEntities;
      ++this.d;

      for(int var2 = 0; var2 < var1.size(); ++var2) {
         String var10000 = ((EntityPlayer)var1.get(var2)).getName();
         Minecraft var10001 = mc;
         if (var10000 != Minecraft.player.getName()) {
            EntityPlayer var3 = (EntityPlayer)var1.get(1);
            Minecraft var11 = mc;
            float var12 = Minecraft.player.getDistanceToEntity(var3);
            var10001 = mc;
            if (var12 > Minecraft.player.getDistanceToEntity((Entity)var1.get(var2))) {
               var3 = (EntityPlayer)var1.get(var2);
            }

            EnumFacing var4 = EnumFacing.NORTH.getOpposite();
            Vec3d var5 = (new Vec3d(var3.posX, var3.posY, var3.posZ)).addVector(0.1D, 0.1D, 0.1D).add((new Vec3d(var4.getDirectionVec())).scale(0.5D));
            var11 = mc;
            float var6 = Minecraft.player.getDistanceToEntity(var3);
            if ((double)var6 < Main.a.a("Distance").f() && this.d > 7) {
               if (Main.a.a("NoReflex").e()) {
                  if (var3.isSwingInProgress) {
                     if (Main.a.a("Team").e()) {
                        var11 = mc;
                        if (!Minecraft.player.isOnSameTeam(var3)) {
                           var10001 = mc;
                           mc.playerController.attackEntity(Minecraft.player, var3);
                           skid.gay.sex.spermix.inside.shalopay.features.idk.RotationUtils.a(var5);
                        }
                     } else {
                        var10001 = mc;
                        mc.playerController.attackEntity(Minecraft.player, var3);
                        skid.gay.sex.spermix.inside.shalopay.features.idk.RotationUtils.a(var5);
                     }
                  }
               } else if (Main.a.a("Team").e()) {
                  var11 = mc;
                  if (!Minecraft.player.isOnSameTeam(var3)) {
                     if (Main.a.a("NoMatrix").e()) {
                        if (Main.a.a("Click").e()) {
                           mc.clickMouse();
                           skid.gay.sex.spermix.inside.shalopay.features.idk.RotationUtils.a(var5);
                        } else {
                           var10001 = mc;
                           mc.playerController.attackEntity(Minecraft.player, var3);
                           skid.gay.sex.spermix.inside.shalopay.features.idk.RotationUtils.a(var5);
                        }
                     } else if (Main.a.a("Click").e()) {
                        mc.clickMouse();
                     } else {
                        var10001 = mc;
                        mc.playerController.attackEntity(Minecraft.player, var3);
                     }

                     var11 = mc;
                     Minecraft.player.swingArm(EnumHand.MAIN_HAND);
                     var11 = mc;
                     Minecraft.player.setSprinting(true);
                     this.d = (int) Main.a.a("Delay").f();
                  }
               } else {
                  if (Main.a.a("NoBots").e()) {
                     var11 = mc;
                     NetHandlerPlayClient var7 = Minecraft.player.connection;
                     List var8 = GuiPlayerTabOverlay.ENTRY_ORDERING.sortedCopy(var7.getPlayerInfoMap());
                     Iterator var10 = var8.iterator();

                     while(var10.hasNext()) {
                        NetworkPlayerInfo var9 = (NetworkPlayerInfo)var10.next();
                        var10001 = mc;
                        if (var3.isOnSameTeam(Minecraft.player)) {
                           if (Main.a.a("Team").e()) {
                              var11 = mc;
                              if (!Minecraft.player.isOnSameTeam(var3)) {
                                 if (Main.a.a("NoMatrix").e()) {
                                    if (Main.a.a("Click").e()) {
                                       mc.clickMouse();
                                       skid.gay.sex.spermix.inside.shalopay.features.idk.RotationUtils.a(var5);
                                    } else {
                                       var10001 = mc;
                                       mc.playerController.attackEntity(Minecraft.player, var3);
                                       skid.gay.sex.spermix.inside.shalopay.features.idk.RotationUtils.a(var5);
                                    }
                                 } else if (Main.a.a("Click").e()) {
                                    mc.clickMouse();
                                 } else {
                                    var10001 = mc;
                                    mc.playerController.attackEntity(Minecraft.player, var3);
                                 }

                                 var11 = mc;
                                 Minecraft.player.swingArm(EnumHand.MAIN_HAND);
                                 var11 = mc;
                                 Minecraft.player.setSprinting(true);
                                 this.d = (int) Main.a.a("Delay").f();
                              }
                           } else {
                              if (Main.a.a("NoMatrix").e()) {
                                 if (Main.a.a("Click").e()) {
                                    mc.clickMouse();
                                    skid.gay.sex.spermix.inside.shalopay.features.idk.RotationUtils.a(var5);
                                 } else {
                                    var10001 = mc;
                                    mc.playerController.attackEntity(Minecraft.player, var3);
                                    skid.gay.sex.spermix.inside.shalopay.features.idk.RotationUtils.a(var5);
                                 }
                              } else if (Main.a.a("Click").e()) {
                                 mc.clickMouse();
                              } else {
                                 var10001 = mc;
                                 mc.playerController.attackEntity(Minecraft.player, var3);
                              }

                              var11 = mc;
                              Minecraft.player.swingArm(EnumHand.MAIN_HAND);
                              var11 = mc;
                              Minecraft.player.setSprinting(true);
                              this.d = (int) Main.a.a("Delay").f();
                           }
                        }
                     }
                  }

                  if (Main.a.a("Team").e()) {
                     var11 = mc;
                     if (!Minecraft.player.isOnSameTeam(var3)) {
                        if (Main.a.a("NoMatrix").e()) {
                           if (Main.a.a("Click").e()) {
                              mc.clickMouse();
                              skid.gay.sex.spermix.inside.shalopay.features.idk.RotationUtils.a(var5);
                           } else {
                              var10001 = mc;
                              mc.playerController.attackEntity(Minecraft.player, var3);
                              skid.gay.sex.spermix.inside.shalopay.features.idk.RotationUtils.a(var5);
                           }
                        } else if (Main.a.a("Click").e()) {
                           mc.clickMouse();
                        } else {
                           var10001 = mc;
                           mc.playerController.attackEntity(Minecraft.player, var3);
                        }

                        var11 = mc;
                        Minecraft.player.swingArm(EnumHand.MAIN_HAND);
                        var11 = mc;
                        Minecraft.player.setSprinting(true);
                        this.d = (int) Main.a.a("Delay").f();
                     }
                  } else {
                     RenderUtils.b(var3, Color.red);
                     if (Main.a.a("NoMatrix").e()) {
                        if (Main.a.a("Click").e()) {
                           mc.clickMouse();
                           skid.gay.sex.spermix.inside.shalopay.features.idk.RotationUtils.a(var5);
                        } else {
                           var10001 = mc;
                           mc.playerController.attackEntity(Minecraft.player, var3);
                           skid.gay.sex.spermix.inside.shalopay.features.idk.RotationUtils.a(var5);
                        }
                     } else if (Main.a.a("Click").e()) {
                        mc.clickMouse();
                     } else {
                        var10001 = mc;
                        mc.playerController.attackEntity(Minecraft.player, var3);
                     }

                     var11 = mc;
                     Minecraft.player.swingArm(EnumHand.MAIN_HAND);
                     var11 = mc;
                     Minecraft.player.setSprinting(true);
                     this.d = (int) Main.a.a("Delay").f();
                  }
               }
            }
         }
      }

   }

   public void h() {
      if (this.c()) {
         this.m();
      }

   }

   public void j() {
      Main.a.a(new skid.gay.sex.spermix.inside.shalopay.features.helpers.SettingMode("Distance", this, 6.7D, 0.0D, 20.5D, true));
      Main.a.a(new skid.gay.sex.spermix.inside.shalopay.features.helpers.SettingMode("Delay", this, 10.0D, 0.0D, 50.0D, true));
      Main.a.a(new skid.gay.sex.spermix.inside.shalopay.features.helpers.SettingMode("NoMatrix", this, false));
      Main.a.a(new skid.gay.sex.spermix.inside.shalopay.features.helpers.SettingMode("NoReflex", this, false));
      Main.a.a(new skid.gay.sex.spermix.inside.shalopay.features.helpers.SettingMode("NoBots", this, true));
      Main.a.a(new skid.gay.sex.spermix.inside.shalopay.features.helpers.SettingMode("Click", this, false));
      Main.a.a(new skid.gay.sex.spermix.inside.shalopay.features.helpers.SettingMode("Team", this, false));
   }

   public Aura() {
      super("Aura", 0, ModuleCategory.COMBAT);
   }
}
