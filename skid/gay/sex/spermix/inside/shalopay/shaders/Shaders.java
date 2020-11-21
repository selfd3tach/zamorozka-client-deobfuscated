package skid.gay.sex.spermix.inside.shalopay.shaders;

import org.apache.logging.log4j.Logger;

import java.util.logging.LogManager;

public abstract class Shaders {

    private static final Logger LOGGER = LogManager.getLogger();

    public static void b(String var0) {
        LOGGER.warn(String.valueOf((new StringBuilder("[Shaders] ")).append(var0)));
    }

    public static void a(String var0) {
        LOGGER.error(String.valueOf((new StringBuilder("[Shaders] ")).append(var0)));
    }

    public static void a(String var0, Object... var1) {
        String var2 = String.format(var0, var1);
        LOGGER.warn(String.valueOf((new StringBuilder("[Shaders] ")).append(var2)));
    }

    public static void b(String var0, Object... var1) {
        String var2 = String.format(var0, var1);
        LOGGER.info(String.valueOf((new StringBuilder("[Shaders] ")).append(var2)));
    }

    public static void c(String var0) {
        LOGGER.info(String.valueOf((new StringBuilder("[Shaders] ")).append(var0)));
    }
}
