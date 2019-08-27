package com.zzx.kc;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * @ClassName Demo
 * @Description
 * @Author zhangzx
 * @Date 2019/8/27 18:33
 * Version 1.0
 **/
public class Demo {

    public static void main(String[] args) {
        List<String> oldList = new ArrayList<>();
        oldList.add("张泽熙");
        oldList.add("韩晶超");
        oldList.add("康闯");
        List<String> newList = new ArrayList<>();
        newList.add("张泽熙");
        newList.add("周浩");
        newList.add("郭威");

        List<String> arrList = getAddaListThanbList(oldList, newList);
        oldList.removeAll(arrList);
        System.out.println(oldList);

    }

    public static <E> List<E> getAddaListThanbList(List<E> aList, List<E> bList){
        List<E> addList = new ArrayList<E>();
        for (int i = 0; i < aList.size(); i++){
            if(!myListContains(bList, aList.get(i))){
                addList.add(aList.get(i));
            }
        }
        return addList;
    }

    /**
     * 判断元素element是否是sourceList列表中的一个子元素
     * @param sourceList 源列表
     * @param element 待判断的包含元素
     * @return 包含返回 true，不包含返回 false
     */
    private static <E> boolean myListContains(List<E> sourceList, E element) {
        if (sourceList == null || element == null){
            return false;
        }
        if (sourceList.isEmpty()){
            return false;
        }
        for (E tip : sourceList){
            if(element.equals(tip)){
                return true;
            }
        }
        return false;
    }
}
