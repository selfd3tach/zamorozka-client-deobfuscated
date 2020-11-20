package skid.gay.sex.spermix.inside.shalopay.j;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import net.minecraft.block.state.IBlockState;
import net.minecraft.client.renderer.block.model.BakedQuad;
import net.minecraft.init.Blocks;

public class aI {
   
   private List b = new ArrayList();
   
   private List a = new ArrayList();
   
   private List c = Arrays.asList();

   public void b() {
      this.a.clear();
      this.b.clear();
   }

   public int a() {
      return this.a.size();
   }

   public IBlockState b(int var1) {
      return var1 >= 0 && var1 < this.b.size() ? (IBlockState)this.b.get(var1) : Blocks.AIR.getDefaultState();
   }

   public List a(BakedQuad var1) {
      this.c.set(0, var1);
      return this.c;
   }

   public BakedQuad a(int var1) {
      return (BakedQuad)this.a.get(var1);
   }

   public void a(BakedQuad var1, IBlockState var2) {
      this.a.add(var1);
      this.b.add(var2);
   }
}
