package laba1;
class Data {
 private double sum;
 private int cnt;
 private double max;
 public Data() {
     sum = 0;
     cnt= 0;
     max = Double.MIN_VALUE; 
 }
 
 public void addValue(double value) {
     sum += value;
     cnt++;
     if (value > max) {
         max = value;
     }
 }
 
 public double getAverage() {
     if (cnt == 0) {
         return 0; 
     }
     return sum / cnt;
 }
 
 
 public double getMaximum() {
     return max;
 }
}