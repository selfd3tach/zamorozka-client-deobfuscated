package skid.gay.sex.spermix.inside.shalopay.j;

import java.util.ArrayList;
import java.util.StringTokenizer;

public class bx {
   private static int a(String var0, String var1, int var2, char var3) {
      if (var0 != null && var1 != null) {
         if (var2 >= 0 && var2 <= var0.length()) {
            if (var0.length() < var2 + var1.length()) {
               return -1;
            } else {
               for(int var4 = var2; var4 + var1.length() <= var0.length(); ++var4) {
                  String var5 = var0.substring(var4, var4 + var1.length());
                  if (a(var5, var1, var3)) {
                     return var4;
                  }
               }

               return -1;
            }
         } else {
            return -1;
         }
      } else {
         return -1;
      }
   }

   public static boolean a(String var0, String var1, char var2, char var3) {
      if (var1 != null && var0 != null) {
         if (var1.indexOf(var2) < 0) {
            return var1.indexOf(var3) < 0 ? var1.equals(var0) : a(var0, var1, var3);
         } else {
            ArrayList var4 = new ArrayList();
            String var5 = String.valueOf((new StringBuilder()).append(var2));
            if (var1.startsWith(var5)) {
               var4.add("");
            }

            StringTokenizer var6 = new StringTokenizer(var1, var5);

            while(var6.hasMoreElements()) {
               var4.add(var6.nextToken());
            }

            if (var1.endsWith(var5)) {
               var4.add("");
            }

            String var7 = (String)var4.get(0);
            if (!c(var0, var7, var3)) {
               return false;
            } else {
               String var8 = (String)var4.get(var4.size() - 1);
               if (!b(var0, var8, var3)) {
                  return false;
               } else {
                  int var9 = 0;

                  for(int var10 = 0; var10 < var4.size(); ++var10) {
                     String var11 = (String)var4.get(var10);
                     if (var11.length() > 0) {
                        int var12 = a(var0, var11, var9, var3);
                        if (var12 < 0) {
                           return false;
                        }

                        var9 = var12 + var11.length();
                     }
                  }

                  return true;
               }
            }
         }
      } else {
         return var1 == var0;
      }
   }

   private static boolean a(String var0, String var1, char var2) {
      if (var0 != null && var1 != null) {
         if (var0.length() != var1.length()) {
            return false;
         } else {
            for(int var3 = 0; var3 < var1.length(); ++var3) {
               char var4 = var1.charAt(var3);
               if (var4 != var2 && var0.charAt(var3) != var4) {
                  return false;
               }
            }

            return true;
         }
      } else {
         return var0 == var1;
      }
   }

   public static String d(String var0, String var1, String var2) {
      if (var0 != null && var1 != null && var2 != null) {
         int var3 = var0.indexOf(var1);
         if (var3 < 0) {
            return null;
         } else {
            int var4 = var0.indexOf(var2, var3);
            return var4 < 0 ? null : var0.substring(var3, var4 + var2.length());
         }
      } else {
         return null;
      }
   }

   public static String a(String var0, String var1) {
      if (var0 != null && var1 != null) {
         if (var0.startsWith(var1)) {
            var0 = var0.substring(var1.length());
         }

         return var0;
      } else {
         return var0;
      }
   }

   public static String c(String var0, String[] var1) {
      if (var0 != null && var1 != null) {
         int var2 = var0.length();

         for(int var3 = 0; var3 < var1.length; ++var3) {
            String var4 = var1[var3];
            var0 = b(var0, var4);
            if (var0.length() != var2) {
               break;
            }
         }

         return var0;
      } else {
         return var0;
      }
   }

   private static boolean b(String var0, String var1, char var2) {
      if (var0 != null && var1 != null) {
         if (var0.length() < var1.length()) {
            return false;
         } else {
            String var3 = var0.substring(var0.length() - var1.length(), var0.length());
            return a(var3, var1, var2);
         }
      } else {
         return var0 == var1;
      }
   }

   public static String d(String var0, String[] var1) {
      if (var0 != null && var1 != null) {
         int var2 = var0.length();

         for(int var3 = 0; var3 < var1.length; ++var3) {
            String var4 = var1[var3];
            var0 = a(var0, var4);
            if (var0.length() != var2) {
               break;
            }
         }

         return var0;
      } else {
         return var0;
      }
   }

   public static String b(String var0, String var1) {
      if (var0 != null && var1 != null) {
         if (var0.endsWith(var1)) {
            var0 = var0.substring(0, var0.length() - var1.length());
         }

         return var0;
      } else {
         return var0;
      }
   }

   private static boolean c(String var0, String var1, char var2) {
      if (var0 != null && var1 != null) {
         if (var0.length() < var1.length()) {
            return false;
         } else {
            String var3 = var0.substring(0, var1.length());
            return a(var3, var1, var2);
         }
      } else {
         return var0 == var1;
      }
   }

   public static String c(String var0, String var1, String var2) {
      return a(var0, new String[]{var1}, new String[]{var2});
   }

   public static boolean b(String var0, String[] var1) {
      if (var0 == null) {
         return false;
      } else if (var1 == null) {
         return false;
      } else {
         for(int var2 = 0; var2 < var1.length; ++var2) {
            String var3 = var1[var2];
            if (var0.endsWith(var3)) {
               return true;
            }
         }

         return false;
      }
   }

   public static String a(String var0, String[] var1, String[] var2) {
      var0 = d(var0, var1);
      var0 = c(var0, var2);
      return var0;
   }

   public static String a(String var0, int var1, char var2) {
      if (var0 == null) {
         var0 = "";
      }

      if (var0.length() >= var1) {
         return var0;
      } else {
         StringBuffer var3 = new StringBuffer();
         int var4 = var1 - var0.length();

         while(var3.length() < var4) {
            var3.append(var2);
         }

         return String.valueOf((new StringBuilder(String.valueOf(var3.toString()))).append(var0));
      }
   }

   public static String b(String var0, String var1, String var2) {
      if (var0 != null && var1 != null) {
         if (!var0.startsWith(var1)) {
            return var0;
         } else {
            if (var2 == null) {
               var2 = "";
            }

            var0 = var0.substring(var1.length());
            return String.valueOf((new StringBuilder(String.valueOf(var2))).append(var0));
         }
      } else {
         return var0;
      }
   }

   public static String a(String var0, String var1, String var2) {
      if (var0 != null && var1 != null) {
         if (!var0.endsWith(var1)) {
            return var0;
         } else {
            if (var2 == null) {
               var2 = "";
            }

            var0 = var0.substring(0, var0.length() - var1.length());
            return String.valueOf((new StringBuilder(String.valueOf(var0))).append(var2));
         }
      } else {
         return var0;
      }
   }

   public static boolean a(String var0, String[] var1) {
      if (var0 == null) {
         return false;
      } else if (var1 == null) {
         return false;
      } else {
         for(int var2 = 0; var2 < var1.length; ++var2) {
            String var3 = var1[var2];
            if (var0.startsWith(var3)) {
               return true;
            }
         }

         return false;
      }
   }
}
