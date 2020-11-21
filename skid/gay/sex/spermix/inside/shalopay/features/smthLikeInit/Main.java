package skid.gay.sex.spermix.inside.shalopay.features.smthLikeInit;

import net.minecraft.client.Minecraft;
import net.minecraft.client.entity.EntityPlayerSP;
import net.minecraft.client.gui.GuiScreen;
import net.minecraft.client.settings.GameSettings;
import net.minecraft.util.text.TextComponentTranslation;
import net.optifine.entity.model.anim.CrackLeak;
import org.lwjgl.opengl.Display;
import skid.gay.sex.spermix.inside.shalopay.features.idk.CommandManager;
import skid.gay.sex.spermix.inside.shalopay.features.idk.n;
import skid.gay.sex.spermix.inside.shalopay.features.idk.q;
import skid.gay.sex.spermix.inside.shalopay.features.module.Module;
import skid.gay.sex.spermix.inside.shalopay.features.module.SmthLikeModuleRegister;
import skid.gay.sex.spermix.inside.shalopay.features.newmegospeed.idk5;

import java.awt.*;
import java.io.BufferedReader;
import java.io.DataOutputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.Iterator;

public class Main {

    public static final skid.gay.sex.spermix.inside.shalopay.features.idk.FontUtils h = new skid.gay.sex.spermix.inside.shalopay.features.idk.FontUtils();
    public static final Main g = new Main();
    private static final Main n = new Main();
    public static SmthLikeModuleRegister f;
    public static boolean m;
    public static skid.gay.sex.spermix.inside.shalopay.features.helpers.Bind a;
    public static q k;
    public static Minecraft e = Minecraft.getMinecraft();
    public static boolean j = false;
    public static String d = "0.4.9.2";
    public static String b = "Zamorozka";
    public static String c = "";
    public static boolean l;
    private static idk5 q;
    private static n p;
    private static CommandManager o;
    private final CrackLeak v;
    private GuiScreen s;

    public Main() {
        this.v = new CrackLeak();
    }

    public static final Main a() {
        return n;
    }

    public static idk5 b() {
        return q;
    }

    public static void d(String var0) throws IOException {
        URL var2 = new URL(var0);
        HttpURLConnection var3 = (HttpURLConnection) var2.openConnection();
        var3.setRequestMethod("GET");
        BufferedReader var4 = new BufferedReader(new InputStreamReader(var3.getInputStream()));
        StringBuffer var6 = new StringBuffer();

        String var5;
        while ((var5 = var4.readLine()) != null) {
            var6.append(var5);
        }

        var4.close();
    }

    public static Minecraft f() {
        return Minecraft.getMinecraft();
    }

    public static boolean j() {
        String var0 = System.getProperty("os.name").toLowerCase();
        return var0.indexOf("mac") >= 0;
    }

    public static EntityPlayerSP e() {
        f();
        return Minecraft.player;
    }

    public static void d() {
        Iterator var1 = SmthLikeModuleRegister.a().iterator();

        while (var1.hasNext()) {
            Module var0 = (Module) var1.next();
            if (var0.getState()) {
                var0.onRender();
            }
        }

    }

    public static void b(String var0) {
        try {
            URL var1 = new URL(var0);
            HttpURLConnection var2 = (HttpURLConnection) var1.openConnection();
            var2.setRequestMethod("GET");
            var2.setRequestProperty("USER-AGENT", "Mozilla/5.0");
            var2.setRequestProperty("Content-Type", "application/x-www-form-urlencoded");
            var2.setRequestProperty("Accept-Charset", "UTF-8");
            var2.setDoOutput(true);
            DataOutputStream var3 = new DataOutputStream(var2.getOutputStream());
            var3.flush();
            var3.close();
            BufferedReader var4 = new BufferedReader(new InputStreamReader(var2.getInputStream()));
            String var5 = "";
            StringBuilder var6 = new StringBuilder();

            while ((var5 = var4.readLine()) != null) {
                var6.append(var5);
            }

            var4.close();
        } catch (MalformedURLException var7) {
            var7.printStackTrace();
        } catch (IOException var8) {
            var8.printStackTrace();
        }
    }

    public static boolean i() {
        String var0 = System.getProperty("os.name").toLowerCase();
        return var0.indexOf("win") >= 0;
    }

    public static Minecraft h() {
        return Minecraft.getMinecraft();
    }

    public static void a(String var0, boolean var1) {
        var0 = String.valueOf((new StringBuilder(String.valueOf(var1 ? String.valueOf((new StringBuilder("&f[&3")).append(b).append("&f]").append("&7: ")) : ""))).append(var0));
        e().addChatMessage(new TextComponentTranslation(var0.replace("&", "§")));
    }

    public static boolean c(String var0) {
        if (var0.startsWith("-")) {
            o.a(var0.substring(1));
            return false;
        } else {
            Iterator var2 = SmthLikeModuleRegister.a().iterator();

            while (var2.hasNext()) {
                Module var1 = (Module) var2.next();
                if (var1.getState()) {
                    return var1.a();
                }
            }

            return true;
        }
    }

    public static boolean a() {
        var0 = "0";
        return true;
    }

    public static GameSettings g() {
        return h().gameSettings;
    }

    public void c() throws IOException, FontFormatException {
        a = new skid.gay.sex.spermix.inside.shalopay.features.helpers.Bind();
        Display.setTitle(String.valueOf((new StringBuilder(String.valueOf(b))).append(" ").append(d).append(" ❄")));
        f = new SmthLikeModuleRegister();
        h.a();
        o = new CommandManager();
        p = new n();
        k = new q();
        this.k();
    }

    private void k() {
    }
}
