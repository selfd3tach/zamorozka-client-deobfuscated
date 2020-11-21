package skid.gay.sex.spermix.inside.shalopay.features.module;

import skid.gay.sex.spermix.inside.shalopay.features.module.modules.combat.FastBow;
import skid.gay.sex.spermix.inside.shalopay.features.module.modules.combat.KillAura;
import skid.gay.sex.spermix.inside.shalopay.features.module.modules.movement.*;
import skid.gay.sex.spermix.inside.shalopay.features.module.modules.player2.AntiPushoutoOfBlock;
import skid.gay.sex.spermix.inside.shalopay.features.module.modules.player2.InventoryWalk;
import skid.gay.sex.spermix.inside.shalopay.features.module.modules.player2.NoSlowdown;
import skid.gay.sex.spermix.inside.shalopay.features.module.modules.render2.*;
import skid.gay.sex.spermix.inside.shalopay.features.module.modules.world.ScaffFly;

import java.util.ArrayList;
import java.util.Iterator;

public class SmthLikeModuleRegister {

    public static ArrayList list = new ArrayList();
    public XRayByPass xRayByPass;
    public XRay xRay;

    public SmthLikeModuleRegister() {
        list.add(new TNTFly());
        list.add(new Glide());
        list.add(new FlyJump());
        list.add(new FlyMatrix());
        list.add(new WaterUp());
        list.add(new Sprint());
        list.add(new Fly());
        list.add(new skid.gay.sex.spermix.inside.shalopay.features.module.modules.movement.Timer());
        list.add(new Jesus());
        list.add(new TracerPlayers());
        list.add(new TracerPortal());
        list.add(new TracerPyhest());
        list.add(new skid.gay.sex.spermix.inside.shalopay.features.module.modules.render2.TracerShulker());
        list.add(new AlfaWallhack());
        list.add(new skid.gay.sex.spermix.inside.shalopay.features.module.modules.world.FastPlace());
        list.add(new PlayerLine());
        list.add(new SpawnerEsp());
        list.add(new skid.gay.sex.spermix.inside.shalopay.features.module.modules.render2.ShulkerEsp());
        list.add(new FullBright());
        list.add(new skid.gay.sex.spermix.inside.shalopay.features.module.modules.render2.ChestBox());
        list.add(new BedEsp());
        list.add(new skid.gay.sex.spermix.inside.shalopay.features.module.modules.render2.ItemEsp());
        list.add(new Fly());
        list.add(new AirWalk());
        list.add(new skid.gay.sex.spermix.inside.shalopay.features.module.modules.world.BoatFly());
        list.add(new skid.gay.sex.spermix.inside.shalopay.features.module.modules.world.BoatSpeed2());
        list.add(new skid.gay.sex.spermix.inside.shalopay.features.module.modules.world.HorseFly());
        list.add(new ScaffFly());
        list.add(new KillAura());
        list.add(new skid.gay.sex.spermix.inside.shalopay.features.module.modules.combat.MatrixAura());
        list.add(new skid.gay.sex.spermix.inside.shalopay.features.module.modules.combat.AntiKnockBack());
        list.add(new skid.gay.sex.spermix.inside.shalopay.features.module.modules.player2.ChestStealer());
        list.add(new skid.gay.sex.spermix.inside.shalopay.features.module.modules.player2.AntiFire());
        list.add(new skid.gay.sex.spermix.inside.shalopay.features.module.modules.player2.NoFall());
        list.add(new Timer());
        list.add(new skid.gay.sex.spermix.inside.shalopay.features.module.modules.world.FastPlace());
        list.add(new skid.gay.sex.spermix.inside.shalopay.features.module.modules.render.SpeedMine());
        list.add(new skid.gay.sex.spermix.inside.shalopay.features.module.modules.render.FlyPoin());
        list.add(new skid.gay.sex.spermix.inside.shalopay.features.module.modules.combat.AimBot());
        list.add(new skid.gay.sex.spermix.inside.shalopay.features.module.modules.combat.AutoTotem());
        list.add(new skid.gay.sex.spermix.inside.shalopay.features.module.modules.combat.Reach());
        list.add(new skid.gay.sex.spermix.inside.shalopay.features.module.modules.render.NightVision());
        list.add(new skid.gay.sex.spermix.inside.shalopay.features.module.modules.movement.LongJump());
        list.add(this.xRay = new XRay());
        list.add(this.xRayByPass = new XRayByPass());
        list.add(new skid.gay.sex.spermix.inside.shalopay.features.module.modules.exploit.XrayLite());
        list.add(new skid.gay.sex.spermix.inside.shalopay.features.module.modules.combat.Criticals());
        list.add(new FastBow());
        list.add(new skid.gay.sex.spermix.inside.shalopay.features.module.modules.exploit.Spammer());
        list.add(new skid.gay.sex.spermix.inside.shalopay.features.module.modules.combat.AutoArmor());
        list.add(new skid.gay.sex.spermix.inside.shalopay.features.module.modules.player2.HitBox());
        list.add(new skid.gay.sex.spermix.inside.shalopay.features.module.modules.world.Spider());
        list.add(new skid.gay.sex.spermix.inside.shalopay.features.module.modules.movement.Derp());
        list.add(new skid.gay.sex.spermix.inside.shalopay.features.module.modules.movement.JesusPack());
        list.add(new NoSlowdown());
        list.add(new skid.gay.sex.spermix.inside.shalopay.features.module.modules.combat.AntiAim());
        list.add(new skid.gay.sex.spermix.inside.shalopay.features.module.modules.player2.Phase());
        list.add(new skid.gay.sex.spermix.inside.shalopay.features.module.modules.exploit.FakeOP());
        list.add(new skid.gay.sex.spermix.inside.shalopay.features.module.modules.world.BoatGlide());
        list.add(new skid.gay.sex.spermix.inside.shalopay.features.module.modules.world.SafeWalk());
        list.add(new skid.gay.sex.spermix.inside.shalopay.features.module.modules.other.Zamorozka());
        list.add(new FlyTeleport());
        list.add(new skid.gay.sex.spermix.inside.shalopay.features.module.modules.movement.FlyCubeCraft());
        list.add(new Speed());
        list.add(new skid.gay.sex.spermix.inside.shalopay.features.module.modules.render2.NameTags());
        list.add(new skid.gay.sex.spermix.inside.shalopay.features.module.modules.exploit.Crasher());
        list.add(new skid.gay.sex.spermix.inside.shalopay.features.module.modules.player2.AntiAfk());
        list.add(new skid.gay.sex.spermix.inside.shalopay.features.module.modules.world.ReackBlock());
        list.add(new skid.gay.sex.spermix.inside.shalopay.features.module.modules.movement.Speed());
        list.add(new skid.gay.sex.spermix.inside.shalopay.features.module.modules.player2.NoWeb());
        list.add(new skid.gay.sex.spermix.inside.shalopay.features.module.modules.world.Fucker());
        list.add(new skid.gay.sex.spermix.inside.shalopay.features.module.modules.world.Scaffold());
        list.add(new skid.gay.sex.spermix.inside.shalopay.features.module.modules.render2.ModelEsp());
        list.add(new skid.gay.sex.spermix.inside.shalopay.features.module.modules.world.PigFly());
        list.add(new skid.gay.sex.spermix.inside.shalopay.features.module.modules.player2.FastLadder());
        list.add(new skid.gay.sex.spermix.inside.shalopay.features.module.modules.player2.MCF());
        list.add(new skid.gay.sex.spermix.inside.shalopay.features.module.modules.player2.ChestStealer());
        list.add(new skid.gay.sex.spermix.inside.shalopay.features.module.modules.player2.KeepSprint());
        list.add(new skid.gay.sex.spermix.inside.shalopay.features.module.modules.player2.NoClip());
        list.add(new skid.gay.sex.spermix.inside.shalopay.features.module.modules.movement.NoFallMatrix());
        list.add(new InventoryWalk());
        list.add(new skid.gay.sex.spermix.inside.shalopay.features.module.modules.render.JumpPoin());
        list.add(new skid.gay.sex.spermix.inside.shalopay.features.module.modules.render.SpeedPoin());
        list.add(new skid.gay.sex.spermix.inside.shalopay.features.module.modules.movement.FlyMatrixNew());
        list.add(new Chams());
        list.add(new skid.gay.sex.spermix.inside.shalopay.features.module.modules.render2.Mirror());
        list.add(new skid.gay.sex.spermix.inside.shalopay.features.module.modules.movement.FlyCubeCraftNew());
        list.add(new skid.gay.sex.spermix.inside.shalopay.features.module.modules.world.Nucker());
        list.add(new skid.gay.sex.spermix.inside.shalopay.features.module.modules.player2.PearlCooldown());
        list.add(new skid.gay.sex.spermix.inside.shalopay.features.module.modules.player2.NameProtect());
        list.add(new skid.gay.sex.spermix.inside.shalopay.features.module.modules.movement.Gravity());
        list.add(new skid.gay.sex.spermix.inside.shalopay.features.module.modules.other.SaveBind());
        list.add(new skid.gay.sex.spermix.inside.shalopay.features.module.modules.movement.AirWalk());
        list.add(new skid.gay.sex.spermix.inside.shalopay.features.module.modules.combat.BowAimBot());
        list.add(new AntiPushoutoOfBlock());
        list.add(new skid.gay.sex.spermix.inside.shalopay.features.module.modules.render.FlyVert());
        list.add(new skid.gay.sex.spermix.inside.shalopay.features.module.modules.movement.MatrixFly());
        list.add(new skid.gay.sex.spermix.inside.shalopay.features.module.modules.movement.NewGlide());
        list.add(new skid.gay.sex.spermix.inside.shalopay.features.module.modules.combat.JetAura());
        list.add(new skid.gay.sex.spermix.inside.shalopay.features.module.modules.movement.WaterUp());
        list.add(new skid.gay.sex.spermix.inside.shalopay.features.module.modules.combat.Aura());
        list.add(new skid.gay.sex.spermix.inside.shalopay.features.module.modules.exploit.EnderChest());
        list.add(new skid.gay.sex.spermix.inside.shalopay.features.module.modules.exploit.CubeClip());
        list.add(new skid.gay.sex.spermix.inside.shalopay.features.module.modules.movement.CubeCraftFast());
        list.add(new skid.gay.sex.spermix.inside.shalopay.features.module.modules.combat.TpAura());
        list.add(new skid.gay.sex.spermix.inside.shalopay.features.module.modules.combat.MobAura());
        list.add(new skid.gay.sex.spermix.inside.shalopay.features.module.modules.exploit.WeatherEffects());
        list.add(new skid.gay.sex.spermix.inside.shalopay.features.module.modules.movement.LineFly());
        list.add(new skid.gay.sex.spermix.inside.shalopay.features.module.modules.movement.Elytra());
        list.add(new skid.gay.sex.spermix.inside.shalopay.features.module.modules.render2.EndEsp());
        list.add(new skid.gay.sex.spermix.inside.shalopay.features.module.modules.render2.Mirror());
        list.add(new skid.gay.sex.spermix.inside.shalopay.features.module.modules.render2.PlayerBox());
        list.add(new skid.gay.sex.spermix.inside.shalopay.features.module.modules.render2.HeallLine());
        list.add(new skid.gay.sex.spermix.inside.shalopay.features.module.modules.movement.PixelFly());
        list.add(new skid.gay.sex.spermix.inside.shalopay.features.module.modules.render.NoBlindness());
        list.add(new skid.gay.sex.spermix.inside.shalopay.features.module.modules.render.AllGlowing());
        list.add(new skid.gay.sex.spermix.inside.shalopay.features.module.modules.combat.AutoClicker());
        list.add(new skid.gay.sex.spermix.inside.shalopay.features.module.modules.combat.FastAura());
        list.add(new skid.gay.sex.spermix.inside.shalopay.features.module.modules.render2.MobEsp());
        list.add(new FreeCam());
        list.add(new skid.gay.sex.spermix.inside.shalopay.features.module.modules.combat.CrystalAura());
        list.add(new skid.gay.sex.spermix.inside.shalopay.features.module.modules.combat.Aura());
        list.add(new skid.gay.sex.spermix.inside.shalopay.features.module.modules.player2.InvCleaner());
        list.add(new skid.gay.sex.spermix.inside.shalopay.features.module.modules.movement.Teleport());
        list.add(new skid.gay.sex.spermix.inside.shalopay.features.module.modules.other.CustomSky());
        list.add(new skid.gay.sex.spermix.inside.shalopay.features.module.modules.combat.TriggerBot());
        list.add(new skid.gay.sex.spermix.inside.shalopay.features.module.modules.combat.NameAura());
        list.add(new skid.gay.sex.spermix.inside.shalopay.features.module.modules.combat.NameLoader());
    }

    public static ArrayList a() {
        return list;
    }

    public static Module a(Class var0) {
        Iterator var2 = a().iterator();

        while (var2.hasNext()) {
            Module var1 = (Module) var2.next();
            if (var1.getClass() == var0) {
                return var1;
            }
        }

        return null;
    }
}
