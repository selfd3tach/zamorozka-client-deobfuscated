package skid.gay.sex.spermix.inside.shalopay.features.idk;

import java.awt.Color;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import org.lwjgl.input.Mouse;
import org.lwjgl.opengl.Display;
import org.lwjgl.opengl.GL11;

public class w {
   
   private boolean b;
   
   private boolean c;
   
   private int d;
   
   private List a = new ArrayList();

   public w(int var1, boolean var2, boolean var3, int var4) {
      this.a(var1);
      this.b = var2;
      this.d = var4;
      this.c = var3;
   }

   public void b(int var1) {
      if (Mouse.isButtonDown(0)) {
         this.a(1);
      }

      Iterator var3 = this.a.iterator();

      while(var3.hasNext()) {
         RenderUtils2 var2 = (RenderUtils2)var3.next();
         var2.a(var1, 0.1F);
      }

   }

   public void a() {
      Iterator var2 = this.a.iterator();

      while(true) {
         label85:
         while(var2.hasNext()) {
            RenderUtils2 var1 = (RenderUtils2)var2.next();
            GL11.glColor4f(1.0F, 1.0F, 1.0F, var1.b() / 255.0F);
            GL11.glPointSize(var1.e());
            GL11.glBegin(0);
            GL11.glVertex2f(var1.c(), var1.d());
            GL11.glEnd();
            if (this.b) {
               Color var8 = null;
               if (this.c) {
                  var8 = RadioShanson.a(50.0F, 0.0F);
               }

               float var9 = (float)s.a(var1.c(), var1.d(), (float)Mouse.getX(), (float)(Display.getHeight() - Mouse.getY()));
               if (var9 < (float)this.d) {
                  float var12 = Math.min(1.0F, Math.min(1.0F, 1.0F - var9 / (float)this.d));
                  this.a(var1.c(), var1.d(), (float)Mouse.getX(), (float)(Display.getHeight() - Mouse.getY()), this.c ? (float)var8.getRed() / 255.0F : 1.0F, this.c ? (float)var8.getGreen() / 255.0F : 1.0F, this.c ? (float)var8.getBlue() / 255.0F : 1.0F, var12);
               }
            } else {
               float var3 = 0.0F;
               RenderUtils2 var4 = null;
               Iterator var6 = this.a.iterator();

               while(true) {
                  RenderUtils2 var5;
                  float var7;
                  do {
                     do {
                        do {
                           if (!var6.hasNext()) {
                              if (var4 != null) {
                                 Color var10 = null;
                                 if (this.c) {
                                    var10 = RadioShanson.a(50.0F, 0.0F);
                                 }

                                 float var11 = Math.min(1.0F, Math.min(1.0F, 1.0F - var3 / (float)this.d));
                                 this.a(var1.c(), var1.d(), var4.c(), var4.d(), this.c ? (float)var10.getRed() / 255.0F : 1.0F, this.c ? (float)var10.getGreen() / 255.0F : 1.0F, this.c ? (float)var10.getBlue() / 255.0F : 1.0F, var11);
                              }
                              continue label85;
                           }

                           var5 = (RenderUtils2)var6.next();
                           var7 = var1.a(var5);
                        } while(var7 > (float)this.d);
                     } while(s.a((float)Mouse.getX(), (float)(Display.getHeight() - Mouse.getY()), var1.c(), var1.d()) > (double)this.d && s.a((float)Mouse.getX(), (float)(Display.getHeight() - Mouse.getY()), var5.c(), var5.d()) > (double)this.d);
                  } while(var3 > 0.0F && var7 > var3);

                  var3 = var7;
                  var4 = var5;
               }
            }
         }

         return;
      }
   }

   public void a(int var1) {
      for(int var2 = 0; var2 < var1; ++var2) {
         this.a.add(RenderUtils2.a());
      }

   }

   private void a(float var1, float var2, float var3, float var4, float var5, float var6, float var7, float var8) {
      GL11.glColor4f(var5, var6, var7, var8);
      GL11.glLineWidth(0.5F);
      GL11.glBegin(1);
      GL11.glVertex2f(var1, var2);
      GL11.glVertex2f(var3, var4);
      GL11.glEnd();
   }
}
