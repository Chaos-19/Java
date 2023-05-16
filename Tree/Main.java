/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Tree;

/**
 *
 * @author GAEDC
 */
public class Main {

    public static void main(String[] args) {
        Binary bi = new Binary(25);
System.out.println(bi.root.data);  
       // bi.root.left=new Binary.Node(15);
        bi.addChild(bi.root,15);
        bi.addChild(bi.root,50);
       /* bi.addChild(bi.root,10);
        bi.addChild(bi.root,22);

        bi.addChild(bi.root,35);
        bi.addChild(bi.root,70);
        bi.addChild(bi.root,90);
        bi.addChild(bi.root,66);

        bi.addChild(bi.root,31);
        bi.addChild(bi.root,41);
        bi.addChild(bi.root,4);
        bi.addChild(bi.root,12);
        bi.addChild(bi.root,18);
        bi.addChild(bi.root,24);*/
      // System.out.println(bi.root.left.data);  
        bi.printPreOrder(bi.root);
    }

}
