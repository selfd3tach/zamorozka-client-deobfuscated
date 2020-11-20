package skid.gay.sex.spermix.inside.shalopay.j;

import java.util.ArrayList;
import java.util.BitSet;
import java.util.List;
import net.minecraft.block.Block;
import net.minecraft.block.BlockLeaves;
import net.minecraft.block.state.BlockStateBase;
import net.minecraft.block.state.IBlockState;
import net.minecraft.client.renderer.BlockModelRenderer$AmbientOcclusionFace;
import net.minecraft.client.renderer.RegionRenderCacheBuilder;
import net.minecraft.client.renderer.block.model.BakedQuad;
import net.minecraft.client.renderer.block.model.BakedQuadRetextured;
import net.minecraft.util.BlockRenderLayer;
import net.minecraft.util.EnumFacing;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.IBlockAccess;

public class bs {
   
   private aI[] w;
   
   private List p;
   
   private EnumFacing[] o;
   
   private boolean[] m;
   
   private BakedQuad[] r;
   
   private BakedQuad[] u;
   
   private int f = -1;
   
   private BakedQuad[] s;
   
   private boolean x;
   
   private int d = -1;
   
   private int g = -1;
   
   private BlockPos c;
   
   private BakedQuad[] t;
   
   private ClientLoginThread k;
   
   private IBlockAccess a;
   
   private IBlockState b;
   
   private float[] h;
   
   private List q;
   
   private RegionRenderCacheBuilder v;
   
   private boolean[] n;
   
   private int e = -1;
   
   private BitSet i;
   
   private boolean[] l;
   
   private BlockModelRenderer$AmbientOcclusionFace j;

   public int b() {
      if (this.e < 0) {
         if (this.b instanceof BlockStateBase) {
            BlockStateBase var1 = (BlockStateBase)this.b;
            this.e = var1.getMetadata();
         } else {
            this.e = this.b.getBlock().getMetaFromState(this.b);
         }
      }

      return this.e;
   }

   public void a(IBlockAccess var1, IBlockState var2, BlockPos var3) {
      if (this.a != var1 || this.b != var2 || this.c != var3) {
         this.a = var1;
         this.b = var2;
         this.c = var3;
         this.d = -1;
         this.e = -1;
         this.f = -1;
         this.g = -1;
         this.i.clear();
      }

   }

   public bs(IBlockAccess var1, IBlockState var2, BlockPos var3) {
      this.h = new float[EnumFacing.VALUES.length * 2];
      this.i = new BitSet(3);
      this.j = new BlockModelRenderer$AmbientOcclusionFace();
      this.k = null;
      this.l = null;
      this.m = null;
      this.n = null;
      this.o = null;
      this.p = new ArrayList();
      this.q = new ArrayList();
      this.r = new BakedQuad[1];
      this.s = new BakedQuad[2];
      this.t = new BakedQuad[3];
      this.u = new BakedQuad[4];
      this.v = null;
      this.w = new aI[BlockRenderLayer.values().length];
      this.x = false;
      this.a = var1;
      this.b = var2;
      this.c = var3;
   }

   public ClientLoginThread h() {
      if (this.k == null) {
         this.k = new ClientLoginThread(0, 0, 0);
      }

      return this.k;
   }

   public int a() {
      if (this.d < 0) {
         if (this.b instanceof BlockStateBase) {
            BlockStateBase var1 = (BlockStateBase)this.b;
            this.d = var1.getBlockId();
         } else {
            this.d = Block.getIdFromBlock(this.b.getBlock());
         }
      }

      return this.d;
   }

   public RegionRenderCacheBuilder n() {
      return this.v;
   }

   public BakedQuad[] b(BakedQuad var1) {
      this.r[0] = var1;
      return this.r;
   }

   public boolean[] k() {
      if (this.n == null) {
         this.n = new boolean[4];
      }

      return this.n;
   }

   public boolean[] j() {
      if (this.m == null) {
         this.m = new boolean[4];
      }

      return this.m;
   }

   public List a(BakedQuad[] var1) {
      this.q.clear();
      if (var1 != null) {
         for(int var2 = 0; var2 < var1.length; ++var2) {
            BakedQuad var3 = var1[var2];
            this.q.add(var3);
         }
      }

      return this.q;
   }

   public boolean[] i() {
      if (this.l == null) {
         this.l = new boolean[4];
      }

      return this.l;
   }

   public BakedQuad[] a(BakedQuad var1, BakedQuad var2, BakedQuad var3, BakedQuad var4) {
      this.u[0] = var1;
      this.u[1] = var2;
      this.u[2] = var3;
      this.u[3] = var4;
      return this.u;
   }

   public BlockModelRenderer$AmbientOcclusionFace e() {
      return this.j;
   }

   public boolean a(List var1) {
      if (this.f == -1 && var1.size() > 0) {
         if (var1.get(0) instanceof BakedQuadRetextured) {
            this.f = 1;
         } else {
            this.f = 0;
         }
      }

      return this.f == 1;
   }

   public List m() {
      return this.p;
   }

   public BakedQuad[] a(BakedQuad var1, BakedQuad var2, BakedQuad var3) {
      this.t[0] = var1;
      this.t[1] = var2;
      this.t[2] = var3;
      return this.t;
   }

   public boolean f() {
      return this.f == 1;
   }

   public aI a(BlockRenderLayer var1) {
      aI var2 = this.w[var1.ordinal()];
      if (var2 == null) {
         var2 = new aI();
         this.w[var1.ordinal()] = var2;
      }

      return var2;
   }

   public BitSet d() {
      return this.i;
   }

   public BakedQuad[] a(BakedQuad var1, BakedQuad var2) {
      this.s[0] = var1;
      this.s[1] = var2;
      return this.s;
   }

   public boolean a(BakedQuad var1) {
      if (this.f < 0) {
         if (var1 instanceof BakedQuadRetextured) {
            this.f = 1;
         } else {
            this.f = 0;
         }
      }

      return this.f == 1;
   }

   public boolean o() {
      return this.x;
   }

   public void a(boolean var1) {
      this.x = var1;
   }

   public IBlockState g() {
      return this.b;
   }

   public boolean l() {
      if (this.g == -1) {
         if (skid.gay.sex.spermix.inside.shalopay.RadioShanson.FastAura.B() && this.b.getBlock() instanceof BlockLeaves) {
            this.g = 1;
         } else {
            this.g = 0;
         }
      }

      return this.g == 1;
   }

   public void a(RegionRenderCacheBuilder var1) {
      this.v = var1;
   }

   public float[] c() {
      return this.h;
   }
}
