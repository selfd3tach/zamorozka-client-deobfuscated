package skid.gay.sex.spermix.inside.shalopay.j;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import net.minecraft.block.Block$EnumOffsetType;
import net.minecraft.block.state.IBlockState;
import net.minecraft.client.renderer.block.model.BakedQuad;
import net.minecraft.client.renderer.block.model.BakedQuadRetextured;
import net.minecraft.client.renderer.block.model.BlockFaceUV;
import net.minecraft.client.renderer.block.model.BlockPartFace;
import net.minecraft.client.renderer.block.model.BlockPartRotation;
import net.minecraft.client.renderer.block.model.FaceBakery;
import net.minecraft.client.renderer.block.model.IBakedModel;
import net.minecraft.client.renderer.block.model.ItemCameraTransforms;
import net.minecraft.client.renderer.block.model.ItemOverrideList;
import net.minecraft.client.renderer.block.model.ModelManager;
import net.minecraft.client.renderer.block.model.ModelResourceLocation;
import net.minecraft.client.renderer.block.model.ModelRotation;
import net.minecraft.client.renderer.block.model.SimpleBakedModel;
import net.minecraft.client.renderer.texture.TextureAtlasSprite;
import net.minecraft.util.EnumFacing;
import net.minecraft.util.math.AxisAlignedBB;
import net.minecraft.util.math.BlockPos;
import org.lwjgl.util.vector.Vector3f;

public class g {
   public static IBakedModel a(String var0, TextureAtlasSprite var1, TextureAtlasSprite var2) {
      if (var1 != null && var2 != null) {
         ModelManager var3 = FastAura.z();
         if (var3 == null) {
            return null;
         } else {
            ModelResourceLocation var4 = new ModelResourceLocation(var0, "normal");
            IBakedModel var5 = var3.getModel(var4);
            if (var5 != null && var5 != var3.getMissingModel()) {
               IBakedModel var6 = aP.a(var5);
               EnumFacing[] var7 = EnumFacing.VALUES;

               for(int var8 = 0; var8 < var7.length; ++var8) {
                  EnumFacing var9 = var7[var8];
                  List var10 = var6.getQuads((IBlockState)null, var9, 0L);
                  a(var10, var1, var2);
               }

               List var11 = var6.getQuads((IBlockState)null, (EnumFacing)null, 0L);
               a(var11, var1, var2);
               return var6;
            } else {
               return null;
            }
         }
      } else {
         return null;
      }
   }

   public static IBakedModel a(TextureAtlasSprite var0, int var1) {
      ArrayList var2 = new ArrayList();
      EnumFacing[] var3 = EnumFacing.VALUES;
      HashMap var4 = new HashMap();

      for(int var5 = 0; var5 < var3.length; ++var5) {
         EnumFacing var6 = var3[var5];
         ArrayList var7 = new ArrayList();
         var7.add(a(var6, var0, var1));
         var4.put(var6, var7);
      }

      ItemOverrideList var8 = new ItemOverrideList(new ArrayList());
      SimpleBakedModel var9 = new SimpleBakedModel(var2, var4, true, true, var0, ItemCameraTransforms.DEFAULT, var8);
      return var9;
   }

   private static float a(float var0) {
      if (var0 > -1.0E-6F && var0 < 1.0E-6F) {
         return 0.0F;
      } else {
         return var0 > 0.999999F && var0 < 1.000001F ? 1.0F : var0;
      }
   }

   public static AxisAlignedBB a(AxisAlignedBB var0, Block$EnumOffsetType var1, BlockPos var2) {
      int var3 = var2.getX();
      int var4 = var2.getZ();
      long var5 = (long)(var3 * 3129871) ^ (long)var4 * 116129781L;
      var5 = var5 * var5 * 42317861L + var5 * 11L;
      double var7 = ((double)((float)(var5 >> 16 & 15L) / 15.0F) - 0.5D) * 0.5D;
      double var9 = ((double)((float)(var5 >> 24 & 15L) / 15.0F) - 0.5D) * 0.5D;
      double var11 = 0.0D;
      if (var1 == Block$EnumOffsetType.XYZ) {
         var11 = ((double)((float)(var5 >> 20 & 15L) / 15.0F) - 1.0D) * 0.2D;
      }

      return var0.offset(var7, var11, var9);
   }

   public static BakedQuad a(EnumFacing var0, TextureAtlasSprite var1, int var2) {
      Vector3f var3 = new Vector3f(0.0F, 0.0F, 0.0F);
      Vector3f var4 = new Vector3f(16.0F, 16.0F, 16.0F);
      BlockFaceUV var5 = new BlockFaceUV(new float[]{0.0F, 0.0F, 16.0F, 16.0F}, 0);
      BlockPartFace var6 = new BlockPartFace(var0, var2, String.valueOf((new StringBuilder("#")).append(var0.getName())), var5);
      ModelRotation var7 = ModelRotation.X0_Y0;
      Object var8 = null;
      boolean var9 = false;
      boolean var10 = true;
      FaceBakery var11 = new FaceBakery();
      BakedQuad var12 = var11.makeBakedQuad(var3, var4, var6, var1, var0, (ModelRotation)var7, (BlockPartRotation)var8, var9, var10);
      return var12;
   }

   private static void a(List var0, TextureAtlasSprite var1, TextureAtlasSprite var2) {
      ArrayList var3 = new ArrayList();
      Iterator var5 = var0.iterator();

      while(var5.hasNext()) {
         BakedQuad var4 = (BakedQuad)var5.next();
         if (var4.getSprite() != var1) {
            var3.add(var4);
            break;
         }

         BakedQuadRetextured var6 = new BakedQuadRetextured(var4, var2);
         var3.add(var6);
      }

      var0.clear();
      var0.addAll(var3);
   }

   public static IBakedModel a(IBakedModel var0, IBakedModel var1) {
      ArrayList var2 = new ArrayList();
      var2.addAll(var0.getQuads((IBlockState)null, (EnumFacing)null, 0L));
      var2.addAll(var1.getQuads((IBlockState)null, (EnumFacing)null, 0L));
      EnumFacing[] var3 = EnumFacing.VALUES;
      HashMap var4 = new HashMap();

      for(int var5 = 0; var5 < var3.length; ++var5) {
         EnumFacing var6 = var3[var5];
         ArrayList var7 = new ArrayList();
         var7.addAll(var0.getQuads((IBlockState)null, var6, 0L));
         var7.addAll(var1.getQuads((IBlockState)null, var6, 0L));
         var4.put(var6, var7);
      }

      boolean var11 = var0.isAmbientOcclusion();
      boolean var12 = var0.isBuiltInRenderer();
      TextureAtlasSprite var13 = var0.getParticleTexture();
      ItemCameraTransforms var8 = var0.getItemCameraTransforms();
      ItemOverrideList var9 = var0.getOverrides();
      SimpleBakedModel var10 = new SimpleBakedModel(var2, var4, var11, var12, var13, var8, var9);
      return var10;
   }

   public static void a(Vector3f var0) {
      var0.setX(a(var0.getX()));
      var0.setY(a(var0.getY()));
      var0.setZ(a(var0.getZ()));
   }
}
