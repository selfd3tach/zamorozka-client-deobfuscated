package skid.gay.sex.spermix.inside.shalopay.features.idk;

import net.minecraft.util.StringUtils;

import java.util.ArrayList;
import java.util.Iterator;

public class q {

    public static ArrayList a = new ArrayList();

    public void a(String var1) {
        Iterator var3 = a.iterator();

        while (var3.hasNext()) {
            p var2 = (p) var3.next();
            if (var2.a().equalsIgnoreCase(var1)) {
                a.remove(var2);
                break;
            }
        }

    }

    public void a(String var1, String var2) {
        a.add(new p(var1, var2));
    }

    public boolean b(String var1) {
        boolean var2 = false;
        Iterator var4 = a.iterator();

        while (var4.hasNext()) {
            p var3 = (p) var4.next();
            if (var3.a().equalsIgnoreCase(StringUtils.stripControlCodes(var1))) {
                var2 = true;
                break;
            }
        }

        return var2;
    }
}
