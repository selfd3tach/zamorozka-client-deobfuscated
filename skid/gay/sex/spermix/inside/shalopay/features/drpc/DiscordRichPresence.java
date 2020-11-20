package skid.gay.sex.spermix.inside.shalopay.features.drpc;

import com.sun.jna.Structure;
import java.util.Arrays;
import java.util.List;

public class DiscordRichPresence extends Structure {
   
   public int partyMax;
   
   public String details;
   
   public String smallImageText;
   
   public String largeImageText;
   
   public String largeImageKey;
   
   public String matchSecret;
   
   public int instance;
   
   public String joinSecret;
   
   public String partyId;
   
   public int partySize;
   
   public long endTimestamp;
   
   public String state;
   
   public String smallImageKey;
   
   public String spectateSecret;
   
   public long startTimestamp;

   public List getFieldOrder() {
      return Arrays.asList("state", "details", "startTimestamp", "endTimestamp", "largeImageKey", "largeImageText", "smallImageKey", "smallImageText", "partyId", "partySize", "partyMax", "matchSecret", "joinSecret", "spectateSecret", "instance");
   }
}
