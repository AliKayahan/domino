package kayahan006;
/**
 * @author Kevan Buckley, maintained by Cumali Kayahan
 * @version 3.3, 2021
 */

public class SpacePlace {
  private int xOrg;
  private int yOrg;
  private double theta;
  private double phi;
  
  public SpacePlace() {
    xOrg = 0;
    yOrg = 0;
  }

  public SpacePlace(double theta, double phi) {
    super();
    this.theta = theta;
    this.phi = phi;
  }

  public int getxOrg() {
    return xOrg;
  }

  public void setxOrg(int xOrg) {
    this.xOrg = xOrg;
  }

  public int getyOrg() {
    return yOrg;
  }

  public void setyOrg(int yOrg) {
    this.yOrg = yOrg;
  }

  public double getTheta() {
    return theta;
  }

  public void setTheta(double theta) {
    this.theta = theta;
  }

  public double getPhi() {
    return phi;
  }

  public void setPhi(double phi) {
    this.phi = phi;
  }
  
}
