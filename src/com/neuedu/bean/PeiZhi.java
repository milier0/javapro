package com.neuedu.bean;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

/**
 * Created by lan_jia_nao on 2020/2/11.
 */
public class PeiZhi {
    public static Set<LangRenSha> langRenShas = new HashSet<>();
    public static Set<CunMin> cunMins = new HashSet<>();
    public static Set<CunZhang> cunZhangs = new HashSet<>();
    public static Set<ChuiDiZhe> chuiDiZhes = new HashSet<>();
    public static Set<LangRen> langRens = new HashSet<>();
    public static Set<ShouHu> shouHus = new HashSet<>();
    public static Set<YuYanJia> yuYanJias = new HashSet<>();
    public static Set<LieRen> lieRens = new HashSet<>();
    public static Set<QiuBiTe> qiuBiTes = new HashSet<>();
    public static Set<ZhangLao> zhangLaos = new HashSet<>();
    public static Set<DaoZei> daoZeis = new HashSet<>();
    public static Set<TiZuiYang> tiZuiYangs = new HashSet<>();
    public static Set<NvWu> nvWus = new HashSet<>();


    public static void menu(){
        Scanner scanner0 = new Scanner(System.in);
        System.out.println("欢迎进入狼人杀游戏平台");
        System.out.println("1：开始游戏");
        System.out.println("2：结束游戏");
        int f = scanner0.nextInt();
        if (f!=1&&f!=2){
            menu();
        }else{
            switch (f){
                case 1 :{
                    xianZhi();
                    return;
                }
                default :{
                    System.exit(1);
                }
            }
        }
    }
    public static void xianZhi(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("12-18人（大于18人或者小于12人，超出游戏人数范围）");
        System.out.println("18（5,7,5）人    5狼人     7村民        1预言家 1女巫   1丘比特 1守护 1猎人 1村长 1 替罪羊 1吹笛者 1盗贼      21张牌");
        System.out.println("17（5,6,6）人    5狼人     7村民        1预言家 1女巫   1丘比特 1守护 1猎人 1村长 1 替罪羊 1盗贼                    20张牌");
        System.out.println("16（5,6,5）人    5狼人     6村民        1预言家 1女巫   1丘比特 1守护 1猎人 1村长 1 替罪羊 1盗贼                    19张牌");
        System.out.println("15（5,5,5）人    5狼人     5村民        1预言家 1女巫   1丘比特 1守护 1猎人 1村长 1 替罪羊 1盗贼                    18张牌");
        System.out.println("14（4,5,5）人    4狼人     5村民        1预言家 1女巫   1丘比特 1守护 1猎人 1村长 1 替罪羊1 盗贼                    17张牌");
        System.out.println("13（4,5,4）人    4狼人     5村民        1预言家 1女巫   1丘比特 1守护 1猎人 1村长 1 盗贼\t                    16张牌");
        System.out.println("12（4,4,4）人    4狼人     4村民        1预言家 1女巫   1丘比特 1守护 1猎人 1村长 1 盗贼\t                    15张牌");
        System.out.println("11 返回");
        System.out.println("请输入玩家人数或者返回");
        int n = scanner.nextInt();
        System.out.println("进入游戏");
        if (n>=11&&n<=18){
            switch (n){
                case 11 :{
                    menu();
                    return;
                }
                case 12 :{
                    zuHe7(langRenShas);
                    System.out.println(langRenShas);
                    return;
                }
                case 13 :{
                    zuHe6(langRenShas);
                    System.out.println(langRenShas);
                    return;
                }
                case 14 :{
                    zuHe5(langRenShas);
                    System.out.println(langRenShas);
                    return;
                }
                case 15 :{
                    zuHe4(langRenShas);
                    System.out.println(langRenShas);
                    return;
                }
                case 16 :{
                    zuHe3(langRenShas);
                    System.out.println(langRenShas);
                    return;
                }
                case 17 :{
                    zuHe2(langRenShas);
                    System.out.println(langRenShas);
                    return;
                }
                case 18 :{
                    zuHe1(langRenShas);
                    System.out.println(langRenShas);
                    return;
                }
            }
        }else{
            System.out.println("大于18人或者小于12人，超出游戏人数范围");
            Scanner scanner1 = new Scanner(System.in);
            System.out.println("请选择");
            System.out.println("1：返回上一层");
            System.out.println("2：结束游戏");
            int d = scanner1.nextInt();
            switch (d){
                case 1 :{
                    fanHui();
                    return;
                }default:{
                    jieShu();
                    return;
                }
            }
        }
    }
    public static void moShi(){
        Scanner scanner2 = new Scanner(System.in);
        System.out.println("请选择模式");
        System.out.println("1：18（5,7,5）人    5狼人     7村民        1预言家 1女巫   1丘比特 1守护 1猎人 1村长 1 替罪羊 1吹笛者 1盗贼      21张牌");
        System.out.println("2：17（5,6,6）人    5狼人     7村民        1预言家 1女巫   1丘比特 1守护 1猎人 1村长 1 替罪羊 1盗贼                    20张牌");
        System.out.println("3：16（5,6,5）人    5狼人     6村民        1预言家 1女巫   1丘比特 1守护 1猎人 1村长 1 替罪羊 1盗贼                    19张牌");
        System.out.println("4：15（5,5,5）人    5狼人     5村民        1预言家 1女巫   1丘比特 1守护 1猎人 1村长 1 替罪羊 1盗贼                    18张牌");
        System.out.println("5：14（4,5,5）人    4狼人     5村民        1预言家 1女巫   1丘比特 1守护 1猎人 1村长 1 替罪羊1 盗贼                    17张牌");
        System.out.println("6：13（4,5,4）人    4狼人     5村民        1预言家 1女巫   1丘比特 1守护 1猎人 1村长 1 盗贼\t                    16张牌");
        System.out.println("7：12（4,4,4）人    4狼人     4村民        1预言家 1女巫   1丘比特 1守护 1猎人 1村长 1 盗贼\t                    15张牌");
        System.out.println("8：结束游戏");
        int b = scanner2.nextInt();
        switch (b){
            case 1 :{
                zuHe1(langRenShas);
                moShi();
                return;
            }
            case 2 :{
                zuHe2(langRenShas);
                moShi();
                return;
            }
            case 3 :{
                zuHe3(langRenShas);
                moShi();
                return;
            }
            case 4 :{
                zuHe4(langRenShas);
                moShi();
                return;
            }
            case 5 :{
                zuHe5(langRenShas);
                moShi();
                return;
            }
            case 6 :{
                zuHe6(langRenShas);
                moShi();
                return;
            }
            case 7 :{
                zuHe7(langRenShas);
                moShi();
                return;
            }case 8 :{
                jieShu();
            }default:{
                System.out.println("请在七种模式下任意选择");
                jieShu();
                return;
            }
        }
    }
    public static void zuHe1(Set<LangRenSha> langRenShas){
        for (int i=1;i<=5;i++){
            LangRen langRen = new LangRen("狼人"+i);
            langRens.add(langRen);
        }
        for (int i=1;i<=7;i++){
            CunMin cunMin = new CunMin("村民"+i);
            cunMins.add(cunMin);
        }
        YuYanJia yuYanJia = new YuYanJia("预言家");
        yuYanJias.add(yuYanJia);
        NvWu nvWu = new NvWu("女巫");
        nvWus.add(nvWu);
        QiuBiTe qiuBiTe = new QiuBiTe("丘比特");
        qiuBiTes.add(qiuBiTe);
        ShouHu shouHu = new ShouHu("守护");
        shouHus.add(shouHu);
        LieRen lieRen = new LieRen("猎人");
        lieRens.add(lieRen);
        CunZhang cunZhang = new CunZhang("村长");
        cunZhangs.add(cunZhang);
        TiZuiYang tiZuiYang = new TiZuiYang("替罪羊");
        tiZuiYangs.add(tiZuiYang);
        ChuiDiZhe chuiDiZhe = new ChuiDiZhe("吹笛者");
        chuiDiZhes.add(chuiDiZhe);
        DaoZei daoZei = new DaoZei("盗贼");
        daoZeis.add(daoZei);
    }
    public static void zuHe2(Set<LangRenSha> langRenShas){
        for (int i=1;i<=5;i++){
            LangRen langRen = new LangRen("狼人"+i);
            langRens.add(langRen);
        }
        for (int i=1;i<=7;i++){
            CunMin cunMin = new CunMin("村民"+i);
            cunMins.add(cunMin);
        }
        YuYanJia yuYanJia = new YuYanJia("预言家");
        yuYanJias.add(yuYanJia);
        NvWu nvWu = new NvWu("女巫");
        nvWus.add(nvWu);
        QiuBiTe qiuBiTe = new QiuBiTe("丘比特");
        qiuBiTes.add(qiuBiTe);
        ShouHu shouHu = new ShouHu("守护");
        shouHus.add(shouHu);
        LieRen lieRen = new LieRen("猎人");
        lieRens.add(lieRen);
        CunZhang cunZhang = new CunZhang("村长");
        cunZhangs.add(cunZhang);
        TiZuiYang tiZuiYang = new TiZuiYang("替罪羊");
        tiZuiYangs.add(tiZuiYang);
        DaoZei daoZei = new DaoZei("盗贼");
        daoZeis.add(daoZei);
    }
    public static void zuHe3(Set<LangRenSha> langRenShas){
        for (int i=1;i<=5;i++){
            LangRen langRen = new LangRen("狼人"+i);
            langRens.add(langRen);
        }
        for (int i=1;i<=6;i++){
            CunMin cunMin = new CunMin("村民"+i);
            cunMins.add(cunMin);
        }
        YuYanJia yuYanJia = new YuYanJia("预言家");
        yuYanJias.add(yuYanJia);
        NvWu nvWu = new NvWu("女巫");
        nvWus.add(nvWu);
        QiuBiTe qiuBiTe = new QiuBiTe("丘比特");
        qiuBiTes.add(qiuBiTe);
        ShouHu shouHu = new ShouHu("守护");
        shouHus.add(shouHu);
        LieRen lieRen = new LieRen("猎人");
        lieRens.add(lieRen);
        CunZhang cunZhang = new CunZhang("村长");
        cunZhangs.add(cunZhang);
        TiZuiYang tiZuiYang = new TiZuiYang("替罪羊");
        tiZuiYangs.add(tiZuiYang);
        DaoZei daoZei = new DaoZei("盗贼");
        daoZeis.add(daoZei);
    }
    public static void zuHe4(Set<LangRenSha> langRenShas){
        for (int i=1;i<=5;i++){
            LangRen langRen = new LangRen("狼人"+i);
            langRens.add(langRen);
        }
        for (int i=1;i<=5;i++){
            CunMin cunMin = new CunMin("村民"+i);
            cunMins.add(cunMin);
        }
        YuYanJia yuYanJia = new YuYanJia("预言家");
        yuYanJias.add(yuYanJia);
        NvWu nvWu = new NvWu("女巫");
        nvWus.add(nvWu);
        QiuBiTe qiuBiTe = new QiuBiTe("丘比特");
        qiuBiTes.add(qiuBiTe);
        ShouHu shouHu = new ShouHu("守护");
        shouHus.add(shouHu);
        LieRen lieRen = new LieRen("猎人");
        lieRens.add(lieRen);
        CunZhang cunZhang = new CunZhang("村长");
        cunZhangs.add(cunZhang);
        TiZuiYang tiZuiYang = new TiZuiYang("替罪羊");
        tiZuiYangs.add(tiZuiYang);
        DaoZei daoZei = new DaoZei("盗贼");
        daoZeis.add(daoZei);
    }
    public static void zuHe5(Set<LangRenSha> langRenShas){
        for (int i=1;i<=4;i++){
            LangRen langRen = new LangRen("狼人"+i);
            langRens.add(langRen);
        }
        for (int i=1;i<=5;i++){
            CunMin cunMin = new CunMin("村民"+i);
            cunMins.add(cunMin);
        }
        YuYanJia yuYanJia = new YuYanJia("预言家");
        yuYanJias.add(yuYanJia);
        NvWu nvWu = new NvWu("女巫");
        nvWus.add(nvWu);
        QiuBiTe qiuBiTe = new QiuBiTe("丘比特");
        qiuBiTes.add(qiuBiTe);
        ShouHu shouHu = new ShouHu("守护");
        shouHus.add(shouHu);
        LieRen lieRen = new LieRen("猎人");
        lieRens.add(lieRen);
        CunZhang cunZhang = new CunZhang("村长");
        cunZhangs.add(cunZhang);
        TiZuiYang tiZuiYang = new TiZuiYang("替罪羊");
        tiZuiYangs.add(tiZuiYang);
        DaoZei daoZei = new DaoZei("盗贼");
        daoZeis.add(daoZei);
    }
    public static void zuHe6(Set<LangRenSha> langRenShas){
        for (int i=1;i<=4;i++){
            LangRen langRen = new LangRen("狼人"+i);
            langRens.add(langRen);
        }
        for (int i=1;i<=5;i++){
            CunMin cunMin = new CunMin("村民"+i);
            cunMins.add(cunMin);
        }
        YuYanJia yuYanJia = new YuYanJia("预言家");
        yuYanJias.add(yuYanJia);
        NvWu nvWu = new NvWu("女巫");
        nvWus.add(nvWu);
        QiuBiTe qiuBiTe = new QiuBiTe("丘比特");
        qiuBiTes.add(qiuBiTe);
        ShouHu shouHu = new ShouHu("守护");
        shouHus.add(shouHu);
        LieRen lieRen = new LieRen("猎人");
        lieRens.add(lieRen);
        CunZhang cunZhang = new CunZhang("村长");
        cunZhangs.add(cunZhang);
        DaoZei daoZei = new DaoZei("盗贼");
        daoZeis.add(daoZei);
    }
    public static void zuHe7(Set<LangRenSha> langRenShas){
        for (int i=1;i<=4;i++){
            LangRen langRen = new LangRen("狼人"+i);
            langRens.add(langRen);
        }
        for (int i=1;i<=4;i++){
            CunMin cunMin = new CunMin("村民"+i);
            cunMins.add(cunMin);
        }
        YuYanJia yuYanJia = new YuYanJia("预言家");
        yuYanJias.add(yuYanJia);
        NvWu nvWu = new NvWu("女巫");
        nvWus.add(nvWu);
        QiuBiTe qiuBiTe = new QiuBiTe("丘比特");
        qiuBiTes.add(qiuBiTe);
        ShouHu shouHu = new ShouHu("守护");
        shouHus.add(shouHu);
        LieRen lieRen = new LieRen("猎人");
        lieRens.add(lieRen);
        CunZhang cunZhang = new CunZhang("村长");
        cunZhangs.add(cunZhang);
        DaoZei daoZei = new DaoZei("盗贼");
        daoZeis.add(daoZei);
    }
    public static void jieShu(){
        Scanner scanner1 = new Scanner(System.in);
        System.out.println("1.重新开始");
        System.out.println("2.退出游戏");
        int a = scanner1.nextInt();
        switch (a){
            case 1 :{
                xianZhi();
                return;
            }
            default :{
                System.exit(1);
            }
        }
    }
    public static void fanHui(){
        xianZhi();
        return;
    }
}
