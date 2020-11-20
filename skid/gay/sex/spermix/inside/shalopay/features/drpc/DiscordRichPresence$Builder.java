package skid.gay.sex.spermix.inside.shalopay.features.drpc;

public class DiscordRichPresence$Builder {
   
   private DiscordRichPresence p = new DiscordRichPresence();

   public DiscordRichPresence$Builder setStartTimestamps(long var1) {
      this.p.startTimestamp = var1;
      return this;
   }

   public DiscordRichPresence$Builder setSmallImage(String var1, String var2) {
      if (var2 != null && !var2.equalsIgnoreCase("") && var1 == null) {
         throw new IllegalArgumentException("Image key must not be null when assigning a hover text.");
      } else {
         this.p.smallImageKey = var1;
         this.p.smallImageText = var2;
         return this;
      }
   }

   public DiscordRichPresence$Builder setSecrets(String var1, String var2, String var3) {
      this.p.matchSecret = var1;
      this.p.joinSecret = var2;
      this.p.spectateSecret = var3;
      return this;
   }

   public DiscordRichPresence$Builder setInstance(boolean var1) {
      this.p.instance = var1 ? 1 : 0;
      return this;
   }

   public DiscordRichPresence$Builder setDetails(String var1) {
      this.p.details = var1;
      return this;
   }

   public DiscordRichPresence$Builder setBigImage(String var1, String var2) {
      if (var2 != null && !var2.equalsIgnoreCase("") && var1 == null) {
         throw new IllegalArgumentException("Image key must not be null when assigning a hover text.");
      } else {
         this.p.largeImageKey = var1;
         this.p.largeImageText = var2;
         return this;
      }
   }

   public DiscordRichPresence$Builder(String var1) {
      this.p.state = var1;
   }

   public DiscordRichPresence$Builder setParty(String var1, int var2, int var3) {
      this.p.partyId = var1;
      this.p.partySize = var2;
      this.p.partyMax = var3;
      return this;
   }

   public DiscordRichPresence$Builder setEndTimestamp(long var1) {
      this.p.endTimestamp = var1;
      return this;
   }

   public DiscordRichPresence build() {
      return this.p;
   }

   public DiscordRichPresence$Builder setSecrets(String var1, String var2) {
      this.p.joinSecret = var1;
      this.p.spectateSecret = var2;
      return this;
   }
}
