package skid.gay.sex.spermix.inside.shalopay.j;

import com.google.gson.JsonElement;
import com.google.gson.JsonParser;

public class ConfigLoader implements aA {
   
   private String a = null;

   public ConfigLoader(String var1) {
      this.a = var1;
   }

   public void a(String var1, byte[] var2, Throwable var3) {
      if (var2 != null) {
         try {
            String var4 = new String(var2, "ASCII");
            JsonParser var5 = new JsonParser();
            JsonElement var6 = var5.parse(var4);
            aV var7 = new aV(this.a);
            aU var8 = var7.a(var6);
            if (var8 != null) {
               var8.a(true);
               aX.a(this.a, var8);
            }
         } catch (Exception var9) {
            FastAura.a(String.valueOf((new StringBuilder("Error parsing configuration: ")).append(var1).append(", ").append(var9.getClass().getName()).append(": ").append(var9.getMessage())));
         }
      }

   }
}
