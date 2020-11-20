package skid.gay.sex.spermix.inside.shalopay.j;

import net.minecraft.client.renderer.RenderGlobal$ContainerLocalRenderInformation;
import net.minecraft.client.renderer.chunk.RenderChunk;
import net.minecraft.util.EnumFacing;

public class bt {
   
   private RenderChunk a;
   
   private RenderGlobal$ContainerLocalRenderInformation b;

   public RenderGlobal$ContainerLocalRenderInformation a() {
      if (this.b == null) {
         this.b = new RenderGlobal$ContainerLocalRenderInformation(this.a, (EnumFacing)null, 0);
      }

      return this.b;
   }

   public void a(RenderChunk var1) {
      this.a = var1;
      this.b = null;
   }
}
