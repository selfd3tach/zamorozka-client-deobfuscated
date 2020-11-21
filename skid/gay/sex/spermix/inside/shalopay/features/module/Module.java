package skid.gay.sex.spermix.inside.shalopay.features.module;

import net.minecraft.client.Minecraft;
import skid.gay.sex.spermix.inside.shalopay.features.idk.n;

public class Module {

    public static Minecraft mc = Minecraft.getMinecraft();
    private static boolean toggled;
    protected int keyBind;
    protected boolean state;
    private final String name;
    private final ModuleCategory moduleCategory;

    public Module(String name, int keyBind, ModuleCategory category) {
        this.name = name;
        this.keyBind = keyBind;
        this.moduleCategory = category;
        this.initModule();
    }

    public int getKeyBind() {
        return this.keyBind;
    }

    public boolean a() {
        return true;
    }

    public boolean a(boolean var1) {
        this.e();
        if (var1) {
            n.c();
            this.onEnable();
            this.state = true;
        } else {
            this.onDisable();
            this.state = false;
        }

        return var1;
    }

    public String getName() {
        return this.name;
    }

    public boolean getState() {
        return this.state;
    }

    public void onDisable() {
    }

    public void getToggled() {
        toggled = !toggled;
        this.e();
        if (toggled) {
            this.onEnable();
        } else {
            this.onDisable();
        }

    }

    public void onEnable() {
    }

    public void onRender() {
    }

    public ModuleCategory getModuleCategory() {
        return this.moduleCategory;
    }

    public void initModule() {
    }

    public void e() {
    }

    public void a(int var1) {
        this.keyBind = var1;
    }

    public void d() {
        this.a(!this.getState());
    }

    public void onUpdate() {
    }
}
