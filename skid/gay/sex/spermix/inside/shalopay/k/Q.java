package skid.gay.sex.spermix.inside.shalopay.k;

import java.util.Collection;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class Q {
   
   private Map b = new HashMap();
   
   private Set c = new HashSet();
   
   private String a = null;

   public String a(String var1) {
      return (String)this.b.get(var1);
   }

   public String a() {
      return this.a;
   }

   public Collection c() {
      return new HashSet(this.c);
   }

   public void a(Q var1) {
      if (var1 != null) {
         this.b.putAll(var1.b);
      }

   }

   public boolean c(String var1) {
      return this.c.contains(var1);
   }

   public String[] b() {
      Set var1 = this.b.keySet();
      String[] var2 = (String[])var1.toArray(new String[var1.size()]);
      return var2;
   }

   public void a(String var1, String var2) {
      this.b.put(var1, var2);
   }

   public void b(String var1) {
      this.c.add(var1);
   }

   public void a(Collection var1) {
      this.c.addAll(var1);
   }

   public Q(String var1) {
      this.a = var1;
   }
}
