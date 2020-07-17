package com.wxq.my0415wed;

import java.util.*;

/**
 * @author wangxiaoqiang
 * @date 2020/4/15 16:56
 * @description
 */

public class Test01 {
    public static void main(String[] args) {
        Map<Integer,String> pai = new HashMap<>();
        List<Integer> nums = new ArrayList<>();
        String[] huaSe = {"♦","♣","♥","♠"};
        String[] shuZi = {"3","4","5","6","7","8","9","10","J","Q","K","A","2"};
        int n = 1;
        for (int i=0;i<huaSe.length;i++){
            for (int j=0;j<shuZi.length;j++){
                pai.put(n,huaSe[i]+shuZi[j]);
                nums.add(n);
                n++;
            }
        }
        pai.put(53,"小王");
        nums.add(53);
        pai.put(54,"大王");
        nums.add(54);
        Collections.shuffle(nums);

        List<String> p1 = new ArrayList<>();
        List<String> p2 = new ArrayList<>();
        List<String> p3 = new ArrayList<>();
        List<String> pd = new ArrayList<>();

       for (int i=0;i<nums.size();i++){
            if(i>50 && i<54){
                pd.add(pai.get(nums.get(i)));
            }else if(i%3==0){
                p1.add(pai.get(nums.get(i)));
            }else if(i%3==1){
                p2.add(pai.get(nums.get(i)));
            }else{
                p3.add(pai.get(nums.get(i)));
            }
        }

        System.out.println("玩家1："+p1);
        System.out.println("玩家2："+p2);
        System.out.println("玩家3："+p3);
        System.out.println("底牌："+pd);

    }
}
