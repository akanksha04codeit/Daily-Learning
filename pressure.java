
public class pressure {

	float calPressure(float force, float area) {
		float pressure=force/area;
		return pressure;
	}
	public static void main(String[] args) {
		
      pressure obj = new pressure();
      float p = obj.calPressure(12, 20);
      System.out.println("Pressure is "+p);
	}

}
