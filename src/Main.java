public class Main {
    public static void main(String[] args) {
        Rational rational1 =new Rational(5,6);
        Rational rational2 =new Rational(9,5);
        System.out.println("rational1 : "+rational1.toString());
        System.out.println("rational2 : "+rational2.toString());
        System.out.println("-------------------------------------------");
//        rational1.compareTo(rational2);
//        Rational add = rational1.add(rational2);
//        System.out.println(rational1.compareTo(rational2));
//        rational1.findMin(new Rational(-1,6));
//        rational1.findMax(new Rational(-1,6));
        Rational sub = rational1.subtract(rational2);
        System.out.println(sub.toString());
        Rational mul = rational1.multiply(rational2);
        System.out.println(mul.toString());
//        Rational mulBy = rational1.multiplyBy(5);
//        System.out.println(mulBy.toString());
//        Rational div = rational1.divide(rational2);
//        System.out.println(mulBy.toString());
//        Rational divBy = rational1.divideBy(5);
//        System.out.println(divBy.toString());
//        Rational inc = rational1.increment();
//        System.out.println(inc.toString());
//        Rational incBy = rational1.incrementBy(3);
//        System.out.println(incBy.toString());
//        Rational dec = rational1.decrement();
//        System.out.println(dec.toString());
//        Rational decBy = rational1.decrementBy(4);
//        System.out.println(decBy.toString());
//        Rational abs = rational2.abs();
//        System.out.println(abs.toString());
//        int sig = rational2.signum();
//        System.out.println("Signum : "+sig);
//        Rational neg = rational2.negate();
//        System.out.println(neg.toString());
//        Rational rec = rational1.reciprocal();
//        System.out.println(rec.toString());
//        Rational pow =  rational1.pow(3);
//        System.out.println(pow.toString());
//        System.out.println("6/10 : "+rational1.intValue());
//        System.out.println("6/10 : "+rational1.longValue());
//        System.out.println("6/10 : "+rational1.doubleValue());
//        System.out.println("6/10 : "+rational1.floatValue());
//        rational1.printRational();
//        rational1.showRational();
//        rational2.isProper();
//        rational1.toMixed();
//        rational1.equals(rational2);

    }
}