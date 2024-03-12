public class inheritance2 extends inheritance1{
    int weight;
    int size;

    inheritance2(){
        super();
        this.weight=1;
        this.size=2;
    }
    inheritance2(int l,int h,int w,int weight){
        this.l=l;
        this.h=h;
        this.w=w;
        this.weight=weight;
    }
    void show(){
        super.show();
        System.out.println(this.l + " " + this.h + " " + this.w + " " + this.weight + " " + this.size);
    }


    public static void main(String[] args) {
        inheritance2 A = new inheritance2();

        System.out.println(A.l + " " + A.h + " " + A.w + " " + A.weight + " " + A.size);
        A.show();
    }
}

