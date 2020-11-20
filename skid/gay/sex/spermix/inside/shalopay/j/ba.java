package skid.gay.sex.spermix.inside.shalopay.j;

import com.google.gson.JsonArray;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.google.gson.JsonParseException;
import com.google.gson.JsonParser;
import java.awt.Dimension;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map.Entry;
import net.minecraft.client.model.ModelBase;
import net.minecraft.client.model.ModelRenderer;
import net.optifine.entity.model.CustomEntityModelParser;

public class ba {
   
   private static JsonParser a = new JsonParser();

   private static int a(String var0) {
      if (var0 == null) {
         return 0;
      } else if (var0.equals("body")) {
         return 0;
      } else if (var0.equals("head")) {
         return 1;
      } else if (var0.equals("leftArm")) {
         return 2;
      } else if (var0.equals("rightArm")) {
         return 3;
      } else if (var0.equals("leftLeg")) {
         return 4;
      } else if (var0.equals("rightLeg")) {
         return 5;
      } else if (var0.equals("cape")) {
         return 6;
      } else {
         FastAura.b(String.valueOf((new StringBuilder("Unknown attachModel: ")).append(var0)));
         return 0;
      }
   }

   public static aZ a(JsonObject var0) {
      String var1 = aE.a(var0, "type");
      if (!FastAura.a((Object)var1, (Object)"PlayerItem")) {
         throw new JsonParseException(String.valueOf((new StringBuilder("Unknown model type: ")).append(var1)));
      } else {
         int[] var2 = aE.b(var0.get("textureSize"), 2);
         a((Object)var2, (String)"Missing texture size");
         Dimension var3 = new Dimension(var2[0], var2[1]);
         boolean var4 = aE.a(var0, "usePlayerTexture", false);
         JsonArray var5 = (JsonArray)var0.get("models");
         a((Object)var5, (String)"Missing elements");
         HashMap var6 = new HashMap();
         ArrayList var7 = new ArrayList();
         new ArrayList();

         for(int var8 = 0; var8 < var5.size(); ++var8) {
            JsonObject var9 = (JsonObject)var5.get(var8);
            String var10 = aE.a(var9, "baseId");
            if (var10 != null) {
               JsonObject var11 = (JsonObject)var6.get(var10);
               if (var11 == null) {
                  FastAura.b(String.valueOf((new StringBuilder("BaseID not found: ")).append(var10)));
                  continue;
               }

               Iterator var13 = var11.entrySet().iterator();

               while(var13.hasNext()) {
                  Entry var12 = (Entry)var13.next();
                  if (!var9.has((String)var12.getKey())) {
                     var9.add((String)var12.getKey(), (JsonElement)var12.getValue());
                  }
               }
            }

            String var15 = aE.a(var9, "id");
            if (var15 != null) {
               if (!var6.containsKey(var15)) {
                  var6.put(var15, var9);
               } else {
                  FastAura.b(String.valueOf((new StringBuilder("Duplicate model ID: ")).append(var15)));
               }
            }

            bb var16 = a(var9, var3);
            if (var16 != null) {
               var7.add(var16);
            }
         }

         bb[] var14 = (bb[])var7.toArray(new bb[var7.size()]);
         return new aZ(var3, var4, var14);
      }
   }

   public static ModelRenderer a(JsonObject var0, ModelBase var1, int[] var2, String var3) {
      ModelRenderer var4 = new ModelRenderer(var1);
      String var5 = aE.a(var0, "id");
      var4.setId(var5);
      float var6 = aE.a(var0, "scale", 1.0F);
      var4.scaleX = var6;
      var4.scaleY = var6;
      var4.scaleZ = var6;
      String var7 = aE.a(var0, "texture");
      if (var7 != null) {
         var4.setTextureLocation(CustomEntityModelParser.getResourceLocation(var3, var7, ".png"));
      }

      int[] var8 = aE.b(var0.get("textureSize"), 2);
      if (var8 == null) {
         var8 = var2;
      }

      if (var8 != null) {
         var4.setTextureSize(var8[0], var8[1]);
      }

      String var9 = aE.a(var0, "invertAxis", "").toLowerCase();
      boolean var10 = var9.contains("x");
      boolean var11 = var9.contains("y");
      boolean var12 = var9.contains("z");
      float[] var13 = aE.a(var0.get("translate"), 3, (float[])(new float[3]));
      if (var10) {
         var13[0] = -var13[0];
      }

      if (var11) {
         var13[1] = -var13[1];
      }

      if (var12) {
         var13[2] = -var13[2];
      }

      float[] var14 = aE.a(var0.get("rotate"), 3, (float[])(new float[3]));

      for(int var15 = 0; var15 < var14.length; ++var15) {
         var14[var15] = var14[var15] / 180.0F * 3.1415927F;
      }

      if (var10) {
         var14[0] = -var14[0];
      }

      if (var11) {
         var14[1] = -var14[1];
      }

      if (var12) {
         var14[2] = -var14[2];
      }

      var4.setRotationPoint(var13[0], var13[1], var13[2]);
      var4.rotateAngleX = var14[0];
      var4.rotateAngleY = var14[1];
      var4.rotateAngleZ = var14[2];
      String var26 = aE.a(var0, "mirrorTexture", "").toLowerCase();
      boolean var16 = var26.contains("u");
      boolean var17 = var26.contains("v");
      if (var16) {
         var4.mirror = true;
      }

      if (var17) {
         var4.mirrorV = true;
      }

      JsonArray var18 = var0.getAsJsonArray("boxes");
      JsonObject var20;
      float[] var23;
      float var24;
      if (var18 != null) {
         for(int var19 = 0; var19 < var18.size(); ++var19) {
            var20 = var18.get(var19).getAsJsonObject();
            int[] var21 = aE.b(var20.get("textureOffset"), 2);
            int[][] var22 = b(var20);
            if (var21 == null && var22 == null) {
               throw new JsonParseException("Texture offset not specified");
            }

            var23 = aE.a(var20.get("coordinates"), 6);
            if (var23 == null) {
               throw new JsonParseException("Coordinates not specified");
            }

            if (var10) {
               var23[0] = -var23[0] - var23[3];
            }

            if (var11) {
               var23[1] = -var23[1] - var23[4];
            }

            if (var12) {
               var23[2] = -var23[2] - var23[5];
            }

            var24 = aE.a(var20, "sizeAdd", 0.0F);
            if (var22 != null) {
               var4.addBox(var22, var23[0], var23[1], var23[2], var23[3], var23[4], var23[5], var24);
            } else {
               var4.setTextureOffset(var21[0], var21[1]);
               var4.addBox(var23[0], var23[1], var23[2], (int)var23[3], (int)var23[4], (int)var23[5], var24);
            }
         }
      }

      JsonArray var27 = var0.getAsJsonArray("sprites");
      if (var27 != null) {
         for(int var28 = 0; var28 < var27.size(); ++var28) {
            JsonObject var29 = var27.get(var28).getAsJsonObject();
            int[] var32 = aE.b(var29.get("textureOffset"), 2);
            if (var32 == null) {
               throw new JsonParseException("Texture offset not specified");
            }

            var23 = aE.a(var29.get("coordinates"), 6);
            if (var23 == null) {
               throw new JsonParseException("Coordinates not specified");
            }

            if (var10) {
               var23[0] = -var23[0] - var23[3];
            }

            if (var11) {
               var23[1] = -var23[1] - var23[4];
            }

            if (var12) {
               var23[2] = -var23[2] - var23[5];
            }

            var24 = aE.a(var29, "sizeAdd", 0.0F);
            var4.setTextureOffset(var32[0], var32[1]);
            var4.addSprite(var23[0], var23[1], var23[2], (int)var23[3], (int)var23[4], (int)var23[5], var24);
         }
      }

      var20 = (JsonObject)var0.get("submodel");
      if (var20 != null) {
         ModelRenderer var30 = a(var20, var1, var8, var3);
         var4.addChild(var30);
      }

      JsonArray var31 = (JsonArray)var0.get("submodels");
      if (var31 != null) {
         for(int var33 = 0; var33 < var31.size(); ++var33) {
            JsonObject var34 = (JsonObject)var31.get(var33);
            ModelRenderer var35 = a(var34, var1, var8, var3);
            if (var35.getId() != null) {
               ModelRenderer var25 = var4.getChild(var35.getId());
               if (var25 != null) {
                  FastAura.b(String.valueOf((new StringBuilder("Duplicate model ID: ")).append(var35.getId())));
               }
            }

            var4.addChild(var35);
         }
      }

      return var4;
   }

   public static bb a(JsonObject var0, Dimension var1) {
      String var2 = aE.a(var0, "type");
      if (!FastAura.a((Object)var2, (Object)"ModelBox")) {
         FastAura.b(String.valueOf((new StringBuilder("Unknown model type: ")).append(var2)));
         return null;
      } else {
         String var3 = aE.a(var0, "attachTo");
         int var4 = a(var3);
         aN var5 = new aN();
         var5.textureWidth = var1.width;
         var5.textureHeight = var1.height;
         ModelRenderer var6 = a(var0, var5, (int[])null, (String)null);
         bb var7 = new bb(var4, var6);
         return var7;
      }
   }

   private static void a(Object var0, String var1) {
      if (var0 == null) {
         throw new JsonParseException(var1);
      }
   }

   private static int[][] b(JsonObject var0) {
      int[][] var1 = new int[][]{aE.b(var0.get("uvDown"), 4), aE.b(var0.get("uvUp"), 4), aE.b(var0.get("uvNorth"), 4), aE.b(var0.get("uvSouth"), 4), aE.b(var0.get("uvWest"), 4), aE.b(var0.get("uvEast"), 4)};
      if (var1[2] == null) {
         var1[2] = aE.b(var0.get("uvFront"), 4);
      }

      if (var1[3] == null) {
         var1[3] = aE.b(var0.get("uvBack"), 4);
      }

      if (var1[4] == null) {
         var1[4] = aE.b(var0.get("uvLeft"), 4);
      }

      if (var1[5] == null) {
         var1[5] = aE.b(var0.get("uvRight"), 4);
      }

      boolean var2 = false;

      for(int var3 = 0; var3 < var1.length; ++var3) {
         if (var1[var3] != null) {
            var2 = true;
         }
      }

      if (!var2) {
         return null;
      } else {
         return var1;
      }
   }
}
