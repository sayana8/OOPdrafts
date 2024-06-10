enum Condition{ 
    RIGHT, 
    MIDDLE 
} 
 
class Triangle{ 
    private int num; 
    public void setNum(int num){ 
        this.num = num; 
    } 
    private Condition cond; 
    public void setCondition(Condition cond){ 
        this.cond = cond; 
    } 
    public Triangle(int num, Condition cond){ 
        this.num = num; 
        this.cond = cond; 
    } 
 
    public void view(){ 
        switch(this.cond){ 
            case RIGHT: 
                for(int i = 1; i<=this.num; i++){ 
                    for(int j = 0; j<this.num-i; j++){ 
                        System.out.print(" "); 
                    } 
                    for(int j = 0; j<i; j++) { 
                        System.out.print("*"); 
                    } 
                    System.out.println(); 
                } 
                break; 
            case MIDDLE: 
                for(int i = 0; i<this.num; i++){ 
                    for(int j = 0; j<this.num-i; j++){ 
                        System.out.print(" "); 
                    } 
                    for(int j = 0; j<i*2+1; j++) { 
                        System.out.print("*"); 
                    } 
                    System.out.println(); 
                } 
                break; 
        } 
    } 
 
} 
 
public class TriangleTest { 
    public static void main(String[] args) { 
    	Triangle t = new Triangle(4, Condition.RIGHT);
        t.setCondition((Condition.MIDDLE));
        t.view();
    } 
}
