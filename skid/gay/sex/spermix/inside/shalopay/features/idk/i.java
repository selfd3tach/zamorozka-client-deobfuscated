package net.a;

import skid.gay.sex.spermix.inside.shalopay.features.module.Module;
import skid.gay.sex.spermix.inside.shalopay.features.module.ModuleCategory;
import skid.gay.sex.spermix.inside.shalopay.features.module.SmthLikeModuleRegister;

import java.util.Iterator;

class i extends ClickGUIMode {
   
   private final ModuleCategory l;
   
   final ClickGUI a;

   public void a() {
      Iterator var2 = SmthLikeModuleRegister.a().iterator();

      while(var2.hasNext()) {
         Module var1 = (Module)var2.next();
         if (var1.b().equals(this.l)) {
            int[] var10000 = new int[]{2};
            this.j.add(new skid.gay.sex.spermix.inside.shalopay.b.b(var1, this));
         }
      }

   }

   i(ClickGUI var1, String var2, double var3, double var5, double var7, double var9, boolean var11, ClickGUI var12, ModuleCategory var13) {
      super(var2, var3, var5, var7, var9, var11, var12);
      this.a = var1;
      this.l = var13;
   }
}
