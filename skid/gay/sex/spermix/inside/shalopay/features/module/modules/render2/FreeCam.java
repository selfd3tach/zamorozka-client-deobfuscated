package skid.gay.sex.spermix.inside.shalopay.features.module.modules.render2;

import net.minecraft.client.Minecraft;
import net.minecraft.client.entity.EntityOtherPlayerMP;
import net.minecraft.client.entity.EntityPlayerSP;
import net.minecraft.client.multiplayer.WorldClient;
import skid.gay.sex.spermix.inside.shalopay.features.module.Module;
import skid.gay.sex.spermix.inside.shalopay.features.module.ModuleCategory;

public class FreeCam extends Module {

    private double g;

    private double f;

    private double e;

    private EntityOtherPlayerMP d = null;

    public FreeCam() {
        super("FreeCam", 0, ModuleCategory.RENDER2);
    }

    public void onEnable() {
        Minecraft.getMinecraft();
        this.e = Minecraft.player.posX;
        Minecraft.getMinecraft();
        this.f = Minecraft.player.posY;
        Minecraft.getMinecraft();
        this.g = Minecraft.player.posZ;
        Minecraft.getMinecraft();
        Minecraft.player.noClip = true;
        WorldClient var10002 = Minecraft.getMinecraft().world;
        Minecraft.getMinecraft();
        EntityOtherPlayerMP var1 = new EntityOtherPlayerMP(var10002, Minecraft.player.getGameProfile());
        Minecraft.getMinecraft();
        var1.copyLocationAndAnglesFrom(Minecraft.player);
        var1.posY -= 0.0D;
        Minecraft.getMinecraft();
        var1.rotationYawHead = Minecraft.player.rotationYawHead;
        Minecraft.getMinecraft().world.addEntityToWorld(-69, var1);
    }

    public void onDisable() {
        Minecraft.getMinecraft();
        Minecraft.player.noClip = false;
        Minecraft.getMinecraft();
        EntityPlayerSP var10000 = Minecraft.player;
        double var10001 = this.e;
        double var10002 = this.f;
        double var10003 = this.g;
        Minecraft.getMinecraft();
        float var10004 = Minecraft.player.rotationYaw;
        Minecraft.getMinecraft();
        var10000.setPositionAndRotation(var10001, var10002, var10003, var10004, Minecraft.player.rotationPitch);
        Minecraft.getMinecraft().world.removeEntityFromWorld(-69);
        this.d = null;
    }

    public void onUpdate() {
        if (this.getState()) {
            Minecraft.getMinecraft();
            Minecraft.player.capabilities.isFlying = true;
            Minecraft.getMinecraft();
            Minecraft.player.motionY = 0.0D;
            if (Minecraft.getMinecraft().gameSettings.keyBindJump.pressed) {
                Minecraft.getMinecraft();
                ++Minecraft.player.motionY;
            }

            if (Minecraft.getMinecraft().gameSettings.keyBindSneak.pressed) {
                Minecraft.getMinecraft();
                --Minecraft.player.motionY;
            }

        }
    }
}
