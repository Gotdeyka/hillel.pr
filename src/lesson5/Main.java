package lesson5;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) throws IOException {

        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        ArrayList<ChessAbstract> chessItemList = new ArrayList<ChessAbstract>();

        String s;
        while (!(s = reader.readLine()).equals("")){
            final int chessItemType = Integer.parseInt(s);
            chessItemList.add(createChessItem(chessItemType));
        }

        for (Drawble item: chessItemList) {
            item.draw();
        }

        for (HasValue item: chessItemList) {
            System.out.println(item.getValue());
        }
    }


    public static ChessAbstract createChessItem(int chessItemType) {
        switch (chessItemType) {
            case 1:
                return new Queen(1, 1, 10);
            case 2:
                return new King(1, 2, 10);
            default:
                throw new IllegalArgumentException("Unknown chess item type");
        }


    }
    //  ChessAbstract ChessItem = new Queen(10,10, 10);
    // chessItem.draw();
    //ChessAbstract ChessItem2 = new King(10, 10, 20);



}