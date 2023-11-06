public class Rational {
    private int num;
    private int den;

    //Default Constructor
    public Rational(){
        this.num=1;
        this.den=1;
    }

    //One-parameter constructor
    public Rational(int num){
        this.num=num ;
        this.den=1;
    }

    //Two-parameter constructor
    public Rational(int num,int den){
        this.num=num ;
        this.den=den ;
//        simplify();
    }

    //Copy constructor
    public Rational(Rational rational){
        this.num= rational.num;
        this.den= rational.den;
    }

    //GCD
    public int gcd(int a,int b){
        int i;
        if(a<b)
            i = a;
        else
            i=b;
        for (i = i; i > 1; i--) {

            if (a % i == 0 && b % i == 0)
                return i;
        }
        return 1;
    }

    //Simplify method
    private void simplify(){
        if(num>0 && den>0) {
            int gcdNum = gcd(this.num, this.den);
            this.num = num / gcdNum;
            this.den = den / gcdNum;
        } else if (num<0 && den<0) {
            int gcdNum = gcd(this.num*(-1), this.den*(-1));
            this.num = num*(-1) / gcdNum;
            this.den = den*(-1) / gcdNum;
        } else if (num<0 && den>0) {
            int gcdNum = gcd(this.num*(-1), this.den);
            this.num = num / gcdNum;
            this.den = den / gcdNum;
        }else {
            int gcdNum = gcd(this.num, this.den*(-1));
            this.num = num*(-1) / gcdNum;
            this.den = den*(-1) / gcdNum;
        }
    }

    //Get numerator value
    public int getNum() {
        return num;
    }

    //Get denominator value
    public int getDen() {
        return den;
    }

    //Add method
    public Rational add(Rational rational) {
        System.out.print(this.toString()+" + "+rational.toString()+" = ");
        Rational result = new Rational((this.num*rational.den)+(rational.num*this.den),this.den*rational.den);
        result.simplify();
        return result;
    }

    //Subtract method
    public Rational subtract(Rational rational) {
        System.out.print(this.toString()+" - "+rational.toString()+" = ");
        Rational result = new Rational((this.num*rational.den)-(rational.num*this.den),this.den*rational.den);
        result.simplify();
        return result;

    }

    //Multiply method
    public Rational multiply(Rational rational) {
        System.out.print(this.toString()+" * "+rational.toString()+" = ");
        Rational result = new Rational(this.num*rational.num,this.den*rational.den);
        result.simplify();
        return result;
    }

    //MultiplyBy method
    public Rational multiplyBy(int number) {
        System.out.print(this.toString()+" * "+number+" = ");
        Rational result = new Rational(this.num*number,this.den);
        result.simplify();
        return result;
    }

    //Divide method
    public Rational divide(Rational rational) {
        System.out.print(this.toString()+" / "+rational.toString()+" = ");
        Rational result =  new Rational(this.num*rational.den,this.den*rational.num);
        result.simplify();
        return result;
    }

    //DivideBy method
    public Rational divideBy(int number) {
        System.out.print(this.toString()+" / "+number+" = ");
        Rational result =  new Rational(this.num,this.den*number);
        result.simplify();
        return result;
    }

    //Increment method
    public Rational increment() {
        Rational result =  new Rational(this.num,this.den).add(new Rational(1));
        result.simplify();
        return result;
    }

    //IncrementBy  method
    public Rational incrementBy(int number) {
        Rational result =  new Rational(this.num,this.den).add(new Rational(number));
        result.simplify();
        return result;
    }

    //Decrement method
    public Rational decrement() {
        Rational result =  new Rational(this.num,this.den).subtract(new Rational(1));
        result.simplify();
        return result;
    }

    //DecrementBy method
    public Rational decrementBy(int number) {
        Rational result =  new Rational(this.num,this.den).subtract(new Rational(number));
        result.simplify();
        return result;
    }

    //Abs method
    public Rational abs() {
        Rational result =  new Rational(Math.abs(this.num),Math.abs(this.den));
        result.simplify();
        return result;
    }

    //Signum method
    public int signum() {
        if(num>0 && den>0 || num<0 && den<0) {
            return 1;
        } else {
        return -1;
        }
    }

    //Negate method
    public Rational negate() {
        Rational result = new Rational((-1)*this.num,this.den);
        result.simplify();
        return result;
    }

    //Reciprocal method
    public Rational reciprocal() {
        Rational result = new Rational(this.den,this.num);
        result.simplify();
        return result;
    }

    //Pow method
    public Rational pow(int powNum) {
        Rational result = new Rational((int) Math.pow(this.num,powNum),(int) Math.pow(this.den,powNum) );
        result.simplify();
        return result;
    }

    //IntValue method
    public int intValue() {
        return ((int) this.num/(int) this.den);
    }

    //LongValue method
    public long longValue() {
        return ((long) this.num/(long) this.den);
    }

    //floatValue method
    public float floatValue() {
        return ((float) this.num/(float) this.den);
    }

    //doubleValue method
    public double doubleValue() {
        return ((double) this.num/(double) this.den);
    }


    @Override
    public String toString() {
        if (this.den==1)
            return ""+this.num;
        else
            return this.num+"/"+this.den;

    }

    //PrintRational method
    public void printRational() {
//        if (this.den==1)
//            System.out.println(this.num) ;
//        else
            System.out.println(this.num+"/"+this.den) ;
    }

    //ShowRational method
    public void showRational() {
        if (this.den==1)
            System.out.println("Rational("+this.num+")") ;
        else
            System.out.println("Rational("+this.num+","+this.den+")") ;
    }

    //IsProper method
    public void isProper() {
        //
        //simplify();
        //
        String i = this.num<=this.den? "True" : "False";
        System.out.println(i);
    }

    //IsImproper method
    public void isImproper() {
        //
        //simplify();
        //
        String i = this.num>this.den? "True" : "False";
        System.out.println(i);
    }

    //ToMixed method
    public void toMixed() {
        simplify();
        if(this.num>this.den)
            System.out.println((int)this.num/this.den +" "+decrementBy(2));
    }

    //Equals method
    public void equals(Rational rational) {
        simplify();
        rational.simplify();
        if(this.num==rational.num && this.den==rational.den)
            System.out.println("True");
        else
            System.out.println("False");
    }

    //CompareTo method
    public int compareTo(Rational rational) {
        int i=0;
        simplify();
        rational.simplify();
        if(this.num==rational.num && this.den==rational.den)
            i= 0;
//            System.out.println("Equals");
        else if (this.den==rational.den && this.num>rational.num)
            i= 1;
//            System.out.println("Bigger");
        else if (this.den==rational.den && this.num<rational.num)
            i= -1;
//            System.out.println("Smaller");
        else if (this.num==rational.num && this.den>rational.den)
            i= -1;
//            System.out.println("Smaller");
        else if (this.num==rational.num && this.den<rational.den)
            i= 1;
//            System.out.println("Bigger");
        else {
            int gcdNum = gcd(this.den, rational.den);
            int lcmNum = (this.den* rational.den)/gcdNum;

            int z1 = lcmNum/this.den;
            int z2 = lcmNum/rational.den;
            this.num=this.num*z1;
            this.den=this.den*z1;
            rational.num=rational.num*z2;
            rational.den=rational.den*z2;
            if(this.num==rational.num && this.den==rational.den)
                i= 0;
//                System.out.println("Equals");
            else if (this.den==rational.den && this.num>rational.num)
                i= 1;
//                System.out.println("Bigger");
            else if (this.den==rational.den && this.num<rational.num)
                i= -1;
//                System.out.println("Smaller");
            else if (this.num==rational.num && this.den>rational.den)
                i= -1;
//                System.out.println("Smaller");
            else if (this.num==rational.num && this.den<rational.den)
                i= 1;
//                System.out.println("Bigger");
        }
        return i;

    }

    //FindMin method
    public void findMin(Rational rational) {
        int i;
        i = compareTo(rational);
        if (i < 1){
            simplify();
            printRational();
        }
        else {
            rational.simplify();
            rational.printRational();
        }
    }

    //FindMax method
    public void findMax(Rational rational) {
        int i;
        i = compareTo(rational);
        if (i >= 1){
            simplify();
            printRational();
        }
        else {
            rational.simplify();
            rational.printRational();
        }
    }


}
