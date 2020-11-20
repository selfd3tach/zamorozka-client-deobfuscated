package skid.gay.sex.spermix.inside.shalopay.j;

import net.minecraft.network.play.server.SPacketChangeGameState;
import net.minecraft.profiler.Profiler;
import net.minecraft.server.MinecraftServer;
import net.minecraft.world.WorldServer;
import net.minecraft.world.storage.ISaveHandler;
import net.minecraft.world.storage.WorldInfo;

public class bH extends WorldServer {
   
   private MinecraftServer a;

   protected void updateWeather() {
      if (!FastAura.aa()) {
         this.a();
      }

      super.updateWeather();
   }

   private void a() {
      if (this.worldInfo.isRaining() || this.worldInfo.isThundering()) {
         this.worldInfo.setRainTime(0);
         this.worldInfo.setRaining(false);
         this.setRainStrength(0.0F);
         this.worldInfo.setThunderTime(0);
         this.worldInfo.setThundering(false);
         this.setThunderStrength(0.0F);
         this.a.getPlayerList().sendPacketToAllPlayers(new SPacketChangeGameState(2, 0.0F));
         this.a.getPlayerList().sendPacketToAllPlayers(new SPacketChangeGameState(7, 0.0F));
         this.a.getPlayerList().sendPacketToAllPlayers(new SPacketChangeGameState(8, 0.0F));
      }

   }

   private void b() {
      if (this.worldInfo.getGameType().getID() == 1) {
         long var1 = this.getWorldTime();
         long var3 = var1 % 24000L;
         if (FastAura.ah()) {
            if (var3 <= 1000L) {
               this.setWorldTime(var1 - var3 + 1001L);
            }

            if (var3 >= 11000L) {
               this.setWorldTime(var1 - var3 + 24001L);
            }
         }

         if (FastAura.aj()) {
            if (var3 <= 14000L) {
               this.setWorldTime(var1 - var3 + 14001L);
            }

            if (var3 >= 22000L) {
               this.setWorldTime(var1 - var3 + 24000L + 14001L);
            }
         }
      }

   }

   public void tick() {
      super.tick();
      if (!FastAura.ai()) {
         this.b();
      }

      if (FastAura.ClickGUIMode) {
         FastAura.ClickGUIMode = false;
         FontUtils.a(FastAura.aL(), this);
      }

   }

   public bH(MinecraftServer var1, ISaveHandler var2, WorldInfo var3, int var4, Profiler var5) {
      super(var1, var2, var3, var4, var5);
      this.a = var1;
   }
}
