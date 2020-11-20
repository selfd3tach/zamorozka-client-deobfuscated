package skid.gay.sex.spermix.inside.shalopay.features.smthLikeInit;

import skid.gay.sex.spermix.inside.shalopay.features.drpc.DiscordUser;
import skid.gay.sex.spermix.inside.shalopay.features.drpc.callbacks.ReadyCallback;

class RPCLogger implements ReadyCallback {
   
   final RichPresence a;

   RPCLogger(RichPresence var1) {
      this.a = var1;
   }

   public void apply(DiscordUser var1) {
      this.a.a(String.valueOf((new StringBuilder("Build: ")).append(Main.d)), "Used.");
   }
}
