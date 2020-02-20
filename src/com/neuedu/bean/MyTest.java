package com.neuedu.bean;

import java.util.*;

import static com.neuedu.test.LangTest.list;

/**
 * Created by hy on 2020/2/13.
 */
public class MyTest {
    public static void main(String[] args) {
        menu();
        Scanner scanner = new Scanner(System.in);
        //接收游戏人数；
        int player = scanner.nextInt();
        if(player>18||player<12){
            System.out.println("不符合游戏人数");
            System.out.println("游戏人数限12-18人");
        }else{
            /**
             *  符合游戏人数后  进行发牌
             *
             *  定义3个list
             *  1 发牌的列表
             *  2 发完牌的列表
             *  3 底牌列表
             *
             * */
            List<String> all = new ArrayList<>();
            List<String> play = new ArrayList<>();
            List<String> di = new ArrayList<>();
            init(all);
            pai(all,player);
            //盗贼一定在游戏的牌中 总牌移除盗贼 放入游戏牌中
            all.remove("盗贼");
            play.add("盗贼");
            dipai(all,di);
            //将放完底牌的总牌，全部放入游戏牌中
            play.addAll(all);
            //将游戏牌 打乱顺序(洗牌)
            Collections.shuffle(play);
            System.out.println("手牌"+play);
            System.out.println("底牌"+di);
        }
    }
    public static void menu(){
        System.out.println("欢迎进入狼人杀游戏：");
        System.out.println("1：展示所有卡牌");
        System.out.println("2：开始游戏");
        System.out.println("3：退出游戏");
        Scanner scanner = new Scanner(System.in);
        int i = scanner.nextInt();
        switch (i){
            case 1:
                print(list);
                break;
            case 2:
                System.out.println("请输入游戏人数(12-18)：");
                break;
            default:
                System.exit(0);
        }
    }

    public static void print(ArrayList<String> list){
        for(int i = 1;i<=5;i++){
            list.add("狼人");
        }
        for(int j= 1;j<=7;j++){
            list.add("村民");
        }
        list.add("预言家");
        list.add("女巫");
        list.add("丘比特");
        list.add("猎人");
        list.add("村长");
        list.add("替罪羊");
        list.add("吹笛人");
        list.add("盗贼");
        System.out.println("所有的身份牌如下(21张)：");
        for (Object obj : list){
            System.out.println(obj);
        }
        menu();
    }
    //游戏初始化12个人
    public static void init(List<String>list){
        //循环添加4个狼人
        for (int i = 0;i<4;i++){
            list.add("狼人");
        }
        //循环添加4个村民
        for (int i =0;i<4;i++){
            list.add("村民");
        }
        list.add("预言家");
        list.add("女巫");
        list.add("丘比特");
        list.add("守护");
        list.add("猎人");
        list.add("村长");
        list.add("盗贼");
    }
    //根据不同的游戏人数 初始化不同的牌
    public static void pai(List<String > list,int player){
        if (player>12)
            list.add("村民");
        if (player>13)
            list.add("替罪羊");
        if (player>14)
            list.add("狼人");
        if (player>15)
            list.add("村民");
        if (player>16)
            list.add("村民");
        if (player>17)
            list.add("吹笛者");
    }
    //从总牌中 拿出三个底牌来
    public static void dipai(List<String> list,List<String> di){
        //狼人数应当小于等于1
        while (di.size()<3){
            //取list的一个随机下标
            Random random = new Random();
            int index = random.nextInt(list.size());
            //如果底牌里有狼人，且拿出来的牌也是狼人，则执行else
            if(di.contains("狼人")&&list.get(index).equals("狼人"))
                //continue结束本次循环，但是还要重新循环；break就彻底停了
                continue;
            else
                //remove从总牌中拿出来之后 总牌就没有了 (移除)
                di.add(list.remove(index));
                //get拿出来 总牌里还在
                //list.get(index)
        }
    }

}
