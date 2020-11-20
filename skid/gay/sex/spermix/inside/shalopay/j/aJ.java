package skid.gay.sex.spermix.inside.shalopay.j;

import net.minecraft.block.state.BlockStateBase;

public class aJ {
   
   private int a = -1;
   
   private int[] b = null;

   public int a() {
      return this.a;
   }

   public int[] b() {
      return this.b;
   }

   public boolean a(BlockStateBase var1) {
      return var1.getBlockId() != this.a ? false : aK.a(var1.getMetadata(), this.b);
   }

   public aJ(int var1) {
      this.a = var1;
   }

   public String toString() {
      return String.valueOf((new StringBuilder()).append(this.a).append(":").append(FastAura.a(this.b)));
   }

   public aJ(int var1, int[] var2) {
      this.a = var1;
      this.b = var2;
   }

   public boolean a(int var1, int var2) {
      return var1 != this.a ? false : aK.a(var2, this.b);
   }
}
