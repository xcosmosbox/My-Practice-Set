// GeometricObject.java: The abstract GeometricObject class
public abstract class GeometricObject implements Comparable<GeometricObject>
{
 
  /**Default construct*/
  protected GeometricObject() {}
  
  /**Abstract method findArea*/
  public abstract double getArea();

  /**Abstract method getPerimeter*/
  public abstract double getPerimeter();
}
