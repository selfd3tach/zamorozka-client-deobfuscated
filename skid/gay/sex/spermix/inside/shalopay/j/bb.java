package skid.gay.sex.spermix.inside.shalopay.j;

import net.minecraft.client.model.ModelBiped;
import net.minecraft.client.model.ModelRenderer;

public class bb {
   
   private ModelRenderer b = null;
   
   private int a = 0;

   public bb(int var1, ModelRenderer var2) {
      this.a = var1;
      this.b = var2;
   }

   public void a(ModelBiped var1, float var2) {
      ModelRenderer var3 = aZ.a(var1, this.a);
      if (var3 != null) {
         var3.postRender(var2);
      }

      this.b.render(var2);
   }
}
