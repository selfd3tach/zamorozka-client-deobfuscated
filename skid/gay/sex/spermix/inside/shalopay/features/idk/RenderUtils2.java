package skid.gay.sex.spermix.inside.shalopay.features.idk;

import org.lwjgl.opengl.Display;
import org.lwjgl.util.vector.Vector2f;

import java.util.Random;

public class RenderUtils2 {

    private static final Random a = new Random();
    private final Vector2f b;
    private final float d;
    private final Vector2f c;
    private float e;

    public RenderUtils2(Vector2f var1, float var2, float var3, float var4) {
        this.b = var1;
        this.c = new Vector2f(var2, var3);
        this.d = var4;
    }

    public static RenderUtils2 a() {
        Vector2f var0 = new Vector2f((float) (Math.random() * 2.0D - 1.0D), (float) (Math.random() * 2.0D - 1.0D));
        float var1 = (float) a.nextInt(Display.getWidth());
        float var2 = (float) a.nextInt(Display.getHeight());
        float var3 = (float) (Math.random() * 5.0D) + 1.0F;
        return new RenderUtils2(var0, var1, var2, var3);
    }

    public float a(RenderUtils2 var1) {
        return this.a(var1.c(), var1.d());
    }

    public float c() {
        return this.c.getX();
    }

    public float a(float var1, float var2) {
        return (float) s.a(this.c(), this.d(), var1, var2);
    }

    public void a(int var1, float var2) {
        Vector2f var10000 = this.c;
        var10000.x += this.b.getX() * (float) var1 * var2;
        var10000 = this.c;
        var10000.y += this.b.getY() * (float) var1 * var2;
        if (this.e < 255.0F) {
            this.e += 0.05F * (float) var1;
        }

        if (this.c.getX() > (float) Display.getWidth()) {
            this.c.setX(0.0F);
        }

        if (this.c.getX() < 0.0F) {
            this.c.setX((float) Display.getWidth());
        }

        if (this.c.getY() > (float) Display.getHeight()) {
            this.c.setY(0.0F);
        }

        if (this.c.getY() < 0.0F) {
            this.c.setY((float) Display.getHeight());
        }

    }

    public float b() {
        return this.e;
    }

    public float d() {
        return this.c.getY();
    }

    public float e() {
        return this.d;
    }
}
