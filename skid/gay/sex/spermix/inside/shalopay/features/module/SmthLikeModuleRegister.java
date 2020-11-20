package skid.gay.sex.spermix.inside.shalopay.features.module;

import java.util.ArrayList;
import java.util.Iterator;

import skid.gay.sex.spermix.inside.shalopay.features.module.modules.combat.FastBow;
import skid.gay.sex.spermix.inside.shalopay.features.module.modules.combat.KillAura;
import skid.gay.sex.spermix.inside.shalopay.features.module.modules.movement.AirWalk;
import skid.gay.sex.spermix.inside.shalopay.features.module.modules.movement.WaterUp;
import skid.gay.sex.spermix.inside.shalopay.features.module.modules.movement.Speed;
import skid.gay.sex.spermix.inside.shalopay.features.module.modules.movement.Timer;
import skid.gay.sex.spermix.inside.shalopay.features.module.modules.movement.Fly;
import skid.gay.sex.spermix.inside.shalopay.features.module.modules.movement.FlyMatrix;
import skid.gay.sex.spermix.inside.shalopay.features.module.modules.movement.FlyJump;
import skid.gay.sex.spermix.inside.shalopay.features.module.modules.movement.Glide;
import skid.gay.sex.spermix.inside.shalopay.features.module.modules.movement.Jesus;
import skid.gay.sex.spermix.inside.shalopay.features.module.modules.movement.Sprint;
import skid.gay.sex.spermix.inside.shalopay.features.module.modules.movement.TNTFly;
import skid.gay.sex.spermix.inside.shalopay.features.smthlikebipas.*;
import skid.gay.sex.spermix.inside.shalopay.features.module.modules.player2.AntiPushoutoOfBlock;
import skid.gay.sex.spermix.inside.shalopay.features.module.modules.player2.InventoryWalk;
import skid.gay.sex.spermix.inside.shalopay.features.module.modules.player2.NoSlowdown;
import skid.gay.sex.spermix.inside.shalopay.features.module.modules.render2.*;
import skid.gay.sex.spermix.inside.shalopay.features.module.modules.world.ScaffFly;

public class SmthLikeModuleRegister {
   
   public XRayByPass c;
   
   public XRay b;
   
   public static ArrayList a = new ArrayList();

   public SmthLikeModuleRegister() {
      a.add(new TNTFly());
      a.add(new Glide());
      a.add(new FlyJump());
      a.add(new FlyMatrix());
      a.add(new WaterUp());
      a.add(new Sprint());
      a.add(new Fly());
      a.add(new skid.gay.sex.spermix.inside.shalopay.features.maybehudmode.HudMode());
      a.add(new skid.gay.sex.spermix.inside.shalopay.features.module.modules.movement.Timer());
      a.add(new Jesus());
      a.add(new TracerPlayers());
      a.add(new TracerPortal());
      a.add(new TracerPyhest());
      a.add(new skid.gay.sex.spermix.inside.shalopay.features.module.modules.render2.TracerShulker());
      a.add(new AlfaWallhack());
      a.add(new skid.gay.sex.spermix.inside.shalopay.features.module.modules.world.FastPlace());
      a.add(new PlayerLine());
      a.add(new SpawnerEsp());
      a.add(new skid.gay.sex.spermix.inside.shalopay.features.module.modules.render2.ShulkerEsp());
      a.add(new FullBright());
      a.add(new skid.gay.sex.spermix.inside.shalopay.features.module.modules.render2.ChestBox());
      a.add(new BedEsp());
      a.add(new skid.gay.sex.spermix.inside.shalopay.features.module.modules.render2.ItemEsp());
      a.add(new Fly());
      a.add(new AirWalk());
      a.add(new skid.gay.sex.spermix.inside.shalopay.features.module.modules.world.BoatFly());
      a.add(new skid.gay.sex.spermix.inside.shalopay.features.module.modules.world.BoatSpeed2());
      a.add(new skid.gay.sex.spermix.inside.shalopay.features.module.modules.world.HorseFly());
      a.add(new ScaffFly());
      a.add(new KillAura());
      a.add(new skid.gay.sex.spermix.inside.shalopay.features.module.modules.combat.MatrixAura());
      a.add(new skid.gay.sex.spermix.inside.shalopay.features.module.modules.combat.AntiKnockBack());
      a.add(new skid.gay.sex.spermix.inside.shalopay.features.module.modules.player2.ChestStealer());
      a.add(new skid.gay.sex.spermix.inside.shalopay.features.module.modules.player2.AntiFire());
      a.add(new skid.gay.sex.spermix.inside.shalopay.features.module.modules.player2.NoFall());
      a.add(new Timer());
      a.add(new skid.gay.sex.spermix.inside.shalopay.features.module.modules.world.FastPlace());
      a.add(new skid.gay.sex.spermix.inside.shalopay.features.module.modules.render.SpeedMine());
      a.add(new skid.gay.sex.spermix.inside.shalopay.features.module.modules.render.FlyPoin());
      a.add(new skid.gay.sex.spermix.inside.shalopay.features.module.modules.combat.AimBot());
      a.add(new skid.gay.sex.spermix.inside.shalopay.features.module.modules.combat.AutoTotem());
      a.add(new skid.gay.sex.spermix.inside.shalopay.features.module.modules.combat.Reach());
      a.add(new skid.gay.sex.spermix.inside.shalopay.features.module.modules.render.NightVision());
      a.add(new skid.gay.sex.spermix.inside.shalopay.features.module.modules.movement.LongJump());
      a.add(this.b = new XRay());
      a.add(this.c = new XRayByPass());
      a.add(new skid.gay.sex.spermix.inside.shalopay.features.module.modules.exploit.XrayLite());
      a.add(new skid.gay.sex.spermix.inside.shalopay.features.module.modules.combat.Criticals());
      a.add(new FastBow());
      a.add(new skid.gay.sex.spermix.inside.shalopay.features.module.modules.exploit.Spammer());
      a.add(new skid.gay.sex.spermix.inside.shalopay.features.module.modules.combat.AutoArmor());
      a.add(new skid.gay.sex.spermix.inside.shalopay.features.module.modules.player2.HitBox());
      a.add(new skid.gay.sex.spermix.inside.shalopay.features.module.modules.world.Spider());
      a.add(new skid.gay.sex.spermix.inside.shalopay.features.module.modules.movement.Derp());
      a.add(new skid.gay.sex.spermix.inside.shalopay.features.module.modules.movement.JesusPack());
      a.add(new NoSlowdown());
      a.add(new skid.gay.sex.spermix.inside.shalopay.features.module.modules.combat.AntiAim());
      a.add(new skid.gay.sex.spermix.inside.shalopay.features.module.modules.player2.Phase());
      a.add(new skid.gay.sex.spermix.inside.shalopay.features.module.modules.render2.HUD());
      a.add(new skid.gay.sex.spermix.inside.shalopay.features.module.modules.exploit.FakeOP());
      a.add(new skid.gay.sex.spermix.inside.shalopay.features.module.modules.world.BoatGlide());
      a.add(new skid.gay.sex.spermix.inside.shalopay.features.module.modules.world.SafeWalk());
      a.add(new skid.gay.sex.spermix.inside.shalopay.features.module.modules.other.Zamorozka());
      a.add(new FlyTeleport());
      a.add(new skid.gay.sex.spermix.inside.shalopay.features.module.modules.movement.FlyCubeCraft());
      a.add(new Speed());
      a.add(new skid.gay.sex.spermix.inside.shalopay.features.module.modules.render2.NameTags());
      a.add(new skid.gay.sex.spermix.inside.shalopay.features.module.modules.exploit.Crasher());
      a.add(new skid.gay.sex.spermix.inside.shalopay.features.module.modules.player2.AntiAfk());
      a.add(new skid.gay.sex.spermix.inside.shalopay.features.module.modules.world.ReackBlock());
      a.add(new skid.gay.sex.spermix.inside.shalopay.features.module.modules.movement.Speed());
      a.add(new skid.gay.sex.spermix.inside.shalopay.features.module.modules.player2.NoWeb());
      a.add(new skid.gay.sex.spermix.inside.shalopay.features.module.modules.world.Fucker());
      a.add(new skid.gay.sex.spermix.inside.shalopay.features.module.modules.world.Scaffold());
      a.add(new skid.gay.sex.spermix.inside.shalopay.features.module.modules.render2.ModelEsp());
      a.add(new skid.gay.sex.spermix.inside.shalopay.features.module.modules.world.PigFly());
      a.add(new skid.gay.sex.spermix.inside.shalopay.features.module.modules.player2.FastLadder());
      a.add(new skid.gay.sex.spermix.inside.shalopay.features.module.modules.player2.MCF());
      a.add(new skid.gay.sex.spermix.inside.shalopay.features.module.modules.player2.ChestStealer());
      a.add(new skid.gay.sex.spermix.inside.shalopay.features.module.modules.player2.KeepSprint());
      a.add(new skid.gay.sex.spermix.inside.shalopay.features.module.modules.player2.NoClip());
      a.add(new skid.gay.sex.spermix.inside.shalopay.features.module.modules.movement.NoFallMatrix());
      a.add(new InventoryWalk());
      a.add(new skid.gay.sex.spermix.inside.shalopay.features.module.modules.render.JumpPoin());
      a.add(new skid.gay.sex.spermix.inside.shalopay.features.module.modules.render.SpeedPoin());
      a.add(new skid.gay.sex.spermix.inside.shalopay.features.module.modules.movement.FlyMatrixNew());
      a.add(new Chams());
      a.add(new skid.gay.sex.spermix.inside.shalopay.features.module.modules.render2.Mirror());
      a.add(new skid.gay.sex.spermix.inside.shalopay.features.module.modules.movement.FlyCubeCraftNew());
      a.add(new skid.gay.sex.spermix.inside.shalopay.features.module.modules.world.Nucker());
      a.add(new skid.gay.sex.spermix.inside.shalopay.features.module.modules.player2.PearlCooldown());
      a.add(new skid.gay.sex.spermix.inside.shalopay.features.module.modules.player2.NameProtect());
      a.add(new skid.gay.sex.spermix.inside.shalopay.features.module.modules.movement.Gravity());
      a.add(new skid.gay.sex.spermix.inside.shalopay.features.module.modules.other.SaveBind());
      a.add(new skid.gay.sex.spermix.inside.shalopay.features.module.modules.movement.AirWalk());
      a.add(new skid.gay.sex.spermix.inside.shalopay.features.module.modules.combat.BowAimBot());
      a.add(new AntiPushoutoOfBlock());
      a.add(new skid.gay.sex.spermix.inside.shalopay.features.module.modules.render.FlyVert());
      a.add(new skid.gay.sex.spermix.inside.shalopay.features.module.modules.movement.MatrixFly());
      a.add(new skid.gay.sex.spermix.inside.shalopay.features.module.modules.movement.NewGlide());
      a.add(new skid.gay.sex.spermix.inside.shalopay.features.module.modules.combat.JetAura());
      a.add(new skid.gay.sex.spermix.inside.shalopay.features.module.modules.movement.WaterUp());
      a.add(new skid.gay.sex.spermix.inside.shalopay.features.module.modules.combat.Aura());
      a.add(new skid.gay.sex.spermix.inside.shalopay.features.module.modules.exploit.EnderChest());
      a.add(new skid.gay.sex.spermix.inside.shalopay.features.module.modules.exploit.CubeClip());
      a.add(new skid.gay.sex.spermix.inside.shalopay.features.module.modules.movement.CubeCraftFast());
      a.add(new skid.gay.sex.spermix.inside.shalopay.features.module.modules.combat.TpAura());
      a.add(new skid.gay.sex.spermix.inside.shalopay.features.module.modules.combat.MobAura());
      a.add(new skid.gay.sex.spermix.inside.shalopay.features.module.modules.exploit.WeatherEffects());
      a.add(new skid.gay.sex.spermix.inside.shalopay.features.module.modules.movement.LineFly());
      a.add(new skid.gay.sex.spermix.inside.shalopay.features.module.modules.movement.Elytra());
      a.add(new skid.gay.sex.spermix.inside.shalopay.features.module.modules.render2.EndEsp());
      a.add(new skid.gay.sex.spermix.inside.shalopay.features.module.modules.render2.Mirror());
      a.add(new skid.gay.sex.spermix.inside.shalopay.features.module.modules.render2.PlayerBox());
      a.add(new skid.gay.sex.spermix.inside.shalopay.features.module.modules.render2.HeallLine());
      a.add(new skid.gay.sex.spermix.inside.shalopay.features.module.modules.movement.PixelFly());
      a.add(new skid.gay.sex.spermix.inside.shalopay.features.module.modules.render.NoBlindness());
      a.add(new skid.gay.sex.spermix.inside.shalopay.features.module.modules.render.AllGlowing());
      a.add(new skid.gay.sex.spermix.inside.shalopay.features.maybehudmode.Music());
      a.add(new skid.gay.sex.spermix.inside.shalopay.features.module.modules.combat.AutoClicker());
      a.add(new skid.gay.sex.spermix.inside.shalopay.features.module.modules.combat.FastAura());
      a.add(new skid.gay.sex.spermix.inside.shalopay.features.module.modules.render2.MobEsp());
      a.add(new FreeCam());
      a.add(new skid.gay.sex.spermix.inside.shalopay.features.module.modules.combat.CrystalAura());
      a.add(new skid.gay.sex.spermix.inside.shalopay.features.module.modules.combat.Aura());
      a.add(new skid.gay.sex.spermix.inside.shalopay.features.hud.InfoBoard());
      a.add(new skid.gay.sex.spermix.inside.shalopay.features.hud.ArrayList());
      a.add(new skid.gay.sex.spermix.inside.shalopay.features.hud.TextRadar());
      a.add(new Defaulted());
      a.add(new MaraxBipas());
      a.add(new JustPerdunMine());
      a.add(new NewMegoSpeed());
      a.add(new LMAOZELUXBANNEDMODERATORBYPASS());
      a.add(new skid.gay.sex.spermix.inside.shalopay.features.module.modules.player2.InvCleaner());
      a.add(new skid.gay.sex.spermix.inside.shalopay.features.module.modules.movement.Teleport());
      a.add(new skid.gay.sex.spermix.inside.shalopay.features.module.modules.other.CustomSky());
      a.add(new skid.gay.sex.spermix.inside.shalopay.features.module.modules.combat.TriggerBot());
      a.add(new skid.gay.sex.spermix.inside.shalopay.features.module.modules.combat.NameAura());
      a.add(new skid.gay.sex.spermix.inside.shalopay.features.module.modules.combat.NameLoader());
      a.add(new skid.gay.sex.spermix.inside.shalopay.features.hud.Logo());
   }

   public static ArrayList a() {
      return a;
   }

   public static Module a(Class var0) {
      Iterator var2 = a().iterator();

      while(var2.hasNext()) {
         Module var1 = (Module)var2.next();
         if (var1.getClass() == var0) {
            return var1;
         }
      }

      return null;
   }
}
