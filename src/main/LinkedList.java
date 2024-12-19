package main;

/**
 * Created with IntelliJ IDEA.
 * Description:
 * User: Async
 * Date: 2024-12-10
 * Time: 21:12
 */
public class LinkedList {
    private StudentLinkNode head = new StudentLinkNode(0,"",0);
    //添加
    public void add(StudentLinkNode stNode){
        StudentLinkNode temp = head;
        boolean flag = false;
        while (true){
            if (temp.next == null) {
                break;
            }
            if(temp.next.stno == stNode.stno){
                flag = true;
                break;
            }
            temp = temp.next;
        }
        if(flag){
            System.out.println("学号重复！！！");
        }
        else {
//            while (true){
//                if(temp.next == null){
//                    break;
//                }
//                temp = temp.next;
//            }
            temp.next = stNode;
        }

    }
    //删除
    public void del(int stno){
        StudentLinkNode temp = head;
        boolean flag = false;
        while (true){
            if (temp.next == null) {
                break;
            }
            if(temp.next.stno == stno){
                flag = true;
                break;
            }
            temp = temp.next;
        }

        if(flag) {
            temp.next = temp.next.next;
        }
        else {
            System.out.println(stno+"号学生不存在");
        }
    }
    //添加初始信息
    public void add(int sno,String name,int score){
        StudentLinkNode s4 = new StudentLinkNode(sno,name,score);
        this.add(s4);
    }
    //改
    public void update(StudentLinkNode stNode){
        if(head.next == null){
            System.out.println("为空");
            return;
        }
        StudentLinkNode temp = head.next;
        boolean flag = false;
        while (true){
            if(temp == null){
                break;
            }
            if(temp.stno == stNode.stno){
                flag = true;
                break;
            }
            temp = temp.next;
        }
        if(flag){
            temp.name = stNode.name;
            temp.score = stNode.score;
        }
        else {
            System.out.println("查无此人");
        }
    }
    //全查
    public void show(){
        if(head.next == null){
            System.out.println("为空");
            return;
        }
        StudentLinkNode temp = head.next;
        while (true){
            if(temp == null){
                break;
            }
            System.out.println(temp);
            System.out.println();
            temp = temp.next;
        }
    }
    public void onlyshow(StudentLinkNode stNode){
        if(head.next == null){
            System.out.println("为空");
            return;
        }
        StudentLinkNode temp = head.next;
        boolean flag = false;
        while (true){
            if(temp == null){
                break;
            }
            if(temp.stno == stNode.stno){
                flag = true;
                break;
            }
            temp = temp.next;
        }
        if(flag){
            System.out.println(temp);
        }
        else {
            System.out.println("查无此人");
        }
    }
    public int len(){
        int count = 0;
        if (head.next == null) {
            System.out.println("链表为空");
            return 0;
        }
        StudentLinkNode temp = head.next;
        while (true){
            if (temp == null) {
                break;
            }
            count++;
            temp = temp.next;
        }
        return count;
    }
    public void reverse(){
        if(head.next == null){
            System.out.println("为空");
            return;
        }
        StudentLinkNode temp = head.next;
        boolean flag = false;
        while (true){
            if(temp == null){
                break;
            }
            if(temp.score >= temp.next.score && temp.next !=null){
                flag = false;
            }else {
                flag = true;
            }
            temp = temp.next;
        }
        if(flag){
//            temp.name = stNode.name;
//            temp.score = stNode.score;
        }
        else {
            System.out.println("查无此人");
        }
    }

    public void bubbleSort(StudentLinkNode stNode){
        if(head.next == null){
            System.out.println("为空");
            return;
        }
        StudentLinkNode temp = head.next;
        int count = 0;

        stNode = head;

        temp.frist = stNode;
        while (temp.frist.next != null){
            count++;
            temp.frist = temp.frist.next;
        }
        for (int i = 0; i < count-1; i++) {
            //int num = count-i-1;
            temp.second = stNode.next;
            temp.frist = temp.second.next;
            temp.third = stNode;

            while (temp.frist != null){
                if(temp.second.score < temp.frist.score){
                    temp.second.next = temp.frist.next;
                    temp.frist.next = temp.second;
                    temp.third.next = temp.frist;
                }
                temp.third = temp.third.next;
                temp.second = temp.third.next;
                temp.frist = temp.second.next;
            }
        }


//        int count = 0;
//        if (head.next == null) {
//            System.out.println("链表为空");
//            return ;
//        }
//        StudentLinkNode temp = head.next;
//        while (true){
//            if (temp == null) {
//                break;
//            }
//            count++;
//            temp = temp.next;
//        }
//        boolean flag = false;
//        while (true){
//            if(temp == null){
//                break;
//            }
//            for (int i = 0; i <count-1 ; i++) {
//                for (int j = i+1; j <count ; j++) {
//
//                }
//            }
//
//            }
////            if(temp.stno == stNode.stno){
////                flag = true;
////                break;
////            }
////            temp = temp.next;
////        }
////        if(flag){
////            temp.name = stNode.name;
////            temp.score = stNode.score;
////        }
////        else {
////            System.out.println("查无此人");
////        }
    }

    public StudentLinkNode getHead() {
        return head;
    }

}
