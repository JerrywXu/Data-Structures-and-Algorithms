package com.interview;
import java.math.BigDecimal;
    public class Sqrt {
        private static final double PRECISION = 6;

        public static double sqrt(double num) throws RuntimeException{
            if(num < 0){
                throw new RuntimeException("num should bigger than 0!");
            }
            if(num == 0 || num == 1){
                return num;
            }

            return sqrt0(0, num, num);
        }

        private static double sqrt0(double low, double high, double num){
            double mid = (low + high) / 2;

            BigDecimal bd = new BigDecimal(mid);
            if(bd.precision() >= PRECISION){// 精度要大于六位，用于获取此BigDecimal对象的精度，我们都知道精度一词是未缩放值中表示的位数。
                return mid;
            }

            if((mid * mid) == num){
                return mid;
            }else if((mid * mid) < num){
                return sqrt0(mid, high, num);
            }else {
                return sqrt0(low, mid, num);
            }
        }

        public static void main(String[] args) {
            System.out.println(sqrt(2));
        }
    }

