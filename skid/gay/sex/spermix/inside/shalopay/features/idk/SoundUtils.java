package skid.gay.sex.spermix.inside.shalopay.features.idk;

import java.io.InputStream;
import java.util.Objects;
import javazoom.jl.player.Player;

public class SoundUtils {
   
   private Player a;
   
   private Thread b;

   public void a(InputStream var1) {
      try {
         this.a = new Player(var1);
      } catch (Exception var3) {
         var3.printStackTrace();
      }

   }

   public void b() {
      if (this.a != null) {
         this.a.close();
      }

   }

   public void a() {
      Objects.requireNonNull(this.a);
      this.b = new Thread(() -> {
         try {
            this.a.play();
         } catch (Exception var2) {
            var2.printStackTrace();
         }

      });
      this.b.start();
   }
}
