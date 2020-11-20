package skid.gay.sex.spermix.inside.shalopay.k;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.nio.ByteBuffer;
import java.nio.FloatBuffer;
import java.nio.IntBuffer;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.IdentityHashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Properties;
import java.util.Set;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import skid.gay.sex.spermix.inside.shalopay.j.aH;
import skid.gay.sex.spermix.inside.shalopay.j.bd;
import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.client.Minecraft;
import net.minecraft.client.model.ModelBase;
import net.minecraft.client.model.ModelRenderer;
import net.minecraft.client.renderer.BufferBuilder;
import net.minecraft.client.renderer.EntityRenderer;
import net.minecraft.client.renderer.GlStateManager;
import net.minecraft.client.renderer.GlStateManager$FogMode;
import net.minecraft.client.renderer.OpenGlHelper;
import net.minecraft.client.renderer.RenderHelper;
import net.minecraft.client.renderer.Tessellator;
import net.minecraft.client.renderer.entity.Render;
import net.minecraft.client.renderer.entity.RenderLiving;
import net.minecraft.client.renderer.texture.ITextureObject;
import net.minecraft.client.renderer.vertex.DefaultVertexFormats;
import net.minecraft.client.settings.GameSettings;
import net.minecraft.entity.Entity;
import net.minecraft.entity.EntityLivingBase;
import net.minecraft.init.MobEffects;
import net.minecraft.item.Item;
import net.minecraft.item.ItemBlock;
import net.minecraft.item.ItemStack;
import net.minecraft.tileentity.TileEntity;
import net.minecraft.util.BlockRenderLayer;
import net.minecraft.util.EnumHand;
import net.minecraft.util.ResourceLocation;
import net.minecraft.util.math.Vec3d;
import net.minecraft.util.text.TextComponentString;
import net.minecraft.world.World;
import org.apache.commons.io.IOUtils;
import org.lwjgl.BufferUtils;
import org.lwjgl.opengl.ARBShaderObjects;
import org.lwjgl.opengl.ARBVertexShader;
import org.lwjgl.opengl.ContextCapabilities;
import org.lwjgl.opengl.EXTFramebufferObject;
import org.lwjgl.opengl.GL11;
import org.lwjgl.opengl.GL20;
import org.lwjgl.opengl.GL30;
import org.lwjgl.opengl.GLContext;
import org.lwjgl.util.glu.GLU;
import skid.gay.sex.spermix.inside.shalopay.shaders.Shaders;

public class V {
   
   public static boolean v = false;
   
   public static int aE = 0;
   
   static float aa = 0.0F;
   
   public static Properties bp = null;
   
   static float aY = -1.0F;
   
   static float K;
   
   public static int m = 0;
   
   private static int dv = 0;
   
   static float[] x = new float[4];
   
   static final FloatBuffer cY = c(16);
   
   static float am = 1.0F;
   
   public static int av = 11;
   
   static long T = 0L;
   
   static final FloatBuffer cV = c(16);
   
   public static int[] dt = new int[32];
   
   public static float ab = 600.0F;
   
   private static int[] eg;
   
   static int aR = 1024;
   
   public static float cD;
   
   public static boolean ax = false;
   
   public static boolean bL = true;
   
   public static float cz = 0.0F;
   
   static Q[] cf = null;
   
   public static int bH = 0;
   
   static float P = 0.0F;
   
   public static t ch = new t("clouds", "Clouds", 0);
   
   public static float cu = 0.5F;
   
   static final FloatBuffer cX = c(16);
   
   static final float[] cM = new float[16];
   
   public static S aG = new S("entityColor");
   
   public static u cn = new u("sun", "Sun", 0);
   
   public static u cm = new u("underwaterOverlay", "Underwater Overlay", 0);
   
   static final float[] cN = new float[16];
   
   public static boolean c = false;
   
   static final float[] cL = new float[16];
   
   static float[] A = new float[4];
   
   static float O = 0.0F;
   
   public static u cj = new u("oldHandLight", "Old Hand Light", 0);
   
   public static String g;
   
   private static Map dR = new HashMap();
   
   private static final boolean dY = System.getProperty("shaders.debug.save", "false").equals("true");
   
   static final FloatBuffer db = c(16);
   
   static long N = 0L;
   
   static Minecraft a;
   
   private static d[] dU = null;
   
   public static boolean aD = false;
   
   static final int[] cJ = new int[]{0, 1, 2, 3, 7, 8, 9, 10};
   
   static final FloatBuffer cW = c(16);
   
   static File cc;
   
   static int aU = 1024;
   
   static float[] z = new float[4];
   
   static float H;
   
   public static float bA = 0.125F;
   
   private static final int[] ee = new int[]{33321, 33323, 32849, 32856, 36756, 36757, 36758, 36759, 33322, 33324, 32852, 32859, 36760, 36761, 36762, 36763, 33325, 33327, 34843, 34842, 33326, 33328, 34837, 34836, 33333, 33339, 36227, 36226, 33334, 33340, 36209, 36208, 10768, 32855, 32857, 35898, 35901};
   
   static final FloatBuffer dc = c(16);
   
   public static boolean aB = false;
   
   private static boolean dx;
   
   private static d[] dV = null;
   
   static float aj = 0.0F;
   
   private static boolean[] dE = new boolean[8];
   
   static EntityRenderer b;
   
   public static int bE = 0;
   
   private static m dZ;
   
   static String bY = "shaderpacks";
   
   public static u cq = new u("backFace.solid", "Back-face Solid", 0);
   
   static int bi = 0;
   
   static double aN;
   
   static int ao = 1;
   
   static final FloatBuffer cZ = c(16);
   
   static B[] cd = null;
   
   static final IntBuffer dk = b(8);
   
   public static float cC;
   
   static IntBuffer[] bn = new IntBuffer[33];
   
   public static boolean r = false;
   
   static final float[] cR = new float[16];
   
   static final IntBuffer[] dr = b(33, 8);
   
   public static boolean az = false;
   
   private static String dM = null;
   
   static double aO;
   
   public static boolean bJ = true;
   
   private static final int[] dG = new int[]{0, 0, 1, 2, 1, 2, 2, 3, 7, 7, 7, 7, 7, 7, 2, 3, 3, 2, 2, 3, 3, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 30, 30};
   
   static float[] B = new float[4];
   
   static float al = 0.0F;
   
   static final IntBuffer dq = b(8);
   
   public static u cp = new u("vignette", "Vignette", 0);
   
   static int aZ = 0;
   
   public static int cA = 0;
   
   static float ak = 0.0F;
   
   public static int du = 0;
   
   public static boolean t;
   
   private static String dN = null;
   
   static double aJ;
   
   private static String[] dJ = new String[33];
   
   public static boolean d = false;
   
   public static boolean bU = false;
   
   static String bV;
   
   public static boolean by = false;
   
   public static boolean bb = false;
   
   public static int bD = 0;
   
   private static String dK = null;
   
   public static boolean p = false;
   
   public static boolean w = false;
   
   private static int dQ = 0;
   
   private static int dP = 0;
   
   private static boolean dA;
   
   public static boolean[] bx = new boolean[8];
   
   static float aV = 90.0F;
   
   public static final int[] bR = new int[]{9728, 9984, 9986};
   
   public static boolean aA = false;
   
   static final FloatBuffer cT = c(16);
   
   private static int dw = 0;
   
   static float aW = 160.0F;
   
   static final IntBuffer do = b(8);
   
   private static boolean dz;
   
   public static boolean aC = false;
   
   static float Q = 0.0F;
   
   static double aL;
   
   public static boolean o = false;
   
   static float G;
   
   public static Properties bq = null;
   
   static float aq = 0.0F;
   
   public static final String[] bP = new String[]{"Nearest", "Nearest-Nearest", "Nearest-Linear"};
   
   static int be = 0;
   
   static float ah = 0.0F;
   
   static Set ce = null;
   
   static File ca;
   
   static int ag = 0;
   
   static int bk = 0;
   
   static int V = 0;
   
   static long S = 0L;
   
   public static int au = 10;
   
   static final FloatBuffer da = c(16);
   
   static double aM;
   
   static final IntBuffer dn = b(8);
   
   private static String[] dL = new String[33];
   
   static final float[] cQ = new float[16];
   
   static int R = 0;
   
   public static float cE = 2.0F;
   
   public static float cB;
   
   public static float cx = -1.0F;
   
   static float ap = 0.0F;
   
   static int bf = 0;
   
   static final float[] cP = new float[16];
   
   static Map ds;
   
   static final int[] cH = new int[16];
   
   static final IntBuffer dh = b(8);
   
   static final int[] cI = new int[8];
   
   static final float[] cO = new float[16];
   
   static float[] E = new float[]{0.0F, -100.0F, 0.0F, 0.0F};
   
   static boolean aX = true;
   
   static long L = 0L;
   
   static final IntBuffer dg = b(3);
   
   static float ai = 0.0F;
   
   static boolean bc = false;
   
   private static final Pattern ef = Pattern.compile("\\s*([\\w:]+)\\s*=\\s*([-]?\\d+)\\s*");
   
   public static String h;
   
   static double aK;
   
   static final IntBuffer dj = b(8);
   
   static final boolean[][] cK = new boolean[33][8];
   
   static boolean ae = false;
   
   private static boolean dB;
   
   public static int aF = 0;
   
   static boolean as = false;
   
   static File cb;
   
   private static int eb = 256;
   
   public static ContextCapabilities e;
   
   static final IntBuffer dp = b(8);
   
   private static int[] eh;
   
   static final FloatBuffer cU = c(16);
   
   public static int k = 0;
   
   public static int aw = 12;
   
   public static boolean[] bw = new boolean[8];
   
   public static boolean j = false;
   
   private static int[] dO = new int[33];
   
   public static int n = 0;
   
   private static final String[] dX = new String[]{"gbuffers", "composite"};
   
   public static u co = new u("moon", "Moon", 0);
   
   static float[] D = new float[]{0.0F, 100.0F, 0.0F, 0.0F};
   
   public static u bM = new u("oldLighting", "Classic Lighting", 0);
   
   public static boolean[] bu = new boolean[2];
   
   static final FloatBuffer dd = c(16);
   
   public static u ck = new u("dynamicHandLight", "Dynamic Hand Light", 0);
   
   static Map cg = null;
   
   public static boolean bs = false;
   
   public static float ad = 10.0F;
   
   public static int bF = 0;
   
   public static float bB = 1.0F;
   
   private static boolean dy;
   
   static String bX = "(internal)";
   
   static n bT = null;
   
   public static boolean s = false;
   
   static final IntBuffer dm = b(8);
   
   public static float cw = 0.8F;
   
   static int aS = 1024;
   
   public static u cs = new u("backFace.cutoutMipped", "Back-face Cutout Mipped", 0);
   
   static float I;
   
   public static final int[] bS = new int[]{9728, 9729};
   
   static int bd = 0;
   
   private static String dW = null;
   
   public static final String[] bQ = new String[]{"Nearest", "Linear"};
   
   public static float bC = 1.0F;
   
   public static boolean q = false;
   
   public static T aI = new T("blockEntityId");
   
   static boolean an = false;
   
   static float X = 0.0F;
   
   public static boolean u = false;
   
   private static int dI = 0;
   
   public static ITextureObject br = null;
   
   static final FloatBuffer de = c(16);
   
   static float W = 0.0F;
   
   static final float[] cS = new float[16];
   
   public static u bN = new u("oldHandLight", "Old Hand Light", 0);
   
   static int af = 0;
   
   public static boolean[] bt = new boolean[2];
   
   private static final ByteBuffer ec = (ByteBuffer)BufferUtils.createByteBuffer(2196).limit(0);
   
   static float Z = 0.0F;
   
   public static String f;
   
   private static int[] dH = new int[33];
   
   public static float ac = 200.0F;
   
   static boolean ar = false;
   
   public static boolean[] bv = new boolean[2];
   
   public static int bl = 0;
   
   private static World dS = null;
   
   static int ba;
   
   public static u ci = new u("oldLighting", "Classic Lighting", 0);
   
   static final IntBuffer dl = b(8);
   
   static int bg = 0;
   
   public static int[] cG = new int[2];
   
   public static u cr = new u("backFace.cutout", "Back-face Cutout", 0);
   
   static int aT = 1024;
   
   public static boolean ay = false;
   
   public static float cv = 0.6F;
   
   public static boolean bK = true;
   
   public static T aH = new T("entityId");
   
   public static int bG = 0;
   
   static boolean at = true;
   
   static float[] C = new float[]{0.0F, 100.0F, 0.0F, 0.0F};
   
   public static boolean i = false;
   
   static float F;
   
   public static int bO = 0;
   
   static int bj = 0;
   
   static long U = 0L;
   
   static int aP = 0;
   
   public static u cl = new u("shadowTranslucent", "Shadow Translucent", 0);
   
   public static boolean bz = false;
   
   private static List dT = new ArrayList();
   
   static boolean l = false;
   
   static float[] y = new float[4];
   
   static final IntBuffer df = b(16);
   
   private static final String[] ed = new String[]{"R8", "RG8", "RGB8", "RGBA8", "R8_SNORM", "RG8_SNORM", "RGB8_SNORM", "RGBA8_SNORM", "R16", "RG16", "RGB16", "RGBA16", "R16_SNORM", "RG16_SNORM", "RGB16_SNORM", "RGBA16_SNORM", "R16F", "RG16F", "RGB16F", "RGBA16F", "R32F", "RG32F", "RGB32F", "RGBA32F", "R32I", "RG32I", "RGB32I", "RGBA32I", "R32UI", "RG32UI", "RGB32UI", "RGBA32UI", "R3_G3_B2", "RGB5_A1", "RGB10_A2", "R11F_G11F_B10F", "RGB9_E5"};
   
   public static int bI = 0;
   
   public static String bW = "OFF";
   
   static final IntBuffer di = b(2);
   
   static int Y = 0;
   
   static IntBuffer bo = null;
   
   static String bZ = "optionsshaders.txt";
   
   public static u ct = new u("backFace.translucent", "Back-face Translucent", 0);
   
   static int bh = 0;
   
   public static boolean aQ = false;
   
   static long M = 0L;
   
   public static int cF = 16;
   
   private static boolean ea = false;
   
   static int[] bm = new int[33];
   
   private static int[] dD = new int[8];
   
   static float J;
   
   private static final String[] dF = new String[]{"", "gbuffers_basic", "gbuffers_textured", "gbuffers_textured_lit", "gbuffers_skybasic", "gbuffers_skytextured", "gbuffers_clouds", "gbuffers_terrain", "gbuffers_terrain_solid", "gbuffers_terrain_cutout_mip", "gbuffers_terrain_cutout", "gbuffers_damagedblock", "gbuffers_water", "gbuffers_block", "gbuffers_beaconbeam", "gbuffers_item", "gbuffers_entities", "gbuffers_armor_glint", "gbuffers_spidereyes", "gbuffers_hand", "gbuffers_weather", "composite", "composite1", "composite2", "composite3", "composite4", "composite5", "composite6", "composite7", "final", "shadow", "shadow_solid", "shadow_cutout"};
   
   public static float cy = 0.0F;
   
   private static float[] dC = new float[16];

   public static void t() {
      dw = 0;
   }

   public static B[] b(String var0) {
      B[] var1 = (B[])cd.clone();
      if (cg == null) {
         if (cf != null) {
            C var9 = new C(cf, var1);
            var1 = (B[]) skid.gay.sex.spermix.inside.shalopay.j.q.a(var1, var9, 0);
         }

         var1 = b(var1);
         return var1;
      } else {
         String var2 = var0 != null ? String.valueOf((new StringBuilder("screen.")).append(var0)) : "screen";
         y var3 = (y)cg.get(var2);
         if (var3 == null) {
            return new B[0];
         } else {
            B[] var4 = var3.a();
            ArrayList var5 = new ArrayList();

            for(int var6 = 0; var6 < var4.length; ++var6) {
               B var7 = var4[var6];
               if (var7 == null) {
                  var5.add((Object)null);
               } else if (var7 instanceof D) {
                  B[] var8 = a(cg, var1);
                  var5.addAll(Arrays.asList(var8));
               } else {
                  var5.add(var7);
               }
            }

            B[] var10 = (B[])var5.toArray(new B[var5.size()]);
            return var10;
         }
      }
   }

   public static B[] a(B[] var0) {
      ArrayList var1 = new ArrayList();

      for(int var2 = 0; var2 < var0.length; ++var2) {
         B var3 = var0[var2];
         if (var3.j() && var3.k()) {
            var1.add(var3);
         }
      }

      B[] var4 = (B[])var1.toArray(new B[var1.size()]);
      return var4;
   }

   public static void a(int var0, int var1, int var2, int var3) {
      GlStateManager.colorMask(true, true, true, true);
      if (s) {
         GL11.glViewport(0, 0, aR, aS);
      } else {
         GL11.glViewport(0, 0, m, n);
         EXTFramebufferObject.glBindFramebufferEXT(36160, bj);
         r = true;
         GlStateManager.enableCull();
         GlStateManager.enableDepth();
         a(dl);
         a(2);
         e("beginRenderPass");
      }

   }

   public static void F() {
      y();
      GL11.glColor3f(cB, cC, cD);
      E();
      GL11.glColor3f(I, J, K);
   }

   public static void z() {
      if (i) {
         for(int var0 = 0; var0 < bd; ++var0) {
            if ((dQ & 1 << var0) != 0) {
               GlStateManager.setActiveTexture('蓀' + cJ[var0]);
               GL11.glTexParameteri(3553, 10241, 9987);
               GL30.glGenerateMipmap(3553);
            }
         }

         GlStateManager.setActiveTexture(33984);
      }

   }

   public static boolean m() {
      return !cn.h();
   }

   public static void b(float var0) {
      Entity var1 = a.getRenderViewEntity();
      double var2 = var1.lastTickPosX + (var1.posX - var1.lastTickPosX) * (double)var0;
      double var4 = var1.lastTickPosY + (var1.posY - var1.lastTickPosY) * (double)var0;
      double var6 = var1.lastTickPosZ + (var1.posZ - var1.lastTickPosZ) * (double)var0;
      aM = var2;
      aN = var4;
      aO = var6;
      GL11.glGetFloat(2983, (FloatBuffer)cT.position(0));
      skid.gay.sex.spermix.inside.shalopay.k.v.a((FloatBuffer)cU.position(0), (FloatBuffer)cT.position(0), cM, cL);
      cT.position(0);
      cU.position(0);
      GL11.glGetFloat(2982, (FloatBuffer)cV.position(0));
      skid.gay.sex.spermix.inside.shalopay.k.v.a((FloatBuffer)cW.position(0), (FloatBuffer)cV.position(0), cO, cN);
      cV.position(0);
      cW.position(0);
      GL11.glViewport(0, 0, aR, aS);
      GL11.glMatrixMode(5889);
      GL11.glLoadIdentity();
      if (aX) {
         GL11.glOrtho((double)(-aW), (double)aW, (double)(-aW), (double)aW, 0.05000000074505806D, 256.0D);
      } else {
         GLU.gluPerspective(aV, (float)aR / (float)aS, 0.05F, 256.0F);
      }

      GL11.glMatrixMode(5888);
      GL11.glLoadIdentity();
      GL11.glTranslatef(0.0F, 0.0F, -100.0F);
      GL11.glRotatef(90.0F, 1.0F, 0.0F, 0.0F);
      O = a.world.getCelestialAngle(var0);
      P = O < 0.75F ? O + 0.25F : O - 0.75F;
      float var8 = O * -360.0F;
      float var9 = cz > 0.0F ? var8 % cz - cz * 0.5F : 0.0F;
      if ((double)P <= 0.5D) {
         GL11.glRotatef(var8 - var9, 0.0F, 0.0F, 1.0F);
         GL11.glRotatef(cy, 1.0F, 0.0F, 0.0F);
         Q = P;
      } else {
         GL11.glRotatef(var8 + 180.0F - var9, 0.0F, 0.0F, 1.0F);
         GL11.glRotatef(cy, 1.0F, 0.0F, 0.0F);
         Q = P - 0.5F;
      }

      float var10;
      float var11;
      if (aX) {
         var10 = cE;
         var11 = var10 / 2.0F;
         GL11.glTranslatef((float)var2 % var10 - var11, (float)var4 % var10 - var11, (float)var6 % var10 - var11);
      }

      var10 = P * 6.2831855F;
      var11 = (float)Math.cos((double)var10);
      float var12 = (float)Math.sin((double)var10);
      float var13 = cy * 6.2831855F;
      float var14 = var11;
      float var15 = var12 * (float)Math.cos((double)var13);
      float var16 = var12 * (float)Math.sin((double)var13);
      if ((double)P > 0.5D) {
         var14 = -var11;
         var15 = -var15;
         var16 = -var16;
      }

      B[0] = var14;
      B[1] = var15;
      B[2] = var16;
      B[3] = 0.0F;
      GL11.glGetFloat(2983, (FloatBuffer)cX.position(0));
      skid.gay.sex.spermix.inside.shalopay.k.v.a((FloatBuffer)cY.position(0), (FloatBuffer)cX.position(0), cQ, cP);
      cX.position(0);
      cY.position(0);
      GL11.glGetFloat(2982, (FloatBuffer)cZ.position(0));
      skid.gay.sex.spermix.inside.shalopay.k.v.a((FloatBuffer)da.position(0), (FloatBuffer)cZ.position(0), cS, cR);
      cZ.position(0);
      da.position(0);
      a("gbufferProjection", false, cT);
      a("gbufferProjectionInverse", false, cU);
      a("gbufferPreviousProjection", false, db);
      a("gbufferModelView", false, cV);
      a("gbufferModelViewInverse", false, cW);
      a("gbufferPreviousModelView", false, dc);
      a("shadowProjection", false, cX);
      a("shadowProjectionInverse", false, cY);
      a("shadowModelView", false, cZ);
      a("shadowModelViewInverse", false, da);
      a.gameSettings.thirdPersonView = 1;
      e("setCamera");
   }

   public static void aj() {
      as = false;
      if (bl == 3) {
         a(2);
      }

   }

   public static boolean at() {
      return !dA && !dB;
   }

   public static void b(float var0, float var1, float var2, float var3) {
      if (o && !s) {
         aG.a(var0, var1, var2, var3);
      }

   }

   public static int a(String var0, String var1) {
      int var2 = GL11.glGetError();
      if (var2 != 0) {
         System.err.format("GL error 0x%04x: %s at %s %s\n", var2, GLU.gluErrorString(var2), var0, var1);
      }

      return var2;
   }

   public static boolean aq() {
      return v;
   }

   public static boolean c(String var0) {
      return ce == null ? false : ce.contains(var0);
   }

   private static int a(int var0, String var1, String var2) {
      e("pre setupProgram");
      int var3 = ARBShaderObjects.glCreateProgramObjectARB();
      e("create");
      if (var3 != 0) {
         aB = false;
         aC = false;
         aD = false;
         int var4 = i(var1);
         int var5 = j(var2);
         e("create");
         if (var4 == 0 && var5 == 0) {
            ARBShaderObjects.glDeleteObjectARB(var3);
            var3 = 0;
         } else {
            if (var4 != 0) {
               ARBShaderObjects.glAttachObjectARB(var3, var4);
               e("attach");
            }

            if (var5 != 0) {
               ARBShaderObjects.glAttachObjectARB(var3, var5);
               e("attach");
            }

            if (aB) {
               ARBVertexShader.glBindAttribLocationARB(var3, au, "mc_Entity");
               e("mc_Entity");
            }

            if (aC) {
               ARBVertexShader.glBindAttribLocationARB(var3, av, "mc_midTexCoord");
               e("mc_midTexCoord");
            }

            if (aD) {
               ARBVertexShader.glBindAttribLocationARB(var3, aw, "at_tangent");
               e("at_tangent");
            }

            ARBShaderObjects.glLinkProgramARB(var3);
            if (GL20.glGetProgrami(var3, 35714) != 1) {
               Shaders.a(String.valueOf((new StringBuilder("Error linking program: ")).append(var3)));
            }

            c(var3, String.valueOf((new StringBuilder(String.valueOf(var1))).append(", ").append(var2)));
            if (var4 != 0) {
               ARBShaderObjects.glDetachObjectARB(var3, var4);
               ARBShaderObjects.glDeleteObjectARB(var4);
            }

            if (var5 != 0) {
               ARBShaderObjects.glDetachObjectARB(var3, var5);
               ARBShaderObjects.glDeleteObjectARB(var5);
            }

            bm[var0] = var3;
            a(var0);
            ARBShaderObjects.glValidateProgramARB(var3);
            a(0);
            c(var3, String.valueOf((new StringBuilder(String.valueOf(var1))).append(", ").append(var2)));
            int var6 = GL20.glGetProgrami(var3, 35715);
            if (var6 != 1) {
               String var7 = "\"";
               h(String.valueOf((new StringBuilder("[Shaders] Error: Invalid program ")).append(var7).append(dF[var0]).append(var7)));
               ARBShaderObjects.glDeleteObjectARB(var3);
               var3 = 0;
            }
         }
      }

      return var3;
   }

   public static void M() {
      if (o) {
         a(as ? 3 : 2);
      }

   }

   public static void H() {
      at = true;
      a(-3, 0);
      a(6);
   }

   public static void s() {
      if (d) {
         e("Shaders.uninit pre");

         for(int var0 = 0; var0 < 33; ++var0) {
            if (dH[var0] != 0) {
               ARBShaderObjects.glDeleteObjectARB(dH[var0]);
               e("del programRef");
            }

            dH[var0] = 0;
            bm[var0] = 0;
            dJ[var0] = null;
            bn[var0] = null;
            dO[var0] = 0;
         }

         if (bj != 0) {
            EXTFramebufferObject.glDeleteFramebuffersEXT(bj);
            bj = 0;
            e("del dfb");
         }

         if (bk != 0) {
            EXTFramebufferObject.glDeleteFramebuffersEXT(bk);
            bk = 0;
            e("del sfb");
         }

         if (dg != null) {
            GlStateManager.deleteTextures(dg);
            b(dg);
            e("del dfbDepthTextures");
         }

         if (df != null) {
            GlStateManager.deleteTextures(df);
            b(df);
            e("del dfbTextures");
         }

         if (di != null) {
            GlStateManager.deleteTextures(di);
            b(di);
            e("del shadow depth");
         }

         if (dh != null) {
            GlStateManager.deleteTextures(dh);
            b(dh);
            e("del shadow color");
         }

         if (dj != null) {
            b(dj);
         }

         if (dZ != null) {
            dZ.d();
            dZ = null;
         }

         Shaders.c("Uninit");
         aP = 0;
         bb = false;
         d = false;
         e("Shaders.uninit");
      }

   }

   public static boolean ar() {
      return w;
   }

   public static void R() {
      if (!s && an) {
         de.clear();
         GL11.glReadPixels(m / 2, n / 2, 1, 1, 6402, 5126, de);
         ak = de.get(0);
         float var0 = (float)U * 0.01F;
         float var1 = (float)Math.exp(Math.log(0.5D) * (double)var0 / (double)am);
         al = al * var1 + ak * (1.0F - var1);
      }

   }

   public static void ah() {
      at = false;
      b("fogMode", 0);
   }

   public static void a(Minecraft var0) {
      ao();
      a = var0;
      var0 = Minecraft.getMinecraft();
      e = GLContext.getCapabilities();
      f = GL11.glGetString(7938);
      g = GL11.glGetString(7936);
      h = GL11.glGetString(7937);
      Shaders.c("ShadersMod version: 2.4.12");
      Shaders.c(String.valueOf((new StringBuilder("OpenGL Version: ")).append(f)));
      Shaders.c(String.valueOf((new StringBuilder("Vendor:  ")).append(g)));
      Shaders.c(String.valueOf((new StringBuilder("Renderer: ")).append(h)));
      Shaders.c(String.valueOf((new StringBuilder("Capabilities: ")).append(e.OpenGL20 ? " 2.0 " : " - ").append(e.OpenGL21 ? " 2.1 " : " - ").append(e.OpenGL30 ? " 3.0 " : " - ").append(e.OpenGL32 ? " 3.2 " : " - ").append(e.OpenGL40 ? " 4.0 " : " - ")));
      Shaders.c(String.valueOf((new StringBuilder("GL_MAX_DRAW_BUFFERS: ")).append(GL11.glGetInteger(34852))));
      Shaders.c(String.valueOf((new StringBuilder("GL_MAX_COLOR_ATTACHMENTS_EXT: ")).append(GL11.glGetInteger(36063))));
      Shaders.c(String.valueOf((new StringBuilder("GL_MAX_TEXTURE_IMAGE_UNITS: ")).append(GL11.glGetInteger(34930))));
      i = e.OpenGL30;
      a();
   }

   private static B[] aF() {
      try {
         B[] var0 = skid.gay.sex.spermix.inside.shalopay.k.M.a(bT, dF, dT);
         Properties var1 = a(bT);

         for(int var2 = 0; var2 < var0.length; ++var2) {
            B var3 = var0[var2];
            String var4 = var1.getProperty(var3.a());
            if (var4 != null) {
               var3.f();
               if (!var3.b(var4)) {
                  skid.gay.sex.spermix.inside.shalopay.j.q.b(String.valueOf((new StringBuilder("[Shaders] Invalid value, option: ")).append(var3.a()).append(", value: ").append(var4)));
               }
            }
         }

         return var0;
      } catch (IOException var5) {
         skid.gay.sex.spermix.inside.shalopay.j.q.b(String.valueOf((new StringBuilder("[Shaders] Error reading configuration for ")).append(bT.a())));
         var5.printStackTrace();
         return null;
      }
   }

   public static void N() {
      if (o) {
         e("beginBlockEntities");
         a(13);
      }

   }

   public static void Q() {
      a(3);
   }

   private static B[] b(B[] var0) {
      ArrayList var1 = new ArrayList();

      for(int var2 = 0; var2 < var0.length; ++var2) {
         B var3 = var0[var2];
         if (var3.l()) {
            var1.add(var3);
         }
      }

      B[] var4 = (B[])var1.toArray(new B[var1.size()]);
      return var4;
   }

   public static boolean j() {
      if (!bM.f()) {
         return bM.g();
      } else {
         return !ci.f() ? ci.g() : true;
      }
   }

   public static void a(float var0) {
      Entity var1 = a.getRenderViewEntity();
      double var2 = var1.lastTickPosX + (var1.posX - var1.lastTickPosX) * (double)var0;
      double var4 = var1.lastTickPosY + (var1.posY - var1.lastTickPosY) * (double)var0;
      double var6 = var1.lastTickPosZ + (var1.posZ - var1.lastTickPosZ) * (double)var0;
      aM = var2;
      aN = var4;
      aO = var6;
      GL11.glGetFloat(2983, (FloatBuffer)cT.position(0));
      skid.gay.sex.spermix.inside.shalopay.k.v.a((FloatBuffer)cU.position(0), (FloatBuffer)cT.position(0), cM, cL);
      cT.position(0);
      cU.position(0);
      GL11.glGetFloat(2982, (FloatBuffer)cV.position(0));
      skid.gay.sex.spermix.inside.shalopay.k.v.a((FloatBuffer)cW.position(0), (FloatBuffer)cV.position(0), cO, cN);
      cV.position(0);
      cW.position(0);
      e("setCamera");
   }

   public static int a(String var0, String var1, String var2) {
      int var3 = GL11.glGetError();
      if (var3 != 0) {
         System.err.format("GL error 0x%04x: %s at %s %s %s\n", var3, GLU.gluErrorString(var3), var0, var1, var2);
      }

      return var3;
   }

   public static void r() {
      if (l) {
         l = false;
         Shaders.c("Reset model renderers");
         Iterator var1 = a.getRenderManager().getEntityRenderMap().values().iterator();

         while(var1.hasNext()) {
            Render var0 = (Render)var1.next();
            if (var0 instanceof RenderLiving) {
               RenderLiving var2 = (RenderLiving)var0;
               a(var2.getMainModel());
            }
         }
      }

   }

   private static void aI() {
      dv = a.displayWidth;
      dw = a.displayHeight;
      m = Math.round((float)dv * bB);
      n = Math.round((float)dw * bB);
      aK();
   }

   public static void Y() {
      GL11.glMatrixMode(5888);
      GL11.glPushMatrix();
      GL11.glMatrixMode(5889);
      GL11.glPushMatrix();
      GL11.glMatrixMode(5888);
      a(19);
      e("beginHand");
      d("beginHand");
   }

   public static void a(String var0, int var1, int var2) {
      int var3 = bm[bl];
      if (var3 != 0) {
         int var4 = ARBShaderObjects.glGetUniformLocationARB(var3, var0);
         ARBShaderObjects.glUniform2iARB(var4, var1, var2);
         a(dF[bl], var0);
      }

   }

   public static void O() {
      a(3);
   }

   public static void b(String var0, int var1) {
      int var2 = bm[bl];
      if (var2 != 0) {
         int var3 = ARBShaderObjects.glGetUniformLocationARB(var2, var0);
         ARBShaderObjects.glUniform1iARB(var3, var1);
         a(dF[bl], var0);
      }

   }

   public static void L() {
      if (o && bm[18] != bm[0]) {
         a(16);
         GlStateManager.disableAlpha();
      }

   }

   public static boolean n() {
      return !co.h();
   }

   public static void b(boolean var0, boolean var1) {
      dy = var0;
      dz = var1;
   }

   public static void a(ModelBase var0) {
      if (var0 != null) {
         Iterator var2 = var0.boxList.iterator();

         while(var2.hasNext()) {
            Object var1 = var2.next();
            if (var1 instanceof ModelRenderer) {
               a((ModelRenderer)var1);
            }
         }
      }

   }

   public static boolean au() {
      return dy;
   }

   public static void c() {
      boolean var0 = bU;
      boolean var1 = j();
      bU = false;
      if (bT != null) {
         bT.b();
         bT = null;
         dR.clear();
         dT.clear();
         cd = null;
         ce = null;
         cf = null;
         cg = null;
         ch.e();
         cj.e();
         ck.e();
         ci.e();
         aE();
         dW = null;
      }

      boolean var2 = false;
      if (skid.gay.sex.spermix.inside.shalopay.j.q.ao()) {
         Shaders.c(String.valueOf((new StringBuilder("Shaders can not be loaded, Antialiasing is enabled: ")).append(skid.gay.sex.spermix.inside.shalopay.j.q.an()).append("x")));
         var2 = true;
      }

      if (skid.gay.sex.spermix.inside.shalopay.j.q.am()) {
         Shaders.c(String.valueOf((new StringBuilder("Shaders can not be loaded, Anisotropic Filtering is enabled: ")).append(skid.gay.sex.spermix.inside.shalopay.j.q.al()).append("x")));
         var2 = true;
      }

      if (skid.gay.sex.spermix.inside.shalopay.j.q.aJ()) {
         Shaders.c("Shaders can not be loaded, Fast Render is enabled.");
         var2 = true;
      }

      String var3 = bq.getProperty(skid.gay.sex.spermix.inside.shalopay.k.e.j.b(), bX);
      if (!var3.isEmpty() && !var3.equals(bW) && !var2) {
         if (var3.equals(bX)) {
            bT = new J();
            bU = true;
         } else {
            try {
               File var4 = new File(cb, var3);
               if (var4.isDirectory()) {
                  bT = new K(var3, var4);
                  bU = true;
               } else if (var4.isFile() && var3.toLowerCase().endsWith(".zip")) {
                  bT = new O(var3, var4);
                  bU = true;
               }
            } catch (Exception var6) {
            }
         }
      }

      if (bT != null) {
         Shaders.c(String.valueOf((new StringBuilder("Loaded shaderpack: ")).append(am())));
      } else {
         Shaders.c("No shaderpack loaded.");
         bT = new L();
      }

      aM();
      aC();
      cd = aF();
      aD();
      boolean var7 = bU ^ var0;
      boolean var5 = j() ^ var1;
      if (var7 || var5) {
         DefaultVertexFormats.updateVertexFormats();
         if (skid.gay.sex.spermix.inside.shalopay.j.bk.cy.b()) {
            skid.gay.sex.spermix.inside.shalopay.j.bk.cz.a((Object)null);
            skid.gay.sex.spermix.inside.shalopay.j.bk.cC.a((Object)null);
         }

         g();
         a.scheduleResourcesRefresh();
      }

   }

   private static boolean a(int var0, String var1, List var2) {
      IntBuffer var3 = BufferUtils.createIntBuffer(1);
      int var4 = GL20.glGetShaderi(var0, 35716);
      if (var4 <= 1) {
         return true;
      } else {
         for(int var5 = 0; var5 < var2.size(); ++var5) {
            String var6 = (String)var2.get(var5);
            Shaders.c(String.valueOf((new StringBuilder("File: ")).append(var5 + 1).append(" = ").append(var6)));
         }

         String var7 = GL20.glGetShaderInfoLog(var0, var4);
         Shaders.c(String.valueOf((new StringBuilder("Shader info log: ")).append(var1).append("\n").append(var7)));
         return false;
      }
   }

   public static void az() {
      if (o) {
         a(13);
      }

   }

   // $FF: synthetic method
   static int[] aA() {
      int[] var10000 = eg;
      if (var10000 != null) {
         return var10000;
      } else {
         int[] var0 = new int[skid.gay.sex.spermix.inside.shalopay.k.e.d().length];

         try {
            var0[skid.gay.sex.spermix.inside.shalopay.k.e.a.ordinal()] = 1;
         } catch (NoSuchFieldError var18) {
         }

         try {
            var0[skid.gay.sex.spermix.inside.shalopay.k.e.g.ordinal()] = 7;
         } catch (NoSuchFieldError var17) {
         }

         try {
            var0[skid.gay.sex.spermix.inside.shalopay.k.e.f.ordinal()] = 6;
         } catch (NoSuchFieldError var16) {
         }

         try {
            var0[skid.gay.sex.spermix.inside.shalopay.k.e.b.ordinal()] = 2;
         } catch (NoSuchFieldError var15) {
         }

         try {
            var0[skid.gay.sex.spermix.inside.shalopay.k.e.h.ordinal()] = 8;
         } catch (NoSuchFieldError var14) {
         }

         try {
            var0[skid.gay.sex.spermix.inside.shalopay.k.e.i.ordinal()] = 9;
         } catch (NoSuchFieldError var13) {
         }

         try {
            var0[skid.gay.sex.spermix.inside.shalopay.k.e.d.ordinal()] = 4;
         } catch (NoSuchFieldError var12) {
         }

         try {
            var0[skid.gay.sex.spermix.inside.shalopay.k.e.j.ordinal()] = 10;
         } catch (NoSuchFieldError var11) {
         }

         try {
            var0[skid.gay.sex.spermix.inside.shalopay.k.e.l.ordinal()] = 12;
         } catch (NoSuchFieldError var10) {
         }

         try {
            var0[skid.gay.sex.spermix.inside.shalopay.k.e.e.ordinal()] = 5;
         } catch (NoSuchFieldError var9) {
         }

         try {
            var0[skid.gay.sex.spermix.inside.shalopay.k.e.c.ordinal()] = 3;
         } catch (NoSuchFieldError var8) {
         }

         try {
            var0[skid.gay.sex.spermix.inside.shalopay.k.e.p.ordinal()] = 16;
         } catch (NoSuchFieldError var7) {
         }

         try {
            var0[skid.gay.sex.spermix.inside.shalopay.k.e.q.ordinal()] = 17;
         } catch (NoSuchFieldError var6) {
         }

         try {
            var0[skid.gay.sex.spermix.inside.shalopay.k.e.r.ordinal()] = 18;
         } catch (NoSuchFieldError var5) {
         }

         try {
            var0[skid.gay.sex.spermix.inside.shalopay.k.e.m.ordinal()] = 13;
         } catch (NoSuchFieldError var4) {
         }

         try {
            var0[skid.gay.sex.spermix.inside.shalopay.k.e.n.ordinal()] = 14;
         } catch (NoSuchFieldError var3) {
         }

         try {
            var0[skid.gay.sex.spermix.inside.shalopay.k.e.o.ordinal()] = 15;
         } catch (NoSuchFieldError var2) {
         }

         try {
            var0[skid.gay.sex.spermix.inside.shalopay.k.e.k.ordinal()] = 11;
         } catch (NoSuchFieldError var1) {
         }

         eg = var0;
         return var0;
      }
   }

   private static void aK() {
      if (bj != 0) {
         EXTFramebufferObject.glDeleteFramebuffersEXT(bj);
         GlStateManager.deleteTextures(dg);
         GlStateManager.deleteTextures(df);
      }

      bj = EXTFramebufferObject.glGenFramebuffersEXT();
      GL11.glGenTextures((IntBuffer)dg.clear().limit(be));
      GL11.glGenTextures((IntBuffer)df.clear().limit(16));
      dg.position(0);
      df.position(0);
      df.get(cH).position(0);
      EXTFramebufferObject.glBindFramebufferEXT(36160, bj);
      GL20.glDrawBuffers(0);
      GL11.glReadBuffer(0);

      int var0;
      for(var0 = 0; var0 < be; ++var0) {
         GlStateManager.bindTexture(dg.get(var0));
         GL11.glTexParameteri(3553, 10242, 10496);
         GL11.glTexParameteri(3553, 10243, 10496);
         GL11.glTexParameteri(3553, 10241, 9728);
         GL11.glTexParameteri(3553, 10240, 9728);
         GL11.glTexParameteri(3553, 34891, 6409);
         GL11.glTexImage2D(3553, 0, 6402, m, n, 0, 6402, 5126, (FloatBuffer)null);
      }

      EXTFramebufferObject.glFramebufferTexture2DEXT(36160, 36096, 3553, dg.get(0), 0);
      GL20.glDrawBuffers(dj);
      GL11.glReadBuffer(0);
      e("FT d");

      for(var0 = 0; var0 < bd; ++var0) {
         GlStateManager.bindTexture(cH[var0]);
         GL11.glTexParameteri(3553, 10242, 10496);
         GL11.glTexParameteri(3553, 10243, 10496);
         GL11.glTexParameteri(3553, 10241, 9729);
         GL11.glTexParameteri(3553, 10240, 9729);
         GL11.glTexImage2D(3553, 0, dD[var0], m, n, 0, 32993, 33639, (ByteBuffer)null);
         EXTFramebufferObject.glFramebufferTexture2DEXT(36160, '賠' + var0, 3553, cH[var0], 0);
         e("FT c");
      }

      for(var0 = 0; var0 < bd; ++var0) {
         GlStateManager.bindTexture(cH[8 + var0]);
         GL11.glTexParameteri(3553, 10242, 10496);
         GL11.glTexParameteri(3553, 10243, 10496);
         GL11.glTexParameteri(3553, 10241, 9729);
         GL11.glTexParameteri(3553, 10240, 9729);
         GL11.glTexImage2D(3553, 0, dD[var0], m, n, 0, 32993, 33639, (ByteBuffer)null);
         e("FT ca");
      }

      var0 = EXTFramebufferObject.glCheckFramebufferStatusEXT(36160);
      if (var0 == 36058) {
         h("[Shaders] Error: Failed framebuffer incomplete formats");

         for(int var1 = 0; var1 < bd; ++var1) {
            GlStateManager.bindTexture(df.get(var1));
            GL11.glTexImage2D(3553, 0, 6408, m, n, 0, 32993, 33639, (ByteBuffer)null);
            EXTFramebufferObject.glFramebufferTexture2DEXT(36160, '賠' + var1, 3553, df.get(var1), 0);
            e("FT c");
         }

         var0 = EXTFramebufferObject.glCheckFramebufferStatusEXT(36160);
         if (var0 == 36053) {
            Shaders.c("complete");
         }
      }

      GlStateManager.bindTexture(0);
      if (var0 != 36053) {
         h(String.valueOf((new StringBuilder("[Shaders] Error: Failed creating framebuffer! (Status ")).append(var0).append(")")));
      } else {
         Shaders.c("Framebuffer created.");
      }

   }

   private static FloatBuffer c(int var0) {
      ByteBuffer var1 = ec;
      int var2 = var1.limit();
      var1.position(var2).limit(var2 + var0 * 4);
      return var1.asFloatBuffer();
   }

   private static void aM() {
      dR = new HashMap();
      if (bU) {
         ArrayList var0 = new ArrayList();
         String var1 = "/shaders/lang/";
         String var2 = "en_US";
         String var3 = ".lang";
         var0.add(String.valueOf((new StringBuilder(String.valueOf(var1))).append(var2).append(var3)));
         if (!skid.gay.sex.spermix.inside.shalopay.j.q.aL().language.equals(var2)) {
            var0.add(String.valueOf((new StringBuilder(String.valueOf(var1))).append(skid.gay.sex.spermix.inside.shalopay.j.q.aL().language).append(var3)));
         }

         try {
            Iterator var5 = var0.iterator();

            while(true) {
               InputStream var6;
               do {
                  if (!var5.hasNext()) {
                     return;
                  }

                  String var4 = (String)var5.next();
                  var6 = bT.a(var4);
               } while(var6 == null);

               Properties var7 = new Properties();
               skid.gay.sex.spermix.inside.shalopay.j.aH.a((InputStream)var6, (Map)var7);
               var6.close();
               Iterator var9 = var7.keySet().iterator();

               while(var9.hasNext()) {
                  Object var8 = var9.next();
                  String var10 = var7.getProperty((String)var8);
                  dR.put((String)var8, var10);
               }
            }
         } catch (IOException var11) {
            var11.printStackTrace();
         }
      }

   }

   public static void I() {
      ah();
      ak();
      a(as ? 3 : 2);
   }

   public static void a(ModelRenderer var0) {
      var0.resetDisplayList();
      if (var0.childModels != null) {
         int var1 = 0;

         for(int var2 = var0.childModels.size(); var1 < var2; ++var1) {
            a((ModelRenderer)var0.childModels.get(var1));
         }
      }

   }

   private static int j(String var0) {
      int var1 = ARBShaderObjects.glCreateShaderObjectARB(35632);
      if (var1 == 0) {
         return 0;
      } else {
         StringBuilder var2 = new StringBuilder(131072);
         BufferedReader var3 = null;

         try {
            var3 = new BufferedReader(new InputStreamReader(bT.a(var0)));
         } catch (Exception var12) {
            ARBShaderObjects.glDeleteObjectARB(var1);
            return 0;
         }

         B[] var4 = a(cd);
         ArrayList var5 = new ArrayList();
         if (var3 != null) {
            try {
               var3 = skid.gay.sex.spermix.inside.shalopay.k.M.a(var3, var0, bT, 0, var5, 0);

               label232:
               while(true) {
                  while(true) {
                     while(true) {
                        z var7;
                        do {
                           String var6 = var3.readLine();
                           if (var6 == null) {
                              var3.close();
                              break label232;
                           }

                           var6 = a(var6, var4);
                           var2.append(var6).append('\n');
                           var7 = skid.gay.sex.spermix.inside.shalopay.k.P.a(var6);
                        } while(var7 == null);

                        String var8;
                        int var9;
                        if (var7.c()) {
                           var8 = var7.a();
                           if ((var9 = skid.gay.sex.spermix.inside.shalopay.k.P.b(var8)) >= 0) {
                              bg = Math.max(bg, var9 + 1);
                           } else if ((var9 = skid.gay.sex.spermix.inside.shalopay.k.P.c(var8)) >= 0) {
                              bf = Math.max(bf, var9 + 1);
                           } else if ((var9 = skid.gay.sex.spermix.inside.shalopay.k.P.d(var8)) >= 0) {
                              be = Math.max(be, var9 + 1);
                           } else if (var8.equals("gdepth") && dD[1] == 6408) {
                              dD[1] = 34836;
                           } else if ((var9 = skid.gay.sex.spermix.inside.shalopay.k.P.e(var8)) >= 0) {
                              bd = Math.max(bd, var9 + 1);
                           } else if (var8.equals("centerDepthSmooth")) {
                              an = true;
                           }
                        } else if (!var7.b("shadowMapResolution") && !var7.a("SHADOWRES")) {
                           if (!var7.d("shadowMapFov") && !var7.a("SHADOWFOV")) {
                              if (!var7.d("shadowDistance") && !var7.a("SHADOWHPL")) {
                                 if (var7.d("shadowDistanceRenderMul")) {
                                    aY = var7.i();
                                    Shaders.c(String.valueOf((new StringBuilder("Shadow distance render mul: ")).append(aY)));
                                 } else if (var7.d("shadowIntervalSize")) {
                                    cE = var7.i();
                                    Shaders.c(String.valueOf((new StringBuilder("Shadow map interval size: ")).append(cE)));
                                 } else if (var7.b("generateShadowMipmap", true)) {
                                    Arrays.fill(bu, true);
                                    Shaders.c("Generate shadow mipmap");
                                 } else if (var7.b("generateShadowColorMipmap", true)) {
                                    Arrays.fill(bw, true);
                                    Shaders.c("Generate shadow color mipmap");
                                 } else if (var7.b("shadowHardwareFiltering", true)) {
                                    Arrays.fill(bt, true);
                                    Shaders.c("Hardware shadow filtering enabled.");
                                 } else if (var7.b("shadowHardwareFiltering0", true)) {
                                    bt[0] = true;
                                    Shaders.c("shadowHardwareFiltering0");
                                 } else if (var7.b("shadowHardwareFiltering1", true)) {
                                    bt[1] = true;
                                    Shaders.c("shadowHardwareFiltering1");
                                 } else if (var7.a("shadowtex0Mipmap", "shadowtexMipmap", true)) {
                                    bu[0] = true;
                                    Shaders.c("shadowtex0Mipmap");
                                 } else if (var7.b("shadowtex1Mipmap", true)) {
                                    bu[1] = true;
                                    Shaders.c("shadowtex1Mipmap");
                                 } else if (var7.a("shadowcolor0Mipmap", "shadowColor0Mipmap", true)) {
                                    bw[0] = true;
                                    Shaders.c("shadowcolor0Mipmap");
                                 } else if (var7.a("shadowcolor1Mipmap", "shadowColor1Mipmap", true)) {
                                    bw[1] = true;
                                    Shaders.c("shadowcolor1Mipmap");
                                 } else if (var7.a("shadowtex0Nearest", "shadowtexNearest", "shadow0MinMagNearest", true)) {
                                    bv[0] = true;
                                    Shaders.c("shadowtex0Nearest");
                                 } else if (var7.a("shadowtex1Nearest", "shadow1MinMagNearest", true)) {
                                    bv[1] = true;
                                    Shaders.c("shadowtex1Nearest");
                                 } else if (var7.a("shadowcolor0Nearest", "shadowColor0Nearest", "shadowColor0MinMagNearest", true)) {
                                    bx[0] = true;
                                    Shaders.c("shadowcolor0Nearest");
                                 } else if (var7.a("shadowcolor1Nearest", "shadowColor1Nearest", "shadowColor1MinMagNearest", true)) {
                                    bx[1] = true;
                                    Shaders.c("shadowcolor1Nearest");
                                 } else if (!var7.d("wetnessHalflife") && !var7.a("WETNESSHL")) {
                                    if (!var7.d("drynessHalflife") && !var7.a("DRYNESSHL")) {
                                       if (var7.d("eyeBrightnessHalflife")) {
                                          ad = var7.i();
                                          Shaders.c(String.valueOf((new StringBuilder("Eye brightness halflife: ")).append(ad)));
                                       } else if (var7.d("centerDepthHalflife")) {
                                          am = var7.i();
                                          Shaders.c(String.valueOf((new StringBuilder("Center depth halflife: ")).append(am)));
                                       } else if (var7.d("sunPathRotation")) {
                                          cy = var7.i();
                                          Shaders.c(String.valueOf((new StringBuilder("Sun path rotation: ")).append(cy)));
                                       } else if (var7.d("ambientOcclusionLevel")) {
                                          cx = skid.gay.sex.spermix.inside.shalopay.j.q.a(var7.i(), 0.0F, 1.0F);
                                          Shaders.c(String.valueOf((new StringBuilder("AO Level: ")).append(cx)));
                                       } else if (var7.b("superSamplingLevel")) {
                                          int var14 = var7.h();
                                          if (var14 > 1) {
                                             Shaders.c(String.valueOf((new StringBuilder("Super sampling level: ")).append(var14).append("x")));
                                             ao = var14;
                                          } else {
                                             ao = 1;
                                          }
                                       } else if (var7.b("noiseTextureResolution")) {
                                          eb = var7.h();
                                          ea = true;
                                          Shaders.c("Noise texture enabled");
                                          Shaders.c(String.valueOf((new StringBuilder("Noise texture resolution: ")).append(eb)));
                                       } else if (var7.c("Format")) {
                                          var8 = skid.gay.sex.spermix.inside.shalopay.j.bx.b(var7.a(), "Format");
                                          String var15 = var7.b();
                                          int var10 = k(var8);
                                          int var11 = l(var15);
                                          if (var10 >= 0 && var11 != 0) {
                                             dD[var10] = var11;
                                             Shaders.b("%s format: %s", var8, var15);
                                          }
                                       } else if (var7.a("Clear", false)) {
                                          if (skid.gay.sex.spermix.inside.shalopay.k.P.f(var0)) {
                                             var8 = skid.gay.sex.spermix.inside.shalopay.j.bx.b(var7.a(), "Clear");
                                             var9 = k(var8);
                                             if (var9 >= 0) {
                                                dE[var9] = false;
                                                Shaders.b("%s clear disabled", var8);
                                             }
                                          }
                                       } else if (var7.a("GAUX4FORMAT", "RGBA32F")) {
                                          dD[7] = 34836;
                                          Shaders.c("gaux4 format : RGB32AF");
                                       } else if (var7.a("GAUX4FORMAT", "RGB32F")) {
                                          dD[7] = 34837;
                                          Shaders.c("gaux4 format : RGB32F");
                                       } else if (var7.a("GAUX4FORMAT", "RGB16")) {
                                          dD[7] = 32852;
                                          Shaders.c("gaux4 format : RGB16");
                                       } else if (var7.a("MipmapEnabled", true)) {
                                          if (skid.gay.sex.spermix.inside.shalopay.k.P.f(var0) || skid.gay.sex.spermix.inside.shalopay.k.P.g(var0)) {
                                             var8 = skid.gay.sex.spermix.inside.shalopay.j.bx.b(var7.a(), "MipmapEnabled");
                                             var9 = k(var8);
                                             if (var9 >= 0) {
                                                dP |= 1 << var9;
                                                Shaders.b("%s mipmap enabled", var8);
                                             }
                                          }
                                       } else if (var7.a("DRAWBUFFERS")) {
                                          var8 = var7.b();
                                          if (skid.gay.sex.spermix.inside.shalopay.k.P.h(var8)) {
                                             dK = var8;
                                          } else {
                                             Shaders.b(String.valueOf((new StringBuilder("Invalid draw buffers: ")).append(var8)));
                                          }
                                       }
                                    } else {
                                       ac = var7.i();
                                       Shaders.c(String.valueOf((new StringBuilder("Dryness halflife: ")).append(ac)));
                                    }
                                 } else {
                                    ab = var7.i();
                                    Shaders.c(String.valueOf((new StringBuilder("Wetness halflife: ")).append(ab)));
                                 }
                              } else {
                                 aW = var7.i();
                                 aX = true;
                                 Shaders.c(String.valueOf((new StringBuilder("Shadow map distance: ")).append(aW)));
                              }
                           } else {
                              aV = var7.i();
                              aX = false;
                              Shaders.c(String.valueOf((new StringBuilder("Shadow map field of view: ")).append(aV)));
                           }
                        } else {
                           aT = aU = var7.h();
                           aR = aS = Math.round((float)aT * bC);
                           Shaders.c(String.valueOf((new StringBuilder("Shadow map resolution: ")).append(aT)));
                        }
                     }
                  }
               }
            } catch (Exception var13) {
               Shaders.a(String.valueOf((new StringBuilder("Couldn't read ")).append(var0).append("!")));
               var13.printStackTrace();
               ARBShaderObjects.glDeleteObjectARB(var1);
               return 0;
            }
         }

         if (dY) {
            c(var0, String.valueOf(var2));
         }

         ARBShaderObjects.glShaderSourceARB(var1, var2);
         ARBShaderObjects.glCompileShaderARB(var1);
         if (GL20.glGetShaderi(var1, 35713) != 1) {
            Shaders.a(String.valueOf((new StringBuilder("Error compiling fragment shader: ")).append(var0)));
         }

         a(var1, var0, (List)var5);
         return var1;
      }
   }

   public static void u() {
      aQ = true;
   }

   static {
      ca = new File(Minecraft.getMinecraft().mcDataDir, "shaders");
      cb = new File(Minecraft.getMinecraft().mcDataDir, bY);
      cc = new File(Minecraft.getMinecraft().mcDataDir, bZ);
      dl.limit(0);
      dq.put(36064).position(0).limit(1);
   }

   private static int b(int var0, String var1) {
      if (var0 == 0) {
         if (var1.equals("texture")) {
            return 0;
         }

         if (var1.equals("lightmap")) {
            return 1;
         }

         if (var1.equals("normals")) {
            return 2;
         }

         if (var1.equals("specular")) {
            return 3;
         }

         if (var1.equals("shadowtex0") || var1.equals("watershadow")) {
            return 4;
         }

         if (var1.equals("shadow")) {
            return bc ? 5 : 4;
         }

         if (var1.equals("shadowtex1")) {
            return 5;
         }

         if (var1.equals("depthtex0")) {
            return 6;
         }

         if (var1.equals("gaux1")) {
            return 7;
         }

         if (var1.equals("gaux2")) {
            return 8;
         }

         if (var1.equals("gaux3")) {
            return 9;
         }

         if (var1.equals("gaux4")) {
            return 10;
         }

         if (var1.equals("depthtex1")) {
            return 12;
         }

         if (var1.equals("shadowcolor0") || var1.equals("shadowcolor")) {
            return 13;
         }

         if (var1.equals("shadowcolor1")) {
            return 14;
         }

         if (var1.equals("noisetex")) {
            return 15;
         }
      }

      if (var0 == 1) {
         if (var1.equals("colortex0") || var1.equals("colortex0")) {
            return 0;
         }

         if (var1.equals("colortex1") || var1.equals("gdepth")) {
            return 1;
         }

         if (var1.equals("colortex2") || var1.equals("gnormal")) {
            return 2;
         }

         if (var1.equals("colortex3") || var1.equals("composite")) {
            return 3;
         }

         if (var1.equals("shadowtex0") || var1.equals("watershadow")) {
            return 4;
         }

         if (var1.equals("shadow")) {
            return bc ? 5 : 4;
         }

         if (var1.equals("shadowtex1")) {
            return 5;
         }

         if (var1.equals("depthtex0") || var1.equals("gdepthtex")) {
            return 6;
         }

         if (var1.equals("colortex4") || var1.equals("gaux1")) {
            return 7;
         }

         if (var1.equals("colortex5") || var1.equals("gaux2")) {
            return 8;
         }

         if (var1.equals("colortex6") || var1.equals("gaux3")) {
            return 9;
         }

         if (var1.equals("colortex7") || var1.equals("gaux4")) {
            return 10;
         }

         if (var1.equals("depthtex1")) {
            return 11;
         }

         if (var1.equals("depthtex2")) {
            return 12;
         }

         if (var1.equals("shadowcolor0") || var1.equals("shadowcolor")) {
            return 13;
         }

         if (var1.equals("shadowcolor1")) {
            return 14;
         }

         if (var1.equals("noisetex")) {
            return 15;
         }
      }

      return -1;
   }

   public static int e(String var0) {
      int var1 = GL11.glGetError();
      if (var1 != 0) {
         boolean var2 = false;
         if (!var2) {
            if (var1 == 1286) {
               int var3 = EXTFramebufferObject.glCheckFramebufferStatusEXT(36160);
               System.err.format("GL error 0x%04X: %s (Fb status 0x%04X) at %s\n", var1, GLU.gluErrorString(var1), var3, var0);
            } else {
               System.err.format("GL error 0x%04X: %s at %s\n", var1, GLU.gluErrorString(var1), var0);
            }
         }
      }

      return var1;
   }

   public static boolean k() {
      return !cl.h();
   }

   public static void a(boolean var0) {
      dx = var0;
   }

   public static void ae() {
      a(1);
   }

   public static void a(String var0, boolean var1, FloatBuffer var2) {
      int var3 = bm[bl];
      if (var3 != 0 && var2 != null) {
         int var4 = ARBShaderObjects.glGetUniformLocationARB(var3, var0);
         ARBShaderObjects.glUniformMatrix4ARB(var4, var1, var2);
         a(dF[bl], var0);
      }

   }

   private static int i(String var0) {
      int var1 = ARBShaderObjects.glCreateShaderObjectARB(35633);
      if (var1 == 0) {
         return 0;
      } else {
         StringBuilder var2 = new StringBuilder(131072);
         BufferedReader var3 = null;

         try {
            var3 = new BufferedReader(new InputStreamReader(bT.a(var0)));
         } catch (Exception var7) {
            ARBShaderObjects.glDeleteObjectARB(var1);
            return 0;
         }

         B[] var4 = a(cd);
         ArrayList var5 = new ArrayList();
         if (var3 != null) {
            try {
               var3 = skid.gay.sex.spermix.inside.shalopay.k.M.a(var3, var0, bT, 0, var5, 0);

               while(true) {
                  String var6 = var3.readLine();
                  if (var6 == null) {
                     var3.close();
                     break;
                  }

                  var6 = a(var6, var4);
                  var2.append(var6).append('\n');
                  if (var6.matches("attribute [_a-zA-Z0-9]+ mc_Entity.*")) {
                     ax = true;
                     aB = true;
                  } else if (var6.matches("attribute [_a-zA-Z0-9]+ mc_midTexCoord.*")) {
                     ay = true;
                     aC = true;
                  } else if (var6.matches(".*gl_MultiTexCoord3.*")) {
                     az = true;
                  } else if (var6.matches("attribute [_a-zA-Z0-9]+ at_tangent.*")) {
                     aA = true;
                     aD = true;
                  }
               }
            } catch (Exception var8) {
               Shaders.a(String.valueOf((new StringBuilder("Couldn't read ")).append(var0).append("!")));
               var8.printStackTrace();
               ARBShaderObjects.glDeleteObjectARB(var1);
               return 0;
            }
         }

         if (dY) {
            c(var0, String.valueOf(var2));
         }

         ARBShaderObjects.glShaderSourceARB(var1, var2);
         ARBShaderObjects.glCompileShaderARB(var1);
         if (GL20.glGetShaderi(var1, 35713) != 1) {
            Shaders.a(String.valueOf((new StringBuilder("Error compiling vertex shader: ")).append(var0)));
         }

         a(var1, var0, (List)var5);
         return var1;
      }
   }

   private static void aH() {
      ds = new IdentityHashMap(300);
      if (ds.isEmpty()) {
         Iterator var1 = Block.REGISTRY.getKeys().iterator();

         while(var1.hasNext()) {
            ResourceLocation var0 = (ResourceLocation)var1.next();
            Block var2 = (Block)Block.REGISTRY.getObject(var0);
            int var3 = Block.REGISTRY.getIDForObject(var2);
            ds.put(var2, var3);
         }
      }

      BufferedReader var10 = null;

      try {
         var10 = new BufferedReader(new InputStreamReader(bT.a("/mc_Entity_x.txt")));
      } catch (Exception var8) {
      }

      if (var10 != null) {
         String var11;
         try {
            while((var11 = var10.readLine()) != null) {
               Matcher var12 = ef.matcher(var11);
               if (var12.matches()) {
                  String var13 = var12.group(1);
                  String var4 = var12.group(2);
                  int var5 = Integer.parseInt(var4);
                  Block var6 = Block.getBlockFromName(var13);
                  if (var6 != null) {
                     ds.put(var6, var5);
                  } else {
                     Shaders.a("Unknown block name %s", var13);
                  }
               } else {
                  Shaders.a("unmatched %s\n", var11);
               }
            }
         } catch (Exception var9) {
            Shaders.b("Error parsing mc_Entity_x.txt");
         }
      }

      if (var10 != null) {
         try {
            var10.close();
         } catch (Exception var7) {
         }
      }

   }

   public static void U() {
      if (be >= 2) {
         GlStateManager.setActiveTexture(33995);
         e("pre copy depth");
         GL11.glCopyTexSubImage2D(3553, 0, 0, 0, 0, 0, m, n);
         e("copy depth");
         GlStateManager.setActiveTexture(33984);
      }

      skid.gay.sex.spermix.inside.shalopay.k.X.a(br.getMultiTexID());
   }

   public static void ak() {
      dt[du * 2] = 0;
      dt[du * 2 + 1] = 0;
      --du;
   }

   public static void ai() {
      as = true;
      if (bl == 2) {
         a(3);
      }

   }

   private static String a(String var0, B[] var1) {
      if (var1 != null && var1.length > 0) {
         for(int var2 = 0; var2 < var1.length; ++var2) {
            B var3 = var1[var2];
            String var4 = var3.a();
            if (var3.f(var0)) {
               var0 = var3.o();
               break;
            }
         }

         return var0;
      } else {
         return var0;
      }
   }

   public static void J() {
      if (o) {
         a(16);
         r();
      }

   }

   private static void aJ() {
      aQ = false;
      aR = Math.round((float)aT * bC);
      aS = Math.round((float)aU * bC);
      aL();
   }

   public static String b(String var0, String var1) {
      String var2 = (String)dR.get(var0);
      return var2 == null ? var1 : var2;
   }

   public static void ac() {
      if (p) {
         a(5);
      } else if (bl == 1) {
         a(as ? 3 : 2);
      }

   }

   public static boolean h() {
      if (!bN.f()) {
         return bN.g();
      } else {
         return !cj.f() ? cj.g() : true;
      }
   }

   private static void a(File var0) {
      if (var0.exists() && var0.isDirectory()) {
         File[] var1 = var0.listFiles();
         if (var1 != null) {
            for(int var2 = 0; var2 < var1.length; ++var2) {
               File var3 = var1[var2];
               if (var3.isDirectory()) {
                  a(var3);
               }

               var3.delete();
            }
         }
      }

   }

   private static void aL() {
      if (bg != 0) {
         if (bk != 0) {
            EXTFramebufferObject.glDeleteFramebuffersEXT(bk);
            GlStateManager.deleteTextures(di);
            GlStateManager.deleteTextures(dh);
         }

         bk = EXTFramebufferObject.glGenFramebuffersEXT();
         EXTFramebufferObject.glBindFramebufferEXT(36160, bk);
         GL11.glDrawBuffer(0);
         GL11.glReadBuffer(0);
         GL11.glGenTextures((IntBuffer)di.clear().limit(bg));
         GL11.glGenTextures((IntBuffer)dh.clear().limit(bf));
         di.position(0);
         dh.position(0);

         int var0;
         int var1;
         for(var0 = 0; var0 < bg; ++var0) {
            GlStateManager.bindTexture(di.get(var0));
            GL11.glTexParameterf(3553, 10242, 10496.0F);
            GL11.glTexParameterf(3553, 10243, 10496.0F);
            var1 = bv[var0] ? 9728 : 9729;
            GL11.glTexParameteri(3553, 10241, var1);
            GL11.glTexParameteri(3553, 10240, var1);
            if (bt[var0]) {
               GL11.glTexParameteri(3553, 34892, 34894);
            }

            GL11.glTexImage2D(3553, 0, 6402, aR, aS, 0, 6402, 5126, (FloatBuffer)null);
         }

         EXTFramebufferObject.glFramebufferTexture2DEXT(36160, 36096, 3553, di.get(0), 0);
         e("FT sd");

         for(var0 = 0; var0 < bf; ++var0) {
            GlStateManager.bindTexture(dh.get(var0));
            GL11.glTexParameterf(3553, 10242, 10496.0F);
            GL11.glTexParameterf(3553, 10243, 10496.0F);
            var1 = bx[var0] ? 9728 : 9729;
            GL11.glTexParameteri(3553, 10241, var1);
            GL11.glTexParameteri(3553, 10240, var1);
            GL11.glTexImage2D(3553, 0, 6408, aR, aS, 0, 32993, 33639, (ByteBuffer)null);
            EXTFramebufferObject.glFramebufferTexture2DEXT(36160, '賠' + var0, 3553, dh.get(var0), 0);
            e("FT sc");
         }

         GlStateManager.bindTexture(0);
         if (bf > 0) {
            GL20.glDrawBuffers(dk);
         }

         var0 = EXTFramebufferObject.glCheckFramebufferStatusEXT(36160);
         if (var0 != 36053) {
            h(String.valueOf((new StringBuilder("[Shaders] Error: Failed creating shadow framebuffer! (Status ")).append(var0).append(")")));
         } else {
            Shaders.c("Shadow framebuffer created.");
         }
      }

   }

   private static void aG() {
      if (dZ == null && dW != null) {
         dZ = a(15, dW);
      }

      if (dZ == null) {
         dZ = new l(eb, eb);
      }

   }

   public static void G() {
      p = false;
      a(dj);
      a(as ? 3 : 2);
      ak();
   }

   public static boolean l() {
      return !cm.h();
   }

   private static d[] a(Properties var0, int var1) {
      String var2 = String.valueOf((new StringBuilder("texture.")).append(dX[var1]).append("."));
      Set var3 = var0.keySet();
      ArrayList var4 = new ArrayList();
      Iterator var6 = var3.iterator();

      while(var6.hasNext()) {
         Object var5 = var6.next();
         String var7 = (String)var5;
         if (var7.startsWith(var2)) {
            String var8 = var7.substring(var2.length());
            String var9 = var0.getProperty(var7).trim();
            int var10 = b(var1, var8);
            if (var10 < 0) {
               Shaders.b(String.valueOf((new StringBuilder("Invalid texture name: ")).append(var7)));
            } else {
               d var11 = a(var10, var9);
               if (var11 != null) {
                  var4.add(var11);
               }
            }
         }
      }

      if (var4.size() <= 0) {
         return null;
      } else {
         d[] var12 = (d[])var4.toArray(new d[var4.size()]);
         return var12;
      }
   }

   private static void a(e var0, String var1) {
      if (var1 == null) {
         var1 = var0.c();
      }

      switch(aA()[var0.ordinal()]) {
      case 1:
         bO = skid.gay.sex.spermix.inside.shalopay.j.q.a((String)var1, 0);
         break;
      case 2:
         bK = skid.gay.sex.spermix.inside.shalopay.j.q.a(var1, true);
         break;
      case 3:
         bL = skid.gay.sex.spermix.inside.shalopay.j.q.a(var1, true);
         break;
      case 4:
         bB = skid.gay.sex.spermix.inside.shalopay.j.q.a(var1, 1.0F);
         break;
      case 5:
         bC = skid.gay.sex.spermix.inside.shalopay.j.q.a(var1, 1.0F);
         break;
      case 6:
         bA = skid.gay.sex.spermix.inside.shalopay.j.q.a(var1, 0.125F);
         break;
      case 7:
         bz = skid.gay.sex.spermix.inside.shalopay.j.q.a(var1, true);
         break;
      case 8:
         bN.a(var1);
         break;
      case 9:
         bM.a(var1);
         break;
      case 10:
         bV = var1;
         break;
      case 11:
         by = skid.gay.sex.spermix.inside.shalopay.j.q.a(var1, true);
         break;
      case 12:
         bJ = skid.gay.sex.spermix.inside.shalopay.j.q.a(var1, true);
         break;
      case 13:
         bD = skid.gay.sex.spermix.inside.shalopay.j.q.a((String)var1, 0);
         break;
      case 14:
         bE = skid.gay.sex.spermix.inside.shalopay.j.q.a((String)var1, 0);
         break;
      case 15:
         bF = skid.gay.sex.spermix.inside.shalopay.j.q.a((String)var1, 0);
         break;
      case 16:
         bG = skid.gay.sex.spermix.inside.shalopay.j.q.a((String)var1, 0);
         break;
      case 17:
         bG = skid.gay.sex.spermix.inside.shalopay.j.q.a((String)var1, 0);
         break;
      case 18:
         bG = skid.gay.sex.spermix.inside.shalopay.j.q.a((String)var1, 0);
         break;
      default:
         throw new IllegalArgumentException(String.valueOf((new StringBuilder("Unknown option: ")).append(var0)));
      }

   }

   public static boolean a(BlockRenderLayer var0) {
      switch(aB()[var0.ordinal()]) {
      case 1:
         return cq.g();
      case 2:
         return cs.g();
      case 3:
         return cr.g();
      case 4:
         return ct.g();
      default:
         return false;
      }
   }

   private static IntBuffer b(int var0) {
      ByteBuffer var1 = ec;
      int var2 = var1.limit();
      var1.position(var2).limit(var2 + var0 * 4);
      return var1.asIntBuffer();
   }

   public static void T() {
      GlStateManager.disableBlend();
      a(3);
   }

   public static void b(Entity var0) {
      if (o && !s && aH.d()) {
         int var1 = skid.gay.sex.spermix.inside.shalopay.j.W.a(var0);
         aH.b(var1);
      }

   }

   public static void a(Entity var0) {
      if (o) {
         a(16);
         b(var0);
      }

   }

   public static void e() {
      a(cd, bT);
   }

   private static IntBuffer[] b(int var0, int var1) {
      IntBuffer[] var2 = new IntBuffer[var0];

      for(int var3 = 0; var3 < var0; ++var3) {
         var2[var3] = b(var1);
      }

      return var2;
   }

   public static void X() {
      if ((double)bA != 1.0D) {
         GL11.glScaled(1.0D, 1.0D, (double)bA);
      }

   }

   public static boolean a(EnumHand var0) {
      if (var0 == EnumHand.MAIN_HAND && dA) {
         return true;
      } else {
         return var0 == EnumHand.OFF_HAND && dB;
      }
   }

   public static void A() {
      GL11.glColor4f(1.0F, 1.0F, 1.0F, 1.0F);
      GL11.glBegin(7);
      GL11.glTexCoord2f(0.0F, 0.0F);
      GL11.glVertex3f(0.0F, 0.0F, 0.0F);
      GL11.glTexCoord2f(1.0F, 0.0F);
      GL11.glVertex3f(1.0F, 0.0F, 0.0F);
      GL11.glTexCoord2f(1.0F, 1.0F);
      GL11.glVertex3f(1.0F, 1.0F, 0.0F);
      GL11.glTexCoord2f(0.0F, 1.0F);
      GL11.glVertex3f(0.0F, 1.0F, 0.0F);
      GL11.glEnd();
   }

   public static void P() {
      a(2);
   }

   public static void an() {
      bO += 2;
      bO = bO / 2 * 2;
      if (bO > 4) {
         bO = 0;
      }

      bO = skid.gay.sex.spermix.inside.shalopay.j.q.a(bO, 0, 4);
   }

   private static int l(String var0) {
      var0 = var0.trim();

      for(int var1 = 0; var1 < ed.length; ++var1) {
         String var2 = ed[var1];
         if (var0.equals(var2)) {
            return ee[var1];
         }
      }

      return 0;
   }

   public static void a(String var0, float var1, float var2, float var3) {
      int var4 = bm[bl];
      if (var4 != 0) {
         int var5 = ARBShaderObjects.glGetUniformLocationARB(var4, var0);
         ARBShaderObjects.glUniform3fARB(var5, var1, var2, var3);
         a(dF[bl], var0);
      }

   }

   public static void a(String var0, float var1) {
      int var2 = bm[bl];
      if (var2 != 0) {
         int var3 = ARBShaderObjects.glGetUniformLocationARB(var2, var0);
         ARBShaderObjects.glUniform1fARB(var3, var1);
         a(dF[bl], var0);
      }

   }

   public static void ad() {
      if (p) {
         a(4);
      } else if (bl == 2 || bl == 3) {
         a(1);
      }

   }

   public static void af() {
      a(16);
   }

   public static int a(String var0, int var1) {
      String var2 = var0 != null ? String.valueOf((new StringBuilder("screen.")).append(var0)) : "screen";
      if (cg == null) {
         return var1;
      } else {
         y var3 = (y)cg.get(var2);
         return var3 == null ? var1 : var3.b();
      }
   }

   public static void a(boolean var0, boolean var1) {
      dA = var0;
      dB = var1;
   }

   public static boolean ax() {
      return dx;
   }

   public static void g() {
      if (j()) {
         cu = 0.5F;
         cv = 0.6F;
         cw = 0.8F;
      } else {
         cu = 1.0F;
         cv = 1.0F;
         cw = 1.0F;
      }

   }

   public static void a(GlStateManager$FogMode var0) {
      GlStateManager.setFog(var0);
      if (at) {
         b("fogMode", var0.capabilityId);
      }

   }

   public static void C() {
      if (s) {
         e("shadow endRender");
      } else {
         if (!q) {
            B();
         }

         o = false;
         GlStateManager.colorMask(true, true, true, true);
         a(0);
         RenderHelper.disableStandardItemLighting();
         e("endRender end");
      }

   }

   public static void Z() {
      e("pre endHand");
      d("pre endHand");
      GL11.glMatrixMode(5889);
      GL11.glPopMatrix();
      GL11.glMatrixMode(5888);
      GL11.glPopMatrix();
      GlStateManager.blendFunc(770, 771);
      e("endHand");
   }

   static ArrayList f() {
      ArrayList var0 = new ArrayList();
      var0.add(bW);
      var0.add(bX);

      try {
         if (!cb.exists()) {
            cb.mkdir();
         }

         File[] var1 = cb.listFiles();

         for(int var2 = 0; var2 < var1.length; ++var2) {
            File var3 = var1[var2];
            String var4 = var3.getName();
            if (var3.isDirectory()) {
               File var5 = new File(var3, "shaders");
               if (var5.exists() && var5.isDirectory()) {
                  var0.add(var4);
               }
            } else if (var3.isFile() && var4.toLowerCase().endsWith(".zip")) {
               var0.add(var4);
            }
         }
      } catch (Exception var6) {
      }

      return var0;
   }

   public static void a(TileEntity var0) {
      if (o) {
         e("nextBlockEntity");
         a(13);
         b(var0);
      }

   }

   private static void aC() {
      dT.clear();

      for(int var0 = -128; var0 <= 128; ++var0) {
         String var1 = String.valueOf((new StringBuilder("/shaders/world")).append(var0));
         if (bT.b(var1)) {
            dT.add(var0);
         }
      }

      if (dT.size() > 0) {
         Integer[] var2 = (Integer[])dT.toArray(new Integer[dT.size()]);
         skid.gay.sex.spermix.inside.shalopay.j.q.a(String.valueOf((new StringBuilder("[Shaders] Worlds: ")).append(skid.gay.sex.spermix.inside.shalopay.j.q.a((Object[])var2))));
      }

   }

   public static void D() {
      p = true;
      at = true;
      a(dj);
      a(5);
      a(-2, 0);
   }

   public static void a() {
      Shaders.c("Load ShadersMod configuration.");

      try {
         if (!cb.exists()) {
            cb.mkdir();
         }
      } catch (Exception var8) {
         Shaders.a(String.valueOf((new StringBuilder("Failed to open the shaderpacks directory: ")).append(cb)));
      }

      bq = new bd();
      bq.setProperty(skid.gay.sex.spermix.inside.shalopay.k.e.j.b(), "");
      if (cc.exists()) {
         try {
            FileReader var0 = new FileReader(cc);
            bq.load(var0);
            var0.close();
         } catch (Exception var7) {
         }
      }

      if (!cc.exists()) {
         try {
            b();
         } catch (Exception var6) {
         }
      }

      e[] var9 = skid.gay.sex.spermix.inside.shalopay.k.e.d();

      for(int var1 = 0; var1 < var9.length; ++var1) {
         e var2 = var9[var1];
         String var3 = var2.b();
         String var4 = var2.c();
         String var5 = bq.getProperty(var3, var4);
         a(var2, var5);
      }

      c();
   }

   private static Properties a(n var0) {
      Properties var1 = new Properties();
      String var2 = String.valueOf((new StringBuilder(String.valueOf(bY))).append("/").append(var0.a()).append(".txt"));
      File var3 = new File(Minecraft.getMinecraft().mcDataDir, var2);
      if (var3.exists() && var3.isFile() && var3.canRead()) {
         FileInputStream var4 = new FileInputStream(var3);
         var1.load(var4);
         var4.close();
         return var1;
      } else {
         return var1;
      }
   }

   public static void a(ItemStack var0) {
      v = c(var0);
   }

   public static void a(Minecraft var0, float var1, long var2) {
      e("pre beginRender");
      a((World)a.world);
      a = var0;
      a.mcProfiler.startSection("init");
      b = a.entityRenderer;
      if (!d) {
         try {
            p();
         } catch (IllegalStateException var9) {
            if (skid.gay.sex.spermix.inside.shalopay.j.q.f(var9.getMessage()).equals("Function is not supported")) {
               h(String.valueOf((new StringBuilder("[Shaders] Error: ")).append(var9.getMessage())));
               var9.printStackTrace();
               a(bW);
               return;
            }
         }
      }

      if (a.displayWidth != dv || a.displayHeight != dw) {
         aI();
      }

      if (aQ) {
         aJ();
      }

      L = a.world.getWorldTime();
      N = (L - M) % 24000L;
      if (N < 0L) {
         N += 24000L;
      }

      M = L;
      R = a.world.getMoonPhase();
      ++V;
      if (V >= 720720) {
         V = 0;
      }

      S = System.currentTimeMillis();
      if (T == 0L) {
         T = S;
      }

      U = S - T;
      T = S;
      W = (float)U / 1000.0F;
      X += W;
      X %= 3600.0F;
      Z = var0.world.getRainStrength(var1);
      float var4 = (float)U * 0.01F;
      float var5 = (float)Math.exp(Math.log(0.5D) * (double)var4 / (double)(aa < Z ? ac : ab));
      aa = aa * var5 + Z * (1.0F - var5);
      Entity var6 = a.getRenderViewEntity();
      if (var6 != null) {
         t = var6 instanceof EntityLivingBase && ((EntityLivingBase)var6).isPlayerSleeping();
         aj = (float)var6.posY * var1 + (float)var6.lastTickPosY * (1.0F - var1);
         ag = var6.getBrightnessForRender();
         var5 = (float)U * 0.01F;
         float var7 = (float)Math.exp(Math.log(0.5D) * (double)var5 / (double)ad);
         ah = ah * var7 + (float)(ag & '\uffff') * (1.0F - var7);
         ai = ai * var7 + (float)(ag >> 16) * (1.0F - var7);
         af = 0;
         if (a.gameSettings.thirdPersonView == 0 && !t) {
            if (var6.isInsideOfMaterial(Material.WATER)) {
               af = 1;
            } else if (var6.isInsideOfMaterial(Material.LAVA)) {
               af = 2;
            }
         }

         if (Minecraft.player != null) {
            ap = 0.0F;
            if (Minecraft.player.isPotionActive(MobEffects.NIGHT_VISION)) {
               ap = skid.gay.sex.spermix.inside.shalopay.j.q.R().entityRenderer.getNightVisionBrightness(Minecraft.player, var1);
            }

            aq = 0.0F;
            if (Minecraft.player.isPotionActive(MobEffects.BLINDNESS)) {
               int var8 = Minecraft.player.getActivePotionEffect(MobEffects.BLINDNESS).getDuration();
               aq = skid.gay.sex.spermix.inside.shalopay.j.q.a((float)var8 / 20.0F, 0.0F, 1.0F);
            }
         }

         Vec3d var11 = a.world.getSkyColor(var6, var1);
         var11 = skid.gay.sex.spermix.inside.shalopay.j.A.b(var11, dS, var6, var1);
         I = (float)var11.xCoord;
         J = (float)var11.yCoord;
         K = (float)var11.zCoord;
      }

      o = true;
      q = false;
      dy = false;
      dz = false;
      dA = false;
      dB = false;
      if (bg >= 1) {
         GlStateManager.setActiveTexture(33988);
         GlStateManager.bindTexture(di.get(0));
         if (bg >= 2) {
            GlStateManager.setActiveTexture(33989);
            GlStateManager.bindTexture(di.get(1));
         }
      }

      GlStateManager.setActiveTexture(33984);

      int var10;
      for(var10 = 0; var10 < bd; ++var10) {
         GlStateManager.bindTexture(cH[var10]);
         GL11.glTexParameteri(3553, 10240, 9729);
         GL11.glTexParameteri(3553, 10241, 9729);
         GlStateManager.bindTexture(cH[8 + var10]);
         GL11.glTexParameteri(3553, 10240, 9729);
         GL11.glTexParameteri(3553, 10241, 9729);
      }

      GlStateManager.bindTexture(0);

      for(var10 = 0; var10 < 4 && 4 + var10 < bd; ++var10) {
         GlStateManager.setActiveTexture('蓇' + var10);
         GlStateManager.bindTexture(df.get(4 + var10));
      }

      GlStateManager.setActiveTexture(33990);
      GlStateManager.bindTexture(dg.get(0));
      if (be >= 2) {
         GlStateManager.setActiveTexture(33995);
         GlStateManager.bindTexture(dg.get(1));
         if (be >= 3) {
            GlStateManager.setActiveTexture(33996);
            GlStateManager.bindTexture(dg.get(2));
         }
      }

      for(var10 = 0; var10 < bf; ++var10) {
         GlStateManager.setActiveTexture('蓍' + var10);
         GlStateManager.bindTexture(dh.get(var10));
      }

      if (ea) {
         GlStateManager.setActiveTexture('蓀' + dZ.a());
         GlStateManager.bindTexture(dZ.c());
         GL11.glTexParameteri(3553, 10242, 10497);
         GL11.glTexParameteri(3553, 10243, 10497);
         GL11.glTexParameteri(3553, 10240, 9729);
         GL11.glTexParameteri(3553, 10241, 9729);
      }

      a(dU);
      GlStateManager.setActiveTexture(33984);
      aJ = aM;
      aK = aN;
      aL = aO;
      db.position(0);
      cT.position(0);
      db.put(cT);
      db.position(0);
      cT.position(0);
      dc.position(0);
      cV.position(0);
      dc.put(cV);
      dc.position(0);
      cV.position(0);
      e("beginRender");
      skid.gay.sex.spermix.inside.shalopay.k.W.a(b, 0, var1, var2);
      a.mcProfiler.endSection();
      EXTFramebufferObject.glBindFramebufferEXT(36160, bj);

      for(var10 = 0; var10 < bd; ++var10) {
         cI[var10] = 0;
         EXTFramebufferObject.glFramebufferTexture2DEXT(36160, '賠' + var10, 3553, cH[var10], 0);
      }

      e("end beginRender");
   }

   public static void al() {
      a.mcProfiler.endSection();
   }

   public static boolean as() {
      return dy && dz;
   }

   private static void a(B[] var0, n var1) {
      Properties var2 = new Properties();
      if (cd != null) {
         for(int var3 = 0; var3 < var0.length; ++var3) {
            B var4 = var0[var3];
            if (var4.k() && var4.j()) {
               var2.setProperty(var4.a(), var4.d());
            }
         }
      }

      try {
         a(var1, var2);
      } catch (IOException var5) {
         skid.gay.sex.spermix.inside.shalopay.j.q.b(String.valueOf((new StringBuilder("[Shaders] Error saving configuration for ")).append(bT.a())));
         var5.printStackTrace();
      }

   }

   public static void a(String var0) {
      bV = var0;
      bq.setProperty(skid.gay.sex.spermix.inside.shalopay.k.e.j.b(), var0);
      c();
   }

   private static B[] a(Map var0, B[] var1) {
      HashSet var2 = new HashSet();
      Iterator var4 = var0.keySet().iterator();

      while(var4.hasNext()) {
         String var3 = (String)var4.next();
         y var5 = (y)var0.get(var3);
         B[] var6 = var5.a();

         for(int var7 = 0; var7 < var6.length; ++var7) {
            B var8 = var6[var7];
            if (var8 != null) {
               var2.add(var8.a());
            }
         }
      }

      ArrayList var9 = new ArrayList();

      for(int var10 = 0; var10 < var1.length; ++var10) {
         B var12 = var1[var10];
         if (var12.l()) {
            String var13 = var12.a();
            if (!var2.contains(var13)) {
               var9.add(var12);
            }
         }
      }

      B[] var11 = (B[])var9.toArray(new B[var9.size()]);
      return var11;
   }

   private static void h(String var0) {
      Shaders.a(var0);
      a.ingameGUI.getChatGUI().printChatMessage(new TextComponentString(var0));
   }

   public static void a(int var0) {
      e("pre-useProgram");
      if (s) {
         var0 = 30;
         if (bm[30] == 0) {
            bs = false;
            return;
         }
      }

      if (bl != var0) {
         bl = var0;
         ARBShaderObjects.glUseProgramObjectARB(bm[var0]);
         if (bm[var0] == 0) {
            bs = false;
         } else {
            if (a("useProgram ", dF[var0]) != 0) {
               bm[var0] = 0;
            }

            IntBuffer var1 = bn[var0];
            if (r) {
               a(var1);
               a(dF[var0], " draw buffers = ", dJ[var0]);
            }

            dQ = dO[var0];
            aG.a(bm[bl]);
            aH.a(bm[bl]);
            aI.a(bm[bl]);
            switch(var0) {
            case 1:
            case 2:
            case 3:
            case 4:
            case 5:
            case 6:
            case 7:
            case 8:
            case 9:
            case 10:
            case 11:
            case 12:
            case 13:
            case 16:
            case 18:
            case 19:
            case 20:
               bs = true;
               b("texture", 0);
               b("lightmap", 1);
               b("normals", 2);
               b("specular", 3);
               b("shadow", bc ? 5 : 4);
               b("watershadow", 4);
               b("shadowtex0", 4);
               b("shadowtex1", 5);
               b("depthtex0", 6);
               if (dU != null) {
                  b("gaux1", 7);
                  b("gaux2", 8);
                  b("gaux3", 9);
                  b("gaux4", 10);
               }

               b("depthtex1", 12);
               b("shadowcolor", 13);
               b("shadowcolor0", 13);
               b("shadowcolor1", 14);
               b("noisetex", 15);
               break;
            case 14:
            case 15:
            case 17:
            default:
               bs = false;
               break;
            case 21:
            case 22:
            case 23:
            case 24:
            case 25:
            case 26:
            case 27:
            case 28:
            case 29:
               bs = false;
               b("gcolor", 0);
               b("gdepth", 1);
               b("gnormal", 2);
               b("composite", 3);
               b("gaux1", 7);
               b("gaux2", 8);
               b("gaux3", 9);
               b("gaux4", 10);
               b("colortex0", 0);
               b("colortex1", 1);
               b("colortex2", 2);
               b("colortex3", 3);
               b("colortex4", 7);
               b("colortex5", 8);
               b("colortex6", 9);
               b("colortex7", 10);
               b("shadow", bc ? 5 : 4);
               b("watershadow", 4);
               b("shadowtex0", 4);
               b("shadowtex1", 5);
               b("gdepthtex", 6);
               b("depthtex0", 6);
               b("depthtex1", 11);
               b("depthtex2", 12);
               b("shadowcolor", 13);
               b("shadowcolor0", 13);
               b("shadowcolor1", 14);
               b("noisetex", 15);
               break;
            case 30:
            case 31:
            case 32:
               b("tex", 0);
               b("texture", 0);
               b("lightmap", 1);
               b("normals", 2);
               b("specular", 3);
               b("shadow", bc ? 5 : 4);
               b("watershadow", 4);
               b("shadowtex0", 4);
               b("shadowtex1", 5);
               if (dU != null) {
                  b("gaux1", 7);
                  b("gaux2", 8);
                  b("gaux3", 9);
                  b("gaux4", 10);
               }

               b("shadowcolor", 13);
               b("shadowcolor0", 13);
               b("shadowcolor1", 14);
               b("noisetex", 15);
            }

            ItemStack var2 = Minecraft.player != null ? Minecraft.player.getHeldItemMainhand() : null;
            Item var3 = var2 != null ? var2.getItem() : null;
            int var4 = -1;
            Block var5 = null;
            if (var3 != null) {
               var4 = Item.REGISTRY.getIDForObject(var3);
               var5 = (Block)Block.REGISTRY.getObjectById(var4);
            }

            int var6 = var5 != null ? var5.getLightValue(var5.getDefaultState()) : 0;
            ItemStack var7 = Minecraft.player != null ? Minecraft.player.getHeldItemOffhand() : null;
            Item var8 = var7 != null ? var7.getItem() : null;
            int var9 = -1;
            Block var10 = null;
            if (var8 != null) {
               var9 = Item.REGISTRY.getIDForObject(var8);
               var10 = (Block)Block.REGISTRY.getObjectById(var9);
            }

            int var11 = var10 != null ? var10.getLightValue(var10.getDefaultState()) : 0;
            if (h() && var11 > var6) {
               var4 = var9;
               var6 = var11;
            }

            b("heldItemId", var4);
            b("heldBlockLightValue", var6);
            b("heldItemId2", var9);
            b("heldBlockLightValue2", var11);
            b("fogMode", at ? cA : 0);
            a("fogColor", cB, cC, cD);
            a("skyColor", I, J, K);
            b("worldTime", (int)(L % 24000L));
            b("worldDay", (int)(L / 24000L));
            b("moonPhase", R);
            b("frameCounter", V);
            a("frameTime", W);
            a("frameTimeCounter", X);
            a("sunAngle", P);
            a("shadowAngle", Q);
            a("rainStrength", Z);
            a("aspectRatio", (float)m / (float)n);
            a("viewWidth", (float)m);
            a("viewHeight", (float)n);
            a("near", 0.05F);
            a("far", (float)(a.gameSettings.renderDistanceChunks * 16));
            a("sunPosition", x[0], x[1], x[2]);
            a("moonPosition", y[0], y[1], y[2]);
            a("shadowLightPosition", z[0], z[1], z[2]);
            a("upPosition", A[0], A[1], A[2]);
            a("previousCameraPosition", (float)aJ, (float)aK, (float)aL);
            a("cameraPosition", (float)aM, (float)aN, (float)aO);
            a("gbufferModelView", false, cV);
            a("gbufferModelViewInverse", false, cW);
            a("gbufferPreviousProjection", false, db);
            a("gbufferProjection", false, cT);
            a("gbufferProjectionInverse", false, cU);
            a("gbufferPreviousModelView", false, dc);
            if (bg > 0) {
               a("shadowProjection", false, cX);
               a("shadowProjectionInverse", false, cY);
               a("shadowModelView", false, cZ);
               a("shadowModelViewInverse", false, da);
            }

            a("wetness", aa);
            a("eyeAltitude", aj);
            a("eyeBrightness", ag & '\uffff', ag >> 16);
            a("eyeBrightnessSmooth", Math.round(ah), Math.round(ai));
            a("terrainTextureSize", cG[0], cG[1]);
            b("terrainIconSize", cF);
            b("isEyeInWater", af);
            a("nightVision", ap);
            a("blindness", aq);
            a("screenBrightness", a.gameSettings.gammaSetting);
            b("hideGUI", a.gameSettings.hideGUI ? 1 : 0);
            a("centerDepthSmooth", al);
            a("atlasSize", aE, aF);
            a("useProgram ", dF[var0]);
         }
      }

   }

   public static int d(String var0) {
      int var1 = EXTFramebufferObject.glCheckFramebufferStatusEXT(36160);
      if (var1 != 36053) {
         System.err.format("FramebufferStatus 0x%04X at %s\n", var1, var0);
      }

      return var1;
   }

   public static void ag() {
      at = true;
      b("fogMode", cA);
   }

   public static String am() {
      if (bT == null) {
         return null;
      } else {
         return bT instanceof L ? null : bT.a();
      }
   }

   public static void W() {
      if (o) {
         if (s) {
         }

         a(as ? 3 : 2);
      }

   }

   private static void a(World var0) {
      if (dS != var0) {
         World var1 = dS;
         dS = var0;
         if (var1 != null && var0 != null) {
            int var2 = var1.provider.getDimensionType().getId();
            int var3 = var0.provider.getDimensionType().getId();
            boolean var4 = dT.contains(var2);
            boolean var5 = dT.contains(var3);
            if (var4 || var5) {
               s();
            }
         }
      }

   }

   public static boolean o() {
      return !cp.h();
   }

   public static void ao() {
      try {
         Class var0 = Class.forName("shadersmod.transform.SMCClassTransformer");
      } catch (Throwable var1) {
         return;
      }

      throw new RuntimeException("Shaders Mod detected. Please remove it, OptiFine has built-in support for shaders.");
   }

   private static int k(String var0) {
      if (!var0.equals("colortex0") && !var0.equals("gcolor")) {
         if (!var0.equals("colortex1") && !var0.equals("gdepth")) {
            if (!var0.equals("colortex2") && !var0.equals("gnormal")) {
               if (!var0.equals("colortex3") && !var0.equals("composite")) {
                  if (!var0.equals("colortex4") && !var0.equals("gaux1")) {
                     if (!var0.equals("colortex5") && !var0.equals("gaux2")) {
                        if (!var0.equals("colortex6") && !var0.equals("gaux3")) {
                           return !var0.equals("colortex7") && !var0.equals("gaux4") ? -1 : 7;
                        } else {
                           return 6;
                        }
                     } else {
                        return 5;
                     }
                  } else {
                     return 4;
                  }
               } else {
                  return 3;
               }
            } else {
               return 2;
            }
         } else {
            return 1;
         }
      } else {
         return 0;
      }
   }

   public static float aw() {
      return aY < 0.0F ? -1.0F : aW * aY;
   }

   public static void a(int var0, float var1, long var2) {
      if (!s) {
         EXTFramebufferObject.glBindFramebufferEXT(36160, bj);
         GL11.glViewport(0, 0, m, n);
         bo = null;
         skid.gay.sex.spermix.inside.shalopay.k.X.a(br.getMultiTexID());
         a(2);
         e("end beginRenderPass");
      }

   }

   public static void aa() {
      GlStateManager.disableLighting();
      GlStateManager.disableBlend();
   }

   private static d a(int var0, String var1) {
      if (var1 == null) {
         return null;
      } else {
         var1 = var1.trim();
         if (var1.indexOf(46) < 0) {
            var1 = String.valueOf((new StringBuilder(String.valueOf(var1))).append(".png"));
         }

         try {
            String var2 = String.valueOf((new StringBuilder("shaders/")).append(skid.gay.sex.spermix.inside.shalopay.j.bx.a(var1, "/")));
            InputStream var3 = bT.a(var2);
            if (var3 == null) {
               Shaders.b(String.valueOf((new StringBuilder("Texture not found: ")).append(var1)));
               return null;
            } else {
               IOUtils.closeQuietly(var3);
               Z var4 = new Z(var2);
               var4.loadTexture(a.getResourceManager());
               d var5 = new d(var0, var2, var4);
               return var5;
            }
         } catch (IOException var6) {
            Shaders.b(String.valueOf((new StringBuilder("Error loading texture: ")).append(var1)));
            Shaders.b(String.valueOf((new StringBuilder()).append(var6.getClass().getName()).append(": ").append(var6.getMessage())));
            return null;
         }
      }
   }

   public static InputStream f(String var0) {
      return bT == null ? null : bT.a(var0);
   }

   public static B[] d() {
      return cd;
   }

   public static void E() {
      BufferBuilder var0 = Tessellator.getInstance().getBuffer();
      float var1 = (float)(a.gameSettings.renderDistanceChunks * 16);
      double var2 = (double)var1 * 0.9238D;
      double var4 = (double)var1 * 0.3826D;
      double var6 = -var4;
      double var8 = -var2;
      double var10 = 16.0D;
      double var12 = -aN;
      var0.begin(7, DefaultVertexFormats.POSITION);
      var0.pos(var6, var12, var8).endVertex();
      var0.pos(var6, var10, var8).endVertex();
      var0.pos(var8, var10, var6).endVertex();
      var0.pos(var8, var12, var6).endVertex();
      var0.pos(var8, var12, var6).endVertex();
      var0.pos(var8, var10, var6).endVertex();
      var0.pos(var8, var10, var4).endVertex();
      var0.pos(var8, var12, var4).endVertex();
      var0.pos(var8, var12, var4).endVertex();
      var0.pos(var8, var10, var4).endVertex();
      var0.pos(var6, var10, var4).endVertex();
      var0.pos(var6, var12, var4).endVertex();
      var0.pos(var6, var12, var4).endVertex();
      var0.pos(var6, var10, var4).endVertex();
      var0.pos(var4, var10, var2).endVertex();
      var0.pos(var4, var12, var2).endVertex();
      var0.pos(var4, var12, var2).endVertex();
      var0.pos(var4, var10, var2).endVertex();
      var0.pos(var2, var10, var4).endVertex();
      var0.pos(var2, var12, var4).endVertex();
      var0.pos(var2, var12, var4).endVertex();
      var0.pos(var2, var10, var4).endVertex();
      var0.pos(var2, var10, var6).endVertex();
      var0.pos(var2, var12, var6).endVertex();
      var0.pos(var2, var12, var6).endVertex();
      var0.pos(var2, var10, var6).endVertex();
      var0.pos(var4, var10, var8).endVertex();
      var0.pos(var4, var12, var8).endVertex();
      var0.pos(var4, var12, var8).endVertex();
      var0.pos(var4, var10, var8).endVertex();
      var0.pos(var6, var10, var8).endVertex();
      var0.pos(var6, var12, var8).endVertex();
      Tessellator.getInstance().draw();
   }

   private static void aE() {
      b(dU);
      b(dV);
      dU = null;
      dV = null;
   }

   public static void a(float var0, float var1, float var2, float var3) {
      GlStateManager.clearColor(var0, var1, var2, var3);
      F = var0;
      G = var1;
      H = var2;
   }

   private static void a(n var0, Properties var1) {
      String var2 = String.valueOf((new StringBuilder(String.valueOf(bY))).append("/").append(var0.a()).append(".txt"));
      File var3 = new File(Minecraft.getMinecraft().mcDataDir, var2);
      if (var1.isEmpty()) {
         var3.delete();
      } else {
         FileOutputStream var4 = new FileOutputStream(var3);
         var1.store(var4, (String)null);
         var4.flush();
         var4.close();
      }

   }

   public static void ap() {
      aM();
   }

   public static boolean a(GameSettings var0) {
      if (!bU) {
         return true;
      } else {
         e("shouldRenderClouds");
         return s ? bz : var0.clouds > 0;
      }
   }

   public static void a(IntBuffer var0) {
      if (var0 == null) {
         var0 = dl;
      }

      if (bo != var0) {
         bo = var0;
         GL20.glDrawBuffers(var0);
      }

   }

   private static void c(String var0, String var1) {
      try {
         File var2 = new File(cb, String.valueOf((new StringBuilder("debug/")).append(var0)));
         var2.getParentFile().mkdirs();
         skid.gay.sex.spermix.inside.shalopay.j.q.a(var2, var1);
      } catch (IOException var3) {
         skid.gay.sex.spermix.inside.shalopay.j.q.b(String.valueOf((new StringBuilder("Error saving: ")).append(var0)));
         var3.printStackTrace();
      }

   }

   public static boolean g(String var0) {
      if (var0 == null) {
         return false;
      } else if (var0.length() <= 0) {
         return false;
      } else {
         int var1 = var0.lastIndexOf("/");
         if (var1 >= 0) {
            var0 = var0.substring(var1 + 1);
         }

         return Arrays.asList(dF).contains(var0);
      }
   }

   private static boolean c(ItemStack var0) {
      if (var0 == null) {
         return false;
      } else {
         Item var1 = var0.getItem();
         if (var1 == null) {
            return false;
         } else if (!(var1 instanceof ItemBlock)) {
            return false;
         } else {
            ItemBlock var2 = (ItemBlock)var1;
            Block var3 = var2.getBlock();
            if (var3 == null) {
               return false;
            } else {
               BlockRenderLayer var4 = var3.getBlockLayer();
               return var4 == BlockRenderLayer.TRANSLUCENT;
            }
         }
      }
   }

   public static void ay() {
      if (o) {
         a(14);
      }

   }

   public static void a(Vec3d var0) {
      I = (float)var0.xCoord;
      J = (float)var0.yCoord;
      K = (float)var0.zCoord;
      a("skyColor", I, J, K);
   }

   private static boolean c(int var0, String var1) {
      IntBuffer var2 = BufferUtils.createIntBuffer(1);
      ARBShaderObjects.glGetObjectParameterARB(var0, 35716, var2);
      int var3 = var2.get();
      if (var3 > 1) {
         ByteBuffer var4 = BufferUtils.createByteBuffer(var3);
         var2.flip();
         ARBShaderObjects.glGetInfoLogARB(var0, var2, var4);
         byte[] var5 = new byte[var3];
         var4.get(var5);
         if (var5[var3 - 1] == 0) {
            var5[var3 - 1] = 10;
         }

         String var6 = new String(var5);
         Shaders.c(String.valueOf((new StringBuilder("Info log: ")).append(var1).append("\n").append(var6)));
         return false;
      } else {
         return true;
      }
   }

   public static void x() {
      FloatBuffer var0 = dd;
      var0.clear();
      GL11.glGetFloat(2982, var0);
      var0.get(dC, 0, 16);
      skid.gay.sex.spermix.inside.shalopay.k.v.b(x, dC, D);
      skid.gay.sex.spermix.inside.shalopay.k.v.b(y, dC, E);
      System.arraycopy(Q == P ? x : y, 0, z, 0, 3);
      a("sunPosition", x[0], x[1], x[2]);
      a("moonPosition", y[0], y[1], y[2]);
      a("shadowLightPosition", z[0], z[1], z[2]);
      e("postCelestialRotate");
   }

   public static String a(e var0) {
      switch(aA()[var0.ordinal()]) {
      case 1:
         return Integer.toString(bO);
      case 2:
         return Boolean.toString(bK);
      case 3:
         return Boolean.toString(bL);
      case 4:
         return Float.toString(bB);
      case 5:
         return Float.toString(bC);
      case 6:
         return Float.toString(bA);
      case 7:
         return Boolean.toString(bz);
      case 8:
         return bN.d();
      case 9:
         return bM.d();
      case 10:
         return bV;
      case 11:
         return Boolean.toString(by);
      case 12:
         return Boolean.toString(bJ);
      case 13:
         return Integer.toString(bD);
      case 14:
         return Integer.toString(bE);
      case 15:
         return Integer.toString(bF);
      case 16:
         return Integer.toString(bG);
      case 17:
         return Integer.toString(bG);
      case 18:
         return Integer.toString(bG);
      default:
         throw new IllegalArgumentException(String.valueOf((new StringBuilder("Unknown option: ")).append(var0)));
      }
   }

   public static void q() {
      ++k;
      l = true;
      Shaders.c("Reset world renderers");
      a.renderGlobal.loadRenderers();
   }

   public static void V() {
      if (o) {
         if (!s) {
            a(12);
            GlStateManager.enableBlend();
            GlStateManager.depthMask(true);
         } else {
            GlStateManager.depthMask(true);
         }
      }

   }

   public static void b() {
      Shaders.c("Save ShadersMod configuration.");
      if (bq == null) {
         bq = new bd();
      }

      e[] var0 = skid.gay.sex.spermix.inside.shalopay.k.e.d();

      for(int var1 = 0; var1 < var0.length; ++var1) {
         e var2 = var0[var1];
         String var3 = var2.b();
         String var4 = a(var2);
         bq.setProperty(var3, var4);
      }

      try {
         FileWriter var6 = new FileWriter(cc);
         bq.store(var6, (String)null);
         var6.close();
      } catch (Exception var5) {
         Shaders.a(String.valueOf((new StringBuilder("Error saving configuration: ")).append(var5.getClass().getName()).append(": ").append(var5.getMessage())));
      }

   }

   public static void K() {
      if (o && bm[18] != bm[0]) {
         a(18);
         GlStateManager.enableAlpha();
         GlStateManager.alphaFunc(516, 0.0F);
         GlStateManager.blendFunc(770, 771);
      }

   }

   // $FF: synthetic method
   static int[] aB() {
      int[] var10000 = eh;
      if (var10000 != null) {
         return var10000;
      } else {
         int[] var0 = new int[BlockRenderLayer.values().length];

         try {
            var0[BlockRenderLayer.CUTOUT.ordinal()] = 3;
         } catch (NoSuchFieldError var4) {
         }

         try {
            var0[BlockRenderLayer.CUTOUT_MIPPED.ordinal()] = 2;
         } catch (NoSuchFieldError var3) {
         }

         try {
            var0[BlockRenderLayer.SOLID.ordinal()] = 1;
         } catch (NoSuchFieldError var2) {
         }

         try {
            var0[BlockRenderLayer.TRANSLUCENT.ordinal()] = 4;
         } catch (NoSuchFieldError var1) {
         }

         eh = var0;
         return var0;
      }
   }

   public static void p() {
      boolean var0;
      if (!c) {
         c = true;
         var0 = true;
      } else {
         var0 = false;
      }

      if (!d) {
         e("Shaders.init pre");
         if (am() != null) {
         }

         if (!e.OpenGL20) {
            h("No OpenGL 2.0");
         }

         if (!e.GL_EXT_framebuffer_object) {
            h("No EXT_framebuffer_object");
         }

         dj.position(0).limit(8);
         df.position(0).limit(16);
         dg.position(0).limit(3);
         dk.position(0).limit(8);
         di.position(0).limit(2);
         dh.position(0).limit(8);
         bd = 4;
         be = 1;
         bf = 0;
         bg = 0;
         bh = 1;
         bi = 1;
         Arrays.fill(dD, 6408);
         Arrays.fill(dE, true);
         Arrays.fill(bt, false);
         Arrays.fill(bu, false);
         Arrays.fill(bv, false);
         Arrays.fill(bw, false);
         Arrays.fill(bx, false);
         an = false;
         ea = false;
         cy = 0.0F;
         cE = 2.0F;
         aY = -1.0F;
         cx = -1.0F;
         ax = false;
         ay = false;
         az = false;
         aA = false;
         bc = false;
         ar = false;
         g();
         Q var1 = skid.gay.sex.spermix.inside.shalopay.k.U.a(cf, cd, false);
         String var2 = "";
         int var3;
         if (dS != null) {
            var3 = dS.provider.getDimensionType().getId();
            if (dT.contains(var3)) {
               var2 = String.valueOf((new StringBuilder("world")).append(var3).append("/"));
            }
         }

         if (dY) {
            a(new File(cb, "debug"));
         }

         String var5;
         int var7;
         for(var3 = 0; var3 < 33; ++var3) {
            String var4 = dF[var3];
            if (var4.equals("")) {
               bm[var3] = dH[var3] = 0;
               dJ[var3] = null;
               dL[var3] = null;
               dO[var3] = 0;
            } else {
               dK = null;
               dM = null;
               dP = 0;
               var5 = String.valueOf((new StringBuilder(String.valueOf(var2))).append(var4));
               if (var1 != null && var1.c(var5)) {
                  Shaders.c(String.valueOf((new StringBuilder("Program disabled: ")).append(var5)));
                  var4 = "<disabled>";
                  var5 = String.valueOf((new StringBuilder(String.valueOf(var2))).append(var4));
               }

               String var6 = String.valueOf((new StringBuilder("/shaders/")).append(var5));
               var7 = a(var3, String.valueOf((new StringBuilder(String.valueOf(var6))).append(".vsh")), String.valueOf((new StringBuilder(String.valueOf(var6))).append(".fsh")));
               if (var7 > 0) {
                  Shaders.c(String.valueOf((new StringBuilder("Program loaded: ")).append(var5)));
               }

               bm[var3] = dH[var3] = var7;
               dJ[var3] = var7 != 0 ? dK : null;
               dL[var3] = var7 != 0 ? dM : null;
               dO[var3] = var7 != 0 ? dP : 0;
            }
         }

         var3 = GL11.glGetInteger(34852);
         new HashMap();

         int var11;
         for(var11 = 0; var11 < 33; ++var11) {
            Arrays.fill(cK[var11], false);
            if (var11 == 29) {
               bn[var11] = null;
            } else if (bm[var11] == 0) {
               if (var11 == 30) {
                  bn[var11] = dl;
               } else {
                  bn[var11] = dq;
               }
            } else {
               var5 = dJ[var11];
               if (var5 != null) {
                  IntBuffer var12 = dr[var11];
                  var7 = var5.length();
                  if (var7 > bi) {
                     bi = var7;
                  }

                  if (var7 > var3) {
                     var7 = var3;
                  }

                  bn[var11] = var12;
                  var12.limit(var7);

                  for(int var8 = 0; var8 < var7; ++var8) {
                     int var9 = 0;
                     if (var5.length() > var8) {
                        int var10 = var5.charAt(var8) - 48;
                        if (var11 != 30) {
                           if (var10 >= 0 && var10 <= 7) {
                              cK[var11][var10] = true;
                              var9 = var10 + '賠';
                              if (var10 > bh) {
                                 bh = var10;
                              }

                              if (var10 > bd) {
                                 bd = var10;
                              }
                           }
                        } else if (var10 >= 0 && var10 <= 1) {
                           var9 = var10 + '賠';
                           if (var10 > bf) {
                              bf = var10;
                           }
                        }
                     }

                     var12.put(var8, var9);
                  }
               } else if (var11 != 30 && var11 != 31 && var11 != 32) {
                  bn[var11] = dj;
                  bi = bd;
                  Arrays.fill(cK[var11], 0, bd, true);
               } else {
                  bn[var11] = dk;
               }
            }
         }

         bh = bd;
         aP = bg > 0 ? 1 : 0;
         bb = bg > 0;
         Shaders.c(String.valueOf((new StringBuilder("usedColorBuffers: ")).append(bd)));
         Shaders.c(String.valueOf((new StringBuilder("usedDepthBuffers: ")).append(be)));
         Shaders.c(String.valueOf((new StringBuilder("usedShadowColorBuffers: ")).append(bf)));
         Shaders.c(String.valueOf((new StringBuilder("usedShadowDepthBuffers: ")).append(bg)));
         Shaders.c(String.valueOf((new StringBuilder("usedColorAttachs: ")).append(bh)));
         Shaders.c(String.valueOf((new StringBuilder("usedDrawBuffers: ")).append(bi)));
         dj.position(0).limit(bi);
         df.position(0).limit(bd * 2);

         for(var11 = 0; var11 < bi; ++var11) {
            dj.put(var11, '賠' + var11);
         }

         if (bi > var3) {
            h(String.valueOf((new StringBuilder("[Shaders] Error: Not enough draw buffers, needed: ")).append(bi).append(", available: ").append(var3)));
         }

         dk.position(0).limit(bf);

         for(var11 = 0; var11 < bf; ++var11) {
            dk.put(var11, '賠' + var11);
         }

         for(var11 = 0; var11 < 33; ++var11) {
            int var13;
            for(var13 = var11; bm[var13] == 0 && dG[var13] != var13; var13 = dG[var13]) {
            }

            if (var13 != var11 && var11 != 30) {
               bm[var11] = bm[var13];
               dJ[var11] = dJ[var13];
               bn[var11] = bn[var13];
            }
         }

         aI();
         aJ();
         if (ea) {
            aG();
         }

         if (br == null) {
            br = skid.gay.sex.spermix.inside.shalopay.k.X.a();
         }

         GlStateManager.pushMatrix();
         GlStateManager.rotate(-90.0F, 0.0F, 1.0F, 0.0F);
         w();
         x();
         GlStateManager.popMatrix();
         d = true;
         aH();
         q();
         if (!var0) {
         }

         e("Shaders.init");
      }

   }

   public static void S() {
      if (!s) {
         if (be >= 3) {
            GlStateManager.setActiveTexture(33996);
            GL11.glCopyTexSubImage2D(3553, 0, 0, 0, 0, 0, m, n);
            GlStateManager.setActiveTexture(33984);
         }

         GlStateManager.enableDepth();
         GlStateManager.enableBlend();
         GlStateManager.blendFunc(770, 771);
         GlStateManager.enableAlpha();
         a(20);
      }

   }

   public static void w() {
      GL11.glRotatef(cy * 1.0F, 0.0F, 0.0F, 1.0F);
      e("preCelestialRotate");
   }

   public static void ab() {
   }

   public static void b(ItemStack var0) {
      w = c(var0);
   }

   public static void a(float var0, float var1, float var2) {
      cB = var0;
      cC = var1;
      cD = var2;
   }

   private static void a(d[] var0) {
      if (var0 != null) {
         for(int var1 = 0; var1 < var0.length; ++var1) {
            d var2 = var0[var1];
            GlStateManager.setActiveTexture('蓀' + var2.a());
            ITextureObject var3 = var2.b();
            GlStateManager.bindTexture(var3.getGlTextureId());
         }
      }

   }

   private static IntBuffer b(IntBuffer var0) {
      int var1 = var0.limit();

      for(int var2 = var0.position(); var2 < var1; ++var2) {
         var0.put(var2, 0);
      }

      return var0;
   }

   public static void b(TileEntity var0) {
      if (o && !s && aI.d()) {
         Block var1 = var0.getBlockType();
         int var2 = Block.getIdFromBlock(var1);
         aI.b(var2);
      }

   }

   public static boolean i() {
      return !ck.f() ? ck.g() : true;
   }

   public static void a(int var0, int var1) {
      ++du;
      dt[du * 2] = var0 & '\uffff' | var1 << 16;
      dt[du * 2 + 1] = 0;
   }

   public static void B() {
      if (!s) {
         e("pre-renderCompositeFinal");
         GL11.glPushMatrix();
         GL11.glLoadIdentity();
         GL11.glMatrixMode(5889);
         GL11.glPushMatrix();
         GL11.glLoadIdentity();
         GL11.glOrtho(0.0D, 1.0D, 0.0D, 1.0D, 0.0D, 1.0D);
         GL11.glColor4f(1.0F, 1.0F, 1.0F, 1.0F);
         GlStateManager.enableTexture2D();
         GlStateManager.disableAlpha();
         GlStateManager.disableBlend();
         GlStateManager.enableDepth();
         GlStateManager.depthFunc(519);
         GlStateManager.depthMask(false);
         GlStateManager.disableLighting();
         if (bg >= 1) {
            GlStateManager.setActiveTexture(33988);
            GlStateManager.bindTexture(di.get(0));
            if (bg >= 2) {
               GlStateManager.setActiveTexture(33989);
               GlStateManager.bindTexture(di.get(1));
            }
         }

         int var0;
         for(var0 = 0; var0 < bd; ++var0) {
            GlStateManager.setActiveTexture('蓀' + cJ[var0]);
            GlStateManager.bindTexture(cH[var0]);
         }

         GlStateManager.setActiveTexture(33990);
         GlStateManager.bindTexture(dg.get(0));
         if (be >= 2) {
            GlStateManager.setActiveTexture(33995);
            GlStateManager.bindTexture(dg.get(1));
            if (be >= 3) {
               GlStateManager.setActiveTexture(33996);
               GlStateManager.bindTexture(dg.get(2));
            }
         }

         for(var0 = 0; var0 < bf; ++var0) {
            GlStateManager.setActiveTexture('蓍' + var0);
            GlStateManager.bindTexture(dh.get(var0));
         }

         if (ea) {
            GlStateManager.setActiveTexture('蓀' + dZ.a());
            GlStateManager.bindTexture(dZ.c());
            GL11.glTexParameteri(3553, 10242, 10497);
            GL11.glTexParameteri(3553, 10243, 10497);
            GL11.glTexParameteri(3553, 10240, 9729);
            GL11.glTexParameteri(3553, 10241, 9729);
         }

         a(dV);
         GlStateManager.setActiveTexture(33984);
         boolean var5 = true;

         int var1;
         for(var1 = 0; var1 < bd; ++var1) {
            EXTFramebufferObject.glFramebufferTexture2DEXT(36160, '賠' + var1, 3553, cH[8 + var1], 0);
         }

         EXTFramebufferObject.glFramebufferTexture2DEXT(36160, 36096, 3553, dg.get(0), 0);
         GL20.glDrawBuffers(dj);
         e("pre-composite");

         for(var1 = 0; var1 < 8; ++var1) {
            if (bm[21 + var1] != 0) {
               a(21 + var1);
               e(dF[21 + var1]);
               if (dQ != 0) {
                  z();
               }

               A();

               for(int var2 = 0; var2 < bd; ++var2) {
                  if (cK[21 + var1][var2]) {
                     int var3 = cI[var2];
                     int var4 = cI[var2] = 8 - var3;
                     GlStateManager.setActiveTexture('蓀' + cJ[var2]);
                     GlStateManager.bindTexture(cH[var4 + var2]);
                     EXTFramebufferObject.glFramebufferTexture2DEXT(36160, '賠' + var2, 3553, cH[var3 + var2], 0);
                  }
               }

               GlStateManager.setActiveTexture(33984);
            }
         }

         e("composite");
         r = false;
         a.getFramebuffer().bindFramebuffer(true);
         OpenGlHelper.glFramebufferTexture2D(OpenGlHelper.GL_FRAMEBUFFER, OpenGlHelper.GL_COLOR_ATTACHMENT0, 3553, a.getFramebuffer().framebufferTexture, 0);
         GL11.glViewport(0, 0, a.displayWidth, a.displayHeight);
         if (EntityRenderer.anaglyphEnable) {
            boolean var6 = EntityRenderer.anaglyphField != 0;
            GlStateManager.colorMask(var6, !var6, !var6, true);
         }

         GlStateManager.depthMask(true);
         GL11.glClearColor(F, G, H, 1.0F);
         GL11.glClear(16640);
         GL11.glColor4f(1.0F, 1.0F, 1.0F, 1.0F);
         GlStateManager.enableTexture2D();
         GlStateManager.disableAlpha();
         GlStateManager.disableBlend();
         GlStateManager.enableDepth();
         GlStateManager.depthFunc(519);
         GlStateManager.depthMask(false);
         e("pre-final");
         a(29);
         e("final");
         if (dQ != 0) {
            z();
         }

         A();
         e("renderCompositeFinal");
         q = true;
         GlStateManager.enableLighting();
         GlStateManager.enableTexture2D();
         GlStateManager.enableAlpha();
         GlStateManager.enableBlend();
         GlStateManager.depthFunc(515);
         GlStateManager.depthMask(true);
         GL11.glPopMatrix();
         GL11.glMatrixMode(5888);
         GL11.glPopMatrix();
         a(0);
      }

   }

   private static void aD() {
      ch.e();
      cj.e();
      ck.e();
      ci.e();
      cl.e();
      cm.e();
      cn.e();
      co.e();
      cp.e();
      cq.e();
      cr.e();
      cs.e();
      ct.e();
      skid.gay.sex.spermix.inside.shalopay.k.b.a();
      if (bT != null) {
         skid.gay.sex.spermix.inside.shalopay.k.b.a(bT);
         String var0 = "/shaders/shaders.properties";

         try {
            InputStream var1 = bT.a(var0);
            if (var1 == null) {
               return;
            }

            bd var2 = new bd();
            var2.load(var1);
            var1.close();
            ch.a(var2);
            cj.a(var2);
            ck.a(var2);
            ci.a(var2);
            cl.a(var2);
            cm.a(var2);
            cn.a(var2);
            cp.a(var2);
            co.a(var2);
            cq.a(var2);
            cr.a(var2);
            cs.a(var2);
            ct.a(var2);
            ce = skid.gay.sex.spermix.inside.shalopay.k.M.b(var2, cd);
            cf = skid.gay.sex.spermix.inside.shalopay.k.M.a((Properties)var2, (B[])cd);
            cg = skid.gay.sex.spermix.inside.shalopay.k.M.a((Properties)var2, (Q[])cf, (B[])cd);
            dU = a((Properties)var2, 0);
            dV = a((Properties)var2, 1);
            dW = var2.getProperty("texture.noise");
            if (dW != null) {
               ea = true;
            }
         } catch (IOException var3) {
            skid.gay.sex.spermix.inside.shalopay.j.q.b(String.valueOf((new StringBuilder("[Shaders] Error reading: ")).append(var0)));
         }
      }

   }

   public static void y() {
      FloatBuffer var0 = dd;
      var0.clear();
      GL11.glGetFloat(2982, var0);
      var0.get(dC, 0, 16);
      skid.gay.sex.spermix.inside.shalopay.k.v.b(A, dC, C);
      a("upPosition", A[0], A[1], A[2]);
   }

   private static void b(d[] var0) {
      if (var0 != null) {
         for(int var1 = 0; var1 < var0.length; ++var1) {
            d var2 = var0[var1];
            var2.d();
         }
      }

   }

   public static boolean av() {
      return dz;
   }

   public static void v() {
      if (s) {
         e("shadow clear pre");
         EXTFramebufferObject.glFramebufferTexture2DEXT(36160, 36096, 3553, di.get(0), 0);
         GL11.glClearColor(1.0F, 1.0F, 1.0F, 1.0F);
         GL20.glDrawBuffers(bn[30]);
         d("shadow clear");
         GL11.glClear(16640);
         e("shadow clear");
      } else {
         e("clear pre");
         if (dE[0]) {
            GL20.glDrawBuffers(36064);
            GL11.glClear(16384);
         }

         if (dE[1]) {
            GL20.glDrawBuffers(36065);
            GL11.glClearColor(1.0F, 1.0F, 1.0F, 1.0F);
            GL11.glClear(16384);
         }

         for(int var0 = 2; var0 < bd; ++var0) {
            if (dE[var0]) {
               GL20.glDrawBuffers('賠' + var0);
               GL11.glClearColor(0.0F, 0.0F, 0.0F, 0.0F);
               GL11.glClear(16384);
            }
         }

         a(dj);
         d("clear");
         e("clear");
      }

   }
}
