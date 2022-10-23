package raytracer.render;

import java.util.ArrayList;

class Light {
	   double strength;
	   Point3d pos;
	   static ArrayList<Light> l = new ArrayList<>();
	   int r;
	   int g;
	   int b;
	   Light(double strength, Point3d pos, int color) {
	      this.strength = strength;
	      this.pos = pos;
	      l.add(this);
	      r = (int)Math.floor(color / 256 / 256);
	      g = (int)Math.floor((color - r * 256 * 256) / 256);
	      b = (int)Math.floor((color - g * 256 - r * 256 * 256));
	   }
	}
