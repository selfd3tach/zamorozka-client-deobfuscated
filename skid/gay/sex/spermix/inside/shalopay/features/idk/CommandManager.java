package skid.gay.sex.spermix.inside.shalopay.features.idk;

import java.util.ArrayList;
import java.util.Iterator;

public class CommandManager {
   
   public static ArrayList a = new ArrayList();
   
   public static char b = '.';

   public CommandManager() {
      this.a();
   }

   public void a(String var1) {
      if (var1.contains(Character.toString(b)) && var1.startsWith(Character.toString(b))) {
         boolean var2 = false;
         String var3 = var1.trim().substring(Character.toString(b).length()).trim();
         boolean var4 = var3.trim().contains(" ");
         String var5 = var4 ? var3.split(" ")[0] : var3.trim();
         String[] var6 = var4 ? var3.substring(var5.length()).trim().split(" ") : new String[0];
         Iterator var8 = a.iterator();

         while(var8.hasNext()) {
            ClickGUIMode var7 = (ClickGUIMode)var8.next();
            if (var7.c().trim().equalsIgnoreCase(var5.trim())) {
               var7.a(var3, var6);
               var2 = true;
               break;
            }
         }

         if (!var2) {
            skid.gay.sex.spermix.inside.shalopay.discordrpc.AutoArmor.a("Invalid command. Type .help for a list of commands.", true);
         }

      }
   }

   public void a() {
      a.clear();
      a.add(new WhatIsTheHell());
      a.add(new BowAimBot());
      a.add(new AutoTotem());
      a.add(new ClientLoginThread());
      a.add(new CustomMainMenu());
   }
}
