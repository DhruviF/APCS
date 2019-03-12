public void fixUnderwater(){
  Pixel[][]pixels = this.getPixels2D();
  for (Pixel[]rowArray : pixels){
    for Pixel (pixelObj : rowArray){
      pixelObj.setRed(pixelObj.getRed()*3);
    }
  }
}
















public void negate(){
  Pixel[][]pixels = this.getPixels2D();
  for (Pixel[]rowArray : pixels){
    for Pixel (pixelObj : rowArray){
      pixelObj.setGreen(255 - (pixelObj.getGreen()));
      pixelObj.setRed(255 - (pixelObj.getRed()));
      pixelObj.setBlue(255 - (pixelObj.getBlue()));
    }
  }
}
