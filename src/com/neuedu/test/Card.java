package com.neuedu.test;

import java.util.Collection;
import java.util.LinkedList;
import java.util.List;

/**
 * Created by hy on 2020/2/11.
 */
public class Card {
    public static void main(String[] args) {
        int[] cards = new Card().getCards();
        for(int i : cards){
            System.out.println(i+"");
        }
    }
    public int[] getCards(){
        List<Integer>list = new LinkedList<Integer>();
        int index = 1;
        for (int i = 0; i<52;i++){
            list.add(index++);
        }
        int[] cards = new int [52];
        for(int i = 0;i<cards.length;i++){
            cards[i] = list.remove(0);
        }
        return cards;
    }
}
