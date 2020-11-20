package skid.gay.sex.spermix.inside.shalopay.j;

import java.util.Iterator;
import java.util.List;
import net.minecraft.client.renderer.texture.TextureAtlasSprite;
import net.minecraft.client.renderer.texture.TextureMap;
import net.minecraft.util.ResourceLocation;

public class bw {
   public static TextureAtlasSprite a(List var0, int var1, TextureMap var2) {
      TextureAtlasSprite var3;
      for(var3 = (TextureAtlasSprite)var0.get(var1); a(var0, var1, var3, var2); var3 = (TextureAtlasSprite)var0.get(var1)) {
      }

      var3.isDependencyParent = false;
      return var3;
   }

   private static boolean a(List var0, int var1, TextureAtlasSprite var2, TextureMap var3) {
      int var4 = 0;
      Iterator var6 = var2.getDependencies().iterator();

      while(var6.hasNext()) {
         ResourceLocation var5 = (ResourceLocation)var6.next();
         FastAura.a(String.valueOf((new StringBuilder("Sprite dependency: ")).append(var2.getIconName()).append(" <- ").append(var5)));
         TextureAtlasSprite var7 = var3.getRegisteredSprite(var5);
         if (var7 == null) {
            var7 = var3.registerSprite(var5);
         } else {
            int var8 = var0.indexOf(var7);
            if (var8 <= var1 + var4) {
               continue;
            }

            if (var7.isDependencyParent) {
               String var9 = String.valueOf((new StringBuilder("circular dependency: ")).append(var2.getIconName()).append(" -> ").append(var7.getIconName()));
               ResourceLocation var10 = var3.getResourceLocation(var2);
               bp.a(var10, var9);
               break;
            }

            var0.remove(var8);
         }

         var2.isDependencyParent = true;
         var0.add(var1 + var4, var7);
         ++var4;
      }

      return var4 > 0;
   }
}
