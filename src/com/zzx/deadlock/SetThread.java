package com.zzx.deadlock;

/**
 * @ClassName SetThread
 * @Description
 * @Author zhangzx
 * @Date 2019/8/29 11:10
 * Version 1.0
 **/
public class SetThread implements Runnable {

    private Student st;
    private int x = 0;

    public SetThread(Student stu) {
        this.st = stu;
    }

    @Override
    public void run() {
        while (true) {
            synchronized (st) {
                // 判断有没有数据
                if (st.flag) {
                    try {
                        // 如果有数据就等待消费者消费
                        st.wait();
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }

                if (x%2 == 0) {
//                    st.name =
                }
            }
        }
    }
}
