package skid.gay.sex.spermix.inside.shalopay.j;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import net.minecraft.block.Block;
import net.minecraft.block.BlockNewLeaf;
import net.minecraft.block.BlockOldLeaf;
import net.minecraft.block.BlockPlanks$EnumType;
import net.minecraft.block.state.IBlockState;
import net.minecraft.client.renderer.block.model.BakedQuad;
import net.minecraft.client.renderer.block.model.IBakedModel;
import net.minecraft.client.renderer.block.model.ModelManager;
import net.minecraft.client.renderer.block.model.ModelResourceLocation;
import net.minecraft.util.EnumFacing;
import net.minecraft.util.ResourceLocation;

public class bv {
   
   private static IBakedModel c = null;
   
   private static IBakedModel n = null;
   
   private static IBakedModel o = null;
   
   private static List h = null;
   
   private static IBakedModel m = null;
   
   private static IBakedModel d = null;
   
   private static IBakedModel b = null;
   
   private static List g = null;
   
   private static List j = null;
   
   private static IBakedModel p = null;
   
   private static IBakedModel f = null;
   
   private static IBakedModel q = null;
   
   private static List l = null;
   
   private static List i = null;
   
   private static IBakedModel r = null;
   
   private static IBakedModel e = null;
   
   private static IBakedModel a = null;
   
   private static List k = null;

   public static boolean a(IBlockState var0, IBlockState var1) {
      if (var0 == var1) {
         return true;
      } else {
         Block var2 = var0.getBlock();
         Block var3 = var1.getBlock();
         if (var2 != var3) {
            return false;
         } else if (var2 instanceof BlockOldLeaf) {
            return ((BlockPlanks$EnumType)var0.getValue(BlockOldLeaf.VARIANT)).equals(var1.getValue(BlockOldLeaf.VARIANT));
         } else {
            return var2 instanceof BlockNewLeaf ? ((BlockPlanks$EnumType)var0.getValue(BlockNewLeaf.VARIANT)).equals(var1.getValue(BlockNewLeaf.VARIANT)) : false;
         }
      }
   }

   static IBakedModel a(String var0, List var1) {
      ModelManager var2 = skid.gay.sex.spermix.inside.shalopay.RadioShanson.FastAura.z();
      if (var2 == null) {
         return null;
      } else {
         ResourceLocation var3 = new ResourceLocation(String.valueOf((new StringBuilder("blockstates/")).append(var0).append("_leaves.json")));
         if (skid.gay.sex.spermix.inside.shalopay.RadioShanson.FastAura.d(var3) != skid.gay.sex.spermix.inside.shalopay.RadioShanson.FastAura.W()) {
            return null;
         } else {
            ResourceLocation var4 = new ResourceLocation(String.valueOf((new StringBuilder("models/block/")).append(var0).append("_leaves.json")));
            if (skid.gay.sex.spermix.inside.shalopay.RadioShanson.FastAura.d(var4) != skid.gay.sex.spermix.inside.shalopay.RadioShanson.FastAura.W()) {
               return null;
            } else {
               ModelResourceLocation var5 = new ModelResourceLocation(String.valueOf((new StringBuilder(String.valueOf(var0))).append("_leaves")), "normal");
               IBakedModel var6 = var2.getModel(var5);
               if (var6 != null && var6 != var2.getMissingModel()) {
                  List var7 = var6.getQuads((IBlockState)null, (EnumFacing)null, 0L);
                  if (var7.size() == 0) {
                     return var6;
                  } else if (var7.size() != 6) {
                     return null;
                  } else {
                     Iterator var9 = var7.iterator();

                     while(var9.hasNext()) {
                        Object var8 = var9.next();
                        List var10 = var6.getQuads((IBlockState)null, ((BakedQuad)var8).getFace(), 0L);
                        if (var10.size() > 0) {
                           return null;
                        }

                        var10.add(var8);
                     }

                     var7.clear();
                     var1.add(String.valueOf((new StringBuilder(String.valueOf(var0))).append("_leaves")));
                     return var6;
                  }
               } else {
                  return null;
               }
            }
         }
      }
   }

   private static IBakedModel b(IBakedModel var0) {
      if (var0 == null) {
         return null;
      } else if (var0.getQuads((IBlockState)null, (EnumFacing)null, 0L).size() > 0) {
         skid.gay.sex.spermix.inside.shalopay.RadioShanson.FastAura.b(String.valueOf((new StringBuilder("SmartLeaves: Model is not cube, general quads: ")).append(var0.getQuads((IBlockState)null, (EnumFacing)null, 0L).size()).append(", model: ").append(var0)));
         return var0;
      } else {
         EnumFacing[] var1 = EnumFacing.VALUES;

         for(int var2 = 0; var2 < var1.length; ++var2) {
            EnumFacing var3 = var1[var2];
            List var4 = var0.getQuads((IBlockState)null, var3, 0L);
            if (var4.size() != 1) {
               skid.gay.sex.spermix.inside.shalopay.RadioShanson.FastAura.b(String.valueOf((new StringBuilder("SmartLeaves: Model is not cube, side: ")).append(var3).append(", quads: ").append(var4.size()).append(", model: ").append(var0)));
               return var0;
            }
         }

         IBakedModel var12 = aP.a(var0);
         List[] var13 = new List[var1.length];

         for(int var14 = 0; var14 < var1.length; ++var14) {
            EnumFacing var5 = var1[var14];
            List var6 = var12.getQuads((IBlockState)null, var5, 0L);
            BakedQuad var7 = (BakedQuad)var6.get(0);
            BakedQuad var8 = new BakedQuad((int[])var7.getVertexData().clone(), var7.getTintIndex(), var7.getFace(), var7.getSprite());
            int[] var9 = var8.getVertexData();
            int[] var10 = (int[])var9.clone();
            int var11 = var9.length / 4;
            System.arraycopy(var9, 0 * var11, var10, 3 * var11, var11);
            System.arraycopy(var9, 1 * var11, var10, 2 * var11, var11);
            System.arraycopy(var9, 2 * var11, var10, 1 * var11, var11);
            System.arraycopy(var9, 3 * var11, var10, 0 * var11, var11);
            System.arraycopy(var10, 0, var9, 0, var10.length);
            var6.add(var8);
         }

         return var12;
      }
   }

   public static IBakedModel a(IBakedModel var0, IBlockState var1) {
      if (!skid.gay.sex.spermix.inside.shalopay.RadioShanson.FastAura.B()) {
         return var0;
      } else {
         List var2 = var0.getQuads(var1, (EnumFacing)null, 0L);
         if (var2 == g) {
            return m;
         } else if (var2 == h) {
            return n;
         } else if (var2 == i) {
            return o;
         } else if (var2 == j) {
            return p;
         } else if (var2 == k) {
            return q;
         } else {
            return var2 == l ? r : var0;
         }
      }
   }

   private static List a(IBakedModel var0) {
      return var0 == null ? null : var0.getQuads((IBlockState)null, (EnumFacing)null, 0L);
   }

   public static void a() {
      ArrayList var0 = new ArrayList();
      a = a((String)"acacia", (List)var0);
      b = a((String)"birch", (List)var0);
      c = a((String)"dark_oak", (List)var0);
      d = a((String)"jungle", (List)var0);
      e = a((String)"oak", (List)var0);
      f = a((String)"spruce", (List)var0);
      g = a(a);
      h = a(b);
      i = a(c);
      j = a(d);
      k = a(e);
      l = a(f);
      m = b(a);
      n = b(b);
      o = b(c);
      p = b(d);
      q = b(e);
      r = b(f);
      if (var0.size() > 0) {
         skid.gay.sex.spermix.inside.shalopay.RadioShanson.FastAura.a(String.valueOf((new StringBuilder("Enable face culling: ")).append(skid.gay.sex.spermix.inside.shalopay.RadioShanson.FastAura.a(var0.toArray()))));
      }

   }
}
