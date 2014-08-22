/** 
* 2014-7-22 下午6:18:28
* Hang.java 
* author:aimenlianhua 
* function：两个线程，sleep按钮出发后5000ms内hello按钮无反应；
*/ 
package javaInteviewBible;

import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;

public class Hang  extends JFrame{
	public Hang(){
		JButton buttonsleep = new JButton("sleep");
		JButton buttonhello = new JButton("hello");
		buttonsleep.addActionListener(
				new ActionListener() {
					
					@Override
					public void actionPerformed(ActionEvent e) {
						try {
							Thread.currentThread().sleep(5000);
						} catch (Exception e2) {
							// TODO: handle exception
						}
					}
				}
				);
		buttonhello.addActionListener(
				new ActionListener() {
					
					@Override
					public void actionPerformed(ActionEvent e) {
						// TODO Auto-generated method stub
						System.out.println("hello world");
					}
				}
				);
		getContentPane().setLayout(new FlowLayout());
		getContentPane().add(buttonhello);
		getContentPane().add(buttonsleep);
		pack();
		show();
	}
	public static void main(String[] args) {
		new Hang();
	}
}

