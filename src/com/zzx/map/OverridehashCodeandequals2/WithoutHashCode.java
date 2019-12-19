package com.zzx.map.OverridehashCodeandequals2;

import java.util.HashMap;

/**
 * @ClassName WithoutHashCode
 * @Description 在HashMap中关于equals和hashCode的重写
 * @Author zhangzx
 * @Date 2019/12/19 16:25
 * Version 1.0
 **/
class Key {
    private Integer id;

    private Integer getId() {
        return  id;
    }

    public Key (Integer id) {
        this.id = id;
    }

//    @Override
//    public boolean equals(Object o) {
//        if (o == null || !(o instanceof Key)) {
//            return false;
//        } else {
//            return this.getId().equals(((Key) o).getId());
//        }
//    }
//
//    @Override
//    public int hashCode() {
//        return id.hashCode();
//    }
}
/**
 * @author zhangzx
 */
public class WithoutHashCode {

    public static void main(String[] args) {
        Key key1 = new Key(1);
        Key key2 = new Key(1);
        HashMap<Key, String> hm = new HashMap<Key, String>();
        hm.put(key1, "Key with id is 1");
        // 如果没有重写hashCode，key1和key2的hash所指引的内存位置不同
        // 如果没有重写equals，key1和key2内存地址可能是一个链表，值可能不同
        System.out.println(hm.get(key2));
    }
}
