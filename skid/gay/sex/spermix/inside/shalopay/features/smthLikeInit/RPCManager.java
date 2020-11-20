package skid.gay.sex.spermix.inside.shalopay.features.smthLikeInit;

import skid.gay.sex.spermix.inside.shalopay.features.drpc.DiscordRPC;

class RPCManager extends Thread {
   
   final DiscordRPC a;

   RPCManager(DiscordRPC var1, String var2) {
      super(var2);
      this.a = var1;
   }

   public void run() {
      while(RichPresence.a(this.a)) {
         DiscordRPC.discordRunCallbacks();
      }

   }
}
