package skid.gay.sex.spermix.inside.shalopay.features.module.modules.other;

import net.minecraft.client.Minecraft;
import net.minecraft.client.multiplayer.WorldClient;
import net.minecraft.init.Blocks;
import net.minecraft.util.EnumParticleTypes;
import net.minecraft.util.math.BlockPos;
import skid.gay.sex.spermix.inside.shalopay.features.module.Module;
import skid.gay.sex.spermix.inside.shalopay.features.module.ModuleCategory;

public class Zamorozka extends Module {
   public Zamorozka() {
      super("Zamorozka", 0, ModuleCategory.OTHER);
   }

   public void i() {
      if (this.c()) {
         for(int var1 = 1; var1 < 8; ++var1) {
            WorldClient var10000 = mc.world;
            EnumParticleTypes var10001 = EnumParticleTypes.SPELL_INSTANT;
            Minecraft var10002 = mc;
            double var2 = Minecraft.player.posX + Math.sin((double)var1) * 0.6D;
            Minecraft var10003 = mc;
            double var3 = Minecraft.player.posY + 0.2D;
            Minecraft var10004 = mc;
            var10000.spawnParticle(var10001, var2, var3, Minecraft.player.posZ + Math.cos((double)var1) * 0.3D, 0.0D, 0.0D, 0.0D, new int[0]);
            var10003 = mc;
            var10004 = mc;
            double var4 = Minecraft.player.posY - 1.0D;
            Minecraft var10005 = mc;
            mc.world.setBlockState(new BlockPos(Minecraft.player.posX, var4, Minecraft.player.posZ), Blocks.SNOW.getDefaultState(), 2);
            var10003 = mc;
            var3 = Minecraft.player.posX + 1.0D;
            var10004 = mc;
            var4 = Minecraft.player.posY - 1.0D;
            var10005 = mc;
            mc.world.setBlockState(new BlockPos(var3, var4, Minecraft.player.posZ), Blocks.ICE.getDefaultState(), 5);
         }
      }

   }
}
