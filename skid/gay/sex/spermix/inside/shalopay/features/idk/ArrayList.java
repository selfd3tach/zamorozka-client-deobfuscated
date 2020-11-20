package skid.gay.sex.spermix.inside.shalopay.features.idk;

import net.minecraft.init.Blocks;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.nbt.JsonToNBT;
import net.minecraft.util.ResourceLocation;

public class ArrayList {
   
   public static final ItemStack a;

   public static ItemStack a(String var0) {
      try {
         new Item();
         var0 = var0.replace('&', '\u0015');
         String[] var2 = null;
         int var3 = 1;
         int var4 = 0;
         var2 = var0.split(" ");
         ResourceLocation var5 = new ResourceLocation(var2[0]);
         Item var1 = (Item)Item.REGISTRY.getObject(var5);
         if (var2.length >= 2 && var2[1].matches("\\d+")) {
            var3 = Integer.parseInt(var2[1]);
         }

         if (var2.length >= 3 && var2[2].matches("\\d+")) {
            var4 = Integer.parseInt(var2[2]);
         }

         ItemStack var6 = new ItemStack(var1, var3, var4);
         if (var2.length >= 4) {
            String var7 = "";

            for(int var8 = 3; var8 < var2.length; ++var8) {
               var7 = String.valueOf((new StringBuilder(String.valueOf(String.valueOf(String.valueOf(var7))))).append(" ").append(var2[var8]));
            }

            var6.setTagCompound(JsonToNBT.getTagFromJson(var7));
         }

         return var6;
      } catch (Exception var9) {
         var9.printStackTrace();
         return new ItemStack(Blocks.BARRIER);
      }
   }

   static {
      a = new ItemStack(Blocks.AIR);
   }
}
