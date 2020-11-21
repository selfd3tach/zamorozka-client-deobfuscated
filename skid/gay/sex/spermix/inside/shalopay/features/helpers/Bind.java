package skid.gay.sex.spermix.inside.shalopay.features.helpers;

import skid.gay.sex.spermix.inside.shalopay.features.module.Module;

import java.util.ArrayList;
import java.util.Iterator;

public class Bind {

    public static ArrayList a;

    public Bind() {
        a = new ArrayList();
    }

    public static ArrayList a() {
        return a;
    }

    public boolean a(SettingMode var1) {
        return a.add(var1);
    }

    public ArrayList a(Module var1) {
        ArrayList var2 = new ArrayList();
        Iterator var4 = a().iterator();

        while (var4.hasNext()) {
            SettingMode var3 = (SettingMode) var4.next();
            if (var3.b().equals(var1)) {
                var2.add(var3);
            }
        }

        if (var2.isEmpty()) {
            return null;
        } else {
            return var2;
        }
    }

    public SettingMode a(String var1) {
        Iterator var3 = a().iterator();

        while (var3.hasNext()) {
            SettingMode var2 = (SettingMode) var3.next();
            if (var2.a().equalsIgnoreCase(var1)) {
                return var2;
            }
        }

        System.err.println((new StringBuilder("[")).append(AutoArmor.AntiKnockBack).append("] Error Setting NOT found: '").append(var1).append("'!"));
        return null;
    }
}
