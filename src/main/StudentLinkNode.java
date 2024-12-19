package main;

import java.util.Scanner;

/**
 * Created with IntelliJ IDEA.
 * Description:
 * User: Async
 * Date: 2024-12-10
 * Time: 21:03
 */
public class StudentLinkNode {
    public int stno;
    public String name;
    public int score;
    public StudentLinkNode next;
    public StudentLinkNode frist;
    public StudentLinkNode second;
    public StudentLinkNode third;
    public StudentLinkNode(StudentLinkNode head){}


    public StudentLinkNode(int stno, String name, int score) {
        this.stno = stno;
        this.name = name;
        this.score = score;
    }
    public StudentLinkNode(int stno){
        this.stno= stno;
    }
    public void setInfo(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("no:");
        this.stno = scanner.nextInt();
        System.out.println("name:");
        this.name = scanner.next();
        System.out.println("score:");
        this.score = scanner.nextInt();
    }

    @Override
    public String toString() {
        return "StudentLinkNode{" +
                "stno=" + stno +
                ", name='" + name + '\'' +
                ", score=" + score +
                '}';
    }
}
