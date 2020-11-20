package skid.gay.sex.spermix.inside.shalopay.features.drpc;

public final class OSUtil {
   public boolean isMac() {
      return this.getOS().toLowerCase().startsWith("mac");
   }

   public String getOS() {
      return System.getProperty("os.name").toLowerCase();
   }

   public boolean isWindows() {
      return this.getOS().toLowerCase().startsWith("win");
   }
}
