package raytracer.render;

class RayCastReturn {
	   Rectangle3d r;
	   Point3d p;
	   RayCastReturn(Rectangle3d r, Point3d p) {
	      this.r = r;
	      this.p = p;
	   }
	}