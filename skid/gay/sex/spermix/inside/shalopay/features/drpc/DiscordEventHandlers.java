package skid.gay.sex.spermix.inside.shalopay.features.drpc;

import com.sun.jna.Structure;
import java.util.Arrays;
import java.util.List;
import skid.gay.sex.spermix.inside.shalopay.features.drpc.callbacks.DisconnectedCallback;
import skid.gay.sex.spermix.inside.shalopay.features.drpc.callbacks.ErroredCallback;
import skid.gay.sex.spermix.inside.shalopay.features.drpc.callbacks.JoinGameCallback;
import skid.gay.sex.spermix.inside.shalopay.features.drpc.callbacks.JoinRequestCallback;
import skid.gay.sex.spermix.inside.shalopay.features.drpc.callbacks.ReadyCallback;
import skid.gay.sex.spermix.inside.shalopay.features.drpc.callbacks.SpectateGameCallback;

public class DiscordEventHandlers extends Structure {
   
   public ReadyCallback ready;
   
   public JoinGameCallback joinGame;
   
   public SpectateGameCallback spectateGame;
   
   public DisconnectedCallback disconnected;
   
   public JoinRequestCallback joinRequest;
   
   public ErroredCallback errored;

   public List getFieldOrder() {
      return Arrays.asList("ready", "disconnected", "errored", "joinGame", "spectateGame", "joinRequest");
   }
}
