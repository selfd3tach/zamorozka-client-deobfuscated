package skid.gay.sex.spermix.inside.shalopay.j;

import java.nio.ByteBuffer;
import java.util.Properties;
import net.minecraft.client.renderer.GLAllocation;
import net.minecraft.client.renderer.GlStateManager;
import net.minecraft.client.renderer.texture.ITextureObject;
import net.minecraft.util.ResourceLocation;
import org.lwjgl.opengl.GL11;

public class by {
   
   private int h = 0;
   
   private int k = 0;
   
   byte[] b = null;
   
   private int e = -1;
   
   private int i = 0;
   
   private ByteBuffer l = null;
   
   private int g = 0;
   
   private bz[] j = null;
   
   private String d = null;
   
   private int f = 0;
   
   ResourceLocation a = null;
   
   private String c = null;

   public boolean c() {
      if (this.e < 0) {
         ITextureObject var1 = bB.a(this.a);
         if (var1 == null) {
            return false;
         }

         this.e = var1.getGlTextureId();
      }

      if (this.l == null) {
         this.l = GLAllocation.createDirectByteBuffer(this.b.length);
         this.l.put(this.b);
         this.b = null;
      }

      if (!this.a()) {
         return false;
      } else {
         int var4 = this.h * this.i * 4;
         int var2 = this.b();
         int var3 = var4 * var2;
         if (var3 + var4 > this.l.capacity()) {
            return false;
         } else {
            this.l.position(var3);
            GlStateManager.bindTexture(this.e);
            GL11.glTexSubImage2D(3553, 0, this.f, this.g, this.h, this.i, 6408, 5121, this.l);
            return true;
         }
      }
   }

   public by(String var1, byte[] var2, String var3, ResourceLocation var4, int var5, int var6, int var7, int var8, Properties var9, int var10) {
      this.c = var1;
      this.d = var3;
      this.a = var4;
      this.f = var5;
      this.g = var6;
      this.h = var7;
      this.i = var8;
      int var11 = var7 * var8 * 4;
      if (var2.length % var11 != 0) {
         FastAura.b(String.valueOf((new StringBuilder("Invalid animated texture length: ")).append(var2.length).append(", frameWidth: ").append(var7).append(", frameHeight: ").append(var8)));
      }

      this.b = var2;
      int var12 = var2.length / var11;
      if (var9.get("tile.0") != null) {
         for(int var13 = 0; var9.get(String.valueOf((new StringBuilder("tile.")).append(var13))) != null; ++var13) {
            var12 = var13 + 1;
         }
      }

      String var21 = (String)var9.get("duration");
      int var14 = FastAura.a(var21, var10);
      this.j = new bz[var12];

      for(int var15 = 0; var15 < this.j.length; ++var15) {
         String var16 = (String)var9.get(String.valueOf((new StringBuilder("tile.")).append(var15)));
         int var17 = FastAura.a(var16, var15);
         String var18 = (String)var9.get(String.valueOf((new StringBuilder("duration.")).append(var15)));
         int var19 = FastAura.a(var18, var14);
         bz var20 = new bz(var17, var19);
         this.j[var15] = var20;
      }

   }

   public boolean a() {
      if (this.j.length <= 0) {
         return false;
      } else {
         if (this.k >= this.j.length) {
            this.k = 0;
         }

         bz var1 = this.j[this.k];
         ++var1.c;
         if (var1.c < var1.b) {
            return false;
         } else {
            var1.c = 0;
            ++this.k;
            if (this.k >= this.j.length) {
               this.k = 0;
            }

            return true;
         }
      }
   }

   public String d() {
      return this.d;
   }

   public int b() {
      if (this.j.length <= 0) {
         return 0;
      } else {
         if (this.k >= this.j.length) {
            this.k = 0;
         }

         bz var1 = this.j[this.k];
         return var1.a;
      }
   }
}
