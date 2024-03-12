public class inheritance1 {
    int l;
    int w;
    int h;
    int size;

    inheritance1(){
        this.l=1;
        this.h=1;
        this.w=1;
        this.size=1;
    }
    inheritance1(int l,int w,int h){
        this.l=l;
        this.w=w;
        this.h=h;
    }

    inheritance1(int s){
        this.h=s;
        this.w=s;
        this.h=s;
    }

    void show(){
        System.out.println(this.l + " " + this.h + " " + this.w + " " + this.size);
    }


}
