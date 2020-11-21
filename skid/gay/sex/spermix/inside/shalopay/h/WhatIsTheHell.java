package skid.gay.sex.spermix.inside.shalopay.h;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.lang.reflect.Modifier;

public abstract class WhatIsTheHell extends a implements d {

    private String a;

    public WhatIsTheHell(String var1) {
        this.a = var1;
    }

    public WhatIsTheHell() {
        this.a = null;
    }

    public void b() {
        Throwable var1 = null;
        this.d();

        try {
            this.c();
        } catch (Throwable var10) {
            var1 = var10;
        } finally {
            try {
                this.e();
            } catch (Throwable var11) {
                if (var1 == null) {
                    var1 = var11;
                }
            }

        }

        if (var1 != null) {
            throw var1;
        }
    }

    public void b(h var1) {
        var1.a(this);
    }

    protected void e() {
    }

    protected void d() {
    }

    public void b(String var1) {
        this.a = var1;
    }

    public String toString() {
        return String.valueOf((new StringBuilder()).append(this.f()).append("(").append(this.getClass().getName()).append(")"));
    }

    public int a() {
        return 1;
    }

    protected void c() {
        a("TestCase.fName cannot be null", this.a);
        Method var1 = null;

        try {
            var1 = this.getClass().getMethod(this.a, (Class[]) null);
        } catch (NoSuchMethodException var5) {
            a(String.valueOf((new StringBuilder()).append("Method \"").append(this.a).append("\" not found")));
        }

        if (!Modifier.isPublic(var1.getModifiers())) {
            a(String.valueOf((new StringBuilder()).append("Method \"").append(this.a).append("\" should be public")));
        }

        try {
            var1.invoke(this);
        } catch (InvocationTargetException var3) {
            var3.fillInStackTrace();
            throw var3.getTargetException();
        } catch (IllegalAccessException var4) {
            var4.fillInStackTrace();
            throw var4;
        }
    }

    public String f() {
        return this.a;
    }
}
