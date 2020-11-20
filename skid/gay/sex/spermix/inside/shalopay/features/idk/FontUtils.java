package skid.gay.sex.spermix.inside.shalopay.features.idk;

import java.awt.Font;
import java.awt.FontFormatException;
import java.io.File;
import java.io.IOException;

public class FontUtils {
   
   private static String h = "Impact";
   
   public FontRenderer a = null;
   
   public FontRenderer c = null;
   
   public FontRenderer g = null;
   
   public FontRenderer f = null;
   
   public FontRenderer e = null;
   
   public FontRenderer d = null;
   
   public FontRenderer b = null;

   public Font c() throws FontFormatException, IOException {
      File var1 = new File("Logos.ttf");
      Font var2 = Font.createFont(0, var1);
      Font var3 = var2.deriveFont(30.0F);
      return var3;
   }

   public Font b() throws FontFormatException, IOException {
      File var1 = new File("Fonts.ttf");
      Font var2 = Font.createFont(0, var1);
      Font var3 = var2.deriveFont(20.0F);
      return var3;
   }

   public void a() throws FontFormatException, IOException {
      File var1 = new File("Logos.ttf");
      Font var2 = Font.createFont(0, var1);
      Font var3 = var2.deriveFont(40.0F);
      this.a = new FontRenderer(this.c(), true, true);
      this.b = new FontRenderer(new Font(h, 0, 40), true, true);
      this.c = new FontRenderer(this.b(), true, true);
      this.d = new FontRenderer(new Font(h, 0, 50), true, true);
      this.e = new FontRenderer(new Font("Verdana", 0, 17), true, true);
      this.f = new FontRenderer(new Font("Verdana", 0, 20), true, true);
      this.g = new FontRenderer(new Font("Ice-&Snow", 0, 20), true, true);
   }
}
