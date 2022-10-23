package raytracer.render;

import java.util.ArrayList;

class Rectangle3d {
	   Point3d center;
	   double radius;
	   Point3d normal;
	   int color;
	   static ArrayList<Rectangle3d> r = new ArrayList<>();
	   Rectangle3d(Point3d center, double radius, Point3d normal, int color) {
	      this.center = center;
	      this.radius = radius;
	      this.normal = normal;
	      this.color=color;
	      r.add(this);
	   }
	}
