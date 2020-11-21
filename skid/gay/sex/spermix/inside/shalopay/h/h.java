package skid.gay.sex.spermix.inside.shalopay.h;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class h {

    private final boolean e = false;
    protected List c = new ArrayList();
    protected List b = new ArrayList();
    protected int d = 0;
    protected List a = new ArrayList();

    public synchronized void a(g var1) {
        this.c.add(var1);
    }

    protected void a(WhatIsTheHell var1) {
        this.b(var1);
        i var2 = new i(this, var1);
        this.a(var1, var2);
        this.a((d) var1);
    }

    public void a(d var1, c var2) {
        try {
            var2.a();
        } catch (b var4) {
            this.a(var1, var4);
        } catch (ThreadDeath var5) {
            throw var5;
        } catch (Throwable var6) {
            this.a(var1, var6);
        }

    }

    public synchronized boolean a() {
        return this.e;
    }

    public void b(d var1) {
        int var2 = var1.a();
        synchronized (this) {
            this.d += var2;
        }

        Iterator var3 = this.b().iterator();

        while (var3.hasNext()) {
            g var4 = (g) var3.next();
            var4.startTest(var1);
        }

    }

    private synchronized List b() {
        ArrayList var1 = new ArrayList();
        var1.addAll(this.c);
        return var1;
    }

    public synchronized void a(d var1, b var2) {
        this.a.add(new f(var1, var2));
        Iterator var3 = this.b().iterator();

        while (var3.hasNext()) {
            g var4 = (g) var3.next();
            var4.addFailure(var1, var2);
        }

    }

    public void a(d var1) {
        Iterator var2 = this.b().iterator();

        while (var2.hasNext()) {
            g var3 = (g) var2.next();
            var3.endTest(var1);
        }

    }

    public synchronized void a(d var1, Throwable var2) {
        this.b.add(new f(var1, var2));
        Iterator var3 = this.b().iterator();

        while (var3.hasNext()) {
            g var4 = (g) var3.next();
            var4.addError(var1, var2);
        }

    }
}
