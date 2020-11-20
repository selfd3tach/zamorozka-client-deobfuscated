package skid.gay.sex.spermix.inside.shalopay.features.drpc;

import com.sun.jna.Library;
import com.sun.jna.Native;

interface DiscordRPC$DLL extends Library {
   
   DiscordRPC$DLL INSTANCE = (DiscordRPC$DLL)Native.loadLibrary("discord-rpc", DiscordRPC$DLL.class);

   void Discord_Register(String var1, String var2);

   void Discord_Respond(String var1, int var2);

   void Discord_RegisterSteamGame(String var1, String var2);

   void Discord_Initialize(String var1, DiscordEventHandlers var2, int var3, String var4);

   void Discord_RunCallbacks();

   void Discord_ClearPresence();

   void Discord_Shutdown();

   void Discord_UpdateHandlers(DiscordEventHandlers var1);

   void Discord_UpdatePresence(DiscordRichPresence var1);
}
