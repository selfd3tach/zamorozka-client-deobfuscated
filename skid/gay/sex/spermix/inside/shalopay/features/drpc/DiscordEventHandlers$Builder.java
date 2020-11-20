package skid.gay.sex.spermix.inside.shalopay.features.drpc;

import skid.gay.sex.spermix.inside.shalopay.features.drpc.callbacks.DisconnectedCallback;
import skid.gay.sex.spermix.inside.shalopay.features.drpc.callbacks.ErroredCallback;
import skid.gay.sex.spermix.inside.shalopay.features.drpc.callbacks.JoinGameCallback;
import skid.gay.sex.spermix.inside.shalopay.features.drpc.callbacks.JoinRequestCallback;
import skid.gay.sex.spermix.inside.shalopay.features.drpc.callbacks.ReadyCallback;
import skid.gay.sex.spermix.inside.shalopay.features.drpc.callbacks.SpectateGameCallback;

public class DiscordEventHandlers$Builder {
   
   DiscordEventHandlers h = new DiscordEventHandlers();

   public DiscordEventHandlers$Builder setDisconnectedEventHandler(DisconnectedCallback var1) {
      this.h.disconnected = var1;
      return this;
   }

   public DiscordEventHandlers$Builder setJoinGameEventHandler(JoinGameCallback var1) {
      this.h.joinGame = var1;
      return this;
   }

   public DiscordEventHandlers$Builder setErroredEventHandler(ErroredCallback var1) {
      this.h.errored = var1;
      return this;
   }

   public DiscordEventHandlers$Builder setSpectateGameEventHandler(SpectateGameCallback var1) {
      this.h.spectateGame = var1;
      return this;
   }

   public DiscordEventHandlers$Builder setReadyEventHandler(ReadyCallback var1) {
      this.h.ready = var1;
      return this;
   }

   public DiscordEventHandlers build() {
      return this.h;
   }

   public DiscordEventHandlers$Builder setJoinRequestEventHandler(JoinRequestCallback var1) {
      this.h.joinRequest = var1;
      return this;
   }
}
