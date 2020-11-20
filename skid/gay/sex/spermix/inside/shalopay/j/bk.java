package skid.gay.sex.spermix.inside.shalopay.j;

import it.unimi.dsi.fastutil.longs.Long2ObjectMap;
import java.io.Reader;
import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.Map;
import java.util.Optional;
import net.minecraft.block.Block;
import net.minecraft.block.properties.IProperty;
import net.minecraft.block.state.IBlockProperties;
import net.minecraft.block.state.IBlockState;
import net.minecraft.client.Minecraft;
import net.minecraft.client.gui.GuiMainMenu;
import net.minecraft.client.gui.GuiScreen;
import net.minecraft.client.model.ModelBanner;
import net.minecraft.client.model.ModelBase;
import net.minecraft.client.model.ModelBat;
import net.minecraft.client.model.ModelBlaze;
import net.minecraft.client.model.ModelBook;
import net.minecraft.client.model.ModelChest;
import net.minecraft.client.model.ModelDragon;
import net.minecraft.client.model.ModelDragonHead;
import net.minecraft.client.model.ModelEnderCrystal;
import net.minecraft.client.model.ModelEnderMite;
import net.minecraft.client.model.ModelEvokerFangs;
import net.minecraft.client.model.ModelGhast;
import net.minecraft.client.model.ModelGuardian;
import net.minecraft.client.model.ModelHorse;
import net.minecraft.client.model.ModelHumanoidHead;
import net.minecraft.client.model.ModelLeashKnot;
import net.minecraft.client.model.ModelMagmaCube;
import net.minecraft.client.model.ModelOcelot;
import net.minecraft.client.model.ModelRabbit;
import net.minecraft.client.model.ModelRenderer;
import net.minecraft.client.model.ModelShulker;
import net.minecraft.client.model.ModelShulkerBullet;
import net.minecraft.client.model.ModelSign;
import net.minecraft.client.model.ModelSilverfish;
import net.minecraft.client.model.ModelSkeletonHead;
import net.minecraft.client.model.ModelSlime;
import net.minecraft.client.model.ModelSquid;
import net.minecraft.client.model.ModelVex;
import net.minecraft.client.model.ModelWitch;
import net.minecraft.client.model.ModelWither;
import net.minecraft.client.model.ModelWolf;
import net.minecraft.client.multiplayer.ChunkProviderClient;
import net.minecraft.client.renderer.EntityRenderer;
import net.minecraft.client.renderer.block.model.ItemOverrideList;
import net.minecraft.client.renderer.block.model.ModelBlockDefinition;
import net.minecraft.client.renderer.block.model.ModelManager;
import net.minecraft.client.renderer.block.model.ModelRotation;
import net.minecraft.client.renderer.entity.RenderBoat;
import net.minecraft.client.renderer.entity.RenderEnderCrystal;
import net.minecraft.client.renderer.entity.RenderEvokerFangs;
import net.minecraft.client.renderer.entity.RenderItemFrame;
import net.minecraft.client.renderer.entity.RenderLeashKnot;
import net.minecraft.client.renderer.entity.RenderLivingBase;
import net.minecraft.client.renderer.entity.RenderManager;
import net.minecraft.client.renderer.entity.RenderMinecart;
import net.minecraft.client.renderer.entity.RenderShulkerBullet;
import net.minecraft.client.renderer.entity.RenderWitherSkull;
import net.minecraft.client.renderer.tileentity.TileEntityBannerRenderer;
import net.minecraft.client.renderer.tileentity.TileEntityChestRenderer;
import net.minecraft.client.renderer.tileentity.TileEntityEnchantmentTableRenderer;
import net.minecraft.client.renderer.tileentity.TileEntityEnderChestRenderer;
import net.minecraft.client.renderer.tileentity.TileEntityShulkerBoxRenderer;
import net.minecraft.client.renderer.tileentity.TileEntitySignRenderer;
import net.minecraft.client.renderer.tileentity.TileEntitySkullRenderer;
import net.minecraft.client.renderer.vertex.VertexFormatElement$EnumUsage;
import net.minecraft.client.resources.DefaultResourcePack;
import net.minecraft.client.resources.IResourcePack;
import net.minecraft.client.resources.LegacyV2Adapter;
import net.minecraft.client.settings.KeyBinding;
import net.minecraft.entity.Entity;
import net.minecraft.entity.EntityLivingBase;
import net.minecraft.entity.EnumCreatureType;
import net.minecraft.entity.item.EntityItemFrame;
import net.minecraft.entity.player.EntityPlayerMP;
import net.minecraft.item.Item;
import net.minecraft.item.ItemArmor;
import net.minecraft.potion.Potion;
import net.minecraft.potion.PotionEffect;
import net.minecraft.tileentity.TileEntity;
import net.minecraft.util.BlockRenderLayer;
import net.minecraft.util.ResourceLocation;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.math.ChunkPos;
import net.minecraft.world.ChunkCache;
import net.minecraft.world.IBlockAccess;
import net.minecraft.world.World;
import net.minecraft.world.WorldProvider;
import net.minecraft.world.biome.Biome;
import net.minecraftforge.common.property.IUnlistedProperty;

public class bk {
   
   public static bl bB;
   
   public static bq bR;
   
   public static bn b;
   
   public static bq bt;
   
   public static bn cv;
   
   public static bl bY;
   
   public static bq s;
   
   public static bq cH;
   
   public static bq cA;
   
   public static bl et;
   
   public static bn ax;
   
   public static bq aM;
   
   public static bm cY;
   
   public static bn dp;
   
   public static bm dc;
   
   public static bo dF;
   
   public static bl fd;
   
   public static bl dX;
   
   public static bq cW;
   
   public static bn ey;
   
   public static bq dj;
   
   public static bm da;
   
   public static bq ac;
   
   public static bl ec;
   
   public static bq aX;
   
   public static bn dZ;
   
   public static bq bc;
   
   public static bl dB;
   
   public static bn bI;
   
   public static bl E;
   
   public static bq bG;
   
   public static bn dy;
   
   public static bq X;
   
   public static bn eJ;
   
   public static bl ds;
   
   public static bn ev;
   
   public static bn eA;
   
   public static bq bZ;
   
   public static bq cL;
   
   public static bq F;
   
   public static bn eV;
   
   public static bn fh;
   
   public static bn dT;
   
   public static bl cM;
   
   public static bq S;
   
   public static bl dx;
   
   public static bq cd;
   
   public static bn fg;
   
   public static bq N;
   
   public static bq cG;
   
   public static bq bm;
   
   public static bq bN;
   
   public static bn dU;
   
   public static bn dJ;
   
   public static bq aW;
   
   public static bq aA;
   
   public static bl do;
   
   public static bl bO;
   
   public static bn cz;
   
   public static bq al;
   
   public static bl dd;
   
   public static bq k;
   
   public static bl ej;
   
   public static bq ah;
   
   public static bl M;
   
   public static bq aL;
   
   public static bq aO;
   
   public static bl cI;
   
   public static bn cN;
   
   public static bq bq;
   
   public static bl cr;
   
   public static bq ak;
   
   public static bq bA;
   
   public static bq bS;
   
   public static bq bU;
   
   public static bq cS;
   
   public static bq bl;
   
   public static bn dY;
   
   public static bl bQ;
   
   public static bl K;
   
   public static bq bX;
   
   public static bq cf;
   
   public static bl eh;
   
   public static bn fi;
   
   public static bl ee;
   
   public static bq bb;
   
   public static bl dL;
   
   public static bq W;
   
   public static bl v;
   
   public static bl bD;
   
   public static bn dw;
   
   public static bm p;
   
   public static bl dS;
   
   public static bq aR;
   
   public static bq aj;
   
   public static bq ap;
   
   public static bl eZ;
   
   public static bl cp;
   
   public static bl dG;
   
   public static bm dn;
   
   public static bn dD;
   
   public static bl cP;
   
   public static bl cZ;
   
   public static bq bT;
   
   public static bl du;
   
   public static bl ea;
   
   public static bq be;
   
   public static bn eB;
   
   public static bl c;
   
   public static bm w;
   
   public static bq bW;
   
   public static bl el;
   
   public static bl d;
   
   public static bq dk;
   
   public static bn dr;
   
   public static bq by;
   
   public static bq e;
   
   public static bo ep;
   
   public static bn eg;
   
   public static bn fc;
   
   public static bq ck;
   
   public static bn dV;
   
   public static bl cD;
   
   public static bq bE;
   
   public static bn eD;
   
   public static bq aN;
   
   public static bq ce;
   
   public static bl dq;
   
   public static bn eL;
   
   public static bq cK;
   
   public static bn cx;
   
   public static bn dW;
   
   public static bq t;
   
   public static bl eX;
   
   public static bq bh;
   
   public static bq aE;
   
   public static bl q;
   
   public static bm r;
   
   public static bl ct;
   
   public static bo ek;
   
   public static bm n;
   
   public static bl eq;
   
   public static bq z;
   
   public static bn eP;
   
   public static bq aQ;
   
   public static bl a = new bl("net.minecraftforge.client.model.Attributes");
   
   public static bl cy;
   
   public static bq P;
   
   public static bl cF;
   
   public static bq aw;
   
   public static bl f;
   
   public static bq bn;
   
   public static bn er;
   
   public static bn fe;
   
   public static bn fa;
   
   public static bq cm;
   
   public static bl ew;
   
   public static bq bP;
   
   public static bl aG;
   
   public static bq aY;
   
   public static bm L;
   
   public static bl av;
   
   public static bl eU;
   
   public static bl eO;
   
   public static bl cV;
   
   public static bn dR;
   
   public static bn dC;
   
   public static bm de;
   
   public static bq i;
   
   public static bq U;
   
   public static bl eQ;
   
   public static bq D;
   
   public static bq ai;
   
   public static bq bM;
   
   public static bl eI;
   
   public static bq an;
   
   public static bq V;
   
   public static bq x;
   
   public static bn eu;
   
   public static bl aP;
   
   public static bl dI;
   
   public static bm cq;
   
   public static bq bp;
   
   public static bq aU;
   
   public static bq aS;
   
   public static bn cJ;
   
   public static bq aI;
   
   public static bl cj;
   
   public static bq bk;
   
   public static bm g;
   
   public static bq as;
   
   public static bn I;
   
   public static bn dQ;
   
   public static bm B;
   
   public static bl at;
   
   public static bl eS;
   
   public static bn H;
   
   public static bl cl;
   
   public static bq ad;
   
   public static bq O;
   
   public static bn eW;
   
   public static bq co;
   
   public static bl eK;
   
   public static bl bJ;
   
   public static bq af;
   
   public static bq bj;
   
   public static bn ed;
   
   public static bo eb;
   
   public static bl bV;
   
   public static bl eM;
   
   public static bn J;
   
   public static bn dv;
   
   public static bq ag;
   
   public static bl cn;
   
   public static bl dh;
   
   public static bq au;
   
   public static bl m;
   
   public static bq aD;
   
   public static bl cR;
   
   public static bq bK;
   
   public static bl Y;
   
   public static bq Q;
   
   public static bq ao;
   
   public static bo dO;
   
   public static bl eC;
   
   public static bn ay;
   
   public static bq bg;
   
   public static bq aJ;
   
   public static bo dH;
   
   public static bq u;
   
   public static bq aK;
   
   public static bl j;
   
   public static bl dm;
   
   public static bq ab;
   
   public static bn dM;
   
   public static bn eT;
   
   private static boolean fk;
   
   public static bl R;
   
   public static bq ba;
   
   public static bl cX;
   
   public static bl dz;
   
   public static bl br;
   
   public static bq bu;
   
   public static bq y;
   
   public static bq aZ;
   
   public static bn cC;
   
   public static bn eR;
   
   public static bq aH;
   
   public static bl dl;
   
   public static bq bi;
   
   public static bq cB;
   
   public static bq ae;
   
   public static bl dP;
   
   public static bq bF;
   
   public static bl bH;
   
   public static bn cE;
   
   public static bl db;
   
   public static bl aa;
   
   public static bq am;
   
   public static bq cb;
   
   public static bl G;
   
   public static bq bC;
   
   public static bl bz;
   
   public static bl eo;
   
   public static bm dg;
   
   public static bl dE;
   
   public static bo ei;
   
   public static bn es;
   
   public static bq ca;
   
   public static bn ex;
   
   public static bn em;
   
   public static bl eF;
   
   public static bq cO;
   
   public static bl ez;
   
   public static bq cg;
   
   public static bq bo;
   
   public static bl C;
   
   public static bq Z;
   
   public static bl bL;
   
   public static bq T;
   
   public static bn en;
   
   private static boolean fj = a("*** Reflector Forge ***");
   
   public static bq l;
   
   public static bl ch;
   
   public static bq cu;
   
   public static bl ff;
   
   public static bn cs;
   
   public static bq aT;
   
   public static bn dt;
   
   public static bq bf;
   
   public static bq bx;
   
   public static bn bs;
   
   public static bq aV;
   
   public static bl cc;
   
   public static bl h;
   
   public static bn cQ;
   
   public static bo dA;
   
   public static bq aq;
   
   public static bq bv;
   
   public static bn eE;
   
   public static bq di;
   
   public static bl dN;
   
   public static bq eH;
   
   public static bq aF;
   
   public static bl A;
   
   public static bl ar;
   
   public static bn eY;
   
   public static bn eN;
   
   public static bl cw;
   
   public static bl cT;
   
   public static bl fb;
   
   public static bq bd;
   
   public static bl o;
   
   public static bl aB;
   
   public static bl df;
   
   public static bn eG;
   
   public static bq bw;
   
   public static bm ci;
   
   public static bn cU;
   
   public static bn ef;
   
   public static bq az;
   
   public static bq aC;
   
   public static bn dK;

   public static Object b(bm var0, Object... var1) {
      Constructor var2 = var0.a();
      if (var2 == null) {
         return null;
      } else {
         try {
            Object var3 = var2.newInstance(var1);
            return var3;
         } catch (Throwable var4) {
            a(var4, var0, var1);
            return null;
         }
      }
   }

   public static boolean b(bq var0, Object... var1) {
      try {
         Method var2 = var0.a();
         if (var2 == null) {
            return false;
         } else {
            Boolean var3 = (Boolean)var2.invoke((Object)null, var1);
            return var3;
         }
      } catch (Throwable var4) {
         a(var4, (Object)null, var0, var1);
         return false;
      }
   }

   private static Object[] a(Object[] var0) {
      if (var0 == null) {
         return new Class[0];
      } else {
         Class[] var1 = new Class[var0.length];

         for(int var2 = 0; var2 < var1.length; ++var2) {
            Object var3 = var0[var2];
            if (var3 != null) {
               var1[var2] = var3.getClass();
            }
         }

         return var1;
      }
   }

   public static void a(bq var0, Object... var1) {
      try {
         Method var2 = var0.a();
         if (var2 == null) {
            return;
         }

         var2.invoke((Object)null, var1);
      } catch (Throwable var3) {
         a(var3, (Object)null, var0, var1);
      }

   }

   public static boolean a(bm var0, Object... var1) {
      Object var2 = b(var0, var1);
      return var2 == null ? false : a(var2);
   }

   public static int c(bq var0, Object... var1) {
      try {
         Method var2 = var0.a();
         if (var2 == null) {
            return 0;
         } else {
            Integer var3 = (Integer)var2.invoke((Object)null, var1);
            return var3;
         }
      } catch (Throwable var4) {
         a(var4, (Object)null, var0, var1);
         return 0;
      }
   }

   public static void a(Object var0, bq var1, Object... var2) {
      try {
         if (var0 == null) {
            return;
         }

         Method var3 = var1.a();
         if (var3 == null) {
            return;
         }

         var3.invoke(var0, var2);
      } catch (Throwable var4) {
         a(var4, var0, var1, var2);
      }

   }

   public static boolean a(bn var0, Object var1) {
      return a((Object)null, (bn)var0, (Object)var1);
   }

   private static boolean a(String var0) {
      skid.gay.sex.spermix.inside.shalopay.j.q.a(var0);
      return true;
   }

   public static String e(bq var0, Object... var1) {
      try {
         Method var2 = var0.a();
         if (var2 == null) {
            return null;
         } else {
            String var3 = (String)var2.invoke((Object)null, var1);
            return var3;
         }
      } catch (Throwable var4) {
         a(var4, (Object)null, var0, var1);
         return null;
      }
   }

   public static Object a(Object var0, bo var1, int var2) {
      bn var3 = var1.a(var2);
      return var3 == null ? null : a(var0, var3);
   }

   public static boolean b(Object var0, bq var1, Object... var2) {
      try {
         Method var3 = var1.a();
         if (var3 == null) {
            return false;
         } else {
            Boolean var4 = (Boolean)var3.invoke(var0, var2);
            return var4;
         }
      } catch (Throwable var5) {
         a(var5, var0, var1, var2);
         return false;
      }
   }

   static {
      b = new bn(a, "DEFAULT_BAKED_FORMAT");
      c = new bl("mods.betterfoliage.client.BetterFoliageClient");
      d = new bl("net.minecraftforge.fml.common.asm.transformers.BlamingTransformer");
      e = new bq(d, "onCrash");
      f = new bl("net.minecraftforge.event.world.ChunkWatchEvent$UnWatch");
      g = new bm(f, new Class[]{ChunkPos.class, EntityPlayerMP.class});
      h = new bl("net.minecraftforge.fml.relauncher.CoreModManager");
      i = new bq(h, "onCrash");
      j = new bl("net.minecraftforge.common.DimensionManager");
      k = new bq(j, "createProviderFor");
      l = new bq(j, "getStaticDimensionIDs");
      m = new bl("net.minecraftforge.client.event.GuiScreenEvent$DrawScreenEvent$Pre");
      n = new bm(m, new Class[]{GuiScreen.class, Integer.TYPE, Integer.TYPE, Float.TYPE});
      o = new bl("net.minecraftforge.client.event.GuiScreenEvent$DrawScreenEvent$Post");
      p = new bm(o, new Class[]{GuiScreen.class, Integer.TYPE, Integer.TYPE, Float.TYPE});
      q = new bl("net.minecraftforge.client.event.EntityViewRenderEvent$CameraSetup");
      r = new bm(q, new Class[]{EntityRenderer.class, Entity.class, IBlockState.class, Double.TYPE, Float.TYPE, Float.TYPE, Float.TYPE});
      s = new bq(q, "getRoll");
      t = new bq(q, "getPitch");
      u = new bq(q, "getYaw");
      v = new bl("net.minecraftforge.client.event.EntityViewRenderEvent$FogColors");
      w = new bm(v, new Class[]{EntityRenderer.class, Entity.class, IBlockState.class, Double.TYPE, Float.TYPE, Float.TYPE, Float.TYPE});
      x = new bq(v, "getRed");
      y = new bq(v, "getGreen");
      z = new bq(v, "getBlue");
      A = new bl("net.minecraftforge.client.event.EntityViewRenderEvent$RenderFogEvent");
      B = new bm(A, new Class[]{EntityRenderer.class, Entity.class, IBlockState.class, Double.TYPE, Integer.TYPE, Float.TYPE});
      C = new bl("net.minecraftforge.fml.common.eventhandler.Event");
      D = new bq(C, "isCanceled");
      E = new bl("net.minecraftforge.fml.common.eventhandler.EventBus");
      F = new bq(E, "post");
      G = new bl("net.minecraftforge.fml.common.eventhandler.Event$Result");
      H = new bn(G, "DENY");
      I = new bn(G, "ALLOW");
      J = new bn(G, "DEFAULT");
      K = new bl("net.minecraftforge.common.property.ExtendedBlockState");
      L = new bm(K, new Class[]{Block.class, IProperty[].class, IUnlistedProperty[].class});
      M = new bl("net.minecraftforge.fml.client.FMLClientHandler");
      N = new bq(M, "instance");
      O = new bq(M, "isLoading");
      P = new bq(M, "trackBrokenTexture");
      Q = new bq(M, "trackMissingTexture");
      R = new bl("net.minecraftforge.fml.common.FMLCommonHandler");
      S = new bq(R, "callFuture");
      T = new bq(R, "enhanceCrashReport");
      U = new bq(R, "getBrandings");
      V = new bq(R, "handleServerAboutToStart");
      W = new bq(R, "handleServerStarting");
      X = new bq(R, "instance");
      Y = new bl(Biome.class);
      Z = new bq(Y, "getWaterColorMultiplier");
      aa = new bl(Block.class);
      ab = new bq(aa, "addDestroyEffects");
      ac = new bq(aa, "addHitEffects");
      ad = new bq(aa, "canCreatureSpawn");
      ae = new bq(aa, "canRenderInLayer", new Class[]{IBlockState.class, BlockRenderLayer.class});
      af = new bq(aa, "doesSideBlockRendering");
      ag = new bq(aa, "getBedDirection");
      ah = new bq(aa, "getExtendedState");
      ai = new bq(aa, "getFogColor");
      aj = new bq(aa, "getLightOpacity", new Class[]{IBlockState.class, IBlockAccess.class, BlockPos.class});
      ak = new bq(aa, "getLightValue", new Class[]{IBlockState.class, IBlockAccess.class, BlockPos.class});
      al = new bq(aa, "getSoundType", new Class[]{IBlockState.class, World.class, BlockPos.class, Entity.class});
      am = new bq(aa, "hasTileEntity", new Class[]{IBlockState.class});
      an = new bq(aa, "isAir");
      ao = new bq(aa, "isBed");
      ap = new bq(aa, "isBedFoot");
      aq = new bq(aa, "isSideSolid");
      ar = new bl(IBlockProperties.class);
      as = new bq(ar, "getLightValue", new Class[]{IBlockAccess.class, BlockPos.class});
      at = new bl(ChunkCache.class);
      au = new bq(at, "isSideSolid");
      av = new bl(Entity.class);
      aw = new bq(av, "canRiderInteract");
      ax = new bn(av, "captureDrops");
      ay = new bn(av, "capturedDrops");
      az = new bq(av, "shouldRenderInPass");
      aA = new bq(av, "shouldRiderSit");
      aB = new bl("net.minecraftforge.event.ForgeEventFactory");
      aC = new bq(aB, "canEntityDespawn");
      aD = new bq(aB, "renderBlockOverlay");
      aE = new bq(aB, "renderFireOverlay");
      aF = new bq(aB, "renderWaterOverlay");
      aG = new bl("net.minecraftforge.common.ForgeHooks");
      aH = new bq(aG, "onLivingAttack");
      aI = new bq(aG, "onLivingDeath");
      aJ = new bq(aG, "onLivingDrops");
      aK = new bq(aG, "onLivingFall");
      aL = new bq(aG, "onLivingHurt");
      aM = new bq(aG, "onLivingJump");
      aN = new bq(aG, "onLivingSetAttackTarget");
      aO = new bq(aG, "onLivingUpdate");
      aP = new bl("net.minecraftforge.client.ForgeHooksClient");
      aQ = new bq(aP, "applyTransform", new Class[]{skid.gay.sex.spermix.inside.shalopay.f.a.class, Optional.class});
      aR = new bq(aP, "applyUVLock");
      aS = new bq(aP, "dispatchRenderLast");
      aT = new bq(aP, "drawScreen");
      aU = new bq(aP, "fillNormal");
      aV = new bq(aP, "handleCameraTransforms");
      aW = new bq(aP, "getArmorModel");
      aX = new bq(aP, "getArmorTexture");
      aY = new bq(aP, "getFogDensity");
      aZ = new bq(aP, "getFOVModifier");
      ba = new bq(aP, "getMatrix", new Class[]{ModelRotation.class});
      bb = new bq(aP, "getOffsetFOV");
      bc = new bq(aP, "loadEntityShader");
      bd = new bq(aP, "onDrawBlockHighlight");
      be = new bq(aP, "onFogRender");
      bf = new bq(aP, "onScreenshot");
      bg = new bq(aP, "onTextureStitchedPre");
      bh = new bq(aP, "onTextureStitchedPost");
      bi = new bq(aP, "orientBedCamera");
      bj = new bq(aP, "putQuadColor");
      bk = new bq(aP, "renderFirstPersonHand");
      bl = new bq(aP, "renderMainMenu");
      bm = new bq(aP, "renderSpecificFirstPersonHand");
      bn = new bq(aP, "setRenderLayer");
      bo = new bq(aP, "setRenderPass");
      bp = new bq(aP, "shouldCauseReequipAnimation");
      bq = new bq(aP, "transform");
      br = new bl(Item.class);
      bs = new bn(br, "delegate");
      bt = new bq(br, "getDurabilityForDisplay");
      bu = new bq(br, "getRGBDurabilityForDisplay");
      bv = new bq(br, "isShield");
      bw = new bq(br, "onEntitySwing");
      bx = new bq(br, "shouldCauseReequipAnimation");
      by = new bq(br, "showDurabilityBar");
      bz = new bl(ItemOverrideList.class);
      bA = new bq(bz, "handleItemState");
      bB = new bl(ItemArmor.class);
      bC = new bq(bB, "hasOverlay");
      bD = new bl(KeyBinding.class);
      bE = new bq(bD, "setKeyConflictContext");
      bF = new bq(bD, "setKeyModifierAndCode");
      bG = new bq(bD, "getKeyModifier");
      bH = new bl("net.minecraftforge.common.ForgeModContainer");
      bI = new bn(bH, "forgeLightPipelineEnabled");
      bJ = new bl(ModelBlockDefinition.class);
      bK = new bq(bJ, "parseFromReader", new Class[]{Reader.class, ResourceLocation.class});
      bL = new bl(Potion.class);
      bM = bL.a("shouldRenderHUD");
      bN = bL.a("renderHUDEffect");
      bO = new bl(PotionEffect.class);
      bP = new bq(bO, "isCurativeItem");
      bQ = new bl(TileEntity.class);
      bR = new bq(bQ, "canRenderBreaking");
      bS = new bq(bQ, "getRenderBoundingBox");
      bT = new bq(bQ, "hasFastRenderer");
      bU = new bq(bQ, "shouldRenderInPass");
      bV = new bl(VertexFormatElement$EnumUsage.class);
      bW = new bq(bV, "preDraw");
      bX = new bq(bV, "postDraw");
      bY = new bl(World.class);
      bZ = new bq(bY, "countEntities", new Class[]{EnumCreatureType.class, Boolean.TYPE});
      ca = new bq(bY, "getPerWorldStorage");
      cb = new bq(bY, "initCapabilities");
      cc = new bl(WorldProvider.class);
      cd = new bq(cc, "getCloudRenderer");
      ce = new bq(cc, "getSkyRenderer");
      cf = new bq(cc, "getWeatherRenderer");
      cg = new bq(cc, "getLightmapColors");
      ch = new bl("net.minecraftforge.fml.client.GuiModList");
      ci = new bm(ch, new Class[]{GuiScreen.class});
      cj = new bl("net.minecraftforge.common.property.IExtendedBlockState");
      ck = new bq(cj, "getClean");
      cl = new bl("net.minecraftforge.client.model.IModel");
      cm = new bq(cl, "getTextures");
      cn = new bl("net.minecraftforge.client.IRenderHandler");
      co = new bq(cn, "render");
      cp = new bl("net.minecraftforge.client.ItemModelMesherForge");
      cq = new bm(cp, new Class[]{ModelManager.class});
      cr = new bl("net.minecraftforge.client.settings.KeyConflictContext");
      cs = new bn(cr, "IN_GAME");
      ct = new bl("net.minecraftforge.client.settings.KeyModifier");
      cu = new bq(ct, "valueFromString");
      cv = new bn(ct, "NONE");
      cw = new bl("net.minecraft.launchwrapper.Launch");
      cx = new bn(cw, "blackboard");
      cy = new bl("net.minecraftforge.client.model.pipeline.LightUtil");
      cz = new bn(cy, "itemConsumer");
      cA = new bq(cy, "putBakedQuad");
      cB = new bq(cy, "renderQuadColor");
      cC = new bn(cy, "tessellator");
      cD = new bl("net.minecraftforge.common.MinecraftForge");
      cE = new bn(cD, "EVENT_BUS");
      cF = new bl("net.minecraftforge.client.MinecraftForgeClient");
      cG = new bq(cF, "getRenderPass");
      cH = new bq(cF, "onRebuildChunk");
      cI = new bl("net.minecraftforge.client.model.ModelLoader");
      cJ = new bn(cI, "stateModels");
      cK = new bq(cI, "onRegisterItems");
      cL = new bq(cI, "getInventoryVariant");
      cM = new bl("net.minecraftforge.client.model.ModelLoader$VanillaLoader", true);
      cN = new bn(cM, "INSTANCE", true);
      cO = new bq(cM, "loadModel", (Class[])null, true);
      cP = new bl("net.minecraftforge.client.model.ModelLoaderRegistry", true);
      cQ = new bn(cP, "textures", true);
      cR = new bl("net.minecraftforge.client.gui.NotificationModUpdateScreen");
      cS = new bq(cR, "init");
      cT = new bl("net.minecraftforge.client.event.RenderBlockOverlayEvent$OverlayType");
      cU = new bn(cT, "BLOCK");
      cV = new bl("net.minecraftforge.fml.client.registry.RenderingRegistry");
      cW = new bq(cV, "loadEntityRenderers", new Class[]{RenderManager.class, Map.class});
      cX = new bl("net.minecraftforge.client.event.RenderItemInFrameEvent");
      cY = new bm(cX, new Class[]{EntityItemFrame.class, RenderItemFrame.class});
      cZ = new bl("net.minecraftforge.client.event.RenderLivingEvent$Pre");
      da = new bm(cZ, new Class[]{EntityLivingBase.class, RenderLivingBase.class, Float.TYPE, Double.TYPE, Double.TYPE, Double.TYPE});
      db = new bl("net.minecraftforge.client.event.RenderLivingEvent$Post");
      dc = new bm(db, new Class[]{EntityLivingBase.class, RenderLivingBase.class, Float.TYPE, Double.TYPE, Double.TYPE, Double.TYPE});
      dd = new bl("net.minecraftforge.client.event.RenderLivingEvent$Specials$Pre");
      de = new bm(dd, new Class[]{EntityLivingBase.class, RenderLivingBase.class, Double.TYPE, Double.TYPE, Double.TYPE});
      df = new bl("net.minecraftforge.client.event.RenderLivingEvent$Specials$Post");
      dg = new bm(df, new Class[]{EntityLivingBase.class, RenderLivingBase.class, Double.TYPE, Double.TYPE, Double.TYPE});
      dh = new bl("net.minecraftforge.client.event.ScreenshotEvent");
      di = new bq(dh, "getCancelMessage");
      dj = new bq(dh, "getScreenshotFile");
      dk = new bq(dh, "getResultMessage");
      dl = new bl("net.minecraftforge.fml.client.SplashProgress");
      dm = new bl("net.minecraftforge.event.world.WorldEvent$Load");
      dn = new bm(dm, new Class[]{World.class});
      fk = a("*** Reflector Vanilla ***");
      do = new bl(ChunkProviderClient.class);
      dp = new bn(do, Long2ObjectMap.class);
      dq = new bl(GuiMainMenu.class);
      dr = new bn(dq, String.class);
      ds = new bl(LegacyV2Adapter.class);
      dt = new bn(ds, IResourcePack.class);
      du = new bl(Minecraft.class);
      dv = new bn(du, DefaultResourcePack.class);
      dw = new bn(new X());
      dx = new bl(ModelHumanoidHead.class);
      dy = new bn(dx, ModelRenderer.class);
      dz = new bl(ModelBat.class);
      dA = new bo(dz, ModelRenderer.class, 6);
      dB = new bl(ModelBlaze.class);
      dC = new bn(dB, ModelRenderer.class);
      dD = new bn(dB, ModelRenderer[].class);
      dE = new bl(ModelDragon.class);
      dF = new bo(dE, ModelRenderer.class, 12);
      dG = new bl(ModelEnderCrystal.class);
      dH = new bo(dG, ModelRenderer.class, 3);
      dI = new bl(RenderEnderCrystal.class);
      dJ = new bn(dI, ModelBase.class, 0);
      dK = new bn(dI, ModelBase.class, 1);
      dL = new bl(ModelEnderMite.class);
      dM = new bn(dL, ModelRenderer[].class);
      dN = new bl(ModelEvokerFangs.class);
      dO = new bo(dN, ModelRenderer.class, 3);
      dP = new bl(ModelGhast.class);
      dQ = new bn(dP, ModelRenderer.class);
      dR = new bn(dP, ModelRenderer[].class);
      dS = new bl(ModelGuardian.class);
      dT = new bn(dS, ModelRenderer.class, 0);
      dU = new bn(dS, ModelRenderer.class, 1);
      dV = new bn(dS, ModelRenderer[].class, 0);
      dW = new bn(dS, ModelRenderer[].class, 1);
      dX = new bl(ModelDragonHead.class);
      dY = new bn(dX, ModelRenderer.class, 0);
      dZ = new bn(dX, ModelRenderer.class, 1);
      ea = new bl(ModelHorse.class);
      eb = new bo(ea, ModelRenderer.class, 39);
      ec = new bl(RenderLeashKnot.class);
      ed = new bn(ec, ModelLeashKnot.class);
      ee = new bl(ModelMagmaCube.class);
      ef = new bn(ee, ModelRenderer.class);
      eg = new bn(ee, ModelRenderer[].class);
      eh = new bl(ModelOcelot.class);
      ei = new bo(eh, ModelRenderer.class, 8);
      ej = new bl(ModelRabbit.class);
      ek = new bo(ej, ModelRenderer.class, 12);
      el = new bl(ModelSilverfish.class);
      em = new bn(el, ModelRenderer[].class, 0);
      en = new bn(el, ModelRenderer[].class, 1);
      eo = new bl(ModelSlime.class);
      ep = new bo(eo, ModelRenderer.class, 4);
      eq = new bl(ModelSquid.class);
      er = new bn(eq, ModelRenderer.class);
      es = new bn(eq, ModelRenderer[].class);
      et = new bl(ModelVex.class);
      eu = new bn(et, ModelRenderer.class, 0);
      ev = new bn(et, ModelRenderer.class, 1);
      ew = new bl(ModelWitch.class);
      ex = new bn(ew, ModelRenderer.class, 0);
      ey = new bn(ew, ModelRenderer.class, 1);
      ez = new bl(ModelWither.class);
      eA = new bn(ez, ModelRenderer[].class, 0);
      eB = new bn(ez, ModelRenderer[].class, 1);
      eC = new bl(ModelWolf.class);
      eD = new bn(eC, ModelRenderer.class, 6);
      eE = new bn(eC, ModelRenderer.class, 7);
      eF = new bl("optifine.OptiFineClassTransformer");
      eG = new bn(eF, "instance");
      eH = new bq(eF, "getOptiFineResource");
      eI = new bl(RenderBoat.class);
      eJ = new bn(eI, ModelBase.class);
      eK = new bl(RenderEvokerFangs.class);
      eL = new bn(eK, ModelEvokerFangs.class);
      eM = new bl(RenderMinecart.class);
      eN = new bn(eM, ModelBase.class);
      eO = new bl(RenderShulkerBullet.class);
      eP = new bn(eO, ModelShulkerBullet.class);
      eQ = new bl(RenderWitherSkull.class);
      eR = new bn(eQ, ModelSkeletonHead.class);
      eS = new bl(TileEntityBannerRenderer.class);
      eT = new bn(eS, ModelBanner.class);
      eU = new bl(TileEntityChestRenderer.class);
      eV = new bn(eU, ModelChest.class, 0);
      eW = new bn(eU, ModelChest.class, 1);
      eX = new bl(TileEntityEnchantmentTableRenderer.class);
      eY = new bn(eX, ModelBook.class);
      eZ = new bl(TileEntityEnderChestRenderer.class);
      fa = new bn(eZ, ModelChest.class);
      fb = new bl(TileEntityShulkerBoxRenderer.class);
      fc = new bn(fb, ModelShulker.class);
      fd = new bl(TileEntitySignRenderer.class);
      fe = new bn(fd, ModelSign.class);
      ff = new bl(TileEntitySkullRenderer.class);
      fg = new bn(ff, ModelDragonHead.class, 0);
      fh = new bn(ff, ModelSkeletonHead.class, 0);
      fi = new bn(ff, ModelSkeletonHead.class, 1);
   }

   private static void a(Throwable var0, bm var1, Object[] var2) {
      if (var0 instanceof InvocationTargetException) {
         var0.printStackTrace();
      } else {
         if (var0 instanceof IllegalArgumentException) {
            skid.gay.sex.spermix.inside.shalopay.j.q.b("*** IllegalArgumentException ***");
            skid.gay.sex.spermix.inside.shalopay.j.q.b(String.valueOf((new StringBuilder("Constructor: ")).append(var1.a())));
            skid.gay.sex.spermix.inside.shalopay.j.q.b(String.valueOf((new StringBuilder("Parameter classes: ")).append(skid.gay.sex.spermix.inside.shalopay.j.q.a(a(var2)))));
            skid.gay.sex.spermix.inside.shalopay.j.q.b(String.valueOf((new StringBuilder("Parameters: ")).append(skid.gay.sex.spermix.inside.shalopay.j.q.a(var2))));
         }

         skid.gay.sex.spermix.inside.shalopay.j.q.b("*** Exception outside of constructor ***");
         skid.gay.sex.spermix.inside.shalopay.j.q.b(String.valueOf((new StringBuilder("Constructor deactivated: ")).append(var1.a())));
         var1.c();
         var0.printStackTrace();
      }

   }

   public static int c(Object var0, bq var1, Object... var2) {
      try {
         Method var3 = var1.a();
         if (var3 == null) {
            return 0;
         } else {
            Integer var4 = (Integer)var3.invoke(var0, var2);
            return var4;
         }
      } catch (Throwable var5) {
         a(var5, var0, var1, var2);
         return 0;
      }
   }

   public static boolean a(Object var0, bn var1, Object var2) {
      try {
         Field var3 = var1.a();
         if (var3 == null) {
            return false;
         } else {
            var3.set(var0, var2);
            return true;
         }
      } catch (Throwable var4) {
         var4.printStackTrace();
         return false;
      }
   }

   public static double e(Object var0, bq var1, Object... var2) {
      try {
         Method var3 = var1.a();
         if (var3 == null) {
            return 0.0D;
         } else {
            Double var4 = (Double)var3.invoke(var0, var2);
            return var4;
         }
      } catch (Throwable var5) {
         a(var5, var0, var1, var2);
         return 0.0D;
      }
   }

   public static boolean a(Object var0) {
      if (var0 == null) {
         return false;
      } else {
         Object var1 = a(cE);
         if (var1 == null) {
            return false;
         } else {
            Object var2 = g(var1, F, var0);
            if (!(var2 instanceof Boolean)) {
               return false;
            } else {
               Boolean var3 = (Boolean)var2;
               return var3;
            }
         }
      }
   }

   public static boolean a(Class[] var0, Class[] var1) {
      if (var0.length != var1.length) {
         return false;
      } else {
         for(int var2 = 0; var2 < var1.length; ++var2) {
            Class var3 = var0[var2];
            Class var4 = var1[var2];
            if (var3 != var4) {
               return false;
            }
         }

         return true;
      }
   }

   public static float d(Object var0, bq var1, Object... var2) {
      try {
         Method var3 = var1.a();
         if (var3 == null) {
            return 0.0F;
         } else {
            Float var4 = (Float)var3.invoke(var0, var2);
            return var4;
         }
      } catch (Throwable var5) {
         a(var5, var0, var1, var2);
         return 0.0F;
      }
   }

   public static Object f(bq var0, Object... var1) {
      try {
         Method var2 = var0.a();
         if (var2 == null) {
            return null;
         } else {
            Object var3 = var2.invoke((Object)null, var1);
            return var3;
         }
      } catch (Throwable var4) {
         a(var4, (Object)null, var0, var1);
         return null;
      }
   }

   public static Object a(Object var0, bn var1) {
      try {
         Field var2 = var1.a();
         if (var2 == null) {
            return null;
         } else {
            Object var3 = var2.get(var0);
            return var3;
         }
      } catch (Throwable var4) {
         var4.printStackTrace();
         return null;
      }
   }

   public static String f(Object var0, bq var1, Object... var2) {
      try {
         Method var3 = var1.a();
         if (var3 == null) {
            return null;
         } else {
            String var4 = (String)var3.invoke(var0, var2);
            return var4;
         }
      } catch (Throwable var5) {
         a(var5, var0, var1, var2);
         return null;
      }
   }

   public static float d(bq var0, Object... var1) {
      try {
         Method var2 = var0.a();
         if (var2 == null) {
            return 0.0F;
         } else {
            Float var3 = (Float)var2.invoke((Object)null, var1);
            return var3;
         }
      } catch (Throwable var4) {
         a(var4, (Object)null, var0, var1);
         return 0.0F;
      }
   }

   public static Object a(bn var0) {
      return a((Object)null, (bn)var0);
   }

   private static void a(Throwable var0, Object var1, bq var2, Object[] var3) {
      if (var0 instanceof InvocationTargetException) {
         Throwable var4 = var0.getCause();
         if (var4 instanceof RuntimeException) {
            RuntimeException var5 = (RuntimeException)var4;
            throw var5;
         }

         var0.printStackTrace();
      } else {
         if (var0 instanceof IllegalArgumentException) {
            skid.gay.sex.spermix.inside.shalopay.j.q.b("*** IllegalArgumentException ***");
            skid.gay.sex.spermix.inside.shalopay.j.q.b(String.valueOf((new StringBuilder("Method: ")).append(var2.a())));
            skid.gay.sex.spermix.inside.shalopay.j.q.b(String.valueOf((new StringBuilder("Object: ")).append(var1)));
            skid.gay.sex.spermix.inside.shalopay.j.q.b(String.valueOf((new StringBuilder("Parameter classes: ")).append(skid.gay.sex.spermix.inside.shalopay.j.q.a(a(var3)))));
            skid.gay.sex.spermix.inside.shalopay.j.q.b(String.valueOf((new StringBuilder("Parameters: ")).append(skid.gay.sex.spermix.inside.shalopay.j.q.a(var3))));
         }

         skid.gay.sex.spermix.inside.shalopay.j.q.b("*** Exception outside of method ***");
         skid.gay.sex.spermix.inside.shalopay.j.q.b(String.valueOf((new StringBuilder("Method deactivated: ")).append(var2.a())));
         var2.d();
         var0.printStackTrace();
      }

   }

   public static Object g(Object var0, bq var1, Object... var2) {
      try {
         Method var3 = var1.a();
         if (var3 == null) {
            return null;
         } else {
            Object var4 = var3.invoke(var0, var2);
            return var4;
         }
      } catch (Throwable var5) {
         a(var5, var0, var1, var2);
         return null;
      }
   }
}
