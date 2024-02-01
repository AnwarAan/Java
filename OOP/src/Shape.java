
class Shape {
  Integer getCorner() {
    return 0;
  }

}

class Rectangle extends Shape {
  Integer getCorner() {
    return 4;
  }

  Integer getCornerParent() {
    return super.getCorner();
  }
}
