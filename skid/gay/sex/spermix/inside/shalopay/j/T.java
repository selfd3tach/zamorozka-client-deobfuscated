package skid.gay.sex.spermix.inside.shalopay.j;

import java.util.Comparator;
import org.lwjgl.opengl.DisplayMode;

public class T implements Comparator {
   public int compare(Object var1, Object var2) {
      DisplayMode var3 = (DisplayMode)var1;
      DisplayMode var4 = (DisplayMode)var2;
      if (var3.getWidth() != var4.getWidth()) {
         return var3.getWidth() - var4.getWidth();
      } else if (var3.getHeight() != var4.getHeight()) {
         return var3.getHeight() - var4.getHeight();
      } else if (var3.getBitsPerPixel() != var4.getBitsPerPixel()) {
         return var3.getBitsPerPixel() - var4.getBitsPerPixel();
      } else {
         return var3.getFrequency() != var4.getFrequency() ? var3.getFrequency() - var4.getFrequency() : 0;
      }
   }
}
