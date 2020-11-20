package skid.gay.sex.spermix.inside.shalopay.j;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Properties;
import java.util.Set;
import java.util.TreeSet;
import net.minecraft.client.renderer.GlStateManager;
import net.minecraft.client.renderer.block.model.BakedQuad;
import net.minecraft.client.renderer.block.model.BlockPart;
import net.minecraft.client.renderer.block.model.BlockPartFace;
import net.minecraft.client.renderer.block.model.FaceBakery;
import net.minecraft.client.renderer.block.model.IBakedModel;
import net.minecraft.client.renderer.block.model.ItemModelGenerator;
import net.minecraft.client.renderer.block.model.ModelBakery;
import net.minecraft.client.renderer.block.model.ModelBlock;
import net.minecraft.client.renderer.block.model.ModelManager;
import net.minecraft.client.renderer.block.model.ModelResourceLocation;
import net.minecraft.client.renderer.block.model.ModelRotation;
import net.minecraft.client.renderer.block.model.SimpleBakedModel$Builder;
import net.minecraft.client.renderer.texture.ITextureObject;
import net.minecraft.client.renderer.texture.TextureAtlasSprite;
import net.minecraft.client.renderer.texture.TextureManager;
import net.minecraft.client.renderer.texture.TextureMap;
import net.minecraft.init.Items;
import net.minecraft.inventory.EntityEquipmentSlot;
import net.minecraft.item.Item;
import net.minecraft.item.ItemArmor;
import net.minecraft.item.ItemArmor$ArmorMaterial;
import net.minecraft.util.EnumFacing;
import net.minecraft.util.ResourceLocation;
import org.lwjgl.opengl.GL11;

public class L {
   
   public IBakedModel A = null;
   
   public String g = null;
   
   public int v = 0;
   
   public int t = 0;
   
   private int E = 0;
   
   public bj n = null;
   
   private int F = 0;
   
   public int p = 0;
   
   public Map h = null;
   
   public Map x = null;
   
   public float s = 0.0F;
   
   public int[] d = null;
   
   public aS[] o = null;
   
   public String a = null;
   
   public float u = 1.0F;
   
   public Map B = null;
   
   public int k = 0;
   
   public bj i = null;
   
   public bj m = null;
   
   public boolean j = false;
   
   public float r = 0.0F;
   
   public IBakedModel C = null;
   
   public int c = 1;
   
   public int q = 1;
   
   public TextureAtlasSprite y = null;
   
   public Map D = null;
   
   public String b = null;
   
   public ResourceLocation w = null;
   
   public Map z = null;
   
   public Map f = null;
   
   public bj l = null;
   
   public String e = null;

   private static IBakedModel a(TextureMap var0, ModelBlock var1, boolean var2) {
      ModelRotation var3 = ModelRotation.X0_Y0;
      boolean var4 = false;
      String var5 = var1.resolveTextureName("particle");
      TextureAtlasSprite var6 = var0.getAtlasSprite((new ResourceLocation(var5)).toString());
      SimpleBakedModel$Builder var7 = (new SimpleBakedModel$Builder(var1, var1.createOverrides())).setTexture(var6);
      Iterator var9 = var1.getElements().iterator();

      while(var9.hasNext()) {
         BlockPart var8 = (BlockPart)var9.next();
         Iterator var11 = var8.mapFaces.keySet().iterator();

         while(var11.hasNext()) {
            EnumFacing var10 = (EnumFacing)var11.next();
            BlockPartFace var12 = (BlockPartFace)var8.mapFaces.get(var10);
            if (!var2) {
               var12 = new BlockPartFace(var12.cullFace, -1, var12.texture, var12.blockFaceUV);
            }

            String var13 = var1.resolveTextureName(var12.texture);
            TextureAtlasSprite var14 = var0.getAtlasSprite((new ResourceLocation(var13)).toString());
            BakedQuad var15 = a(var8, var12, var14, var10, var3, var4);
            if (var12.cullFace == null) {
               var7.addGeneralQuad(var15);
            } else {
               var7.addFaceQuad(var3.rotateFace(var12.cullFace), var15);
            }
         }
      }

      return var7.makeBakedModel();
   }

   private static String c(String var0, String var1) {
      var0 = bB.a(var0, var1);
      boolean var2 = var0.startsWith("block/") || var0.startsWith("item/");
      if (!var0.startsWith(var1) && !var2 && !var0.startsWith("mcpatcher/")) {
         var0 = String.valueOf((new StringBuilder(String.valueOf(var1))).append("/").append(var0));
      }

      String var3 = ".json";
      if (var0.endsWith(var3)) {
         var0 = var0.substring(0, var0.length() - var3.length());
      }

      if (var0.startsWith("/")) {
         var0 = var0.substring(1);
      }

      return var0;
   }

   private int[] b() {
      Item var1 = Item.getByNameOrId(this.a);
      if (var1 == null) {
         return null;
      } else {
         int var2 = Item.getIdFromItem(var1);
         return var2 <= 0 ? null : new int[]{var2};
      }
   }

   private String[] d() {
      if (this.c == 1 && this.d.length == 1) {
         Item var1 = Item.getItemById(this.d[0]);
         boolean var2 = var1 == Items.POTIONITEM || var1 == Items.SPLASH_POTION || var1 == Items.LINGERING_POTION;
         String var6;
         String var7;
         if (var2 && this.i != null && this.i.a() > 0) {
            bi var9 = this.i.b(0);
            int var10 = var9.a();
            boolean var11 = (var10 & 16384) != 0;
            var6 = this.a(this.f, "texture.potion_overlay", "items/potion_overlay");
            var7 = null;
            if (var11) {
               var7 = this.a(this.f, "texture.potion_bottle_splash", "items/potion_bottle_splash");
            } else {
               var7 = this.a(this.f, "texture.potion_bottle_drinkable", "items/potion_bottle_drinkable");
            }

            return new String[]{var6, var7};
         }

         if (var1 instanceof ItemArmor) {
            ItemArmor var3 = (ItemArmor)var1;
            if (var3.getArmorMaterial() == ItemArmor$ArmorMaterial.LEATHER) {
               String var4 = "leather";
               String var5 = "helmet";
               if (var3.armorType == EntityEquipmentSlot.HEAD) {
                  var5 = "helmet";
               }

               if (var3.armorType == EntityEquipmentSlot.CHEST) {
                  var5 = "chestplate";
               }

               if (var3.armorType == EntityEquipmentSlot.LEGS) {
                  var5 = "leggings";
               }

               if (var3.armorType == EntityEquipmentSlot.FEET) {
                  var5 = "boots";
               }

               var6 = String.valueOf((new StringBuilder(String.valueOf(var4))).append("_").append(var5));
               var7 = this.a(this.f, String.valueOf((new StringBuilder("texture.")).append(var6)), String.valueOf((new StringBuilder("items/")).append(var6)));
               String var8 = this.a(this.f, String.valueOf((new StringBuilder("texture.")).append(var6).append("_overlay")), String.valueOf((new StringBuilder("items/")).append(var6).append("_overlay")));
               return new String[]{var7, var8};
            }
         }
      }

      return new String[]{this.e};
   }

   private ResourceLocation h(String var1) {
      if (var1 == null) {
         return null;
      } else {
         ResourceLocation var2 = new ResourceLocation(var1);
         String var3 = var2.getResourceDomain();
         String var4 = var2.getResourcePath();
         if (!var4.contains("/")) {
            var4 = String.valueOf((new StringBuilder("textures/items/")).append(var4));
         }

         String var5 = String.valueOf((new StringBuilder(String.valueOf(var4))).append(".png"));
         ResourceLocation var6 = new ResourceLocation(var3, var5);
         boolean var7 = skid.gay.sex.spermix.inside.shalopay.RadioShanson.FastAura.b(var6);
         if (!var7) {
            skid.gay.sex.spermix.inside.shalopay.RadioShanson.FastAura.b(String.valueOf((new StringBuilder("File not found: ")).append(var5)));
         }

         return var6;
      }
   }

   public void a(ModelBakery var1) {
      if (this.g != null) {
         a(var1, this.g);
      }

      if (this.c == 1 && this.h != null) {
         Iterator var3 = this.h.keySet().iterator();

         while(true) {
            String var4;
            String var5;
            do {
               if (!var3.hasNext()) {
                  return;
               }

               String var2 = (String)var3.next();
               var4 = (String)this.h.get(var2);
               var5 = bx.a(var2, "model.");
            } while(!var5.startsWith("bow") && !var5.startsWith("fishing_rod"));

            a(var1, var4);
         }
      }
   }

   public void a(TextureMap var1, ItemModelGenerator var2) {
      if (this.e != null || this.f != null) {
         String[] var3 = this.d();
         boolean var4 = this.c();
         this.A = a(var1, var2, var3, var4);
         if (this.c == 1 && this.f != null) {
            Iterator var6 = this.f.keySet().iterator();

            while(true) {
               String var7;
               String var8;
               do {
                  if (!var6.hasNext()) {
                     return;
                  }

                  String var5 = (String)var6.next();
                  var7 = (String)this.f.get(var5);
                  var8 = bx.a(var5, "texture.");
               } while(!var8.startsWith("bow") && !var8.startsWith("fishing_rod"));

               String[] var9 = new String[]{var7};
               IBakedModel var10 = a(var1, var2, var9, var4);
               if (this.B == null) {
                  this.B = new HashMap();
               }

               String var11 = String.valueOf((new StringBuilder("item/")).append(var8));
               this.B.put(var11, var10);
            }
         }
      }

   }

   private static Map a(Properties var0, String var1) {
      String var2 = "texture.";
      Map var3 = c(var0, var2);
      if (var3.size() <= 0) {
         return null;
      } else {
         Set var4 = var3.keySet();
         LinkedHashMap var5 = new LinkedHashMap();
         Iterator var7 = var4.iterator();

         while(var7.hasNext()) {
            Object var6 = var7.next();
            String var8 = (String)var3.get(var6);
            var8 = b(var8, var1);
            var5.put(var6, var8);
         }

         return var5;
      }
   }

   private static BakedQuad a(BlockPart var0, BlockPartFace var1, TextureAtlasSprite var2, EnumFacing var3, ModelRotation var4, boolean var5) {
      FaceBakery var6 = new FaceBakery();
      return var6.makeBakedQuad(var0.positionFrom, var0.positionTo, var1, var2, var3, var4, var0.partRotation, var5, var0.shade);
   }

   public L(Properties var1, String var2) {
      this.a = b(var2);
      this.b = c(var2);
      this.c = this.d(var1.getProperty("type"));
      this.d = this.a(var1.getProperty("items"), var1.getProperty("matchItems"));
      this.h = b(var1, this.b);
      this.g = a(var1.getProperty("model"), var2, this.b, this.c, this.h);
      this.f = a(var1, this.b);
      boolean var3 = this.h == null && this.g == null;
      this.e = a(var1.getProperty("texture"), var1.getProperty("tile"), var1.getProperty("source"), var2, this.b, this.c, this.f, var3);
      String var4 = var1.getProperty("damage");
      if (var4 != null) {
         this.j = var4.contains("%");
         var4 = var4.replace("%", "");
         this.i = this.e(var4);
         this.k = this.a(var1.getProperty("damageMask"), 0);
      }

      this.l = this.e(var1.getProperty("stackSize"));
      this.m = this.a((String)var1.getProperty("enchantmentIDs"), (aD)(new aT()));
      this.n = this.e(var1.getProperty("enchantmentLevels"));
      this.o = this.a(var1);
      this.p = this.g(var1.getProperty("hand"));
      this.q = skid.gay.sex.spermix.inside.shalopay.j.d.a(var1.getProperty("blend"));
      this.r = this.a(var1.getProperty("speed"), 0.0F);
      this.s = this.a(var1.getProperty("rotation"), 0.0F);
      this.t = this.a(var1.getProperty("layer"), 0);
      this.v = this.a(var1.getProperty("weight"), 0);
      this.u = this.a(var1.getProperty("duration"), 1.0F);
   }

   private ResourceLocation a(ResourceLocation var1) {
      String var2 = var1.getResourcePath();
      var2 = bx.a(var2, "textures/");
      var2 = bx.b(var2, ".png");
      ResourceLocation var3 = new ResourceLocation(var1.getResourceDomain(), var2);
      return var3;
   }

   public void a(TextureMap var1) {
      if (this.e != null) {
         this.w = this.h(this.e);
         if (this.c == 1) {
            ResourceLocation var2 = this.a(this.w);
            this.y = var1.registerSprite(var2);
         }
      }

      if (this.f != null) {
         this.x = new HashMap();
         this.z = new HashMap();
         Iterator var3 = this.f.keySet().iterator();

         while(var3.hasNext()) {
            String var8 = (String)var3.next();
            String var4 = (String)this.f.get(var8);
            ResourceLocation var5 = this.h(var4);
            this.x.put(var8, var5);
            if (this.c == 1) {
               ResourceLocation var6 = this.a(var5);
               TextureAtlasSprite var7 = var1.registerSprite(var6);
               this.z.put(var8, var7);
            }
         }
      }

   }

   private bj e(String var1) {
      return this.a((String)var1, (aD)null);
   }

   private aS[] a(Properties var1) {
      String var2 = "nbt.";
      Map var3 = c(var1, var2);
      if (var3.size() <= 0) {
         return null;
      } else {
         ArrayList var4 = new ArrayList();
         Iterator var6 = var3.keySet().iterator();

         while(var6.hasNext()) {
            Object var5 = var6.next();
            String var7 = (String)var3.get(var5);
            String var8 = ((String)var5).substring(var2.length());
            aS var9 = new aS(var8, var7);
            var4.add(var9);
         }

         aS[] var10 = (aS[])var4.toArray(new aS[var4.size()]);
         return var10;
      }
   }

   public void a() {
      ModelManager var1 = skid.gay.sex.spermix.inside.shalopay.RadioShanson.FastAura.z();
      IBakedModel var2 = var1.getMissingModel();
      if (this.g != null) {
         ResourceLocation var3 = i(this.g);
         ModelResourceLocation var4 = new ModelResourceLocation(var3, "inventory");
         this.C = var1.getModel(var4);
         if (this.C == var2) {
            skid.gay.sex.spermix.inside.shalopay.RadioShanson.FastAura.b(String.valueOf((new StringBuilder("Custom Items: Model not found ")).append(var4.getResourcePath())));
            this.C = null;
         }
      }

      if (this.c == 1 && this.h != null) {
         Iterator var12 = this.h.keySet().iterator();

         while(true) {
            String var5;
            String var6;
            do {
               if (!var12.hasNext()) {
                  return;
               }

               String var11 = (String)var12.next();
               var5 = (String)this.h.get(var11);
               var6 = bx.a(var11, "model.");
            } while(!var6.startsWith("bow") && !var6.startsWith("fishing_rod"));

            ResourceLocation var7 = i(var5);
            ModelResourceLocation var8 = new ModelResourceLocation(var7, "inventory");
            IBakedModel var9 = var1.getModel(var8);
            if (var9 == var2) {
               skid.gay.sex.spermix.inside.shalopay.RadioShanson.FastAura.b(String.valueOf((new StringBuilder("Custom Items: Model not found ")).append(var8.getResourcePath())));
            } else {
               if (this.D == null) {
                  this.D = new HashMap();
               }

               String var10 = String.valueOf((new StringBuilder("item/")).append(var6));
               this.D.put(var10, var9);
            }
         }
      }
   }

   private static IBakedModel a(TextureMap var0, ItemModelGenerator var1, String[] var2, boolean var3) {
      String[] var4 = new String[var2.length];

      for(int var5 = 0; var5 < var4.length; ++var5) {
         String var6 = var2[var5];
         var4[var5] = bx.a(var6, "textures/");
      }

      ModelBlock var8 = a(var4);
      ModelBlock var9 = var1.makeItemModel(var0, var8);
      IBakedModel var7 = a(var0, var9, var3);
      return var7;
   }

   private static String b(String var0, String var1) {
      var0 = bB.a(var0, var1);
      if (!var0.startsWith(var1) && !var0.startsWith("textures/") && !var0.startsWith("mcpatcher/")) {
         var0 = String.valueOf((new StringBuilder(String.valueOf(var1))).append("/").append(var0));
      }

      if (var0.endsWith(".png")) {
         var0 = var0.substring(0, var0.length() - 4);
      }

      if (var0.startsWith("/")) {
         var0 = var0.substring(1);
      }

      return var0;
   }

   private static String b(String var0) {
      String var1 = var0;
      int var2 = var0.lastIndexOf(47);
      if (var2 >= 0) {
         var1 = var0.substring(var2 + 1);
      }

      int var3 = var1.lastIndexOf(46);
      if (var3 >= 0) {
         var1 = var1.substring(0, var3);
      }

      return var1;
   }

   private bj a(String var1, aD var2) {
      if (var1 == null) {
         return null;
      } else {
         String[] var3 = skid.gay.sex.spermix.inside.shalopay.RadioShanson.FastAura.a(var1, " ");
         bj var4 = new bj();

         for(int var5 = 0; var5 < var3.length; ++var5) {
            String var6 = var3[var5];
            if (var2 != null) {
               int var7 = var2.a(var6, Integer.MIN_VALUE);
               if (var7 != Integer.MIN_VALUE) {
                  var4.a(new bi(var7, var7));
                  continue;
               }
            }

            bi var8 = this.f(var6);
            if (var8 == null) {
               skid.gay.sex.spermix.inside.shalopay.RadioShanson.FastAura.b(String.valueOf((new StringBuilder("Invalid range list: ")).append(var1)));
               return null;
            }

            var4.a(var8);
         }

         return var4;
      }
   }

   public IBakedModel a(ResourceLocation var1, boolean var2) {
      IBakedModel var3;
      Map var4;
      if (var2) {
         var3 = this.C;
         var4 = this.D;
      } else {
         var3 = this.A;
         var4 = this.B;
      }

      if (var1 != null && var4 != null) {
         String var5 = var1.getResourcePath();
         IBakedModel var6 = (IBakedModel)var4.get(var5);
         if (var6 != null) {
            return var6;
         }
      }

      return var3;
   }

   private static String a(String var0, String var1, String var2, String var3, String var4, int var5, Map var6, boolean var7) {
      if (var0 == null) {
         var0 = var1;
      }

      if (var0 == null) {
         var0 = var2;
      }

      String var8;
      if (var0 != null) {
         var8 = ".png";
         if (var0.endsWith(var8)) {
            var0 = var0.substring(0, var0.length() - var8.length());
         }

         var0 = b(var0, var4);
         return var0;
      } else if (var5 == 3) {
         return null;
      } else {
         if (var6 != null) {
            var8 = (String)var6.get("texture.bow_standby");
            if (var8 != null) {
               return var8;
            }
         }

         if (!var7) {
            return null;
         } else {
            var8 = var3;
            int var9 = var3.lastIndexOf(47);
            if (var9 >= 0) {
               var8 = var3.substring(var9 + 1);
            }

            int var10 = var8.lastIndexOf(46);
            if (var10 >= 0) {
               var8 = var8.substring(0, var10);
            }

            var8 = b(var8, var4);
            return var8;
         }
      }
   }

   private static String a(String var0, String var1, String var2, int var3, Map var4) {
      String var5;
      if (var0 != null) {
         var5 = ".json";
         if (var0.endsWith(var5)) {
            var0 = var0.substring(0, var0.length() - var5.length());
         }

         var0 = c(var0, var2);
         return var0;
      } else if (var3 == 3) {
         return null;
      } else {
         if (var4 != null) {
            var5 = (String)var4.get("model.bow_standby");
            if (var5 != null) {
               return var5;
            }
         }

         return var0;
      }
   }

   public float a(TextureManager var1) {
      if (this.E <= 0) {
         if (this.w != null) {
            ITextureObject var2 = var1.getTexture(this.w);
            int var3 = var2.getGlTextureId();
            int var4 = GlStateManager.getBoundTexture();
            GlStateManager.bindTexture(var3);
            this.E = GL11.glGetTexLevelParameteri(3553, 0, 4096);
            GlStateManager.bindTexture(var4);
         }

         if (this.E <= 0) {
            this.E = 16;
         }
      }

      return (float)this.E;
   }

   private static Map c(Properties var0, String var1) {
      LinkedHashMap var2 = new LinkedHashMap();
      Iterator var4 = var0.keySet().iterator();

      while(var4.hasNext()) {
         Object var3 = var4.next();
         String var5 = var0.getProperty((String)var3);
         if (((String)var3).startsWith(var1)) {
            var2.put(var3, var5);
         }
      }

      return var2;
   }

   private static void a(ModelBakery var0, String var1) {
      ResourceLocation var2 = i(var1);
      ModelResourceLocation var3 = new ModelResourceLocation(var2, "inventory");
      if (bk.cI.b()) {
         try {
            Object var4 = bk.cN.b();
            a(var4, "vanillaLoader is null");
            Object var5 = bk.g(var4, bk.cO, var3);
            a(var5, "iModel is null");
            Map var6 = (Map)bk.a((Object)var0, (bn)bk.cJ);
            a((Object)var6, (String)"stateModels is null");
            var6.put(var3, var5);
            Set var7 = (Set)bk.cQ.b();
            a((Object)var7, (String)"registryTextures is null");
            Collection var8 = (Collection)bk.g(var5, bk.cm);
            a((Object)var8, (String)"modelTextures is null");
            var7.addAll(var8);
         } catch (Exception var9) {
            skid.gay.sex.spermix.inside.shalopay.RadioShanson.FastAura.b(String.valueOf((new StringBuilder("Error registering model: ")).append(var3).append(", ").append(var9.getClass().getName()).append(": ").append(var9.getMessage())));
         }
      } else {
         var0.loadItemModel(var2.toString(), var3, var2);
      }

   }

   private int g(String var1) {
      if (var1 == null) {
         return 0;
      } else {
         var1 = var1.toLowerCase();
         if (var1.equals("any")) {
            return 0;
         } else if (var1.equals("main")) {
            return 1;
         } else if (var1.equals("off")) {
            return 2;
         } else {
            skid.gay.sex.spermix.inside.shalopay.RadioShanson.FastAura.b(String.valueOf((new StringBuilder("Invalid hand: ")).append(var1)));
            return 0;
         }
      }
   }

   private int d(String var1) {
      if (var1 == null) {
         return 1;
      } else if (var1.equals("item")) {
         return 1;
      } else if (var1.equals("enchantment")) {
         return 2;
      } else if (var1.equals("armor")) {
         return 3;
      } else if (var1.equals("elytra")) {
         return 4;
      } else {
         skid.gay.sex.spermix.inside.shalopay.RadioShanson.FastAura.b(String.valueOf((new StringBuilder("Unknown method: ")).append(var1)));
         return 0;
      }
   }

   private static Map b(Properties var0, String var1) {
      String var2 = "model.";
      Map var3 = c(var0, var2);
      if (var3.size() <= 0) {
         return null;
      } else {
         Set var4 = var3.keySet();
         LinkedHashMap var5 = new LinkedHashMap();
         Iterator var7 = var4.iterator();

         while(var7.hasNext()) {
            Object var6 = var7.next();
            String var8 = (String)var3.get(var6);
            var8 = c(var8, var1);
            var5.put(var6, var8);
         }

         return var5;
      }
   }

   public boolean a(String var1) {
      if (this.a != null && this.a.length() > 0) {
         if (this.b == null) {
            skid.gay.sex.spermix.inside.shalopay.RadioShanson.FastAura.b(String.valueOf((new StringBuilder("No base path found: ")).append(var1)));
            return false;
         } else if (this.c == 0) {
            skid.gay.sex.spermix.inside.shalopay.RadioShanson.FastAura.b(String.valueOf((new StringBuilder("No type defined: ")).append(var1)));
            return false;
         } else {
            if (this.c == 4 && this.d == null) {
               this.d = new int[]{Item.getIdFromItem(Items.ELYTRA)};
            }

            if (this.c == 1 || this.c == 3 || this.c == 4) {
               if (this.d == null) {
                  this.d = this.b();
               }

               if (this.d == null) {
                  skid.gay.sex.spermix.inside.shalopay.RadioShanson.FastAura.b(String.valueOf((new StringBuilder("No items defined: ")).append(var1)));
                  return false;
               }
            }

            if (this.e == null && this.f == null && this.g == null && this.h == null) {
               skid.gay.sex.spermix.inside.shalopay.RadioShanson.FastAura.b(String.valueOf((new StringBuilder("No texture or model specified: ")).append(var1)));
               return false;
            } else if (this.c == 2 && this.m == null) {
               skid.gay.sex.spermix.inside.shalopay.RadioShanson.FastAura.b(String.valueOf((new StringBuilder("No enchantmentIDs specified: ")).append(var1)));
               return false;
            } else {
               return true;
            }
         }
      } else {
         skid.gay.sex.spermix.inside.shalopay.RadioShanson.FastAura.b(String.valueOf((new StringBuilder("No name found: ")).append(var1)));
         return false;
      }
   }

   private bi f(String var1) {
      if (var1 == null) {
         return null;
      } else {
         var1 = var1.trim();
         int var2 = var1.length() - var1.replace("-", "").length();
         if (var2 > 1) {
            skid.gay.sex.spermix.inside.shalopay.RadioShanson.FastAura.b(String.valueOf((new StringBuilder("Invalid range: ")).append(var1)));
            return null;
         } else {
            String[] var3 = skid.gay.sex.spermix.inside.shalopay.RadioShanson.FastAura.a(var1, "- ");
            int[] var4 = new int[var3.length];

            int var5;
            for(var5 = 0; var5 < var3.length; ++var5) {
               String var6 = var3[var5];
               int var7 = skid.gay.sex.spermix.inside.shalopay.RadioShanson.FastAura.a((String)var6, -1);
               if (var7 < 0) {
                  skid.gay.sex.spermix.inside.shalopay.RadioShanson.FastAura.b(String.valueOf((new StringBuilder("Invalid range: ")).append(var1)));
                  return null;
               }

               var4[var5] = var7;
            }

            if (var4.length == 1) {
               var5 = var4[0];
               if (var1.startsWith("-")) {
                  return new bi(0, var5);
               } else {
                  return var1.endsWith("-") ? new bi(var5, 65535) : new bi(var5, var5);
               }
            } else if (var4.length == 2) {
               var5 = Math.min(var4[0], var4[1]);
               int var8 = Math.max(var4[0], var4[1]);
               return new bi(var5, var8);
            } else {
               skid.gay.sex.spermix.inside.shalopay.RadioShanson.FastAura.b(String.valueOf((new StringBuilder("Invalid range: ")).append(var1)));
               return null;
            }
         }
      }
   }

   private boolean c() {
      return true;
   }

   private static ResourceLocation i(String var0) {
      return bk.cI.b() && !var0.startsWith("mcpatcher/") && !var0.startsWith("optifine/") ? new ResourceLocation(String.valueOf((new StringBuilder("models/")).append(var0))) : new ResourceLocation(var0);
   }

   public String toString() {
      return String.valueOf((new StringBuilder()).append(this.b).append("/").append(this.a).append(", type: ").append(this.c).append(", items: [").append(skid.gay.sex.spermix.inside.shalopay.RadioShanson.FastAura.a(this.d)).append("], textture: ").append(this.e));
   }

   private String a(Map var1, String var2, String var3) {
      if (var1 == null) {
         return var3;
      } else {
         String var4 = (String)var1.get(var2);
         return var4 == null ? var3 : var4;
      }
   }

   private int a(String var1, int var2) {
      if (var1 == null) {
         return var2;
      } else {
         var1 = var1.trim();
         int var3 = skid.gay.sex.spermix.inside.shalopay.RadioShanson.FastAura.a(var1, Integer.MIN_VALUE);
         if (var3 == Integer.MIN_VALUE) {
            skid.gay.sex.spermix.inside.shalopay.RadioShanson.FastAura.b(String.valueOf((new StringBuilder("Invalid integer: ")).append(var1)));
            return var2;
         } else {
            return var3;
         }
      }
   }

   private static String c(String var0) {
      int var1 = var0.lastIndexOf(47);
      return var1 < 0 ? "" : var0.substring(0, var1);
   }

   private static void a(Object var0, String var1) {
      if (var0 == null) {
         throw new NullPointerException(var1);
      }
   }

   private float a(String var1, float var2) {
      if (var1 == null) {
         return var2;
      } else {
         var1 = var1.trim();
         float var3 = skid.gay.sex.spermix.inside.shalopay.RadioShanson.FastAura.a(var1, Float.MIN_VALUE);
         if (var3 == Float.MIN_VALUE) {
            skid.gay.sex.spermix.inside.shalopay.RadioShanson.FastAura.b(String.valueOf((new StringBuilder("Invalid float: ")).append(var1)));
            return var2;
         } else {
            return var3;
         }
      }
   }

   private static ModelBlock a(String[] var0) {
      StringBuffer var1 = new StringBuffer();
      var1.append("{\"parent\": \"builtin/generated\",\"textures\": {");

      for(int var2 = 0; var2 < var0.length; ++var2) {
         String var3 = var0[var2];
         if (var2 > 0) {
            var1.append(", ");
         }

         var1.append(String.valueOf((new StringBuilder("\"layer")).append(var2).append("\": \"").append(var3).append("\"")));
      }

      var1.append("}}");
      String var4 = var1.toString();
      ModelBlock var5 = ModelBlock.deserialize(var4);
      return var5;
   }

   private int[] a(String var1, String var2) {
      if (var1 == null) {
         var1 = var2;
      }

      if (var1 == null) {
         return null;
      } else {
         var1 = var1.trim();
         TreeSet var3 = new TreeSet();
         String[] var4 = skid.gay.sex.spermix.inside.shalopay.RadioShanson.FastAura.a(var1, " ");

         int var7;
         label57:
         for(int var5 = 0; var5 < var4.length; ++var5) {
            String var6 = var4[var5];
            var7 = skid.gay.sex.spermix.inside.shalopay.RadioShanson.FastAura.a((String)var6, -1);
            if (var7 >= 0) {
               var3.add(new Integer(var7));
            } else {
               int var9;
               if (var6.contains("-")) {
                  String[] var8 = skid.gay.sex.spermix.inside.shalopay.RadioShanson.FastAura.a(var6, "-");
                  if (var8.length == 2) {
                     var9 = skid.gay.sex.spermix.inside.shalopay.RadioShanson.FastAura.a((String)var8[0], -1);
                     int var10 = skid.gay.sex.spermix.inside.shalopay.RadioShanson.FastAura.a((String)var8[1], -1);
                     if (var9 >= 0 && var10 >= 0) {
                        int var11 = Math.min(var9, var10);
                        int var12 = Math.max(var9, var10);
                        int var13 = var11;

                        while(true) {
                           if (var13 > var12) {
                              continue label57;
                           }

                           var3.add(new Integer(var13));
                           ++var13;
                        }
                     }
                  }
               }

               Item var16 = Item.getByNameOrId(var6);
               if (var16 == null) {
                  skid.gay.sex.spermix.inside.shalopay.RadioShanson.FastAura.b(String.valueOf((new StringBuilder("Item not found: ")).append(var6)));
               } else {
                  var9 = Item.getIdFromItem(var16);
                  if (var9 <= 0) {
                     skid.gay.sex.spermix.inside.shalopay.RadioShanson.FastAura.b(String.valueOf((new StringBuilder("Item not found: ")).append(var6)));
                  } else {
                     var3.add(new Integer(var9));
                  }
               }
            }
         }

         Integer[] var14 = (Integer[])var3.toArray(new Integer[var3.size()]);
         int[] var15 = new int[var14.length];

         for(var7 = 0; var7 < var15.length; ++var7) {
            var15[var7] = var14[var7];
         }

         return var15;
      }
   }
}
