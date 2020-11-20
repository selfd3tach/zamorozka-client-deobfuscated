package skid.gay.sex.spermix.inside.shalopay.features.drpc;

import com.sun.jna.Structure;
import java.util.Arrays;
import java.util.List;

public class DiscordUser extends Structure {
   
   public String discriminator;
   
   public String username;
   
   public String avatar;
   
   public String userId;

   public List getFieldOrder() {
      return Arrays.asList("userId", "username", "discriminator", "avatar");
   }
}
