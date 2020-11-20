package skid.gay.sex.spermix.inside.shalopay.j;

import net.minecraft.client.Minecraft;
import net.minecraft.client.entity.EntityPlayerSP;
import net.minecraft.client.multiplayer.PlayerControllerMP;
import net.minecraft.client.multiplayer.WorldClient;
import net.minecraft.client.network.NetHandlerPlayClient;
import net.minecraft.entity.Entity;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.util.EnumActionResult;
import net.minecraft.util.EnumFacing;
import net.minecraft.util.EnumHand;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.math.RayTraceResult;
import net.minecraft.util.math.Vec3d;
import net.minecraft.world.World;

public class aY extends PlayerControllerMP {
   
   private boolean a = false;
   
   private BlockPos b = null;
   
   private Entity c = null;

   public Entity c() {
      return this.c;
   }

   public boolean clickBlock(BlockPos var1, EnumFacing var2) {
      this.a = true;
      this.b = var1;
      boolean var3 = super.clickBlock(var1, var2);
      this.a = false;
      return var3;
   }

   public EnumActionResult interactWithEntity(EntityPlayer var1, Entity var2, EnumHand var3) {
      this.c = var2;
      return super.interactWithEntity(var1, var2, var3);
   }

   public EnumActionResult interactWithEntity(EntityPlayer var1, Entity var2, RayTraceResult var3, EnumHand var4) {
      this.c = var2;
      return super.interactWithEntity(var1, var2, var3, var4);
   }

   public boolean a() {
      return this.a;
   }

   public boolean onPlayerDamageBlock(BlockPos var1, EnumFacing var2) {
      this.a = true;
      this.b = var1;
      boolean var3 = super.onPlayerDamageBlock(var1, var2);
      this.a = false;
      return var3;
   }

   public BlockPos b() {
      return this.b;
   }

   public EnumActionResult processRightClickBlock(EntityPlayerSP var1, WorldClient var2, BlockPos var3, EnumFacing var4, Vec3d var5, EnumHand var6) {
      this.a = true;
      this.b = var3;
      EnumActionResult var7 = super.processRightClickBlock(var1, var2, var3, var4, var5, var6);
      this.a = false;
      return var7;
   }

   public EnumActionResult processRightClick(EntityPlayer var1, World var2, EnumHand var3) {
      this.a = true;
      EnumActionResult var4 = super.processRightClick(var1, var2, var3);
      this.a = false;
      return var4;
   }

   public aY(Minecraft var1, NetHandlerPlayClient var2) {
      super(var1, var2);
   }
}
