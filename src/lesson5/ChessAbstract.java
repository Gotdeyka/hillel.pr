package lesson5;

public abstract class ChessAbstract  implements Drawble, Element{

    private int x;
    private int y;
    private int value;

    public int getValue() {
        return value;
    }

    public abstract void draw();

    public ChessAbstract(){
        System.out.println("ChessAbstract()");
    }

    public ChessAbstract(int x, int y){
        this.x = x;
        this.y = y;
        System.out.println("ChessAbstract(int x, int y)");
    }

    public ChessAbstract(int x, int y, int value){
        this.x = x;
        this.y = y;
        this.value = value;
        System.out.println("ChessAbstract(int x, int y, int value)");
    }
    @Override
    public int getX(){
        return this.x;
    }
    @Override
    public int getY(){
        return this.y;
    }

}

