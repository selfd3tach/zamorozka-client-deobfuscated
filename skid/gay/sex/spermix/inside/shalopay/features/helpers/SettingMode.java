package skid.gay.sex.spermix.inside.shalopay.features.helpers;

import skid.gay.sex.spermix.inside.shalopay.features.module.Module;

import java.util.ArrayList;

public class SettingMode {

    private double h;

    private final String c;

    private String d;

    private double i;

    private final String a;

    private boolean j = false;

    private ArrayList e;

    private final Module b;

    private boolean f;

    private double g;

    public SettingMode(String var1, Module var2, String var3, ArrayList var4) {
        this.a = var1;
        this.b = var2;
        this.d = var3;
        this.e = var4;
        this.c = "Combo";
    }

    public SettingMode(String var1, Module var2, double var3, double var5, double var7, boolean var9) {
        this.a = var1;
        this.b = var2;
        this.g = var3;
        this.h = var5;
        this.i = var7;
        this.j = var9;
        this.c = "Slider";
    }

    public SettingMode(String var1, Module var2, boolean var3) {
        this.a = var1;
        this.b = var2;
        this.f = var3;
        this.c = "Check";
    }

    public void a(String var1) {
        this.d = var1;
    }

    public boolean i() {
        return this.c.equalsIgnoreCase("Combo");
    }

    public ArrayList d() {
        return this.e;
    }

    public boolean e() {
        return this.f;
    }

    public Module b() {
        return this.b;
    }

    public String a() {
        return this.a;
    }

    public boolean j() {
        return this.c.equalsIgnoreCase("Check");
    }

    public double g() {
        return this.h;
    }

    public void a(boolean var1) {
        this.f = var1;
    }

    public boolean k() {
        return this.c.equalsIgnoreCase("Slider");
    }

    public double h() {
        return this.i;
    }

    public String c() {
        return this.d;
    }

    public void a(double var1) {
        this.g = var1;
    }

    public double f() {
        if (this.j) {
            this.g = (int) this.g;
        }

        return this.g;
    }
}
