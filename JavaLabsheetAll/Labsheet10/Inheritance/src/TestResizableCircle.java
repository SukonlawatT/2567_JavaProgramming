
public class TestResizableCircle {

	public static void main(String[] args) {
		ResizableCircle rc  = new ResizableCircle(10.0);
		System.out.println(rc);
		System.out.println("Perimeter: "+rc.getPerimeter());
		System.out.println("Area is "+rc.getArea());
		
		rc.resize(5);
		System.out.println("After resize(50%) : "+rc);
		System.out.println("Perimeter: "+rc.getPerimeter());
		System.out.println("Area is "+rc.getArea());

	}

}
