package skid.gay.sex.spermix.inside.shalopay.k;

import com.google.gson.JsonObject;
import com.google.gson.JsonParser;
import java.awt.image.BufferedImage;
import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.InputStream;
import java.io.InputStreamReader;
import net.minecraft.client.renderer.texture.AbstractTexture;
import net.minecraft.client.renderer.texture.TextureUtil;
import net.minecraft.client.resources.IResourceManager;
import net.minecraft.client.resources.data.AnimationMetadataSection;
import net.minecraft.client.resources.data.AnimationMetadataSectionSerializer;
import net.minecraft.client.resources.data.FontMetadataSection;
import net.minecraft.client.resources.data.FontMetadataSectionSerializer;
import net.minecraft.client.resources.data.LanguageMetadataSection;
import net.minecraft.client.resources.data.LanguageMetadataSectionSerializer;
import net.minecraft.client.resources.data.MetadataSerializer;
import net.minecraft.client.resources.data.PackMetadataSection;
import net.minecraft.client.resources.data.PackMetadataSectionSerializer;
import net.minecraft.client.resources.data.TextureMetadataSection;
import net.minecraft.client.resources.data.TextureMetadataSectionSerializer;
import org.apache.commons.io.IOUtils;
import skid.gay.sex.spermix.inside.shalopay.shaders.Shaders;

public class Z extends AbstractTexture {
   
   private static final MetadataSerializer b = b();
   
   private String a;

   private static MetadataSerializer b() {
      MetadataSerializer var0 = new MetadataSerializer();
      var0.registerMetadataSectionType(new TextureMetadataSectionSerializer(), TextureMetadataSection.class);
      var0.registerMetadataSectionType(new FontMetadataSectionSerializer(), FontMetadataSection.class);
      var0.registerMetadataSectionType(new AnimationMetadataSectionSerializer(), AnimationMetadataSection.class);
      var0.registerMetadataSectionType(new PackMetadataSectionSerializer(), PackMetadataSection.class);
      var0.registerMetadataSectionType(new LanguageMetadataSectionSerializer(), LanguageMetadataSection.class);
      return var0;
   }

   private TextureMetadataSection a() {
      String var1 = String.valueOf((new StringBuilder(String.valueOf(this.a))).append(".mcmeta"));
      String var2 = "texture";
      InputStream var3 = V.f(var1);
      if (var3 != null) {
         MetadataSerializer var4 = b;
         BufferedReader var5 = new BufferedReader(new InputStreamReader(var3));

         TextureMetadataSection var10;
         try {
            JsonObject var7 = (new JsonParser()).parse(var5).getAsJsonObject();
            TextureMetadataSection var8 = (TextureMetadataSection)var4.parseMetadataSection(var2, var7);
            if (var8 == null) {
               var10 = new TextureMetadataSection(false, false);
               return var10;
            }

            TextureMetadataSection var6 = var8;
            return var6;
         } catch (RuntimeException var13) {
            Shaders.b(String.valueOf((new StringBuilder("Error reading metadata: ")).append(var1)));
            Shaders.b(String.valueOf((new StringBuilder()).append(var13.getClass().getName()).append(": ").append(var13.getMessage())));
            var10 = new TextureMetadataSection(false, false);
         } finally {
            IOUtils.closeQuietly(var5);
            IOUtils.closeQuietly(var3);
         }

         return var10;
      } else {
         return new TextureMetadataSection(false, false);
      }
   }

   public Z(String var1) {
      this.a = var1;
   }

   public void loadTexture(IResourceManager var1) {
      this.deleteGlTexture();
      InputStream var2 = V.f(this.a);
      if (var2 == null) {
         throw new FileNotFoundException(String.valueOf((new StringBuilder("Shader texture not found: ")).append(this.a)));
      } else {
         try {
            BufferedImage var3 = TextureUtil.readBufferedImage(var2);
            TextureMetadataSection var4 = this.a();
            TextureUtil.uploadTextureImageAllocate(this.getGlTextureId(), var3, var4.getTextureBlur(), var4.getTextureClamp());
         } finally {
            IOUtils.closeQuietly(var2);
         }

      }
   }
}
