package raytracer.render;

public class Portal extends Rectangle3d{
	Point3d p2;
	Point3d np2;
	double p2r;
	Portal(Point3d center, double radius, Point3d normal, int color, Point3d p2,Point3d np2, double p2r) {
		super(center, radius, normal, color);
		this.p2=p2;
		this.np2=np2;
		this.p2r=p2r;
	}
}
