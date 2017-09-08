class simplePredict {

  public static double classify(Object[] i)
    throws Exception {

    double p = Double.NaN;
    p = simplePredict.N722c41f40(i);
    return p;
  }
  static double N722c41f40(Object []i) {
    double p = Double.NaN;
    if (i[3] == null) {
      p = 1;
    } else if (((Double) i[3]).doubleValue() <= 0.0040543838404119015) {
      p = 1;
    } else if (((Double) i[3]).doubleValue() > 0.0040543838404119015) {
    p = simplePredict.N5b80350b1(i);
    } 
    return p;
  }
  static double N5b80350b1(Object []i) {
    double p = Double.NaN;
    if (i[0] == null) {
      p = 2;
    } else if (((Double) i[0]).doubleValue() <= 0.014811638742685318) {
      p = 2;
    } else if (((Double) i[0]).doubleValue() > 0.014811638742685318) {
    p = simplePredict.N5d6f64b12(i);
    } 
    return p;
  }
  static double N5d6f64b12(Object []i) {
    double p = Double.NaN;
    if (i[2] == null) {
      p = 0;
    } else if (((Double) i[2]).doubleValue() <= 0.002036124002188444) {
    p = simplePredict.N32a1bec03(i);
    } else if (((Double) i[2]).doubleValue() > 0.002036124002188444) {
    p = simplePredict.N22927a814(i);
    } 
    return p;
  }
  static double N32a1bec03(Object []i) {
    double p = Double.NaN;
    if (i[0] == null) {
      p = 0;
    } else if (((Double) i[0]).doubleValue() <= 0.8800122141838074) {
      p = 0;
    } else if (((Double) i[0]).doubleValue() > 0.8800122141838074) {
      p = 3;
    } 
    return p;
  }
  static double N22927a814(Object []i) {
    double p = Double.NaN;
    if (i[0] == null) {
      p = 2;
    } else if (((Double) i[0]).doubleValue() <= 0.05647268518805504) {
    p = simplePredict.N78e03bb55(i);
    } else if (((Double) i[0]).doubleValue() > 0.05647268518805504) {
    p = simplePredict.N5e8c92f46(i);
    } 
    return p;
  }
  static double N78e03bb55(Object []i) {
    double p = Double.NaN;
    if (i[1] == null) {
      p = 3;
    } else if (((Double) i[1]).doubleValue() <= 0.01207662746310234) {
      p = 3;
    } else if (((Double) i[1]).doubleValue() > 0.01207662746310234) {
      p = 2;
    } 
    return p;
  }
  static double N5e8c92f46(Object []i) {
    double p = Double.NaN;
    if (i[1] == null) {
      p = 3;
    } else if (((Double) i[1]).doubleValue() <= 0.035765670239925385) {
      p = 3;
    } else if (((Double) i[1]).doubleValue() > 0.035765670239925385) {
    p = simplePredict.N61e4705b7(i);
    } 
    return p;
  }
  static double N61e4705b7(Object []i) {
    double p = Double.NaN;
    if (i[2] == null) {
      p = 0;
    } else if (((Double) i[2]).doubleValue() <= 0.01863892935216427) {
      p = 0;
    } else if (((Double) i[2]).doubleValue() > 0.01863892935216427) {
      p = 3;
    } 
    return p;
  }
}

