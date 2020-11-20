package skid.gay.sex.spermix.inside.shalopay.h;

import java.io.PrintWriter;
import java.io.StringWriter;
import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.lang.reflect.Modifier;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Vector;

public class j implements d {
   
   private String a;
   
   private Vector b = new Vector(10);

   public j(Class var1) {
      this.b(var1);
   }

   public void b(String var1) {
      this.a = var1;
   }

   private boolean b(Method var1) {
      return var1.getParameterTypes().length == 0 && var1.getName().startsWith("test") && var1.getReturnType().equals(Void.TYPE);
   }

   private void b(Class var1) {
      this.a = var1.getName();

      try {
         a(var1);
      } catch (NoSuchMethodException var8) {
         this.a(a(String.valueOf((new StringBuilder()).append("Class ").append(var1.getName()).append(" has no public constructor TestCase(String name) or TestCase()"))));
         return;
      }

      if (!Modifier.isPublic(var1.getModifiers())) {
         this.a(a(String.valueOf((new StringBuilder()).append("Class ").append(var1.getName()).append(" is not public"))));
      } else {
         Class var2 = var1;

         for(ArrayList var3 = new ArrayList(); d.class.isAssignableFrom(var2); var2 = var2.getSuperclass()) {
            Method[] var4 = var2.getDeclaredMethods();
            int var5 = var4.length;

            for(int var6 = 0; var6 < var5; ++var6) {
               Method var7 = var4[var6];
               this.a(var7, var3, var1);
            }
         }

         if (this.b.size() == 0) {
            this.a(a(String.valueOf((new StringBuilder()).append("No tests found in ").append(var1.getName()))));
         }

      }
   }

   private boolean a(Method var1) {
      return this.b(var1) && Modifier.isPublic(var1.getModifiers());
   }

   public String toString() {
      return this.b() != null ? this.b() : super.toString();
   }

   public static d a(String var0) {
      return new k("warning", var0);
   }

   public d a(int var1) {
      return (d)this.b.get(var1);
   }

   public static d a(Class var0, String var1) {
      Constructor var2;
      try {
         var2 = a(var0);
      } catch (NoSuchMethodException var8) {
         return a(String.valueOf((new StringBuilder()).append("Class ").append(var0.getName()).append(" has no public constructor TestCase(String name) or TestCase()")));
      }

      Object var3;
      try {
         if (var2.getParameterTypes().length == 0) {
            var3 = var2.newInstance();
            if (var3 instanceof WhatIsTheHell) {
               ((WhatIsTheHell)var3).b(var1);
            }
         } else {
            var3 = var2.newInstance(var1);
         }
      } catch (InstantiationException var5) {
         return a(String.valueOf((new StringBuilder()).append("Cannot instantiate test case: ").append(var1).append(" (").append(a((Throwable)var5)).append(")")));
      } catch (InvocationTargetException var6) {
         return a(String.valueOf((new StringBuilder()).append("Exception in constructor: ").append(var1).append(" (").append(a(var6.getTargetException())).append(")")));
      } catch (IllegalAccessException var7) {
         return a(String.valueOf((new StringBuilder()).append("Cannot access test case: ").append(var1).append(" (").append(a((Throwable)var7)).append(")")));
      }

      return (d)var3;
   }

   public int c() {
      return this.b.size();
   }

   public j() {
   }

   public j(String var1) {
      this.b(var1);
   }

   public String b() {
      return this.a;
   }

   public void b(h var1) {
      Iterator var2 = this.b.iterator();

      while(var2.hasNext()) {
         d var3 = (d)var2.next();
         if (var1.a()) {
            break;
         }

         this.a(var3, var1);
      }

   }

   public void a(d var1, h var2) {
      var1.b(var2);
   }

   public static Constructor a(Class var0) {
      try {
         return var0.getConstructor(String.class);
      } catch (NoSuchMethodException var2) {
         return var0.getConstructor();
      }
   }

   private static String a(Throwable var0) {
      StringWriter var1 = new StringWriter();
      PrintWriter var2 = new PrintWriter(var1);
      var0.printStackTrace(var2);
      return var1.toString();
   }

   public int a() {
      int var1 = 0;

      d var3;
      for(Iterator var2 = this.b.iterator(); var2.hasNext(); var1 += var3.a()) {
         var3 = (d)var2.next();
      }

      return var1;
   }

   public void a(d var1) {
      this.b.add(var1);
   }

   private void a(Method var1, List var2, Class var3) {
      String var4 = var1.getName();
      if (!var2.contains(var4)) {
         if (!this.a(var1)) {
            if (this.b(var1)) {
               this.a(a(String.valueOf((new StringBuilder()).append("Test method isn't public: ").append(var1.getName()).append("(").append(var3.getCanonicalName()).append(")"))));
            }

         } else {
            var2.add(var4);
            this.a(a(var3, var4));
         }
      }
   }
}
