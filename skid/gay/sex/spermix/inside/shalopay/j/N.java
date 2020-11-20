package skid.gay.sex.spermix.inside.shalopay.j;

import java.util.Comparator;

class N implements Comparator {
   public int compare(Object var1, Object var2) {
      L var3 = (L)var1;
      L var4 = (L)var2;
      if (var3.t != var4.t) {
         return var3.t - var4.t;
      } else if (var3.v != var4.v) {
         return var4.v - var3.v;
      } else {
         return !var3.b.equals(var4.b) ? var3.b.compareTo(var4.b) : var3.a.compareTo(var4.a);
      }
   }
}
