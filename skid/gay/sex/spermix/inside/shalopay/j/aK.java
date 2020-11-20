package skid.gay.sex.spermix.inside.shalopay.j;

import net.minecraft.block.state.BlockStateBase;
import net.minecraft.client.renderer.texture.TextureAtlasSprite;
import net.minecraft.world.biome.Biome;

public class aK {
   public static boolean a(int var0, aJ[] var1) {
      if (var1 == null) {
         return true;
      } else {
         for(int var2 = 0; var2 < var1.length; ++var2) {
            aJ var3 = var1[var2];
            if (var3.a() == var0) {
               return true;
            }
         }

         return false;
      }
   }

   public static boolean a(int var0, int var1, aJ[] var2) {
      if (var2 == null) {
         return true;
      } else {
         for(int var3 = 0; var3 < var2.length; ++var3) {
            aJ var4 = var2[var3];
            if (var4.a(var0, var1)) {
               return true;
            }
         }

         return false;
      }
   }

   public static boolean a(int var0, int[] var1) {
      if (var1 == null) {
         return true;
      } else {
         for(int var2 = 0; var2 < var1.length; ++var2) {
            if (var1[var2] == var0) {
               return true;
            }
         }

         return false;
      }
   }

   public static boolean a(Biome var0, Biome[] var1) {
      if (var1 == null) {
         return true;
      } else {
         for(int var2 = 0; var2 < var1.length; ++var2) {
            if (var1[var2] == var0) {
               return true;
            }
         }

         return false;
      }
   }

   public static boolean a(TextureAtlasSprite var0, TextureAtlasSprite[] var1) {
      if (var1 == null) {
         return true;
      } else {
         for(int var2 = 0; var2 < var1.length; ++var2) {
            if (var1[var2] == var0) {
               return true;
            }
         }

         return false;
      }
   }

   public static boolean a(BlockStateBase var0, aJ[] var1) {
      if (var1 == null) {
         return true;
      } else {
         for(int var2 = 0; var2 < var1.length; ++var2) {
            aJ var3 = var1[var2];
            if (var3.a(var0)) {
               return true;
            }
         }

         return false;
      }
   }
}
