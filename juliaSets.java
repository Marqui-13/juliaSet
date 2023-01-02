float angle = 0;

void setup() {
  size(650, 350);
  colorMode(HSB, 1);
}

void draw() {
  // Plug these values into the respective equations on lines 42 and 43 to get different julia sets
  //float constantA = map(mouseX, 0, width, -1, 1);
  //float constantB = map(mouseY, 0, height, -1, 1);
  float constantA = cos(angle * PI);
  float constantB = sin(angle);
  
  angle += 0.008;
  
  background(255);
  
  float w = abs(cos(angle))*3;
  float h = (w * height) / width;
  
  float xMin = -w / 2;
  float yMin = - h / 2;
  
  loadPixels();
  
  int maxIterations = 100;
  
  float xMax = xMin + w;
  float yMax = yMin + h;
  
  float dx = (xMax - xMin) / (width);
  float dy = (yMax - yMin) / (height);
  
  float y = yMin;
  for (int j = 0; j < height; j++) {
    float x = xMin;
    for (int i = 0; i < width; i++) {
      
      float a = x;
      float b = y;
      int n = 0;
      while (n < maxIterations) {
        float aSquared = a * a;
        float bSquared = b * b;
        if (((aSquared * aSquared) + (bSquared * bSquared)) > 4.0) {
          break;
        }
        float twoab = 2.0 * a * b;
        //change the x and y values being added on the 2 lines below to get different julia sets
        a = aSquared - bSquared + constantA;
        b = twoab + constantB;
        n++;
      }
      
      if (n == maxIterations) {
        pixels[i + j * width] = color(0);    
      } else {
          float hue = sqrt(float(n) / maxIterations);
          pixels[i + j * width] = color(hue, 255, 100);  
      }
      x += dx;
    }
    y += dy;
  }
  updatePixels();
}
