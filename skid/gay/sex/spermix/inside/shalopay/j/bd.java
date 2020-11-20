package skid.gay.sex.spermix.inside.shalopay.j;

import java.util.Collections;
import java.util.Enumeration;
import java.util.LinkedHashSet;
import java.util.Properties;
import java.util.Set;

public class bd extends Properties {
   
   private Set a = new LinkedHashSet();

   public synchronized Enumeration keys() {
      return Collections.enumeration(this.keySet());
   }

   public synchronized Object put(Object var1, Object var2) {
      this.a.add(var1);
      return super.put(var1, var2);
   }

   public Set keySet() {
      Set var1 = super.keySet();
      this.a.retainAll(var1);
      return Collections.unmodifiableSet(this.a);
   }
}
