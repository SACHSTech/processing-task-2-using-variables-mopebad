import processing.core.PApplet;

public class Sketch extends PApplet {
  
  public void settings() {
    size(600, 600);
  }

  public void setup() {
    background(210, 255, 173);
  }

  public void draw() {
    // Draw the stem
    stroke(0, 255, 0); // Green color for the stem
    float stemWeight = width / 30; // Proportional stroke weight
    strokeWeight(stemWeight);
    float stemX = width / 2;
    float stemTopY = height / 2 + (width / 12 * 3); // Adjusted based on petal size
    float stemBottomY = height / 2 + (width / 12 * 7); // Adjusted based on petal size
    line(stemX, stemTopY, stemX, stemBottomY); // Proportional stem line

    // Draw petals
    fill(255, 0, 0); // Red color for petals
    noStroke(); // No outline for petals
    ellipse(width / 4, height / 4, width / 2, height / 2); // Petal 1
    ellipse(width * 0.75f, height / 4.0f, width / 2.0f, height / 2.0f); // Petal 2 (using floats)
    ellipse(width / 4.0f, height * 0.75f, width / 2.0f, height / 2.0f); // Petal 3 (using floats)
    ellipse(width * 0.75f, height * 0.75f, width / 2.0f, height / 2.0f); // Petal 4 (using floats)

    // Draw the center of the flower
    fill(255, 255, 0); // Yellow color for the center
    ellipse(width / 2, height / 2, width / 2, height / 2); // Proportional center of the flower
  }
}
